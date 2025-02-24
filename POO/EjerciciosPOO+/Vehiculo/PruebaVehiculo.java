import java.util.Scanner;

public class PruebaVehiculo {
    
    public static int menu(){
        Scanner sc = new Scanner(System.in);

        System.out.println("VEHÍCULOS");
        System.out.println("=========");
        System.out.println("1. Anda en bicicleta");
        System.out.println("2. Anda en coche");
        System.out.println("3. Ver kilometraje de la bicicleta");
        System.out.println("4. Ver kilometraje del coche");
        System.out.println("5. Ver kilometraje total");
        System.out.println("6. Ver vehículos totales");
        System.out.println("7. Salir");
        System.out.println("Elige una opción (1-7):");

        return sc.nextInt();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        double km;
        Bicicleta b1 = new Bicicleta();
        Coche c1 = new Coche();
        
        do {
            
            n = menu();

            switch (n) {
                case 1 :
                    System.out.println("¿Cuantos kilometros anda en bicicleta?");
                    km = sc.nextDouble();
                    b1.anda(km);
                    
                    break;
                case 2 :
                    System.out.println("¿Cuantos kilometros anda en coche?");
                    km = sc.nextDouble();
                    c1.anda(km);

                    break;
                case 3 :
                    System.out.println("Estos son los kilómetros de la bici: " + b1.getKilometrosRecorridos());
                    break;
                case 4 :
                    System.out.println("Estos son los kilómetros del coche: " + c1.getKilometrosRecorridos());
                    break;
                case 5 :
                    System.out.println("Estos son los kilómetros totales");
                    break;
                case 6 :
                    System.out.println("Estos son todos los vehículos: ");
                    break;
                case 7 :
                    System.out.println("Saliendo");
                    break;
                default:
                    System.out.println("Opción incorrecta");
            }

        }while(n != 7);
        
    
    }
}
