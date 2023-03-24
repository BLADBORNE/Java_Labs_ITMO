package main;

import classes.*;

public class Main {
    public static void main(String[] args) throws Exception {

//        Story story = new Story();
//        story.tell();


        Person person = new Person("Znayka");
        Knees knees = new Knees("knees");
        Ruler ruler = new Ruler("ruler's ends", "сomputing ruler");
        Ruler.End rulerEnd = new Ruler.End(21, 21);

        person.goUp(ruler);
        rulerEnd.plugIn("Lunit", "Magnet Steel");
        person.bend(rulerEnd);

        person.bend(ruler);
        person.bend(knees);
    }
}