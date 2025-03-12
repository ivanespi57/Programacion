import java.util.ArrayList;
import java.util.Scanner;

public class PruebaVehiculo {
    
    public static int menu(){
        Scanner sc = new Scanner(System.in);

        System.out.println("VEHÍCULOS");
        System.out.println("=========");
        System.out.println("1. Añadir bici");
        System.out.println("2. Añadir coche");
        System.out.println("3. Anda en bicicleta");
        System.out.println("4. Anda en coche");
        System.out.println("5. Ver kilometraje de la bicicleta");
        System.out.println("6. Ver kilometraje del coche");
        System.out.println("7. Ver kilometraje total");
        System.out.println("8. Ver vehículos totales");
        System.out.println("9. Salir");
        System.out.println("Elige una opción (1-9):");

        return sc.nextInt();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        double km;
        ArrayList<Bicicleta> bici = new ArrayList<>();
        ArrayList<Coche> coche = new ArrayList<>();
        
        do {
            
            n = menu();

            switch (n) {
                case 1 : 
                    Bicicleta b1 = new Bicicleta();
                    bici.add(b1);
                    break;
                case 2 : 
                    Coche c1 = new Coche();
                    coche.add(c1);
                    break;
                case 3 :
                    int posb = (int)(Math.random()* bici.size());
                    double andar = (int)(Math.random() * 10 +1);
                    bici.get(posb).anda(andar);
                    break;
                case 4 :
                    int posc = (int)(Math.random()* bici.size());
                    double andarc = (int)(Math.random() * 10 +1);
                    bici.get(posc).anda(andarc);
                    break;
                case 5 :
                    System.out.println("KM BICIS");
                    for (Bicicleta b : bici) {
                        System.out.println("Km: "+ b.getKilometrosRecorridos());
                    }
                    break;
                case 6 :
                System.out.println("KM BICIS");
                    for (Coche c : coche) {
                        System.out.println("Km: "+ c.getKilometrosRecorridos());
                    }
                    break;
                case 7 :
                    System.out.println("Estos son los kilómetros totales: "+ Vehiculo.getKilometrosTotales());
                    break;
                case 8 :
                    System.out.println("Estos son todos los vehículos: " + Vehiculo.getVehiculosCreados());
                    break;
                case 9 :
                    System.out.println("Saliendo");
                    break;
                default:
                    System.out.println("Opción incorrecta");
            }

        }while(n != 9);
        
    
    }
}
