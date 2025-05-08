package archivos;
import java.io.*;
import java.util.Scanner;
public class namePass {
	public static void main(String[] args) {
		try {
			File   f = new File("bulk.txt");
			if(!f.exists()) {
				f.createNewFile();
				System.out.println("se ha creado el archivo: "+f.getAbsolutePath());

			}
			FileWriter fw = new FileWriter(f, true);
            BufferedWriter bw = new BufferedWriter(fw);
            String nick;
            String pass;
            Scanner sc = new Scanner(System.in);
            do {
            	System.out.print("introduzca el nick(exit): ");
            	nick = sc.nextLine();
            	if(!nick.equals("exit")) {
                	System.out.print("password: ");
                	pass = sc.nextLine();
                	bw.write(nick+":"+pass);
                	bw.newLine();
            	}

            }while(!nick.equals("exit"));
            bw.close();
            fw.close();
            System.out.println("fin");

			
		}catch (Exception e) {

		}

		
	}
}
