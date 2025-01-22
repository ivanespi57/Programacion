import java.util.HashMap;
import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        HashMap<Integer,Integer> hash = new HashMap<Integer,Integer>();

		boolean fin=false;
		int n = sc.nextInt();
        sc.nextLine();
        int fecha;
        int predic;
        int suma = 0; 
        
        do{
			

			if (n == 0){
				fin=true; 
			}else{
                for (int i = 0; i < n; i++) {
                    fecha = sc.nextInt(); 
                    predic = sc.nextInt();
                    suma = fecha + predic;

                    hash.put(fecha, suma);
                    
                    if (suma >= fecha){

                    }else{
                        System.out.println(suma + 1);
                    } 
                    // ni idea Patxi

                }
                for (HashMap.Entry<Integer,Integer> mapa : hash.entrySet()) {
                
                    System.out.println(mapa.getKey() + ": " + mapa.getValue());


                }
                n = sc.nextInt();
			}

		}while (!fin);
    }
}
