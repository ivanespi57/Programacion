public class PruebaEjer3 {
    public static void main(String[] args) {
        Integer n;

    
        System.out.println("Introduce un número entero positivo:");
        n = Ejer3.LeeIntPos();
        
        System.out.println("Introduce un número:");
        n = Ejer3.LeeInt();

        System.out.println("Has leido el valor "+n);

        System.out.println("Introduce un número entre el 0 y el 10");
        n = Ejer3.LeeIntRango(0,10);
        
        
    }
}
