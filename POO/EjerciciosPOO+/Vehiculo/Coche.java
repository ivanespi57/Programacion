public class Coche extends Vehiculo{
    private Double kilometrosRecorridos;

    public Double getKilometrosRecorridos() {
        return kilometrosRecorridos;
    }

    public void setKilometrosRecorridos(Double kilometrosRecorridos) {
        this.kilometrosRecorridos = kilometrosRecorridos;
    }

    public Coche(){
        this.kilometrosRecorridos = 0.0;
    }

    @Override
    public Double anda(Double km){
        return kilometrosRecorridos += km;
    }
}


