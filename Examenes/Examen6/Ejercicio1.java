
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {

            FileWriter fw = new FileWriter("enlaces.html",true);
            int n = sc.nextInt();
            sc.nextLine();

            for (int i = 0; i < n; i++) {
                String lineas = sc.nextLine();

                String[] separar = lineas.split(" ");
 
                String x = "<a href='http://" + separar[0] + "'>" + separar[1] + "</a>";
                fw.write(x+"\n");

                fw.flush();

                
            }
            fw.close();
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
}
