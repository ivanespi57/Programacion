import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class EntreDosLineas {
    public static void main(String[] args) {
        
        String s = "";
        ArrayList<String> lista = new ArrayList<>();

        try {
            FileReader fr = new FileReader("hola2.txt");
            BufferedReader br = new BufferedReader(fr);
           
            while ((s = br.readLine()) != null) { 
                lista.add(s);
            }

            br.close();
            fr.close();

        } catch (IOException e) {
            System.out.println(e.toString());
        }

        if(!lista.isEmpty()) {
            try {
                FileWriter fw = new FileWriter("hola2.txt", false);

                fw.write(lista.get(0) + "\n");
                fw.write("Iván\n");
                fw.write(lista.get(1));

                /* for (int i = 0; i < lista.size(); i++) {
                    fw.write(lista.get(i) + "\n");
                    fw.flush();
                }*/
                
                fw.close();

            } catch (IOException e) {
                System.out.println(e.toString());
            }
        }
    }
}
