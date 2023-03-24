package Attack_pokemons;

import ru.ifmo.se.pokemon.*;

public class TailWhip extends StatusMove {
    public TailWhip() {
        super(Type.NORMAL, 30, 100);
    }

    @Override
    public void applyOppEffects(Pokemon def) {
        Effect effect = new Effect();
        effect.stat(Stat.DEFENSE, -1);
        def.addEffect(effect);
        System.out.println("Покемон понизил защиту");
    }

    @Override
    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");
        return "Использует атаку " + pieces[pieces.length - 1];
    }
}
