package cesar;

import java.io.*;

/*
 * Realiza un programa al que se le pasen dos argumentos: el nombre de un archivo de texto y
un número entre el 1 y el 9. Por ejemplo:
> cifrado prueba.txt 4
El programa usará el número para cifrar el texto del archivo tantas posiciones como dice el
número.
El resultado se guardará en un archivo con el nombre igual que el original pero con la
extensión cfN, donde la N representa el número de posiciones de la codificación. En el
ejemplo, se llamará prueba.cf4
Nuestro programa debe gestionar todas las excepciones que se os ocurran: que no hay dos
argumentos; el fichero original exista; que el argumento de posiciones sea un número y entre
1 y 9; avisar si el archivo ya fue codificado con ese cifrado,…
 */
public class Cesar {
	public static void main(String[] args) {
		if(args.length != 2) {
			System.out.println("uso: Cesar ejemplo.txt 3");
			return;
		}
		String nombre = args[0];
		int desp = Integer.valueOf(args[1]);
		
		if(desp > 9 || desp<1) {
			System.out.println("desplazamiento NO valido 1-9");
			return
;		}
		
		try {
			File f = new File(nombre);
			if(f.exists()) {
				cifrarArchivo(f,desp);
			}else {
				f.createNewFile();
				System.out.println("archivo creado, agrega contenido");
				return;
			}
		}catch (Exception e) {
			System.out.println("error al crear el archivo");
		}
		

		
		
	}
	private static void cifrarArchivo(File f, int desp) throws IOException {
	    String nombreSalida = f.getName().replaceAll("\\.txt$", "") + ".cf" + desp;
	    File fSalida = new File(nombreSalida);

	    if (fSalida.exists()) {
	        System.out.println("El archivo ya fue cifrado con este desplazamiento: " + nombreSalida);
	        return;
	    }

	    try (
	        BufferedReader br = new BufferedReader(new FileReader(f));
	        FileWriter fw = new FileWriter(fSalida)
	    ) {
	        int c;
	        while ((c = br.read()) != -1) {
	            char original = (char) c;
	            char cifrado;

	            if (original >= 'a' && original <= 'z') {
	                cifrado = (char) ((original - 'a' + desp) % 26 + 'a');
	            } else {
	                cifrado = original;
	            }

	            fw.write(cifrado);
	        }

	    } catch (Exception e) {
	        System.out.println("error: " + e.getMessage());
	    }
	}


}
