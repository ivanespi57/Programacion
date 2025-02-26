import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean fin=false;
        
        do{
            int casos = sc.nextInt();
            String info;
            String nombre = "";
            int recompensa;
            int punteria;
            int max_recomp = 0;
            int max_punt = 0;
    
            if (casos == 0){
                    fin=true;
            }else{
                for (int i = 0; i < casos; i++) {
                    
                    info = sc.nextLine();
                    String[] infoF = info.split(" ");
                    nombre = infoF[0];
                    recompensa = Integer.parseInt(infoF[1]);
                    punteria = Integer.parseInt(infoF[2]);

                    if (recompensa == max_recomp) {
                        
                        if (punteria < max_punt){
                            
                        }
                    }
                }
               
            }

        }while (!fin);

    }
}
