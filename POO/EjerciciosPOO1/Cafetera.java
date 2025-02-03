public class Cafetera {
    
    //atributos
    private Integer capacidadMaxima;
    private Integer cantidadActual;
    public static Integer numCafeteras;

    // constructores

    public Cafetera() {
        this.capacidadMaxima = 1000;
        this.cantidadActual = 0;
        this.numCafeteras++;
    }

    public Cafetera(Integer capacidadMaxima){
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = capacidadMaxima;
        this.numCafeteras++;
    }

    public Cafetera(Integer capacidadMaxima, Integer cantidadActual){
        this.capacidadMaxima = capacidadMaxima;

        if (cantidadActual > capacidadMaxima){
            this.cantidadActual = capacidadMaxima;
        }else{
            this.cantidadActual = cantidadActual;
        }
        this.numCafeteras++;
    }

    public Integer getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(Integer capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public Integer getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(Integer cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
    
    public void llenarCafetera(){
        this.cantidadActual = this.capacidadMaxima;
    }

    public Integer servirTaza(int taza){
        Integer sobra = this.cantidadActual;
        if (taza <= this.cantidadActual){
            this.cantidadActual = this.cantidadActual - taza;
            return taza;
        }else{
            this.cantidadActual = 0;
            return sobra;
        }
    }

    public void vaciarCafetera(){
        this.cantidadActual = 0;
    }

    public void agregarCafe(int cafe){
        
        if ((this.cantidadActual + cafe) > this.capacidadMaxima){
            System.out.println("No cabe tanto café");   
            this.cantidadActual = this.capacidadMaxima; 
        }else{
            this.cantidadActual = this.cantidadActual + cafe;
        }
            
    }
}
