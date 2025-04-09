import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class UsuarioContraseña {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String linea;
        ArrayList<String> lista = new ArrayList<>();
        
        try {
            
            FileReader fr = new FileReader("passwd.txt");
            BufferedReader br = new BufferedReader(fr);
            
            while((linea = br.readLine()) != null){
                lista.add(linea.split(":")[0]);
            }

            br.close();
            fr.close();

        } catch (IOException e) {
            e.getMessage();
        }
        
        
        System.out.println("Dime un nombre de usuario: ");
        String usuario = sc.nextLine();
        /*if(lista.contains(usuario)){
            System.out.println("Ya existe este usuario");           // Lo mismo que lo de abajo pero si no utilizamos el contains
        }*/
        boolean yaexiste = false;
        for (String string : lista) {
            if(string.equals(usuario)){
                yaexiste = true;
            }
        }
        if(yaexiste){
            System.out.println("El usuario ya existe");
        }else{
            System.out.println("Dime la contraseña: ");
            String contra = sc.nextLine();
            
            try{
                
                FileWriter fw = new FileWriter("passwd.txt",true);
                

                fw.write(usuario +":"+ contra+"\n");

                fw.close();
                
            }catch(IOException e){
                e.getMessage();
            }    
        }  
    }
}
