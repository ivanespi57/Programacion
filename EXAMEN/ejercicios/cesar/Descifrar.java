package cesar;

import java.io.*;

public class Descifrar {
	public static void main(String[] args) {
		if(args.length!=1) {
			System.out.println("formula invalida");
			return;
		}
		
		String nombre = args[0];
		String ext;
		String fname;
		int desp = 0;
		
		try {
			File f = new File(nombre);
			if(!f.exists()) {
				System.out.println("el archivo especificado no existe.");
				return;
			}
			if(!f.isFile()) {
				System.out.println("no es un archivo válido.");
				return;
			}
			
			if (nombre.length() >= 3) {
			    ext = nombre.substring(nombre.length() - 3);
			    try{
			    	desp = Integer.valueOf(nombre.substring(nombre.length()-1));
			    }catch (Exception e) {
			    	System.out.println("la extension no es válida.");
			    }
			    System.out.println(ext);
			} else {
			    System.out.println("Nombre demasiado corto para tener extensión.");
			}
			
			descifrar(f,desp);

			
		}catch (Exception e) {
			System.out.println(e);
		}
		
		
	}
	private static void descifrar(File f, int desp) {
	    String fname = f.getName().substring(0, f.getName().length() - 4);       
	    try (
	        BufferedReader br = new BufferedReader(new FileReader(f));
	        BufferedWriter bw = new BufferedWriter(new FileWriter(fname + ".txt"))
	    ) {
	        int car;
	        while ((car = br.read()) != -1) {
	            char c = (char) car;
	            char descifrado = c;

	            if (Character.isUpperCase(c)) {
	                descifrado = (char) ((c - 'A' - desp + 26) % 26 + 'A');
	            } else if (Character.isLowerCase(c)) {
	                descifrado = (char) ((c - 'a' - desp + 26) % 26 + 'a');
	            }

	            bw.write(descifrado);
	        }
	    } catch (Exception e) {
	        System.out.println("Error al descifrar: " + e.getMessage());
	    }
	}

}
