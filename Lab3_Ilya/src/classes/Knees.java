package classes;

public class Knees extends Subject {
    public Knees(String name)
    {
        super(name);
    }
    @Override
    public void bend(Subject subject) {
        System.out.println("the knees were bend");
    }
}
