package record;

import keyboard.Note;
import keyboard.Playable;

import java.util.ArrayList;
import java.util.List;

public class Record implements Playable {

    private List<Note> listNotes = new ArrayList<>();
    private int id;
    private static int count = 0;
    
    public Record() {
    	count += 1;
    	this.id = count;
    }
    
    public int getRecordID() {
    	return this.id;
    }

    public void addNote(Note note){
        listNotes.add(note);
    }
    public List<Note> getListNotes() {
        return listNotes;
    }


    @Override
    public void play() {
    	for(Note i : listNotes) {
    		i.play();
    	}
    }


}
