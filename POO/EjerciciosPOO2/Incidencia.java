public class Incidencia implements Comparable<Incidencia>{
    private Integer codigo;
    private String estado;
    private static Integer pendientes = 0;
    private String causa;
    private Integer puesto;
    private String solucion;
    private static Integer incidencia = 1;
    private Integer prioridad;

   
    public Incidencia(Integer puesto, String causa, Integer prioridad){
        this.codigo = incidencia++;
        this.puesto = puesto;
        this.causa = causa;
        this.estado = "pendiente";
        pendientes++;
        this.prioridad = prioridad;
    }

    public void resuelve(String solucion){
        if (this.estado.equals("resuelta")){
            System.out.println("Ya está resuelta");
        }else{
            this.solucion = solucion;
            setEstado("resuelta");
            pendientes--;
        }
    }

    public int compareTo(Incidencia inc){
        
        return (this.prioridad - inc.prioridad);
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public static Integer getPendientes() {
        return pendientes;
    }

    public static void setPendientes(Integer pendientes) {
        Incidencia.pendientes = pendientes;
    }

    public String getCausa() {
        return causa;
    }

    public void setCausa(String causa) {
        this.causa = causa;
    }

    public Integer getPuesto() {
        return puesto;
    }

    public void setPuesto(Integer puesto) {
        this.puesto = puesto;
    }

    public String getSolucion() {
        return solucion;
    }

    public void setSolucion(String solucion) {
        this.solucion = solucion;
    }

    public static Integer getIncidencia() {
        return incidencia;
    }

    public static void setIncidencia(Integer incidencia) {
        Incidencia.incidencia = incidencia;
    }

    public String toString() {
        if (this.solucion != null) {
            return "Incidencia " + codigo + " - Puesto: " + puesto + " - " + causa + " - " + estado + " - " + solucion;
        }else{
            return "Incidencia " + codigo + " - Puesto: " + puesto + " - " + causa + " - " + estado; 
        }
    }
    
}
