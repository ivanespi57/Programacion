public class libreria {

        // Calcula la potencia de una base elevada a un exponente
        public static double potencia(double base, int exponente) {
            return Math.pow(base, exponente);
        }
    
        // Cuenta el número de dígitos de un número entero
        public static int cuentaDigitos(int numero) {
            return Integer.toString(Math.abs(numero)).length();
        }
    
        // Le da la vuelta a un número
        public static int volteaNum(int numero) {
            int numeroVolteado = 0;
            while (numero != 0) {
                numeroVolteado = numeroVolteado * 10 + numero % 10;
                numero /= 10;
            }
            return numeroVolteado;
        }
    
        // Devuelve verdadero si el número es capicúa
        public static boolean esCapicua(int numero) {
            return numero == volteaNum(numero);
        }
    
        // Devuelve verdadero si el número es primo
        public static boolean esPrimo(int numero) {
            if (numero <= 1) return false;
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) return false;
            }
            return true;
        }
    
        // Devuelve el siguiente número primo
        public static int siguientePrimo(int numero) {
            int siguiente = numero + 1;
            while (!esPrimo(siguiente)) {
                siguiente++;
            }
            return siguiente;
        }
    
        // Devuelve el primo inmediatamente anterior
        public static int anteriorPrimo(int numero) {
            int anterior = numero - 1;
            while (anterior > 1 && !esPrimo(anterior)) {
                anterior--;
            }
            return anterior;
        }
    
        // Une dos números para formar uno
        public static int uneNumeros(int numero1, int numero2) {
            String resultado = Integer.toString(numero1) + Integer.toString(numero2);
            return Integer.parseInt(resultado);
        }
    
        // Comprueba si un número es de Kaprekar
        public static boolean esKaprekar(int numero) {
            if (numero < 1) return false;
            int cuadrado = numero * numero;
            String strCuadrado = Integer.toString(cuadrado);
    
            for (int i = 1; i < strCuadrado.length(); i++) {
                String izquierda = strCuadrado.substring(0, i);
                String derecha = strCuadrado.substring(i);
    
                int izquierdaNum = izquierda.isEmpty() ? 0 : Integer.parseInt(izquierda);
                int derechaNum = derecha.isEmpty() ? 0 : Integer.parseInt(derecha);
    
                if (izquierdaNum + derechaNum == numero) {
                    return true;
                }
            }
            return false;
        }
    }
    

