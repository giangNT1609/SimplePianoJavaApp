import javafx.scene.Node;

import java.util.ArrayList;
import java.util.List;

public class Record implements Playable {

    private List<Note> listNotes = new ArrayList<>();
    public Record(List<Note> listNotes) {
        this.listNotes = listNotes;
    }
    @Override
    public void play() {
        for (Note note : listNotes) {
            note.play();
        }
    }
}
