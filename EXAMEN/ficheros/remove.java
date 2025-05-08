package ficheros;

import java.io.File;
import java.io.IOException;

public class remove {
	public static void main(String[] args) {
        
        if (args.length != 1) {
            System.out.println("Uso: java rmj <nombre_del_fichero>");
            return;
        }
        String nombreFichero = args[0];
        
		File file = new File(nombreFichero);
		if(file.exists()) {
			if(file.isFile()) {
				file.delete();
			}
		}
	}
}
