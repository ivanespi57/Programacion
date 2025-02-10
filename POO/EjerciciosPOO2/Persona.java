public class Persona {
    private String nombre;
    private Integer edad;
    private String dni;
    private Character sexo;
    private Double peso;
    private Double altura;

    public Persona(){
        this.sexo = 'M';
        this.dni = generaDni();
    }

    public Persona(String nombre, Integer edad, Character sexo){
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        comprobarSexo(this.sexo);
        this.dni = generaDni();
    }

    public Persona(String nombre, Integer edad, Character sexo, Double peso, Double altura){
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        comprobarSexo(this.sexo);
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Character getSexo() {
        return sexo;
    }

    public void setSexo(Character sexo) {
        this.sexo = sexo;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public int calcularIMC(int imc){
        imc = (int)(peso / (altura * altura));

        if (imc < 20){
            return -1;
        }else if (imc >= 20 && imc <= 25) {
            return 0;
        }else{
            return 1;
        }
    }

    public boolean esMayorDeEdad(){
        if (this.edad < 18){
            return false;
        }else{
            return true;
        }
    }

    private void comprobarSexo(char sexo){
        if(sexo != 'H' || sexo != 'M'){
            this.sexo = 'M';
        }
    }

    public String toString(){
        return "Nombre: " + this.nombre + " - Edad: " + this.edad + " - DNI: " + this.dni + " - Sexo: " + this.sexo + " - Altura : " + this.altura + "m - Peso: " + this.peso + " kg";
    }

    public String generaDni(){
        String cifras = "";

        String letra = "TRWAGMYFPDXBNJZSQVHLCKE"; 

        for (int i = 0; i < 8; i++) {
            cifras += (int)(Math.random() * 10);
        }
        int resto = Integer.parseInt(cifras) % 23;

        return cifras + letra.charAt(resto);
    }
}
