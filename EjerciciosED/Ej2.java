import java.util.ArrayList;

public class Ej2 {
    public static void main(String[] args) {
        
        ArrayList<Integer> lista = new ArrayList<Integer>(); 

        int n = (int)(Math.random() * 11) + 10;
        int suma = 0;
        

        for (int i = 0; i < n; i++) {
            lista.add((int)(Math.random() * 100) + 1);
        }    

        for (Integer x : lista) { // mostrar los números
            System.out.print(x +" ");
        }
        System.out.println();

        int min = lista.getFirst();
        int max =  lista.getFirst();

        for (Integer x : lista) { // suma 
            suma += x;   
            if (x < min){
                min = x;
            }
            if (x > max){
                max = x;
            }
        }
        System.out.println("La suma es "+suma);
        System.out.println("La media es "+suma/lista.size());
        System.out.println("El máximo es "+max);
        System.out.println("El mínimo es "+min);
    }
}
