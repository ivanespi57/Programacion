package archivos;

import java.io.*;

public class FileReaderDocs {
	public static void main(String[] args) {
//rREAD
		try {
			File f = new File("lectura.txt");
			FileReader fr = new FileReader(f); //new FileReader("lectura.txt")
			BufferedReader br = new BufferedReader(fr);
			
			String linea = br.readLine(); //fr.read(), para un caracter
			System.out.println();
			while(linea != null) {
				System.out.println(linea);
				linea = br.readLine();
			}
			br.close();
			fr.close();
			
		} catch(IOException e) {
			e.printStackTrace();
		}
		
//WRITE
		try {
			File f = new File("lectura.txt");
			FileWriter fw = new FileWriter(f);
			fw.write("Hola, esto es un ejemplo de FileWriter\nOK");
			fw.close(); //Mete el contenido en el fichero
		}catch (Exception e) {
			// TODO: handle exception
		}

//write con formato
		try {
			PrintWriter pw = new PrintWriter("file1.txt");
			pw.println("Hola, esto es un ejemplo de PrintWriter");
			pw.printf("Este es un número: %d", 42);
			pw.close();
		
		} catch(IOException e) {
			e.printStackTrace();
		}

	}
	public static void copiaFichero() {
		int caracter;
		try {
			FileReader in = new FileReader("fuente.txt");
			// new FileWriter("archivo",true) para abrir en modo append
			FileWriter out = new FileWriter("destino.txt");
			while( (caracter = in.read()) != -1) {
				out.write(caracter);
			}
			in.close();
			out.close();
		} catch(FileNotFoundException e1) {
			System.err.println("Error: No se encuentra el fichero");
		} catch(IOException e2) {
			System.err.println("Error leyendo/escribiendo fichero");
		}
	}
}
