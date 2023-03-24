package enums;

public enum Feelings {
    FORCEOFGRAVITY("force of gravity"),
    NOTEMBRASSED("was not dismayed by this"),
    SMILE("smiled triumphantly"),
    CHAOS("chaos");

    private final String translation;

    Feelings(String translation) {
        this.translation = translation;
    }

    public String getTranslation() {
        return translation;
    }

    @Override
    public String toString() {
        return translation;
    }
}