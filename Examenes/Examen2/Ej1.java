import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
   
		boolean fin=false;
		do{
			int n = sc.nextInt();
            sc.nextLine();
			if (n == 0){
				fin=true; 
			}else{
                String frase = sc.nextLine();
                String min  = frase.toLowerCase();
                
                if (min.contains(" ia")  || min.contains(" ai")){
                    System.out.println("TRAMPA");
                }else{
                    System.out.println("LEGAL");
                }
			}

		}while (!fin);
    }
}
