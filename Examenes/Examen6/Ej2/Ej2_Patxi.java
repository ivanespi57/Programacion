
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Ej2_Patxi {
    public static void main(String[] args) {
        
        if (args.length != 1){  
            System.out.println("No hay argumentos");
        }else{
            String fichero = args[0];

            try {
                String linea;
                HashMap<String, Integer> map = new HashMap<>();
                FileReader fr = new FileReader(fichero);
                BufferedReader entrada = new BufferedReader(fr);

                while((linea = entrada.readLine()) != null){
                    String valor = linea.split(" ")[0];
                    if (valor.equals("#")){
                        valor = "Comentarios";
                    }
                    if(map.containsKey(valor)){
                        
                        map.replace(valor, map.get(valor) + 1);

                    }else{
                        map.put(valor, 1);
                    }     
                }

                for (Map.Entry<String, Integer> elemento : map.entrySet()) {
                    System.out.println(elemento.getKey()+" "+elemento.getValue());
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }   
}
