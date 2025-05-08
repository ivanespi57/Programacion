
import java.util.Calendar;

public class Vuelos {
    
    private String Id_Vuelos;
    private String origen;
    private String destino;
    private Calendar fecha;
    private Integer capacidad;

    public Vuelos(){}

    public Vuelos(String id_Vuelos, String origen, String destino, Calendar fecha, Integer capacidad) {
        Id_Vuelos = id_Vuelos;
        this.origen = origen;
        this.destino = destino;
        this.fecha = fecha;
        this.capacidad = capacidad;
    }

    public String getId_Vuelos() {
        return Id_Vuelos;
    }

    public void setId_Vuelos(String id_Vuelos) {
        Id_Vuelos = id_Vuelos;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    public Integer getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }

    
}
