public class Propaga1 {
    public static void main(String[] args) {
        try {
            
            int result = divide(10, 0);
            System.out.println("Resultado: " + result);
        
        } catch (ArithmeticException e) {
            
            System.out.println("Excepción capturada en main: " + e.getMessage());
        }
    }
    public static int divide(int nume, int denom) throws ArithmeticException{
        if (denom == 0) {
        
            throw new ArithmeticException("No se puede dividir por cero");
        }
        return nume / denom;
    }
}

