
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class descifrado {
    public static String descifrar(String s, int n){
        String texto_cifrado = "";
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'){
                int letra = ((s.charAt(i) - 65 - n) % 26) + 65;
                texto_cifrado += (char)letra;
            }else{
                texto_cifrado += s.charAt(i);
            }
        }
        return texto_cifrado;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            if (args.length == 1){
                String f = args[0];
                int n = Integer.valueOf(args[1]);
                FileReader fr = new FileReader(f);
                BufferedReader br = new BufferedReader(fr);
                String linea = "";
                String texto = "";
    
                while ((linea = br .readLine()) != null){
                    texto += descifrar(linea,n) + "\n";
                }
                br.close();
                fr.close();
                
                // Crear el fichero con la extensión .cf
                String nombre = f.split("\\.")[0];
                nombre += ".cf"+n;
    
                FileWriter fw = new FileWriter(nombre);

                fw.write(texto);
                fw.close();
            }else{
                System.out.println("ERROR: Número incorrecto de argumentos");
            }

            

            
        } catch (IOException e) {
            System.out.println("ERROR de lectura del fichero");
            e.getMessage();
        } catch (NumberFormatException e){
            System.out.println("ERROR: El segundo argumento no es un número");
            e.getMessage();
        }catch (Exception e){
            System.out.println("ERROR genérico");
        }
        
    }    
}
