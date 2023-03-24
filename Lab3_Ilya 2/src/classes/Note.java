package classes;

public class Note {
    private String textNote;

    public Note(String textNote) {
        this.textNote = textNote;
    }

    public Note() {
    }

    public void setTextNote(String textNote) {
        this.textNote = textNote;
    }

    public String getTextNote() {
        return textNote;
    }

    @Override
    public String toString() {
        return getTextNote();
    }
}
