
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CombatePokemon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Generacion uno = new Generacion(1,"Kanto");
        Generacion dos = new Generacion(21,"Johto");

        ArrayList<Pokemon> mochilaAsh = new ArrayList<>();
        ArrayList<Pokemon> mochilaTeamRocket = new ArrayList<>();

        mochilaAsh.add(new Pokemon(1,"Bulbasaur","planta-veneno",20,1,uno));
        mochilaAsh.add(new Pokemon(25,"Pikachu","electrico",10,5,uno));
        mochilaAsh.add(new Pokemon(4,"Charmander","fuego",22,2,uno));
        mochilaAsh.add(new Pokemon(1,"Chikorita","planta",8,1,dos));

        mochilaTeamRocket.add(new Pokemon(165,"Ledyba","bicho-volador",10,2,dos));
        mochilaTeamRocket.add(new Pokemon(41,"Zubat","veneno-volador",15,4,uno));
        mochilaTeamRocket.add(new Pokemon(19,"Rattata","normal",10,1,uno));

        //Ordena las dos mochilas
        Collections.sort(mochilaAsh);
        Collections.sort(mochilaTeamRocket);

        //Elige los dos pokemon para el combate, el primero de las dos mochilas
        Pokemon pokemonAsh = mochilaAsh.get(0);
        Pokemon pokemonTeamRocket = mochilaTeamRocket.get(0);

        //Imprime las fichas de los dos pokemons
        System.out.println(pokemonAsh);
        System.out.println(pokemonTeamRocket);

        //COMBATE POKEMON
        while(pokemonAsh.getVida() > 0 && pokemonTeamRocket.getVida() > 0){
            pokemonAsh.ataquePokemon(pokemonTeamRocket);
            if(pokemonTeamRocket.getVida() > 0){
                pokemonTeamRocket.ataquePokemon(pokemonAsh);
            }
        }

        System.out.println(pokemonAsh);
        System.out.println(pokemonTeamRocket);
        
    }
}
