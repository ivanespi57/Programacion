public class Mesa {
    
    String estado;
    String color;
    String material;
    Integer num_patas;
    String tamanyo;
    String superficie;

    public Mesa(String estado, String color, String material, Integer num_patas, String tamanyo, String superficie){
        this.estado = estado;
        this.color = color;
        this.material = material;
        this.num_patas = num_patas;
        this.tamanyo = tamanyo;
        this.superficie = superficie;
    }
    
    public boolean comerEnMesa(){
        if (this.material.equals("Cristal") || this.material.equals("Plastico")){
            return true;
        }else{
            return false;
        }
    }
    public boolean reservarMesa(){
        if (this.estado.equals("libre")){
            this.estado = "ocupada";
            System.out.println("Reserva hecha");
            return true;
        }else{
            System.out.println("No ha sido posible reservar la mesa");
            return false;
        }
    }
}
