import java.io.File;
import java.util.Scanner;

public class rmj {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String conf;
        if (args.length != 0){
            try {   
                File f = new File(args[0]);
    
                if (args.length != 0){
                    if (f.exists()) {
                        if (f.isFile()){
                            System.out.println("Seguro (Si o No)");
                            conf = sc.next();
                            if (conf.contains("No")){
                                System.out.println("Adiós :)");
                                
                            }else{
                                System.out.println("Borrando fichero..");
                                f.delete();
                            }
                        }else{
                            System.out.println("No es un fichero");
        
                        }
                    }else{
                        System.out.println("No existe este fichero");
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
