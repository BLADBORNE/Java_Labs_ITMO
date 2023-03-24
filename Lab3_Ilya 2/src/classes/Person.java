package classes;

import enums.Feelings;
import enums.Location;
import exceptions.DoesNotBelong;
import exceptions.RulerBreakException;
import interfaces.*;

import java.util.Objects;

public class Person implements Bend, Sit {
    private String name;
    private String thoughts;
    private Feelings feelings;

    public Person(String name, Feelings feelings) {
        this.name = name;
        this.feelings = feelings;
    }

    public Person(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Feelings getFeelings() {
        return feelings;
    }

    public String getThoughts(String note) {
        return thoughts;
    }

    public String getThoughts() {
        return thoughts;
    }


    public void setThoughts(String thoughts) {
        this.thoughts = thoughts;
    }

    public String setAndGetLocation(Location location) {
        return location.getTranslation();
    }

    public void thought() {
        setThoughts("thoughts");
        System.out.println(name + " thought of one " + getThoughts() + " that superseded the others");
    }

    public void goUp(Ruler ruler) {
        setName("he");
        System.out.println("Rising from the " + setAndGetLocation(Location.FLOOR) + ", " + name + " pulled out " + ruler.getType());
    }


    public void reflection() {
        setTextNotes();
        setName("his");
        setThoughts("Thoughts");
        System.out.println(getThoughts() + swirl() + " and " + name + " mind went into " + setAndGetFeelings(Feelings.CHAOS));
    }


    public String swirl() {
        return " were swirling in his head";
    }

    public void expressFeelings() {
        System.out.print(" and felt the " + feelings); //may remove .getTranslation()
    }

    public void setFeelings(Feelings feelings) {
        this.feelings = feelings;
    }

    public String setAndGetFeelings(Feelings feelings) {
        this.feelings = feelings;
        return feelings.getTranslation();
    }

    public void expressFeelings(Feelings feelings) {
        this.feelings = feelings;
        System.out.print(name + " even " + feelings.getTranslation() + "\n");
    }


    public String setTextNotes() {
        Invention invention = new Invention("weightlessness");
        System.out.println(name + " sat on the " + setAndGetLocation(Location.FLOOR) + " and filled out a note on the discovery of " + invention.getName());
        return name + " sat on the " + setAndGetLocation(Location.FLOOR) + " and filled out a note on the discovery of " + invention.getName();
    }

    @Override
    public void bend(Object obj) throws DoesNotBelong {
        if (obj instanceof Subject subject) {
            if (subject.getName().equals("ruler's ends")) {
                setName("Znayka");
                this.feelings = Feelings.FORCEOFGRAVITY;
                System.out.print(name + " pushed " + subject.getName() + " " + setAndGetLocation(Location.APART));
                expressFeelings();
            } else {
                System.out.print("\nHis " + subject.getName() + " have bent and " + name + sit() + " to the " + setAndGetLocation(Location.FLOOR) + ". ");
                expressFeelings(Feelings.NOTEMBRASSED);
                setName("He");
                sit(Feelings.SMILE);
                setName("Znayka");
                reflection();
                setName("Znayka");
                thought();
            }
        } else {
            throw new DoesNotBelong("The object does not belong to the Subject class");
        }

    }

    public void bend(Ruler.End rulerEnd) {
        boolean isBanded = false;
        int EndSpaceAmount = rulerEnd.getEndSpaceAmount();
        while (!isBanded) {
            if (EndSpaceAmount == Subject.DEFAULT_SPACE_BETWEEN_STONES) {
                System.out.println(name + " felt " + setAndGetFeelings(Feelings.FORCEOFGRAVITY) + " again");
                isBanded = true;
            } else {
                EndSpaceAmount--;
            }
        }
    }

    public Note specialNote() {
        final String dream = name + " always wanted to own Lunit and Magnet Steel";
        return new Note(dream) {
            @Override
            public String getTextNote() {
                return dream + "\n - it's a secret note";
            }
        };
    }

    @Override
    public String sit() {
        return " sit with thud";
    }

    @Override
    public void sit(Feelings feelings) {
        System.out.println(name + " " + feelings.getTranslation() + " and sat on the " + setAndGetLocation(Location.FLOOR));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && feelings == person.feelings;
    }

    @Override
    public int hashCode() {
        return 37 * name.hashCode() + 29;
    }

    @Override
    public String toString() {
        return "name = " + name + "is feeling " + feelings;
    }
}