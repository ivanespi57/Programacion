
import java.util.Scanner;

public class Avanzado4 {
    public static void main(String[] args) {
        int insec;
        int arac;
        int crus;
        int cien;
        int seg;
        int total;

        Scanner sc = new Scanner(System.in);

        System.out.print("Insectos: ");
        insec = sc.nextInt();
        System.out.print("Arácnidos: ");
        arac = sc.nextInt();
        System.out.print("Crustáceos: ");
        crus = sc.nextInt();
        System.out.print("Cienpiés: ");
        cien = sc.nextInt();
        System.out.print("Segmentos de cienpiés: ");
        seg = sc.nextInt();
        
        total = (insec * 6) + (arac * 8) + (crus * 10) + ((seg * 2) * cien);

        System.out.println("Totald de patas: " + total);
        

    }
    
}
