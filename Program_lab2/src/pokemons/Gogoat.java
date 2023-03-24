package pokemons;

import Attack_pokemons.AerialAce;
import ru.ifmo.se.pokemon.Type;

public class Gogoat extends Skiddo {
    public Gogoat(String name, int level) {
        super(name, level);
        setStats(123, 100, 62, 97, 81, 68);
        setType(Type.GRASS);
        addMove(new AerialAce());
    }
}
