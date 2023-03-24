package main;

import pokemons.*;
import ru.ifmo.se.pokemon.Battle;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Battle b = new Battle();
        Entei p1 = new Entei("one", 5);
        Skiddo p2 = new Skiddo("bnb", 5);
        Gogoat p3 = new Gogoat("lorem", 5);
        Bounsweet p4 = new Bounsweet("Kat", 5);
        Steenee p5 = new Steenee("Crew", 5);
        Tsareena p6 = new Tsareena("Jake", 5);
        b.addAlly(p1);
        b.addAlly(p4);
        b.addAlly(p3);
        b.addFoe(p2);
        b.addFoe(p5);
        b.addFoe(p6);
        b.go();
    }
}