public class Pizza {
    private String tamanyo;
    private String tipo;
    private String estado;
    private static Integer TotalPedidas = 0;
    private static Integer TotalServidas = 0;

    public Pizza(){
        setTipo("margarita");
        setTamanyo("mediana");
    }

    public Pizza(String tipo, String tamanyo){
        this.tipo = tipo;
        this.tamanyo = tamanyo;
        this.estado = "Pedida";
        TotalPedidas++;
    }

    public void sirve(){

        if (this.estado.equals("Servida")){
            
            System.out.println("Esta pizza ya se ha servido");
        }else{
            setEstado("Servida");
            TotalServidas++;
        }
        
    }

    public String getTamanyo() {
        return tamanyo;
    }

    public void setTamanyo(String tamanyo) {
        this.tamanyo = tamanyo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public static Integer getTotalPedidas() {
        return TotalPedidas;
    }

    public static void setTotalPedidas(Integer totalPedidas) {
        TotalPedidas = totalPedidas;
    }

    public static Integer getTotalServidas() {
        return TotalServidas;
    }

    public static void setTotalServidas(Integer totalServidas) {
        TotalServidas = totalServidas;
    }

}
