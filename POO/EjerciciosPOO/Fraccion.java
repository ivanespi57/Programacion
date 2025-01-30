public class Fraccion {
   
    private Integer n;
    private Integer d;

    public Fraccion(){
        this.n = 1;
        this.d = 1;
    }
    public Fraccion(Integer n, Integer d){
        this.n = n;
        this.d = d;
    }
    
    public Integer getN() {
        return n;
    }

    public void setN(Integer n) {
        this.n = n;
    }

    public Integer getD() {
        return d;
    }

    public void setD(Integer d) {
        this.d = d;
    }

    public String toString(){
        return this.n + "/" + this.d;
    }

    public void invertir(){
        Integer aux = this.d;
        this.d = this.n;
        this.n = aux;
    }

    public void simplificar(){
        int n = 2;
        int menor = Math.min(this.n,this.d);
        while (n < menor){
            if (this.n % n == 0 && this.d % n == 0){
                this.n = this.n / n;
                this.d = this.d / n;
            }else{
                n++;
            }
        }
    }

    public void multiplicar(Fraccion f){
        this.n = this.n * f.getN();
        this.d = this.d * f.getD();
    }
    
    public void dividir(Fraccion f){
        this.n = this.n * f.getD();
        this.d = this.d * f.getN();
    }

    public void suma(Fraccion f){
        Integer naux1 = this.n * f.getD();
        Integer naux2 = f.getN() * this.d;
        Integer daux = this.d * f.getD();

        this.n = naux1 + naux2;
        this.d = daux;

        this.simplificar();
    }
}
