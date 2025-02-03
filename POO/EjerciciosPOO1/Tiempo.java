public class Tiempo implements Comparable<Tiempo>{
    private Integer h = 0;
    private Integer min = 0;
    private Integer seg = 0;

    public Tiempo(){}

    public Tiempo(int h, int min, int seg){
        this.h = h;
        this.min = min;
        this.seg = seg;
    }

    public Integer getH() {
        return h;
    }

    public void setH(Integer h) {
        this.h = h;
    }

    public Integer getMin() {
        return min;
    }

    public void setMin(Integer min) {
        this.min = min;
    }

    public Integer getSeg() {
        return seg;
    }

    public void setSeg(Integer seg) {
        this.seg = seg;
    }

    public String toString(){
        return this.h + "h " + this.min + "m " + this.seg + "s"; 
    }

    public void suma(Tiempo t1){
        int segundos = this.seg + t1.getSeg();
        this.seg = segundos % 60;

        int minuto = this.min + t1.getMin() + (segundos / 60);
        this.min = minuto % 60;

        this.h = this.h + t1.getH() + (minuto / 60);
        
    }

    public void resta(Tiempo t2){
        int hora = this.h - t2.getH();
        int minuto = this.min - t2.getMin();
        int segundo = this.seg -t2.getSeg();


        if ((hora < 0) || (hora == 0) && (minuto < 0) || (hora == 0) && (minuto == 0) && (segundo <= 0)){
            this.h = 0;
            this.min = 0;
            this.seg = 0;
        }else{
            if(segundo > 0){
                this.seg = segundo;
            }else{
                minuto--;
                segundo = segundo + 60;
                this.seg = segundo;
            }
            if(minuto > 0){
                this.min = minuto;
            }else{
                hora--;
                minuto = minuto + 60;
                this.min = minuto;
            }
            this.h = hora;
        }
    }
    
    public int compareTo(Tiempo t1){
        if (this.h != t1.getH()){
            return this.h - t1.getH();
        }else{
            if(this.min != t1.getMin()){
                return this.min - t1.getMin();
            }else{
                return this.seg - t1.getSeg();
            }
        }
    }
}
