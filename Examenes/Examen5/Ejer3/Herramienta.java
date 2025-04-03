
import java.util.ArrayList;

public class Herramienta extends Objeto {
    
    private ArrayList<String> h;
    private Integer desgaste;

    public Herramienta(){
        super();
        h = new ArrayList<>();

        h.add("espada");
        h.add("pico");
        h.add("pala");
        h.add("azada");
        h.add("hacha");
    }

    @Override
    public String eligeNombre(){
        

        String n = "";
        int r = (int)(Math.random() * h.size())+1;
        n = h.get(r);

        return n;
    }

    @Override
    public Integer eligeValor(){
        desgaste = (int)(Math.random() *10) +1;

        return desgaste;
    }

}
