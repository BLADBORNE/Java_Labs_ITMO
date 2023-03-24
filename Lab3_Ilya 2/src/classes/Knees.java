package classes;

import exceptions.DoesNotBelong;

public class Knees extends Subject {
    public Knees(String name) {
        super(name);
    }

    @Override
    public void bend(Object obj) throws DoesNotBelong {
        if (obj instanceof Subject subject) {
            System.out.println("the knees were bend");
        } else {
            System.out.println("the knees were not bend");
            throw new DoesNotBelong("The object does not belong to the Subject class");
        }
    }
}
