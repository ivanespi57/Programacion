public class PruebaCoche {
    public static void main(String[] args) {
        
        Coche ivancoche = new Coche();
        Coche luciaCoche = new Coche("Audi","R8", "negro",5);

        System.out.println(ivancoche.numPlazas);
        System.out.println(luciaCoche.marca);
    }
}
