public abstract class Objeto {
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    private Integer valor;

    public Objeto(){
        this.nombre = eligeNombre();
        this.valor = eligeValor();
    }

    public abstract String eligeNombre();
    public abstract Integer eligeValor();

    public void usar(Integer g){
        this.valor = valor - g;
    }

    public void usar(){
        this.valor = valor - 1;
    }
}