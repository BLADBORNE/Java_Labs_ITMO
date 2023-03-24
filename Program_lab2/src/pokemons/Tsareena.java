package pokemons;

import Attack_pokemons.Facade;
import Attack_pokemons.Rest;
import Attack_pokemons.Tackle;
import ru.ifmo.se.pokemon.Type;

public class Tsareena extends Steenee {
    public Tsareena(String name, int level) {
        super(name, level);
        setStats(72, 120, 98, 50, 98, 72);
        setType(Type.GRASS);
        setMove(new Rest());
    }
}
