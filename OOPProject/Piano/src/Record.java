import org.jfugue.pattern.Pattern;

import java.util.ArrayList;
import java.util.List;

public class Record implements Playable {

    private List<NewNote> listNotes = new ArrayList<>();
    public Record(List<NewNote> listNotes) {
        this.listNotes = listNotes;
    }

    public void addNote(NewNote note){
        listNotes.add(note);
    }
    public List<NewNote> getListNotes() {
        return listNotes;
    }


    @Override
    public void play() {

    }

    @Override
    public void play(Pattern p) {

    }

}
