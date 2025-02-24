public abstract class Vehiculo {
    private Integer vehiculosCreados;
    private static Integer kilometrosTotales;

    public Integer getVehiculosCreados() {
        return vehiculosCreados;
    }
    public void setVehiculosCreados(Integer vehiculosCreados) {
        this.vehiculosCreados = vehiculosCreados;
    }
    public Integer getKilometrosTotales() {
        return kilometrosTotales;
    }
    public void setKilometrosTotales(Integer kilometrosTotales) {
        this.kilometrosTotales = kilometrosTotales;
    }
    
    public abstract Double anda(Double km);
    
}
