
import java.util.Scanner;

public class PE6 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int dia1, dia2;
        int hora1, hora2;
        int horaT = 0;
        

        System.out.println("Introduce el primer dia (1-7): ");
        dia1 = sc.nextInt();
        System.out.println("Introduce la primera hora (0-23)");
        hora1 = sc.nextInt();
        System.out.println();
        System.out.println("Introduce el segundo dia (1-7): ");
        dia2 = sc.nextInt();
        System.out.println("Introduce la segunda hora (0-23)");
        hora2 = sc.nextInt();
        System.out.println();
        
        String dia1s = "";
        String dia2s = "";
        if ( (dia1 >= 1 && dia1 <= 7) && (hora1 >= 0 && hora1 <= 23) 
             &&
             (dia2 >= 1 && dia2 <= 7) && (hora2 >= 0 && hora2 <= 23)
             &&
             dia1>=dia2 || (dia1 == dia2 && hora1 <= hora2) ){
                switch (dia1) {
                case 1: dia1s = "lunes"; break;
                case 2: dia1s = "martes"; break;
                case 3: dia1s = "miércoles"; break;
                case 4: dia1s = "jueves"; break;
                case 5: dia1s = "viernes"; break;
                case 6: dia1s = "sábado"; break;
                case 7: dia1s = "domingo"; break;
                default: dia1s = "Dia inválido"; break;
               
                }
                switch (dia2) {
                    case 1: dia2s = "lunes"; break;
                    case 2: dia2s = "martes"; break;
                    case 3: dia2s = "miércoles"; break;
                    case 4: dia2s = "jueves"; break;
                    case 5: dia2s = "viernes"; break;
                    case 6: dia2s = "sábado"; break;
                    case 7: dia2s = "domingo"; break;
                    default: dia2s = "Dia inválido"; break;
                   
                }

                horaT = ((dia1 - dia2) * 24) + (hora2 - hora1); 
                 
                
                
            }
            
            System.out.println("Entre las "+hora1+" del "+dia1s+" y las "+hora2+" del "+dia2s+" hay "+horaT+" horas.");
            
    }
}
    
