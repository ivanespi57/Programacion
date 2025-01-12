package libreriaNum;
public class Numeros {

    public static long potencia(int base, int expo){

        long result = 1;

        for(int i = 0; i < expo; i++){
            result = result * base;
        }

        return result;
    }

    public static int cuentaDigitos(int num){

        int digitos = 0;

        String n = String.valueOf(num);

        if (num < 0){

            digitos = n.length() - 1;

        }else{
            
            digitos = n.length();
        }

        return digitos;
    }

    public static int cuentaDigitos(long num){

        int digitos = -1;

        while (num >= 10){

            num = num / 10;
            digitos++;
        }

        return digitos;
    }

    public static int volteaNum(int num){

        int result;

        String str = String.valueOf(num);

        String str1 = "";

        /*for (int i = str.length() -1; i >= 0; i--){
            
            str1 += str.charAt(i);
         }
        */ 

        for (int i = 0; i < str.length(); i++){

            str1 = str.charAt(i) + str1;
        }

        result = Integer.valueOf(str1);

        return result;
    }

    public static boolean esCapicua(int num){

        return (num == volteaNum(num));
    }

    public static boolean esPrimo(int num){

        boolean result = true;

        for(int i = 2; i < num/2 + 1; i++){
            if(num % i == 0){
                result = false;
            }
        }

        return result;
    }

    public static int siguientePrimo(int num){

        num++; 
    
        while (!esPrimo(num)) {
            num++; 
        }

        return num;
    }

    public static int anteriorPrimo(int num){
        
        num--; 
    
        while (!esPrimo(num)) {
            num--; 
        }

        return num;
    }

    public static int uneNumeros(int num1, int num2){

        String str1 = String.valueOf(num1);
        String str2 = String.valueOf(num2);
        String compl = str1 + str2;
        int nuevoNum = Integer.valueOf(compl);

        return nuevoNum;
    }

}
