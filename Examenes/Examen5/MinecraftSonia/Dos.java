
import java.util.Scanner;

public class Dos {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        
        boolean fin=false;
		do{
            int f= sc.nextInt(); //filas
			int c = sc.nextInt(); //columnas
			if (f == 0 && c==0){
				fin=true; 
			}else{

               String saltoLinea= sc.nextLine();

                char [] [] cofre= new char [f] [c];

                int herramientas=0;
                int comida=0;
                int minerales=0;
                int armadura=0;


                //Rellenar la matriz
                for(int i=0;i<f;i++){
                    String s=sc.nextLine();
                    for(int j=0;j<c;j++){
                        cofre[i][j]=s.charAt(j);
                    }
                }


                //Recorrer la matriz
                for(int i=0;i<f;i++){
                    for(int j=0;j<c;j++){
                        if (cofre[i][j]=='H'){
                            herramientas++;
                        }
                        if (cofre[i][j]=='C'){
                            comida++;
                        }
                        if (cofre[i][j]=='M'){
                            minerales++;
                        }
                        if (cofre[i][j]=='A'){
                            armadura++;
                        }
                    }
                }

                System.out.println(herramientas+" "+comida+" "+minerales+" "+armadura);
			
			}
		}while (!fin);

    }
    
}
