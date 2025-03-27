import java.util.Scanner;

public class C {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        while (sc.hasNext()) { 

            int num = sc.nextInt();
            int nume = sc.nextInt();

            int mayor = nume;
            int menor = nume;

            for(int i = 1; i < num; i++){
                nume = sc.nextInt();

                if(nume > mayor){
                    mayor = nume;
                }

                if(nume < menor){
                    menor = nume;
                }

            }
            System.out.println(mayor + " " + menor);
        }
    }
}