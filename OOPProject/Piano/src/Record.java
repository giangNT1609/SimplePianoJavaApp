import java.util.ArrayList;
import java.util.List;

public class Record implements Playable {

    private List<Note> listNotes = new ArrayList<>();
    public Record(List<Note> listNotes) {
        this.listNotes = listNotes;
    }

    public void addNote(Note note){
        listNotes.add(note);
    }
    public List<Note> getListNotes() {
        return listNotes;
    }

    @Override
    public void play(double volume) {
        for (Note note : listNotes) {
            note.play(volume);
        }
    }

    @Override
    public void play() {
        for (Note note : listNotes) {
            note.play();
        }
    }
}
