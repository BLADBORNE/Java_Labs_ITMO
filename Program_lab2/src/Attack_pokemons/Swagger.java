package Attack_pokemons;

import ru.ifmo.se.pokemon.*;

public class Swagger extends StatusMove {
    public Swagger() {
        super(Type.NORMAL, 2, 85);
    }

    @Override
    public void applyOppEffects(Pokemon def) {
        Effect effect = new Effect();
        Effect.confuse(def);
        effect.stat(Stat.ATTACK, 2);
        System.out.println("Покемон сбит с толку");
    }

    @Override
    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");
        return "Использует атаку " + pieces[pieces.length - 1];
    }

}
