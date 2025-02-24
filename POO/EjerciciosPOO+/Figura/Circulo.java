public class Circulo extends Figura{
    
    private Double radio;

    public Circulo(Double radio){
        cont++;
        this.nombre = "Cir1"+cont;
        this.radio = radio;
    }

    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }

    @Override
    public double area(){
        return PI * (radio * radio);
    }
    @Override
    public double perimetro(){
        return 2 * PI * radio;
    }
}
