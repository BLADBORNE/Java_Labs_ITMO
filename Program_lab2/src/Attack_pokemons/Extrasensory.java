package Attack_pokemons;

import ru.ifmo.se.pokemon.*;

public class Extrasensory extends SpecialMove {
    public Extrasensory() {
        super(Type.PSYCHIC, 80, 100);
    }

    @Override
    public void applyOppEffects(Pokemon def) {
        if (Math.random() < 0.1) {
            Effect effect = new Effect();
            Effect.flinch(def);
            def.addEffect(effect);
            System.out.println("Покемон вздрогнул");
        }
    }

    @Override
    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");
        return "Использует атаку " + pieces[pieces.length - 1];
    }
}
