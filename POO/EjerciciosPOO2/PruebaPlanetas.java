public class PruebaPlanetas {
    public static void main(String[] args) {
        Planeta p1 = new Planeta("Marte", 1000000L, 3456.68);
        Planeta p2 = new Planeta("Tierra", 10000L, 12.3);

        Satelite s1 = new Satelite("Fobos", p1, 15000L);
        Satelite s2 = new Satelite("Luna", p2, 1000L);
        Satelite s3 = new Satelite("Deimos", p2, 12000L);

        System.out.println(p1.getnSatelites());
        System.out.println(p2.getnSatelites());
    }
}
