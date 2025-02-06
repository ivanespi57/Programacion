// P 579
public class Pareja implements Comparable<Pareja>{
    private Integer prioridad;
    private Integer tiempo;

    public Pareja(Integer prioridad, Integer tiempo){
        this.prioridad = prioridad;
        this.tiempo = tiempo;
    }

    public Integer getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(Integer prioridad) {
        this.prioridad = prioridad;
    }

    public Integer getTiempo() {
        return tiempo;
    }

    public void setTiempo(Integer tiempo) {
        this.tiempo = tiempo;
    }

    public String toString(){
        return this.prioridad + " " + this.tiempo;
    }

    public int compareTo(Pareja p){
        if (this.prioridad != p.prioridad){
            return (p.prioridad - this.prioridad);
        }
        return (this.tiempo - p.tiempo);
    }
}


