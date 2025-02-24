public class Cuadrado extends Figura{
    
    private Double lado;

    public Cuadrado(Double lado){
        cont++;
        this.nombre = "C"+cont;
        this.lado = lado;
    }

    public Double getLado() {
        return lado;
    }

    public void setLado(Double lado) {
        this.lado = lado;
    }

    @Override
    public double area(){
        return lado * lado;
    }
    @Override
    public double perimetro(){
        return lado * 4;
    }
}
