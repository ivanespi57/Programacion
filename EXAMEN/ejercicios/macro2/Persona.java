package macro2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Persona implements Serializable {
	private int id;
	private String nombre;
	private String apellido;
	private int edad;
	
	public Persona(int id, String nombre, String apellido, int edad) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
			
	}
    public static void serializarObjeto(Object objeto, String rutaArchivo) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(rutaArchivo))) {
            oos.writeObject(objeto);
            System.out.println("Objeto serializado correctamente en: " + rutaArchivo);
        } catch (IOException e) {
            System.err.println("Error al serializar: " + e.getMessage());
        }
    }
    
    public static void serializarLista(ArrayList<Persona> personas,String nombre) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nombre))) {
            oos.writeObject(personas);
            System.out.println("Lista de objetos serializada correctamente en: " + nombre);
        } catch (IOException e) {
            System.err.println("Error al serializar lista: " + e.getMessage());
        }
    }
    
	@Override
	public String toString() {
		String string;
		string = "id: "+id+", nombre:"+nombre+", apellido:"+apellido+", edad:"+edad;
		return string;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
}
