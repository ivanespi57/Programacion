public class Pasajeros {
    
    private Integer id_pasajero;
    private String pasaporte;
    private String nombre;

    public Pasajeros(){}

    public Pasajeros(Integer id_pasajero, String pasaporte, String nombre){
        this.id_pasajero = id_pasajero;
        this.pasaporte = pasaporte;
        this.nombre = nombre;
    }

    public Integer getId_pasajero() {
        return id_pasajero;
    }

    public void setId_pasajero(Integer id_pasajero) {
        this.id_pasajero = id_pasajero;
    }

    public String getPasaporte() {
        return pasaporte;
    }

    public void setPasaporte(String pasaporte) {
        this.pasaporte = pasaporte;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
}
