public class Bicicleta extends Vehiculo{
    private Double kilometrosRecorridos;

    public Double getKilometrosRecorridos() {
        return kilometrosRecorridos;
    }

    public void setKilometrosRecorridos(Double kilometrosRecorridos) {
        this.kilometrosRecorridos = kilometrosRecorridos;
    }
    
    public Bicicleta(){
        this.kilometrosRecorridos = 0.0;
    }

    @Override
    public Double anda(Double km){
        return kilometrosRecorridos += km;
    }
}
