

public class Ejemplo2 {
    
    public static void main(String[] args) {
        
        int p = 6;
        int q = 4;
        int suma = p + q;
        int mult = p * q;
        int resto = p % q; // resto de división
        double division = p / q; // asi no da decimal bien
        double divDecimales = (double)p / q; // para que de bien los decimales
        double quitaDecimales = 100.99; // este
        int x = (int) quitaDecimales; // y este van juntos, para quitar los decimales sin redondear, cortando

        

    

        boolean resultado1 = (p == (q * 2));
        boolean resultado2 = (p >= (q * 2));
        boolean resultado3 = (p > q);
        boolean resultado4 = ((p > q) && (p <= q)); // Siempre falso
        boolean resultado5 = ((p > q) || (p < q));  // Si son iguales es false, pero si una true, es true
        

        System.out.println(division);
        System.out.println(suma);
        System.out.println(mult);
        System.out.println(resto);
        System.out.println(resultado1);
        System.out.println(resultado2);
        System.out.println(resultado3);
        System.out.println(resultado4);
        System.out.println(resultado5);
        System.out.println(divDecimales);
        System.out.println(x); // para quitar los decimales 
    }
    
}
