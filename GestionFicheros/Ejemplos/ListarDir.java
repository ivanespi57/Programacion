
import java.io.File;
import java.util.Scanner;

public class ListarDir {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el nombre del directorio");
        String nombre = sc.next();

        try {
            File f = new File(nombre);

            if (f.isDirectory()){
                String[] lista = f.list();

                for (String string : lista) {
                    System.out.println(string);
                }
            }else{
                f.mkdir();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        
       
    }
}
