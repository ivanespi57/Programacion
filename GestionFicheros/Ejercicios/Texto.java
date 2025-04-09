
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Texto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
            String texto = sc.nextLine();
            FileWriter fw = new FileWriter("texto.txt",true);

            while(!texto.equals("fin")){
                fw.write(texto +"\n");

                fw.flush();

                texto = sc.nextLine();
            
            }
                
            fw.close();
            

            
        }catch(IOException e){
            e.getMessage();
        }

        
        
        
    }
}
