public abstract class  Objeto {

    private String nombre;
    private Integer valor;

    //constructor estandar, los valores serán aleatorios (determinados por los métodos)
    public Objeto(){
        this.nombre=eligeNombre();
        this.valor= eligeValor();
    }

    //geters y seters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    //Métodos abstractos
    public abstract String eligeNombre();

    public abstract Integer eligeValor();

  
    //Método usar
    public void usar(){
        this.valor=valor-1;

    }

    public void usar(int g){
        this.valor=valor-g;

    }
    
}
