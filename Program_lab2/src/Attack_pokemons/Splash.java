package Attack_pokemons;

import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class Splash extends StatusMove {
    public Splash() {
        super(Type.NORMAL, 0, 100);
    }

    @Override
    protected String describe() {
        return "Курит бамбук";
    }
}
