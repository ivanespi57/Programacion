public class Estacion {
    private String nombre;
    private Double precio;

    public Estacion(String nombre, Double precio){
        this.nombre = nombre;
        this.precio = precio;
    }

    public double precioBillete(Integer edad){
        if (edad < 16){
            return (precio * 0.5);
        }
        return precio;
         
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Double getPrecio() {
        return precio;
    }
    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    
}
