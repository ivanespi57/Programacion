
import java.util.Scanner;

public class PE8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int puntosJ = 0;
        int puntosO = 0;
        int tryMaq;
        int tryYo;
        
        do{
            
            tryMaq = (int)(Math.random()*5+1);
            System.out.println("Selecciona una opción: ");
            System.out.println("1- Piedra 2- Papel 3- Tijeras 4- Lagarto 5- Spock");
            System.out.println("Elige: ");
            tryYo = sc.nextInt();

            if (tryYo >=1 && tryYo <= 5){
                //Quien gana?
                if (tryMaq == tryYo){
                    System.out.println("Empate");
                    System.out.printf("Tu opción: %d La opción del ordenador: %d\n", tryYo, tryMaq);
                    System.out.printf("Tus puntos: %d Puntos del ordenador: %d\n",puntosJ, puntosO);
                    System.out.println("");
                }else{
                    if ((tryYo == 1 && tryMaq == 3) || (tryYo == 2 && tryMaq == 1) || (tryYo == 3 && tryMaq == 2) ||
                        (tryYo == 4 && tryMaq == 5) || (tryYo == 4 && tryMaq == 2) || (tryYo == 5 && tryMaq == 3) 
                        || (tryYo == 5 && tryMaq == 1) || (tryYo == 1 && tryMaq == 4) || (tryYo == 2 && tryMaq == 5) 
                        || (tryYo == 3 && tryMaq == 5)) {

                            System.out.printf("Tu opción: %d La opción del ordenador: %d\n", tryYo, tryMaq);
                            System.out.println("Has ganado ;)");
                            puntosJ++;
                            System.out.printf("Tus puntos: %d Puntos del ordenador: %d\n",puntosJ, puntosO);
                            System.out.println("");
                    }else{
                        System.out.printf("Tu opción: %d La opción del ordenador: %d\n", tryYo, tryMaq);
                        System.out.println("Has perdido :(");
                        puntosO++;
                        System.out.printf("Tus puntos: %d Puntos del ordenador: %d\n",puntosJ, puntosO);
                        System.out.println("");
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

