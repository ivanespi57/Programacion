public class String1 {
    public static void main(String[] args) {
        
        String s = "Hola a todos";
        /* 
        System.out.println(s.length()); // Para contar todos los caractéres del String 

        System.out.println(s.charAt(7)); // Para imprimir el caracter en la posición 7 del String

        System.out.println(s.substring(0,4)); // Para imprimir desde un caracter a otro sin contar el fin

        System.out.println(s.substring(7,s.length())); // De la posición 7 hasta el final, porque el lenght te pone uno más 

        System.out.println(s.indexOf("o")); // Busca la cadena o dentro del String y dice en que posición esta la primera 
        
        System.out.println(s.equals("Hola"));
        if (s.equals("uno")){ // s == "uno" . Es como poner un ==, (este imprime false o true)
         
        System.out.println("Primero");
        }else{
            System.out.println("Has perdido");
        }
        */

        System.out.println(s=s.toUpperCase()); // Para imprimir todo en mayúsculas, pero esto no lo guarda, solo la imprime. 
        // para guardarla sería sin el sout | si pones toLowerCase en minúscula
       
        String[] separa = s.split(" "); // para separar por lo que le digas
        System.out.println(separa[0]);

        System.out.print(separa[0]);

        /*for (int i = 1; i < separa.length; i++) {
            System.out.print(" " + separa[i]);
        }
        System.out.println();

        */

      

        for (int i = 1; i < separa.length - 1; i++) {
            System.out.print(separa[i]);
        }
        System.out.print(separa[separa.length - 1]);
        System.out.println();
    }   
    
}
