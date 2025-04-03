public class Armadura extends Objeto{

    public Armadura(){
        super();
    }

    @Override
    public String eligeNombre(){
        String [] opciones={"casco","pechera","pantalon","botas"};
        int num= (int) (Math.random() * 4);
        String s=opciones[num];
        return s;

    }

    @Override
    public Integer eligeValor(){
        int num= (int) (Math.random() * 10)+1;
        return num;
    }
}
