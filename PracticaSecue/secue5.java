import java.util.Scanner;

public class secue5 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int hora;

        System.out.println("¿Que hora és?");
        hora = sc.nextInt();
        
        switch (hora) {
            case 0:
            
            case 1:
                
            case 2:
           
            case 3:
            
            case 4:
                
            case 5:
                System.out.println("De madrugada");
                break;
            case 6:
                
            case 7:
            
            case 8:
                
            case 9:
                
            case 10:
                
            case 11:
                System.out.println("Buenos días");
                break;
            case 12:
               
            case 13:
                
            case 14:
                
            case 15:
              
               
            case 16:
              
                 
            case 17:
                
            case 18:
                
            case 19:
                System.out.println("Buenas tardes");  
                break;
            case 20:
                
            case 21:
            
            case 22:
            
            case 23:
                System.out.println("Buenas noches");
                break;
            default: System.out.println("Hora inválida");                
                 break;
        }

    }
    
}
