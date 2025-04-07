import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Entrada {
    public static void main(String[] args) {
        int b;
        try {
        
            FileInputStream fis = new FileInputStream("adios");
            FileOutputStream fis2 = new FileOutputStream("hola",true);
            //new FileInputStream("lectura.bin");
    
            
            while((b = fis.read()) != -1) {
                System.out.println(b);
                fis2.write(b);
            }
            fis2.close();
            fis.close();
    
            
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
    
}
