package Attack_pokemons;

import ru.ifmo.se.pokemon.*;

public class Snarl extends StatusMove {
    public Snarl()
    {
        super(Type.DARK, 55, 95);
    }
    @Override
    public void applyOppEffects(Pokemon def) {
        Effect effect = new Effect();
        effect.stat(Stat.SPECIAL_ATTACK, -1);
        def.addEffect(effect);
        System.out.println("Покемон понизил атаку на 1 этап");
    }

    @Override
    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");
        return "Использует атаку " + pieces[pieces.length - 1];
    }
}
