public class PruebaFraccion {
    public static void main(String[] args) {
        
        Fraccion f1 = new Fraccion();
        Fraccion f2 = new Fraccion(2, 3);
        Fraccion f3 = new Fraccion(3,14);
        Fraccion f4 = new Fraccion(2,9);
        Fraccion f5 = new Fraccion(24,54);

        System.out.println(f1);

        System.out.println(f2);

        System.out.println(f3);

        f2.invertir();
        System.out.println(f2);

        f2.multiplicar(f3);
        System.out.println(f2);

        f2.dividir(f4);
        System.out.println(f2);

        f5.simplificar();
        System.out.println(f5);

        f4.suma(f5);
        System.out.println(f4);
    }
}
