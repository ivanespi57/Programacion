
import java.util.Scanner;
import libreriaNum.*;

public class PruebaLibNum{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // PRUEBA DE LAS FUNCIONES DE LA CLASE NÚMEROS

        int num = 12345;
        int numNeg = -12345;
        int numCapi = 3883;
        
        System.out.println(Numeros.potencia(4, 3));

        System.out.println(Numeros.cuentaDigitos(num));

        System.out.println(Numeros.cuentaDigitos(numNeg));

        System.out.println(Numeros.volteaNum(num));

        System.out.println(Numeros.esCapicua(numCapi));

        System.out.println(Numeros.esPrimo(15));

        System.out.println(Numeros.siguientePrimo(13));

        System.out.println(Numeros.anteriorPrimo(13));

        System.out.println(Numeros.uneNumeros(123, 45));


        // EJERCICIOS DEL PDF 

        // Ejercicio 1

        int numPrimos = 0;

        for(int i = 1; i <= 1000; i++){
            if(Numeros.esPrimo(i)){
                //System.out.println(i);
                numPrimos++;
            }
        }
        System.out.println(numPrimos);

        // Ejercicio 2

        int numCap = 0;

        for(int i = 1000; i <= 9999; i++){
            if(Numeros.esCapicua(i)){
                //System.out.println(i);
                numCap++;
            }
        }
        System.out.println(numCap);

        // Ejercicio 3 (210 de acepta el reto)

        int casos;
        String palabra;
        int suma;
        char letra;

        casos = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < casos; i++){
            palabra = sc.nextLine();
            suma = 0;
            for(int j = 0; j < palabra.length(); j++){
                letra = palabra.charAt(j);
                suma += letra; // suma el valor de la tabla ASCII del carácter a "suma"
            }
            System.out.println(Numeros.anteriorPrimo(suma));
        }
    }

}
