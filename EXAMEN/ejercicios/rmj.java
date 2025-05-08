package archivos;

import java.io.File;

public class rmj {
	public static void main(String[] args) {
		
		if(args.length != 1) {
			System.out.println("demasiados o demasiado pocos argumentos");
            System.out.println("Ejemplo: java rmj fichero.txt");
            return;
		}
		String nombre = args[0];
		
		File f = new File(nombre);
		
		if (!f.exists()) {
			System.out.println("el archivo no existe");
		}
		if(!f.isFile()) {
			System.out.println("no es un archivo");
		}
		if(f.delete()) {
			System.out.println("archivo borrado con exito");
			
		}else {
			System.out.println("error al borrar el archivo");
		}
	}
}
