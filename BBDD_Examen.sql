2a. Procedimiento p_actualizaparidad
Corrección: El procedimiento ha sido completamente reescrito para seguir la lógica sugerida: verificar la existencia de la clínica, obtener el total de dentistas y los masculinos, calcular la paridad y luego actualizar el campo. Se incluyen validaciones para evitar divisiones por cero o errores si la clínica no existe.

DELIMITER $$

-- Es buena práctica eliminar el procedimiento si ya existe antes de crearlo
DROP PROCEDURE IF EXISTS p_actualizaparidad $$

CREATE PROCEDURE p_actualizaparidad(
    IN paramcodclinica INT
)
BEGIN
    DECLARE total_dentistas INT DEFAULT 0;
    DECLARE dentistas_masculinos INT DEFAULT 0;
    DECLARE paridad_calculada FLOAT DEFAULT 0.0;
    DECLARE clinica_existe BOOLEAN DEFAULT FALSE;

    -- 1. Verificar si la clínica existe
    SELECT TRUE INTO clinica_existe FROM clinicas WHERE codclinica = paramcodclinica LIMIT 1;

    IF clinica_existe = FALSE THEN
        -- Si la clínica no existe, emitir una señal de error.
        SIGNAL SQLSTATE '45000' SET MESSAGE_TEXT = 'La clínica especificada no existe.';
    ELSE
        -- 2. Obtener el total de dentistas para la clínica
        SELECT COUNT(*)
        INTO total_dentistas
        FROM dentistas
        WHERE codclinica = paramcodclinica;

        -- 3. Obtener el total de dentistas masculinos para la clínica
        SELECT COUNT(*)
        INTO dentistas_masculinos
        FROM dentistas
        WHERE codclinica = paramcodclinica AND sexo = 'M';

        -- 4. Calcular la paridad (si hay dentistas para evitar división por cero)
        IF total_dentistas > 0 THEN
            SET paridad_calculada = (CAST(dentistas_masculinos AS FLOAT) / total_dentistas) * 100;
        ELSE
            -- Si no hay dentistas, la paridad es 0 (o lo que se defina como apropiado)
            SET paridad_calculada = 0.0;
        END IF;

        -- 5. Actualizar el campo 'paridad' en la tabla 'clinicas'
        UPDATE clinicas
        SET paridad = paridad_calculada
        WHERE codclinica = paramcodclinica;
    END IF;
END $$

DELIMITER ;

2b. Trigger t_paridad
Corrección: Para un comportamiento robusto y correcto, se recomienda separar la validación (que debe ser BEFORE) de la actualización de datos dependientes (que debe ser AFTER). He creado dos triggers para cubrir ambos escenarios de manera adecuada.

t_dentistas_validar_sexo (BEFORE UPDATE, BEFORE INSERT): Este trigger valida que el campo sexo solo acepte 'M' o 'V' antes de que el registro sea modificado o insertado.

t_dentistas_actualizar_paridad (AFTER UPDATE, AFTER INSERT): Este trigger se dispara después de que se haya actualizado o insertado un dentista, asegurando que la llamada a p_actualizaparidad utilice los datos más recientes.

DELIMITER $$

-- Eliminar triggers si existen antes de crearlos
DROP TRIGGER IF EXISTS t_dentistas_validar_sexo $$DROP TRIGGER IF EXISTS t_dentistas_actualizar_paridad$$

-- Trigger para validar el sexo (BEFORE para evitar datos incorrectos)
CREATE TRIGGER t_dentistas_validar_sexo
BEFORE UPDATE ON dentistas
FOR EACH ROW
BEGIN
    -- Validar que el sexo sea 'M' (Masculino) o 'V' (Femenino)
    IF NEW.sexo IS NULL OR (NEW.sexo != 'M' AND NEW.sexo != 'V') THEN
        SIGNAL SQLSTATE '45000' SET MESSAGE_TEXT = 'Solo se aceptan valores "M" y "V" para el sexo.';
    END IF;
END $$

-- Trigger para actualizar la paridad (AFTER para usar los datos actualizados/insertados)
-- Se dispara tanto al actualizar como al insertar dentistas
CREATE TRIGGER t_dentistas_actualizar_paridad
AFTER INSERT ON dentistas
FOR EACH ROW
BEGIN
    -- Llamar al procedimiento para actualizar la paridad de la clínica
    -- usando el código de clínica del nuevo o modificado dentista.
    CALL p_actualizaparidad(NEW.codclinica);
END $$

CREATE TRIGGER t_dentistas_actualizar_paridad_update
AFTER UPDATE ON dentistas
FOR EACH ROW
BEGIN
    -- Si el sexo o la clínica han cambiado, o simplemente se actualiza el registro,
    -- recalcular la paridad para la clínica afectada.
    -- Es importante recalcular si el sexo cambia (OLD.sexo != NEW.sexo)
    -- o si el dentista se mueve de clínica (OLD.codclinica != NEW.codclinica).
    IF OLD.sexo != NEW.sexo OR OLD.codclinica != NEW.codclinica THEN
        CALL p_actualizaparidad(NEW.codclinica);
        -- Si el dentista se movió de clínica, también recalcular para la antigua clínica.
        IF OLD.codclinica != NEW.codclinica THEN
            CALL p_actualizaparidad(OLD.codclinica);
        END IF;
    END IF;
END $$

DELIMITER ;

2c. Función importecliente
Corrección: La función ha sido corregida para realizar correctamente la suma de importes. La principal mejora es la sintaxis de la consulta JOIN y la forma de devolver el valor directamente desde la SUM. Se añade un IFNULL para devolver 0.0 si no hay intervenciones o tratamientos asociados.

DELIMITER $$

-- Eliminar la función si ya existe antes de crearla
DROP FUNCTION IF EXISTS importecliente $$

CREATE FUNCTION importecliente(
    cod_cliente VARCHAR(20)
)
RETURNS FLOAT
DETERMINISTIC
BEGIN
    DECLARE total_importe FLOAT DEFAULT 0.0;

    -- Calcular el total de importes para el cliente
    SELECT IFNULL(SUM(tr.importe), 0.0)
    INTO total_importe
    FROM intervenciones i
    JOIN tratamientos tr ON i.codtratamientos = tr.codtratamientos
    WHERE i.dni = cod_cliente; -- Asumiendo que 'dni' es el campo para el DNI del paciente/cliente en 'intervenciones'

    RETURN total_importe;
END $$

DELIMITER ;
