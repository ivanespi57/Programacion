import java.util.ArrayList;
import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<Integer>();

        int sig = 0; 
        int aleatorio;
        int numeros; 

        for (int i = 1; i <= 90; i++){
            lista.add(i);
        }

        System.out.println("BINGO");
        System.out.println("Estos son los números cantados: ");

        while (lista.size() > 0){   // para comprobar si tiene los números la lista 
            System.out.println("Pulsa 0 y luego Enter para mostrar el siguiente número: ");
            sig = sc.nextInt();
            
            if (sig == 0){
                aleatorio = (int) ((Math.random() * lista.size())); // número aleatorio dentro de la lista
                numeros = lista.get(aleatorio); // cogemos ese número
    
                System.out.println("¡" + numeros + "!"); 
    
                lista.remove(aleatorio); // para borrar el número de la lista
            }else{
                System.out.println("Ese  no es el 0, intentalo otra vez!");
            }
        }
        
        
    }
}
