public abstract class Bloque {
    private Integer alto;
    private Integer ancho;
    private Integer profundo;
    private String color;

    public Bloque(){
        this.alto = 1;
        this.ancho = 1;
        this.profundo = 1;
        this.color = "Blanco";
    }

    public Bloque(Integer alto, Integer ancho, Integer profundo, String color){
        this.alto = alto;
        this.ancho = ancho;
        this.profundo = profundo;
        this.color = color;
    }



    public Integer getAlto() {
        return alto;
    }

    public Integer getAncho() {
        return ancho;
    }

    public Integer getProfundo() {
        return profundo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract void colocar();
}
