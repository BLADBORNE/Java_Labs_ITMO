package classes;

import interfaces.Bend;

import java.util.Objects;

public abstract class Subject implements Bend {
    private final String name;

    public Subject(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Subject subject = (Subject) o;
        return Objects.equals(name, subject.name);
    }

    @Override
    public int hashCode() {
        return 37 * name.hashCode() + 29;
    }

    @Override
    public String toString() {
        return "Name " + getName();
    }
}
