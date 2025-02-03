public class Planeta {
    private Double masa;
    private Double diametro;
    private String nombre;

    public Planeta(){}

    public Double getMasa() {
        return this.masa;
    }

    public void setMasa(Double masa) {
        this.masa = masa;
    }

    public Double getDiametro() {
        return this.diametro;
    }

    public void setDiametro(Double diametro) {
        this.diametro = diametro;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Planeta(String nombre, double masa, double diametro){
        this.nombre = nombre;
        this.masa = masa;
        this.diametro = diametro;
    }

    public Integer nSatelites(){

    }
}
