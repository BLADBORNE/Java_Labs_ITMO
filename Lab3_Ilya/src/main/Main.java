package main;

import classes.*;
import enums.Feelings;

public class Main {
    public static void main(String[] args) {

//        Story story = new Story();
//        story.tell();
        Person person = new Person("Znayka");
        Knees knees = new Knees("knees");//1
        Ruler ruler = new Ruler("ruler's ends");//2

        person.bend(ruler);
        person.bend(knees);
    }
}