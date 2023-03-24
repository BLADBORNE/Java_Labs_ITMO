package Attack_pokemons;

import ru.ifmo.se.pokemon.*;

public class FireFang extends PhysicalMove {
    public FireFang() {
        super(Type.FIRE, 65, 95);
    }

    @Override
    public void applyOppEffects(Pokemon def) {
        if (Math.random() < 0.1) {
            Effect effect = new Effect();
            Effect.burn(def);
            def.addEffect(effect);
            System.out.println("Покемон горит");
        }
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
