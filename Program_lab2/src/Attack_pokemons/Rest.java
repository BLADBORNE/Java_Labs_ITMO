package Attack_pokemons;

import ru.ifmo.se.pokemon.*;

public class Rest extends StatusMove {
    public Rest() {
        super(Type.PSYCHIC, 0, 100);
    }

    @Override
    protected void applySelfEffects(Pokemon att) {
        att.restore();
        Effect effect = new Effect();
        effect.condition(Status.SLEEP).turns(2);
        att.addEffect(effect);
        System.out.println("Покемон уснул на 2 хода");
    }

    @Override
    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");
        return "Использует атаку " + pieces[pieces.length - 1];
    }
}

