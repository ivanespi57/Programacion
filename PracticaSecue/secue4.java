import java.util.Scanner;
public class secue4 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int nota;
        System.out.println("Introduce la nota");
        nota = sc.nextInt();

        switch (nota) {
            case 1:
                
            case 2:
           
            case 3:
            
            case 4:
                System.out.println("Suspenso");
                break;
            case 5:
                System.out.println("Aprobado");
                break;
            case 6:
                System.out.println("Bien");
                break;
            case 7:
            
            case 8:
                System.out.println("Notable");
                break;
            case 9:
                
            case 10:
                System.out.println("Sobresaliente");
                break;
                
            default: System.out.println("Nota inválida");                
                break;
        }


    }
    
}
