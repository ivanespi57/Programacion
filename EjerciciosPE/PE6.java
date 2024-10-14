
import java.util.Scanner;

public class PE6 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int dia1, dia2;
        int hora1, hora2;
        int horaT1, horaT2;
        int horaTr = 1;

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

        if ( (dia1 >= 1 && dia1 <= 7) && (hora1 >= 0 && hora1 <= 23) 
             &&
             (dia2 >= 1 && dia2 <= 7) && (hora2 >= 0 && hora2 <= 23)
             &&
             dia1>=dia2 || (dia1 == dia2 && hora1 <= hora2) ){

                
            }else{
                System.out.println("Inválido");
            }
            horaT1 = (dia1 - 1) * 24 + hora1; 
            horaT2 = (dia2 - 1) * 24 + hora2; 
            horaTr = horaT2 - horaT1;
            System.out.println(horaTr);





        /*switch (dia1) {
            case 1:System.out.println("lunes"); break;
            case 2:System.out.println("martes");break;
            case 3:System.out.println("miércoles");break;
            case 4:System.out.println("jueves");break;
            case 5:System.out.println("viernes");break;
            case 6:System.out.println("sabado");break;
            case 7:System.out.println("domingo");break;
                
            default: System.out.println("Dia inválido");
        }
        switch (hora1) {
            case 1:
                
                
            default:
          */      
        }
    }
