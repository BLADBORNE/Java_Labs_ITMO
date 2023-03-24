package classes;

import java.util.Objects;

public class Invention {

    private String name;
    private String description;


    public Invention(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Invention invention = (Invention) o;
        return Objects.equals(description, invention.description);
    }

    @Override
    public int hashCode() {
        return 37 * name.hashCode() + 29;
    }

    @Override
    public String toString() {
        return getDescription();
    }
}
