public class Alumno {
    private Integer NumAlumno;
    private String Nombre;
    private Integer NIA;
    private Integer Edad;

    public Alumno(){}

    public Alumno(Integer numAlumno, String nombre, Integer NIA, Integer edad) {
        this.NumAlumno = numAlumno;
        this.Nombre = nombre;
        this.NIA = NIA;
        this.Edad = edad;
    }
    @Override
    public String toString(){
        return NumAlumno + " - " + Nombre;
    }
    
    public Integer getNumAlumno() {
        return NumAlumno;
    }
    public void setNumAlumno(Integer numAlumno) {
        NumAlumno = numAlumno;
    }
    public Integer getEdad() {
        return Edad;
    }

    public void setEdad(Integer edad) {
        Edad = edad;
    }

    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public Integer getNIA() {
        return NIA;
    }
    public void setNIA(Integer nia) {
        NIA = NIA;
    }

}
