package enums;

public enum Location {
    APART("apart"),
    FLOOR("floor"),
    GROUND("ground"),
    DOWN("down"),
    UP("up");

    private final String translation;

    Location(String translation) {
        this.translation = translation;
    }

    public String getTranslation() {
        return translation;
    }
}
