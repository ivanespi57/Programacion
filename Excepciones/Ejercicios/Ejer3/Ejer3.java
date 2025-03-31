
import java.util.Scanner;

public class Ejer3 {
    static Scanner sc = new Scanner(System.in);

    public static Integer LeeInt(){      

        Integer n = null;

        try{
            n = sc.nextInt();

        }catch(Exception e){
            System.out.println("Valor no Entero");
        }
        
        return n;
    }

    public static Integer LeeIntPos(){
        
        Integer n = null;

        try{
            n = sc.nextInt();

            Error1(n);

        }catch(ExcepcionPos e){
 
            System.out.println(e.toString());
        
        }catch(Exception e){
            System.out.println("Error indefinido");
        }
        
        return n;
    }

    public static Integer LeeIntRango(int min, int max){
        Integer n = null;

        try{
            n = sc.nextInt();

            
            if (n < min || n > max){
                Error2(n);
            }

        }catch(ExcepcionRango e){
 
            System.out.println(e.toString());
        
        }

        return n;
    }

    private static void Error1(Integer n) throws ExcepcionPos{
        
        if (n < 0){
            throw new ExcepcionPos("No es entero positivo");
        }
    }

    private static void Error2(Integer n) throws ExcepcionRango{

        throw new ExcepcionRango("El número no está entre el 0 y el 10");
        
    }
}
