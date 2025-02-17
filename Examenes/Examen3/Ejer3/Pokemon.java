public class Pokemon implements Comparable<Pokemon>{
    private Integer numero;
    private String nombre;
    private String tipo;
    private Integer vida;
    private Integer experiencia;
    private Generacion generacion = new Generacion();

    

    public Pokemon(Integer numero, String nombre, String tipo, Integer vida, Integer experiencia, Generacion generacion) {
        this.numero = numero;
        this.nombre = nombre;
        this.tipo = tipo;
        this.vida = vida;
        this.experiencia = experiencia;
        this.generacion = generacion;
    }

    public Integer getNumero() {
        return numero;
    }
    public void setNumero(Integer numero) {
        this.numero = numero;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public Integer getVida() {
        return vida;
    }
    public void setVida(Integer vida) {
        this.vida = vida;
    }
    public Integer getExperiencia() {
        return experiencia;
    }
    public void setExperiencia(Integer experiencia) {
        this.experiencia = experiencia;
    }
    public Generacion getGeneracion() {
        return generacion;
    }
    public void setGeneracion(Generacion generacion) {
        this.generacion = generacion;
    }

    public void ataquePokemon(Pokemon p){
        int n = (int)(Math.random() * 3) +1;
        int daño;
        if(this.experiencia > p.experiencia){
            daño = p.vida - n;     
            if (0 > daño){
                p.vida = 0;
            }
        }else{
            daño = p.vida - 1;
            if(0 > daño){
                p.vida = 0;
            }
        }
    }

    public int compareTo(Pokemon p){
        /*if (this.experiencia != p.experiencia){
            return (p.experiencia - this.experiencia);
        }else{
            return (this.experiencia - p.experiencia);
        }*/
        if (this.experiencia > p.experiencia){
            return -1;
        }
        if (this.experiencia < p.experiencia){
            return 1;
        }
        return 0;
        
        // Con esto basta - return (p.experiencia - this.experiencia);
        
    }

    public String toString(){
        return "========\n" + this.nombre.toUpperCase() + "\n" + generacion.getNombregen() + "\n" + this.tipo + "\n" + this.vida + "\n" + this.experiencia + "\n========";
    }
}
