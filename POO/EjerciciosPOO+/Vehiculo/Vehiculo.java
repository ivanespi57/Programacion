public abstract class Vehiculo {
    private static Integer vehiculosCreados;
    private static Integer kilometrosTotales;

    public static Integer getVehiculosCreados() {
        return vehiculosCreados;
    }
    public void setVehiculosCreados(Integer vehiculosCreados) {
        this.vehiculosCreados = vehiculosCreados;
    }
    public static Integer getKilometrosTotales() {
        return kilometrosTotales;
    }
    public void setKilometrosTotales(Integer kilometrosTotales) {
        this.kilometrosTotales = kilometrosTotales;
    }
    
    public abstract Double anda(Double km);
    
}
