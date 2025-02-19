import java.util.Scanner;
public class PruebaTren {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    Tren t1 = new Tren("T100", 10);
    Tren t2 = new Tren("T200", 20);
    Tren t3 = new Tren("T300", 30);

    Viaje v1 = new Viaje("viaje1","06/02/2023",t1);
    Viaje v2 = new Viaje("viaje2","06/02/2023",t2);
    Viaje v3 = new Viaje("viaje3","06/02/2023",t3);

    Estacion e1 = new Estacion("Algemesi", 10.0);
    Estacion e2 = new Estacion("Xativa", 12.0);
    Estacion e3 = new Estacion("Gandia", 15.0);
    Estacion e4 = new Estacion("Paiporta", 8.0);
    Estacion e5 = new Estacion("Torrent", 9.0);
    Estacion e6 = new Estacion("Segorbe", 22.0);

    v1.addEstacion(e1);
    v1.addEstacion(e2);
    v1.addEstacion(e3);
    v2.addEstacion(e4);
    v2.addEstacion(e5);
    v3.addEstacion(e6);

    Pasajero p1 = new Pasajero("Patxi", "Sanchis", "12345678W", 25);
    Pasajero p2 = new Pasajero("Angel", "Berlanas", "12121212Y", 15);
    Pasajero p3 = new Pasajero("Antonio", "Calabuig", "98989898A", 32);

    System.out.print("Escribe el nombre de la estacion de destino: ");
    String est = sc.nextLine();

    //Este método buscarEstacion devuelve null si el Viaje no pasa por esa Estacion
    Estacion aux = v1.buscarEstacion(est);

    if (aux != null){ //Existe esa estacion?
        //El método plazaslibres() devuelve una cadena con las plazas libres o "" si está completo
        String libres = v1.plazasLibres();

        if (!libres.equals("")){
            System.out.println("Plazas libres: "+libres);
            System.out.print("Elige una plaza: ");

            int num_asiento = Integer.parseInt(sc.nextLine());

            //El método reservaAsiento() pone el DNI del pasajero en el asiento correspondiente
            v1.reservaAsiento(p1.getDni(), num_asiento);

            //El método precioBillete() calcula el precio del billete según la edad del pasajero
            double precio = aux.precioBillete(p1.getEdad());

            Billete b1 = new Billete(p1.getDni(), est, v1.getFecha(), v1.getTren().getNombre(),
            num_asiento, precio);
            //El método imprimeBillete() imprime el billete completo
            System.out.println(b1.imprimeBillete());
        }else{
            System.out.println("No hay plazas disponibles");
        }
    }else{
        System.out.println("No existe esa estacion");
    }
    }
}
