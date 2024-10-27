import java.util.Scanner;

public class PExtra5d {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int numNiv;
        int numPos;
        int pos1;
        int posFin;
        int cont;
        String res;

        System.out.print("Lineas de la pirámide: ");
        numNiv = sc.nextInt(); 
        
        numPos = numNiv * 2 -1; 
        pos1 = numNiv;
        posFin = numNiv;
        
        for (int i = 0; i < numNiv; i++) { // números de líneas --> 4 líneas
            cont = 1;               
            res = "";
            
            for (int j = 0; j <= numPos; j++) { // recorre las posiciones de "res"
                if ((j < pos1) || (j > posFin)) {
                    res += " "; // res = res + " "
                } else {
                    if (j < numNiv) {
                        res += cont; // res = res + cont
                        cont++;
                    } else {
                        res += cont;
                        cont--;
                    }
                }    
            }
            System.out.println(res);
            posFin++;
            pos1--;
        }
    }
}