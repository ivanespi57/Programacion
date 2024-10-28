
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
        

    }
    
}
