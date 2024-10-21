import java.util.Scanner;

public class PExtra3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String s;
        int Nsepara = 0 ;
        int aes = 0;
        int ees = 0;
        int ies = 0;
        int oes = 0;
        int ues = 0;
        int vocales;
        char a = ' ';
        int mayus = 0;
        
        System.out.println("Escribe una frase");
        s = sc.nextLine();

        String smin = s.toLowerCase();

        System.out.println("Estos son los caracteres: "+ s.length());
       
        String[] separa = s.split(" ");
        
        for (int i = 1; i < separa.length; i++) {
            Nsepara++;
        }
        System.out.println("El número de espacios es: "+ Nsepara);

        for (int i = 0; i < smin.length(); i++) {
            char c = s.charAt(i);
            
            switch (c){
                case 'a': aes++; break;
                case 'e': ees++; break;
                case 'i': ies++; break;
                case 'o': oes++; break;
                case 'u': ues++; break;
            }
        }
        vocales = aes + ees + ies + oes + ues;
        System.out.printf("Este es el número de vocales: %d\n",vocales);

        for (int i = 0; i < s.length(); i++) {
            a = s.charAt(i);
            if (a >= 65 && a <= 90){
                mayus++;
                
            }
        }

        System.out.printf("El número de mayúsculas es: %d\n",mayus);

    }
}
