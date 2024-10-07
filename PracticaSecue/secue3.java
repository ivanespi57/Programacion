import java.util.Scanner;
public class secue3 {
    public static void main(String[] args) {
        int hora;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Dime la hora que es en este momento: ");
        hora = sc.nextInt();
        
        if (hora >= 5 && hora < 12){
            System.out.println("Buenos dias");
         }else if (hora >= 12 && hora < 20){
            System.out.println("Buenas tardes ");
         }else if ((hora >= 20 && hora < 24) || (hora >= 0 && hora < 5)) {
            System.out.println("Buenas noches ");
         }else{
            System.out.println("Hora inválida");
         }
    
    
    }
    
}
