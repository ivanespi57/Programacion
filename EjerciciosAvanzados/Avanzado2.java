
import java.util.Scanner;
public class Avanzado2 {
    public static void main(String[] args) {

        //variables
        double kg;
        double alt; 
        double imc;

        Scanner sc = new Scanner(System.in);
        
        //Pedir peso y alt
        System.out.println("Dime tu peso (en kilos): ");
        kg = sc.nextDouble();
        System.out.println("Dime tu altura (en metros): ");
        alt = sc.nextDouble();
       
        //Calcula el imc = peso/(alt*alt)
        imc = kg/(alt*alt);
        
        //Si imc < 20 entonces 
        //Imprime "Delgado/a"
        //fsi
        if (imc < 20){
            System.out.println("Delgado/a");

          }
        //si imc >= 20 y imc <= 30 entonces
        // imprime "Normal"
        //fsi
        if (imc >= 20 && imc <= 30) {

            System.out.println("Normal");
        }
    
        //si imc > 30 entonces 
        //Imprime "Obeso/a"
        //fsi  
        if (imc > 30){
            System.out.println("Obeso/a");
        }

        
    }

}
