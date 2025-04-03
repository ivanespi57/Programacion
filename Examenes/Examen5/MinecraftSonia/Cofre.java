import java.util.ArrayList;

public class Cofre {

    private String id;
    private ArrayList <Objeto> objetos= new ArrayList<>();

    //Constructor
    public Cofre(String id){
        this.id=id;
    }


    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<Objeto> getObjetos() {
        return objetos;
    }
    

    //Métodos
    public void rellenaCofre(){
        //Herramientas
        int numH= (int) (Math.random() * 3);
        for(int i=0;i<numH;i++){
            Herramienta h= new Herramienta();
            objetos.add(h);
        }

        //Comidas
        int numC= (int) (Math.random() * 4);
        for(int i=0;i<numC;i++){
            Comida c= new Comida();
            objetos.add(c);
        }

        //Minerales
        int numM= (int) (Math.random() * 3);
        for(int i=0;i<numM;i++){
            Mineral m= new Mineral();
            objetos.add(m);
        }

        //Armadura
        int numA= (int) (Math.random() * 2);
        for(int i=0;i<numA;i++){
            Armadura a= new Armadura();
            objetos.add(a);
        }
    }

    public String toString(){
        String s= this.id+"\n====================";
        for (Objeto x : objetos) {
            s=s+"\n"+(x.getNombre()+" "+x.getValor());
            
        }
        return s;
    }

    


 

    
    
}
