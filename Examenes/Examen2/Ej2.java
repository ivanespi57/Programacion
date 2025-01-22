import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int e = sc.nextInt();
        int plagio;
        int p;
        int res = 0;

        boolean fin=false;
            do{
                
                if (l == 0 && e == 0){
                        fin=true;
                }else{
                 
                    int[] a = new int[e]; 
                    p = 75;

                    for (int i = 0; i < a.length; i++) {
                        a[i] = sc.nextInt();
                        plagio = a[i];

                        if ((plagio * 100) / l >= p){
                            res++;
                        }
                    }
                    System.out.println(res);
                    res = 0;
                    l = sc.nextInt();
                    e = sc.nextInt();
                
                }
                
                    
            }while (!fin);
    }
}
