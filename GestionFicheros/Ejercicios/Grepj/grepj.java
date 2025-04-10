import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class grepj {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String linea;
        ArrayList<String> lista = new ArrayList<>();
        int cont = 1;
        String txt = args[1];
        

        if (args.length != 0){
            try {   
                File f = new File(args[0]);
                

                if(!f.exists()){
                    System.out.println("El archivo no existe");
                }else{
        
                    FileReader fr = new FileReader(f);
                    BufferedReader br = new BufferedReader(fr);

                    while((linea = br.readLine()) != null){
                        
                        if(linea.contains(txt)){
                            lista.add(cont+": "+ linea);    
                        }
                        cont++;
                    }
                    br.close();
                    fr.close();   
                }

            }catch(Exception e){
                e.getMessage();
            }
            for (String string : lista) {
                String x = "\u001B[32m"+txt+"\u001B[0m";
                System.out.println(string.replace(txt, x));
            }
        }else{
            System.out.println("No hay argumentos");
        }
        
    }
}
