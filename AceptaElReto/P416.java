import java.util.Scanner;

public class P416 {
    static Scanner sc = new Scanner(System.in);
    
    public static boolean cum(int casos){

        String[] fechas = new String[casos];
        boolean rep = false;

        for (int i = 0; i < casos; i++) {
            String fecha = sc.next();
            // Compara dias y meses 
            String dm = fecha.substring(0, 5); // Obtener solo DD/MM
        
            for (int j = 0; j < i; j++) {
                
                if (dm.equals(fechas[j].substring(0, 5))) {
                    rep = true;
                    
                }
            }
            fechas[i] = fecha; // Almacena toda la fecha
        }
        return rep;
    }
    
    
    public static void main(String[] args) {
        

        int casos = sc.nextInt();
        boolean rep;
        do {
            rep = cum(casos);
            
            if (rep) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }

            casos = sc.nextInt();

        }while (casos != 0);
    }
}

