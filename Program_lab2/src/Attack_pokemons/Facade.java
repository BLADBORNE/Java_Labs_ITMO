package Attack_pokemons;

import ru.ifmo.se.pokemon.*;

public class Facade extends PhysicalMove {
    public Facade() {
        super(Type.NORMAL, 70, 100);
    }

    @Override
    public void applyOppDamage(Pokemon def, double damage) {
        byte Damage;
        if (def.getCondition() == Status.BURN || def.getCondition() == Status.POISON || def.getCondition() == Status.PARALYZE) {
            Damage = 2;
            System.out.println("" + def + " получает двойной урон");
        } else {
            Damage = 1;
            System.out.println("" + def + " получает обычный урон");
        }

        def.setMod(Stat.HP, (int) Math.round((double) Damage * damage));
    }

    @Override
    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");
        return "Использует атаку " + pieces[pieces.length - 1];
    }
}

