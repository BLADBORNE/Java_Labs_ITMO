package classes;

import enums.Feelings;

public class Story
{
    private Person person;
    private Ruler ruler;
    private Knees knees;

    public Story()
    {
        person = new Person("Znayka");
        ruler =  new Ruler("ruler's ends");
        knees =  new Knees("knees");
    }

    public void tell()
    {
        person.bend(ruler);
        person.bend(knees);
        person.expressFeelings(Feelings.NOTEMBRASSED);
        person.setName("He");
        person.sit(Feelings.SMILE);
        person.setName("Znayka");
        Note note = new Note(person.setTextNotes());
        person. setThoughts("Thoughts");
        person.reflection();
        person.setName("Znayka");
        person.thought();
    }
}
