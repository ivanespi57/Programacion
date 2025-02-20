public class TarjetaSIM {
    private String numero;
    private Integer tiempoConexion;

    public TarjetaSIM(String numero){
        this.numero = numero;
        this.tiempoConexion = 0;
        
    }

    public String toString(){
        return "Num. " + this.numero + " - " + this.tiempoConexion + "s de conexión" ; 
    }

    public void llama(TarjetaSIM t, Integer s){
        //añadir segundos a las dos TarjetaSIM
        this.tiempoConexion += s;    
        //t.tiempoConexion += s;       
        t.setTiempoConexion(t.getTiempoConexion() + s);
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Integer getTiempoConexion() {
        return tiempoConexion;
    }

    public void setTiempoConexion(Integer tiempoConexion) {
        this.tiempoConexion = tiempoConexion;
    }

    
}
