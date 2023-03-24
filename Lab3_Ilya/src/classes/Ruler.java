package classes;

public class Ruler extends Subject
{
    public Ruler(String name)
    {
        super(name);
    }

    @Override
    public void bend(Subject subject) {
        System.out.println("the ruler was bend");
    }




}
