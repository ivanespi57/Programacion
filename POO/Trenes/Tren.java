public class Tren {
    private String nombre;
    private Integer cantAsientos;
    private String[] asientos;

    public Tren(String nombre, Integer cantAsientos){
        this.nombre = nombre;
        this.cantAsientos = cantAsientos;
        this.asientos = new String[cantAsientos];
    }

    public Tren(){
        this.nombre = "Virtual";
        this.cantAsientos = 1;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCantAsientos() {
        return cantAsientos;
    }

    public String[] getAsientos() {
        return asientos;
    }

    public void setAsientos(String[] asientos) {
        this.asientos = asientos;
    }

    
    /* 
    public void setCantAsientos(Integer cantAsientos) {
        this.cantAsientos = cantAsientos;
    }
    */
    
}
