
import java.util.Arrays;

public class ordenar {
    public static void main(String[] args) {
        
      
        int[] vector1 = {4,8,2,-5,-2,7,3};
        int[] vector2 = {-5, -2, 2, 3, 4, 7, 8};

        System.out.println(vector1);

        System.out.println(Arrays.toString(vector1));
        System.out.println(Arrays.toString(vector2)); // muestra el Array

        System.out.println(Arrays.equals(vector1, vector2));
      

        Arrays.sort(vector1); // para ordenar el Array de menor a mayor
        System.out.println(Arrays.toString(vector1));

        System.out.println(Arrays.equals(vector1, vector2));
        
        //Obtener mayor o menor de un array

        int[] array = {40, 50, 10, 30, 20};

        int menor = array[0];
        int mayor = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < menor){
                menor = array[i]; // para que se actualice el menor
            }            
            if (array[i] > mayor){
                mayor = array[i]; // para que se actualice el mayor
            }  
        }

        System.out.println("El menor es "+ menor);
        System.out.println("El mayor es "+ mayor);
    }
    
}
