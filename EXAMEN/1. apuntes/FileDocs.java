package archivos;

import java.io.File;
import java.io.IOException;

public class FileDocs {
	public static void main(String[] args) {
		try {
			File file = new File("file.txt");
			crearArchivo(file);
		}catch (Exception e) {
			System.out.println("error al tratar el archivo");
		}
	}
	public static void crearArchivo(File f) {
			try {
				if(f.createNewFile()) {
					System.out.println("archivo creado con exito");
				}else {
					System.out.println("el archivo ya existe");
				}
			}catch (IOException e) {
				System.out.println("error al tratar el archivo");
			}
	}
	public static void borrarArchivo(File f) {
	    if (f.exists()) {
	        if (f.delete()) {
	            System.out.println("Archivo eliminado.");
	        } else {
	            System.out.println("No se pudo eliminar el archivo.");
	        }
	    } else {
	        System.out.println("El archivo no existe.");
	    }
	}
	public static void renombrarArchivo(File f, String s) {
		File newFile = new File(s);
		
	    if (f.exists()) {
	        if (f.renameTo(newFile)) {
	            System.out.println("Archivo renombrado a: " + newFile.getName());
	        } else {
	            System.out.println("No se pudo renombrar el archivo.");
	        }
	    } else {
	        System.out.println("El archivo original no existe.");
	    }
		
	}
	public static void mostrarContenidoDirectorio(File f) {

	    if (f.exists() && f.isDirectory()) {
	        String[] archivos = f.list();
	        if (archivos != null) {
	            for (String nombre : archivos) {
	                System.out.println(nombre);
	            }
	        } else {
	            System.out.println("No se pudo leer el contenido del directorio.");
	        }
	    } else {
	        System.out.println("No es un directorio válido.");
	    }
	}
	public static void mostrarInformacionArchivo(File f ) {

	    if (f.exists()) {
	        System.out.println("Nombre: " + f.getName());
	        System.out.println("Ruta relativa: " + f.getPath());
	        System.out.println("Ruta absoluta: " + f.getAbsolutePath());
	        System.out.println("Directorio padre: " + f.getParent());
	    } else {
	        System.out.println("El archivo no existe.");
	    }
	}
	public static void mostrarPermisos(File f) {

	    if (f.exists()) {
	        System.out.println("Se puede leer: " + f.canRead());
	        System.out.println("Se puede escribir: " + f.canWrite());
	        System.out.println("Se puede ejecutar: " + f.canExecute());
	    } else {
	        System.out.println("El archivo no existe.");
	    }
	}
	public static void cambiarPermisos(File f, boolean lectura, boolean escritura, boolean ejecucion) {

	    if (f.exists()) {
	        f.setReadable(lectura);
	        f.setWritable(escritura);
	        f.setExecutable(ejecucion);
	        System.out.println("Permisos cambiados.");
	    } else {
	        System.out.println("El archivo no existe.");
	    }
	}



	

	
}


