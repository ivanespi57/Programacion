public class PruebaMesa {
     public static void main(String[] args) {
         
        Mesa[] bar = new Mesa[5];
        
        for (int i = 0; i < bar.length; i++) {
            
            bar[i] = new Mesa("libre", "gris", "Cristal", 4, "grande", "150x70cm");

        }
        System.out.println("Estado: "+ bar[3].estado);

        boolean reserva = bar[3].reservarMesa();
        
        System.out.println("Estado: "+ bar[3].estado);

        reserva = bar[3].reservarMesa();
        
                
        /*  Mesa mesaCocina = new Mesa("libre", "gris", "Cristal", 4, "grande", "150x70cm");
        Mesa mesaEstudio = new Mesa("ocupada", "marron", "Madera", 2, "mediano", "70x40cm");
 
        if (mesaCocina.estado.equals("libre")){
            System.out.println("La mesa de la cocina esta libre para comer");
        }

        if (mesaEstudio.comerEnMesa()){
            System.out.println("En esta mesa no se puede comer");
        }
            */
     }
}
