public class Generacion {
    private Integer ngen;
    private String nombregen;

    public Generacion(Integer ngen, String nombregen){
        this.ngen = ngen;
        this.nombregen = nombregen;
    }

    public Integer getNgen() {
        return ngen;
    }

    public void setNgen(Integer ngen) {
        this.ngen = ngen;
    }

    public String getNombregen() {
        return nombregen;
    }

    public void setNombregen(String nombregen) {
        this.nombregen = nombregen;
    }
    
}
