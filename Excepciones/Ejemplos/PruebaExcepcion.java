class MiExcepcion extends Exception {
    
    public MiExcepcion(String mensaje) {
        super(mensaje);
    }
    
}
public class PruebaExcepcion {
    
    public static void rango(int num) throws MiExcepcion {
    
        if ((num > 100) || (num < 0)) {
            throw new MiExcepcion("Número fuera del rango [0,100]");
        }
    }
    public static void main(String[] args) {
        try {
            System.out.println("Probamos con un número 50");
            rango(50);
            System.out.println("Probamos con un número 150");
            rango(150);
        } catch (Exception e) {
            System.out.println("Excepcion: " + e.getMessage());
        }
    }
}
