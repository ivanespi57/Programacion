public class Satelite {
    private String nombre;
    private Planeta planeta;
    private Double distanciaPlaneta;

    public Satelite() {}

    public Satelite(String nombre, Planeta planeta, double distanciaPlaneta){
        this.nombre = nombre;
        this.planeta = planeta;
        this.distanciaPlaneta = distanciaPlaneta;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Planeta getPlanetaOrbita() {
        return this.planeta;
    }

    public void setPlanetaOrbita(Planeta planeta) {
        this.planeta = planeta;
    }

    public Double getDistanciaPlaneta() {
        return this.distanciaPlaneta;
    }

    public void setDistanciaPlaneta(Double distanciaPlaneta) {
        this.distanciaPlaneta = distanciaPlaneta;
    }

    public boolean orbita(String nombre){
        if (nombre.equals(this.planeta.getNombre())){
            return true;
        }else {
            return false;
        }
    }
}
