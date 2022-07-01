package keyboard;

import java.util.ArrayList;

public class LoadGuitarNote extends LoadNote {
    private final int instrument = 24 ;
    public int getVolume() {
        return volume;
    }
    public LoadGuitarNote(int volume){
        this.volume = volume;
        ArrayList<NewNote> guitarNotes = new ArrayList<NewNote>();
        NewNote noteC = new NewNote(60,this.getVolume(),instrument);
        NewNote noteD = new NewNote(62,this.getVolume(),instrument);
        NewNote noteE = new NewNote(64,this.getVolume(),instrument);
        NewNote noteF = new NewNote(65,this.getVolume(),instrument);
        NewNote noteG = new NewNote(67,this.getVolume(),instrument);
        NewNote noteA = new NewNote(69,this.getVolume(),instrument);
        NewNote noteB = new NewNote(71,this.getVolume(),instrument);
        NewNote noteCSharp = new NewNote(61,this.getVolume(),instrument);
        NewNote noteDSharp = new NewNote(63,this.getVolume(),instrument);
        NewNote noteFSharp = new NewNote(66,this.getVolume(),instrument);
        NewNote noteGSharp = new NewNote(68,this.getVolume(),instrument);
        NewNote noteASharp = new NewNote(70,this.getVolume(),instrument);
        NewNote noteC1 = new NewNote(72,this.getVolume(),instrument);
        NewNote noteD1 = new NewNote(74,this.getVolume(),instrument);
        NewNote noteE1 = new NewNote(76,this.getVolume(),instrument);
        NewNote noteF1 = new NewNote(77,this.getVolume(),instrument);
        NewNote noteG1 = new NewNote(79,this.getVolume(),instrument);
        NewNote noteA1 = new NewNote(81,this.getVolume(),instrument);
        NewNote noteB1 = new NewNote(83,this.getVolume(),instrument);
        NewNote noteCSharp1 = new NewNote(73,this.getVolume(),instrument);
        NewNote noteDSharp1 = new NewNote(75,this.getVolume(),instrument);
        NewNote noteFSharp1 = new NewNote(78,this.getVolume(),instrument);
        NewNote noteGSharp1 = new NewNote(80,this.getVolume(),instrument);
        NewNote noteASharp1 = new NewNote(82,this.getVolume(),instrument);
        guitarNotes.add(noteC);
        guitarNotes.add(noteD);
        guitarNotes.add(noteE);
        guitarNotes.add(noteF);
        guitarNotes.add(noteG);
        guitarNotes.add(noteA);
        guitarNotes.add(noteB);
        guitarNotes.add(noteCSharp);
        guitarNotes.add(noteDSharp);
        guitarNotes.add(noteFSharp);
        guitarNotes.add(noteGSharp);
        guitarNotes.add(noteASharp);
        guitarNotes.add(noteC1);
        guitarNotes.add(noteD1);
        guitarNotes.add(noteE1);
        guitarNotes.add(noteF1);
        guitarNotes.add(noteG1);
        guitarNotes.add(noteA1);
        guitarNotes.add(noteB1);
        guitarNotes.add(noteCSharp1);
        guitarNotes.add(noteDSharp1);
        guitarNotes.add(noteFSharp1);
        guitarNotes.add(noteGSharp1);
        guitarNotes.add(noteASharp1);
        this.notes = guitarNotes;
    }
}