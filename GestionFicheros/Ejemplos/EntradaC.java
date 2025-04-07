import java.io.FileWriter;
import java.io.IOException;


public class EntradaC {
    public static void main(String[] args) {
        
        try {
            //FileReader fr = new FileReader("hola.txt");

            //BufferedReader br = new BufferedReader(fr);
            FileWriter fw = new FileWriter("hola2.txt",true);

            String out = "Hola otra vez\n";
            fw.write(out);

            fw.flush();
            out = "Adios";
            fw.write(out);
            fw.close();

        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }
}
