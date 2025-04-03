public class Comida extends Objeto{

    public Comida(){
        super();
    }

    @Override
    public String eligeNombre(){
        String [] opciones={"pan","manzana","carne","pescado"};
        int num= (int) (Math.random() * 4);
        String s=opciones[num];
        return s;

    }

    @Override
    public Integer eligeValor(){
        int num= (int) (Math.random() * 3)+1;
        return num;


    }
    
}
