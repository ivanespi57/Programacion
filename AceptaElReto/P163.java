import java.util.Scanner;

public class P163{


    public static String sumaHexa(String hex){

        String solucion = "";

        //Realizar el cálculo del siguiente núm hexadecimal

        int i = hex.length()-1;
        char c = hex.charAt(i);
        String s = "";

        while (c == 'F' && i >= 0){
            i--;
            c = hex.charAt(i);
            s = s + "0";
        }
        if (i < 0){
            s = "1" + s;
        }else{
 
            switch (c) {
                case '0': s = hex.substring(0,i) + "1" + s; break;
                case '1': s = hex.substring(0,i) + "2" + s; break;    
                case '2': s = hex.substring(0,i) + "3" + s; break;
                case '3': s = hex.substring(0,i) + "4" + s; break;
                case '4': s = hex.substring(0,i) + "5" + s; break;
                case '5': s = hex.substring(0,i) + "6" + s; break;
                case '6': s = hex.substring(0,i) + "7" + s; break;
                case '7': s = hex.substring(0,i) + "8" + s; break;
                case '8': s = hex.substring(0,i) + "9" + s; break;
                case '9': s = hex.substring(0,i) + "A" + s; break;
                case 'A': s = hex.substring(0,i) + "B" + s; break;
                case 'B': s = hex.substring(0,i) + "C" + s; break;
                case 'C': s = hex.substring(0,i) + "D" + s; break;
                case 'D': s = hex.substring(0,i) + "E" + s; break;
                case 'E': s = hex.substring(0,i) + "F" + s; break;
                
                default:
            }
        }

        return s;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String hexa = sc.nextLine();

        while ( ! hexa.equals("FIN"))

            System.out.println(sumaHexa(hexa));

            hexa = sc.nextLine();

        }
        
    }
    

