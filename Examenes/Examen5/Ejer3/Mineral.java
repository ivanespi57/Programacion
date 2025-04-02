
import java.util.ArrayList;

public class Mineral extends Objeto {
    
    private ArrayList<String> m;
    private Integer unidades;

    public Mineral(){
        super();
        m = new ArrayList<>();

        m.add("hierro");
        m.add("carbon");
        m.add("oro");
        m.add("diamante");
    }

    @Override
    public String eligeNombre(){
       

        String n = "";
        int r = (int)(Math.random() * m.size())+1;
        n = m.get(r);

        return n;
    }

    @Override
    public Integer eligeValor(){
        unidades = (int)(Math.random() *3) +1;

        return unidades;
    }

    public ArrayList<String> getM() {
        return m;
    }

    public void setM(ArrayList<String> m) {
        this.m = m;
    }

    public Integer getUnidades() {
        return unidades;
    }

    public void setUnidades(Integer unidades) {
        this.unidades = unidades;
    }
}