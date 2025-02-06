public class Planeta {
    private Long masa;
    private Double diametro;
    private String nombre;
    private Integer nSatelites;

    public Planeta(){}

    public Long getMasa() {
        return masa;
    }

    public void setMasa(Long masa) {
        this.masa = masa;
    }

    public Double getDiametro() {
        return diametro;
    }

    public void setDiametro(Double diametro) {
        this.diametro = diametro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getnSatelites() {
        return nSatelites;
    }

    public void setnSatelites(Integer nSatelites) {
        this.nSatelites = nSatelites;
    }

    public Planeta(String nombre, Long masa, double diametro){
        this.nombre = nombre;
        this.masa = masa;
        this.diametro = diametro;
        this.nSatelites = 0;
    }
}