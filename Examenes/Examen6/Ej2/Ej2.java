import java.io.*;
import java.util.*;

public class Ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] filas;
        String lista ;
        String pal = "";
        int hash = 0;
        int from = 0;
        int r = 0;
        int w = 0;
        int co = 0;
        int u = 0;
        int ex = 0;
        int c = 0;

    
        if (args.length != 0){
            try {   
                File f = new File(args[0]);
                

                if(!f.exists()){
                    System.out.println("El archivo no existe");
                }else{
        
                    FileReader fr = new FileReader(f);
                    BufferedReader br = new BufferedReader(fr);

                    while((lista = br.readLine()) != null){
                        filas = lista.split(" ");
                        pal = filas[0];

                        if(pal.equals("#")){
                            hash++;
                        }
                        if(pal.equals("FROM")){
                            from++;
                        }
                        if(pal.equals("RUN")){
                            r++;
                        }
                        if(pal.equals("WORKDIR")){
                            w++;
                        }
                        if(pal.equals("COPY")){
                            co++;
                        }
                        if(pal.equals("USER")){
                            u++;
                        }
                        if(pal.equals("EXPOSE")){
                            ex++;
                        }
                        if(pal.equals("CMD")){
                            c++;
                        }

                    }
                    br.close();
                    fr.close();   
                }
                

            }catch(Exception e){
                e.getMessage();
            }
            System.out.println("Comentarios " + hash);
            System.out.println("FROM " + from);
            System.out.println("RUN " + r);
            System.out.println("WORKDIR " + w);
            System.out.println("COPY " + co);
            System.out.println("USER " + u);
            System.out.println("EXPOSE " + ex);
            System.out.println("CMD " + c);
            
        }else{
            System.out.println("No hay argumentos");
        }
    }
}
