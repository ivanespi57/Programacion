public class Carta {
    private Integer valor;
    private String palo;

    public Carta(Integer valor, String palo){
        this.valor = valor;
        this.palo = palo;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    public String toString(){
        return "Carta: " + this.valor + " de " + this.palo;
    }
}
