
import java.util.ArrayList;

public class Armadura extends Objeto {
    
    private ArrayList<String> a = new ArrayList<>();
    private Integer desgaste;

    public Armadura(){
        super();
        a = new ArrayList<>();

        a.add("casco");
        a.add("pechera");
        a.add("pantalon");
        a.add("botas");

    }

    @Override
    public String eligeNombre(){
        
        String n = "";
        int r = (int)(Math.random() * a.size())+1;
        n = a.get(r);

        return n;
    }

    @Override
    public Integer eligeValor(){
        desgaste = (int)(Math.random() *10) +1;

        return desgaste;
    }

    public ArrayList<String> getA() {
        return a;
    }

    public void setA(ArrayList<String> a) {
        this.a = a;
    }

    public Integer getDesgaste() {
        return desgaste;
    }

    public void setDesgaste(Integer desgaste) {
        this.desgaste = desgaste;
    }
}