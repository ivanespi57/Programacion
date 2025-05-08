package macro2;
import java.io.*;
import java.util.ArrayList;
/*
 * 
 */
public class Main {
	public static void main(String[] args) {
		File f = crearArchivoPersonas();
		ArrayList<Persona> personas = new ArrayList<>();
		try (BufferedReader br = new BufferedReader(new FileReader(f))) {
			String persona = br.readLine();
			while (persona != null) {
				String[] datosPersona = persona.split(",");
				int id;String nombre;String apellidos;int edad;
				id = Integer.valueOf(datosPersona[0]);
				nombre = datosPersona[1];
				apellidos = datosPersona[2];
				edad = Integer.valueOf(datosPersona[3]);
				personas.add(new Persona(id,nombre,apellidos,edad));
				persona = br.readLine();
			}

		Persona.serializarLista(personas, "personas.ser");
			
			
		}catch (Exception e) {
			System.out.println("exc: "+e);
		}
	}

	public static File crearArchivoPersonas() {
		File ptxt = new File("personas.txt");
		try {
			if (!ptxt.exists()) {
				ptxt.createNewFile();	
				System.out.println("archivo creado: personas.txt");
			}
		}catch (Exception e) {
		}
		return ptxt;

	}
}
