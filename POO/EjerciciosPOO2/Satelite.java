public class Satelite {
    private String nombre;
    private Planeta planeta;
    private Long distanciaPlaneta;

    public Satelite() {}

    public Satelite(String nombre, Planeta planeta, Long distanciaPlaneta){
        this.nombre = nombre;
        this.planeta = planeta;
        this.planeta.setnSatelites(planeta.getnSatelites() + 1);
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

    public Long getDistanciaPlaneta() {
        return this.distanciaPlaneta;
    }

    public void setDistanciaPlaneta(Long distanciaPlaneta) {
        this.distanciaPlaneta = distanciaPlaneta;
    }

    public boolean orbita(String nombre){
        if (nombre.equals(this.planeta.getNombre())){
            return true;
        }
        return false;
        
    }
}
