package pokemons;


import Attack_pokemons.*;
import ru.ifmo.se.pokemon.*;

public class Entei extends Pokemon {
    public Entei(String name, int level) {
        super(name, level);
        setStats(115, 300, 85, 90, 75, 100);
        setType(Type.FIRE);
        setMove(new Snarl(), new Extrasensory(), new Swagger(), new FireFang());
    }

}
