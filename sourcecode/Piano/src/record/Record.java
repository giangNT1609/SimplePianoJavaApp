package record;

import keyboard.NewNote;
import keyboard.Playable;

import java.util.ArrayList;
import java.util.List;

public class Record implements Playable {

    private List<NewNote> listNotes = new ArrayList<>();
    private int id;
    private static int count = 0;
    
    public Record() {
    	count += 1;
    	this.id = count;
    }
    
    public int getRecordID() {
    	return this.id;
    }

    public void addNote(NewNote note){
        listNotes.add(note);
    }
    public List<NewNote> getListNotes() {
        return listNotes;
    }


    @Override
    public void play() {
    	for(NewNote i : listNotes) {
    		i.play();
    	}
    }


}
