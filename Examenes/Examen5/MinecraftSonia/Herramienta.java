public class Herramienta extends Objeto{

    public Herramienta(){
        super();
    }

    @Override
    public String eligeNombre(){
        String [] opciones={"espada","pico","pala","azada","hacha"};
        int num= (int) (Math.random() * 5);
        String s=opciones[num];
        return s;

    }

    @Override
    public Integer eligeValor(){
        int num= (int) (Math.random() * 10)+1;
        return num;

    }

    
}
