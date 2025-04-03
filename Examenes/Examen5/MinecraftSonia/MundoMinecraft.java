public class MundoMinecraft {

    public static void main(String[] args) {

        //Creamos un array de cofres simulando posiciones de un mapa Minecraft
        Cofre[] juego = new Cofre[20];

        //Colocamos tres cofres de manera aleatoria
        for (int i = 1; i <= 3; i++) {

            //Creo el cofre
            Cofre c = new Cofre("cofre"+i);

            //Relleno el cofre con objetos
            c.rellenaCofre();

            //Imprimo el contenido del Cofre
            System.out.println(c);

            // Compruebo que la posición del mapa está libre
            int posicion = (int) (Math.random() * 20);
            while (juego[posicion] != null){
                posicion = (int) (Math.random() * 20);
            }

            //Coloco el cofre en posicion
            juego[posicion] = c;
            System.out.println(c.getId() +" está en la posición "+posicion+" del mapa");
            
        }
        
    } //Fin del main
} //Fin del programa
   