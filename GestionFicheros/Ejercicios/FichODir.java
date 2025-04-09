import java.io.File;
import java.util.Scanner;

public class FichODir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (args.length != 0){
            try {   
                File f = new File(args[0]);
    
                if (args.length != 0){
                    if (f.exists()) {
                        if (f.isFile()){
                            System.out.println("Es un fichero");
                        }else{
                            System.out.println("Es un directorio");  
                        }
                        System.out.println("La ruta es: "+ f.getAbsolutePath());
                        System.out.println("El tamaño es: "+ f.length());

                        if(f.canExecute()){
                            System.out.println("Tiene permiso de ejecución");
                        }else{
                            System.out.println("No tiene permiso de ejecución");
                        }
                        if(f.canRead()){
                            System.out.println("Tiene permiso de lectura");
                        }else{
                            System.out.println("No tiene permiso de lectura");
                        }
                        if(f.canWrite()){
                            System.out.println("Tiene permiso de escritura");
                        }else{
                            System.out.println("No tiene permiso de escritura");
                        }
                    }else{
                        System.out.println("No existe");
                    }
                }
            }catch (Exception ea){
                System.out.println(ea.toString());
            }
        }else{
            System.out.println("No hay argumentos");
           
        }
    }
}

