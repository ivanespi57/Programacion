public class Forajido {
    public String nombre;
    private Integer precio;
    protected Boolean capturado = false;

    public Forajido(String nombre, Integer precio){
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getPrecio() {
        return this.precio;
    }

    public void setPrecio(Integer precio) {
        if (capturado == true){
            System.out.println("No se puede cambiar el precio porque ya ha sido capturado");
        }else{
            this.precio = precio;
        }
    }

    public Boolean getCapturado() {
        return this.capturado;
    }

    public void setCapturado(Boolean capturado) {
        this.capturado = capturado;
    }
    
     
}
