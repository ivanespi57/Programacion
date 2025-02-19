
import java.util.ArrayList;

public class Viaje {
    private String nombre;
    private String fecha;
    private ArrayList<Estacion> estaciones = new ArrayList<Estacion>();
    private Tren tren;
 
    public Viaje(String nombre, String fecha){
        this.nombre = nombre;
        this.fecha = fecha;
        this.tren = new Tren();
    }

    public Viaje(String nombre, String fecha, Tren tren){
        this.nombre = nombre;
        this.fecha = fecha;
        this.tren = tren;
        String[] asientos = this.tren.getAsientos();

        for (int i = 0; i < asientos.length; i++) {
            asientos[i] = "";
        }
    }

    public void addEstacion(Estacion e){
        estaciones.add(e);
    }

    public Estacion buscarEstacion(String est){
        
        for (Estacion estacion : estaciones) {
            if (estacion.getNombre().equals(est)){
                return estacion;                
            }
        }
        return null;
    }   
    
    public String plazasLibres(){
        String plazas = "";

        for (int i = 0; i < tren.getCantAsientos(); i++) {
            if (tren.getAsientos()[i].equals("")){
                plazas += i + ":";
            }
        }

        return plazas;
    }

    public void reservaAsiento(String dni, Integer nAsientos){
        
        if(tren.getAsientos()[nAsientos].equals("")){
            tren.getAsientos()[nAsientos] = dni;
        }else{
            System.out.println("Ese asiento ya está reservado");
        }
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public ArrayList<Estacion> getEstaciones() {
        return estaciones;
    }

    public void setEstaciones(ArrayList<Estacion> estaciones) {
        this.estaciones = estaciones;
    }

    public Tren getTren() {
        return tren;
    }

    public void setTren(Tren tren) {
        this.tren = tren;
    }

    
}

