
import java.util.ArrayList;

public class Comida extends Objeto {
    
    private ArrayList<String> c;
    private Integer unidades;

    public Comida(){
        super();
        c = new ArrayList<>();
        c.add("pan");
        c.add("manzana");
        c.add("carne");
        c.add("pescado");
    }

    @Override
    public String eligeNombre(){
        

        String n = "";
        int r = (int)(Math.random() * c.size())+1;
        n = c.get(r);

        return n;
    }

    @Override
    public Integer eligeValor(){
        unidades = (int)(Math.random() *3) +1;

        return unidades;
    }

    public ArrayList<String> getC() {
        return c;
    }

    public void setC(ArrayList<String> c) {
        this.c = c;
    }

    public Integer getUnidades() {
        return unidades;
    }

    public void setUnidades(Integer unidades) {
        this.unidades = unidades;
    }
}