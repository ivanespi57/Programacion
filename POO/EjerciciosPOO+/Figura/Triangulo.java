public class Triangulo extends Figura{
    
    private Double altura;
    private Double base;

    public Triangulo(Double base, Double altura){
        cont++;
        this.nombre = "T"+cont;
        this.base = base;
        this.altura = altura;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    @Override
    public double area(){
        return (base * altura) / 2;
    }
    @Override
    public double perimetro(){
        double l2 = Math.sqrt(Math.pow(altura,2) + Math.pow(base / 2,2));
        return base + l2 + l2;
    }
    
}
