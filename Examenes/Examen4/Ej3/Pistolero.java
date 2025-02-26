
import java.util.ArrayList;

public class Pistolero {
    private String nombre;
    private Integer recompensa;
    private ArrayList<Forajido> capturas = new ArrayList<>();

    public Pistolero(String nombre){
        this.nombre = nombre;
        this.recompensa = 0;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getRecompensa() {
        return this.recompensa;
    }

    public void setRecompensa(Integer recompensa) {
        this.recompensa = recompensa;
    }

    public ArrayList<Forajido> getCapturas() {
        return this.capturas;
    }

    public void setCapturas(ArrayList<Forajido> capturas) {
        this.capturas = capturas;
    }

    public void meterCarcel(Forajido f, Carcel c){
        if (f.getCapturado() == false){
            System.out.println("No está capturado");
        }else{
            
            c.setLista(f);
            capturas.remove(f);
            this.setRecompensa(f.getPrecio());
            
            
        }   
    }
    
    public void captura(Forajido f){
        if (f.getCapturado() == false){
            f.setCapturado(true);
            capturas.add(f);
        }else{
            System.out.println("Este forajido ya ha sido capturado");
        }
    }
    
}
