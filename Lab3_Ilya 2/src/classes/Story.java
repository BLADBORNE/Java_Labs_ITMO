package classes;

import enums.Feelings;
import exceptions.DoesNotBelong;

public class Story {
    private Person person;
    private Ruler ruler;
    private Knees knees;

    public Story() {
        person = new Person("Znayka");
        ruler = new Ruler("ruler", "flexible");
        knees = new Knees("knees");
    }

    public void tell() throws DoesNotBelong {
        person.bend(ruler);
        person.bend(knees);
        person.expressFeelings(Feelings.NOTEMBRASSED);
        person.setName("He");
        person.sit(Feelings.SMILE);
        person.setName("Znayka");
        Note note = new Note(person.setTextNotes());
        person.setTextNotes();
        person.reflection();
        person.setName("Znayka");
        person.thought();
    }
}
