package pokemons;

import Attack_pokemons.*;
import ru.ifmo.se.pokemon.*;

public class Skiddo extends Pokemon {
    public Skiddo(String name, int level) {
        super(name, level);
        setStats(66, 65, 48, 62, 57, 52);
        setType(Type.GRASS);
        setMove(new TailWhip(), new Facade(), new Tackle());

    }
}
