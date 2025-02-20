import java.text.DecimalFormat;

public class Movil extends TarjetaSIM{
    private String tarifa;
    private Integer tiempoLlamada;

    public Movil(String numero){
        super(numero);
    }

    public Movil(String numero, String tarifa){
        super(numero);
        //this.setNumero(numero);       |
        //this.setTiempoConexion(0);    |  Esto es lo mismo que el super
        this.tarifa = tarifa;
        this.tiempoLlamada = 0;
    }

    public String toString(){
        Double gasto = 0.0;
        DecimalFormat f = new DecimalFormat("#.##");

        if (this.tarifa.equals("plata")){
            gasto = (this.tiempoLlamada * 0.1) / 60; 
        }
        if (this.tarifa.equals("oro")){
            gasto = (this.tiempoLlamada * 0.06) / 60; 
        }
        if (this.tarifa.equals("platinum")){
            gasto = (this.tiempoLlamada * 0.03) / 60; 
        }

        return super.toString() + " - " + f.format(gasto) + " euros de gasto";
    }

    public void llama(Movil m, Integer seg){
        super.llama(m, seg);
        this.tiempoLlamada += seg;
    }

    public String getTarifa() {
        return tarifa;
    }

    public void setTarifa(String tarifa) {
        this.tarifa = tarifa;
    }

    public Integer getTiempoLlamada() {
        return tiempoLlamada;
    }

    public void setTiempoLlamada(Integer tiempoLlamada) {
        this.tiempoLlamada = tiempoLlamada;
    }

    
}
