public class Billete {
    private String dni;
    private String nEstacion;
    private String fechaViaje;
    private String nTren;
    private Integer nAsiento;
    private Double precioBill;

    public Billete(){}

    public Billete(String dni, String nEstacion, String fechaViaje, String nTren, Integer nAsiento, Double precioBill) {
        this.dni = dni;
        this.nEstacion = nEstacion;
        this.fechaViaje = fechaViaje;
        this.nTren = nTren;
        this.nAsiento = nAsiento;
        this.precioBill = precioBill;
    }
    
    public String imprimeBillete(){
        return this.dni + " " + this.nEstacion + " " + this.fechaViaje + " " + this.nTren + " " + this.nAsiento + " " + this.precioBill;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getnEstacion() {
        return nEstacion;
    }

    public void setnEstacion(String nEstacion) {
        this.nEstacion = nEstacion;
    }

    public String getFechaViaje() {
        return fechaViaje;
    }

    public void setFechaViaje(String fechaViaje) {
        this.fechaViaje = fechaViaje;
    }

    public String getnTren() {
        return nTren;
    }

    public void setnTren(String nTren) {
        this.nTren = nTren;
    }

    public Integer getnAsiento() {
        return nAsiento;
    }

    public void setnAsiento(Integer nAsiento) {
        this.nAsiento = nAsiento;
    }

    public Double getPrecioBill() {
        return precioBill;
    }

    public void setPrecioBill(Double precioBill) {
        this.precioBill = precioBill;
    }

    
}
