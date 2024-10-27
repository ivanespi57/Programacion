package PE;

import java.util.Scanner;

public class PE7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int puntosJ = 0;
        int puntosO = 0;
<<<<<<< HEAD
        int tryMaq = (int)(Math.random()*3);
=======
        int tryMaq;
>>>>>>> 277e4d8f255500ef996737946cc54f275e0dbd01
        int tryYo;
        
        do{
            
            tryMaq = (int)(Math.random()*3+1);
            System.out.println("Selecciona una opción: ");
            System.out.println("1- Piedra 2- Papel 3- Tijeras");
            System.out.println("Elige: ");
            tryYo = sc.nextInt();

            if (tryMaq >=1 && tryMaq <= 3){
                //Quien gana?
                if (tryMaq == tryYo){
                    System.out.println("Empate");
                }else{
                    if ( (tryYo == 1 && tryMaq == 3) || (tryYo == 2 && tryMaq == 1) || (tryYo == 3 && tryMaq == 2) ){
                        System.out.println("Has ganado ;)");
                        puntosJ++;
                    }else{
                        System.out.println("Has perdido :(");
                        puntosO++;
                    }
                }
            }else{
                System.out.println("Opción inválida");
            }
        }while (puntosO < 3 && puntosJ < 3);
        
        if (puntosJ == 3){
            System.out.println("Victoria");
        }else {
            System.out.println("Derrota");
        }
    
        
    }
    
}
