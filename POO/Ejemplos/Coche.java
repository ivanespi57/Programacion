// Clase Coche
public class Coche {
    
    // Atributos
    String matricula;
    String marca;
    String modelo;
    String color;
    int numPlazas;

    public Coche() {} // El contructor por defecto

    public Coche(String marca, String modelo, String color, int numPlazas){
        
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.numPlazas = numPlazas;
    }

} 
