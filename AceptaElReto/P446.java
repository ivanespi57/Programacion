import java.util.Scanner;

public class P446 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int casos;
        String real;
        int num;
        String nom;
        String ult;

        casos = sc.nextInt();

        for (int i = 0; i < casos; i++){
            real = sc.next();
            num = sc.nextInt();
            nom = sc.nextLine();

            String[] pers = nom.split(" ");
            ult = pers[pers.length -1];

            if ((real.equals(ult)) && num > 1){
                System.out.println("VERDADERA");
            }else{
                System.out.println("FALSA");
            }

        }
    }
}
