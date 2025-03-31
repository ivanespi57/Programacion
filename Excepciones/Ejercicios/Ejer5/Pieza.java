public class Pieza {
    public String forma = "";
    public String color = "";

    public Pieza(String forma, String color){
        this.forma = forma;
        this.color = color;
    }

    public Double area(){
        return 0.0;
    }

    public boolean equals(Object o) {

        try{
            Pieza p = (Pieza) o;
            return this.color.equals(p.color) &&
            this.forma.equals(p.forma) &&
            this.area() == p.area();
           
        }catch (ClassCastException e){
            return false;
        }
    }
}
