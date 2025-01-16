
import java.util.Scanner;
import java.util.TreeSet;

public class P185 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        int casos = Integer.valueOf(sc.next());
        

        while (casos != 0){
            TreeSet<String> si = new TreeSet<String>();
            TreeSet<String> no= new TreeSet<String>();

            for (int i = 0; i < casos; i++) {
                
                String resp = sc.next(); //  SI: o NO:

                if (resp.equals("SI:")){
                    
                    boolean salir = false;
                    
                    do { 
                        String palabra = sc.next();
                        if (palabra.equals("FIN")){
                            salir = true;
                        }else{
                            si.add(palabra);
                            no.remove(palabra);
                        }
                    } while (!salir);

                }else{
                    
                    boolean salir = false;
                    
                    do { 
                        String palabra = sc.next();
                        if (palabra.equals("FIN")){
                            salir = true;
                        }else{
                            if (!si.contains(palabra)){
                                no.add(palabra);
                            }
                        }
                    } while (!salir);
                }
            }
            if (no.size() > 0){
                Object[] ingredientes = no.toArray();

                System.out.print(ingredientes[0]);

                for(int i = 1; i < ingredientes.length; i++){

                    System.out.print(" " + ingredientes[i]);
                }
                
            }
            System.out.println();  
            casos = Integer.valueOf(sc.next());
        }
        
        
    }
}
