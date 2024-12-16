
import java.util.Scanner;

public class ExamenPuntualidad {
    
    public static boolean tarde(String linea){

        String[] datos = linea.split(" ");        
        boolean nopuntual = false;

        // String nombre = datos[0];   No hace falta para el problema 
        String turno = datos[1];
        String hora = datos[2];

        int h = Integer.parseInt(hora.split(":")[0]); // separas horas de minutos y lo conviertes a entero
        int m = Integer.parseInt(hora.split(":")[1]); // separas minutos de horas y lo conviertes a entero


        switch (turno) {
            case "M": if ((h > 6) || (h == 6 && m != 0)){
                        nopuntual = true;
                    }
                    break;
            case "T": if ((h > 14) || (h == 14 && m != 0)){
                        nopuntual = true;
                    }
                    break;
            case "N": if ((h > 22) || (h == 22 && m != 0)){
                        nopuntual = true;
                    }
                    break;     
        }


        return nopuntual;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int casos;
        String linea;
        int suma = 0;

        casos = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < casos; i++) {
            linea = sc.nextLine();
            if (tarde(linea)){
                suma++;
            }
            
        }
        System.out.println(suma);
    }
}
