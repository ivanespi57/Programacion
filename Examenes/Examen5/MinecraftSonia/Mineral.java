public class Mineral extends Objeto{

    public Mineral(){
        super();
    }

    @Override
    public String eligeNombre(){
        String [] opciones={"hierro","carbon","oro","diamante"};
        int num= (int) (Math.random() * 4);
        String s=opciones[num];
        return s;

    }

    @Override
    public Integer eligeValor(){
        int num= (int) (Math.random() * 2)+1;
        return num;
        
    }
    
}
