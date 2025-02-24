import java.util.Vector;
public class CreaFiguras {
    public static void main(String[] args) {
        Vector<Figura> figuras = new Vector<Figura>();
        
        figuras.add(new Circulo(5.0)); // Radio=10
        figuras.add(new Cuadrado(10.0)); // Lado=10
        figuras.add(new Triangulo(10.0,5.0)); // Base=10, Altura=5;
        
        double areaMayor = 0.0;
        String figuraMayor = "";

        for (Figura f: figuras){
            double a = f.area();
            System.out.println("Área: "+f.area());
            System.out.println("Perímetro: "+f.perimetro());
            if (a > areaMayor){
                areaMayor = a;
                figuraMayor = f.nombre;
            }
        }
        System.out.println("La figura de mayor área es: " + figuraMayor);
    }
}
    
