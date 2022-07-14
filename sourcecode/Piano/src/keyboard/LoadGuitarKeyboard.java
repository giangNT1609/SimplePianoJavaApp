package keyboard;

import java.util.ArrayList;

public class LoadGuitarKeyboard extends LoadKeyboard {
    public int getVolume() {
        return volume;
    }
    public LoadGuitarKeyboard(int volume){
        this.instrument = 24;
        this.volume = volume;
        ArrayList<Note> guitarNotes = new ArrayList<Note>();
        Note noteC = new Note(60,this.getVolume(),instrument);
        Note noteD = new Note(62,this.getVolume(),instrument);
        Note noteE = new Note(64,this.getVolume(),instrument);
        Note noteF = new Note(65,this.getVolume(),instrument);
        Note noteG = new Note(67,this.getVolume(),instrument);
        Note noteA = new Note(69,this.getVolume(),instrument);
        Note noteB = new Note(71,this.getVolume(),instrument);
        Note noteCSharp = new Note(61,this.getVolume(),instrument);
        Note noteDSharp = new Note(63,this.getVolume(),instrument);
        Note noteFSharp = new Note(66,this.getVolume(),instrument);
        Note noteGSharp = new Note(68,this.getVolume(),instrument);
        Note noteASharp = new Note(70,this.getVolume(),instrument);
        Note noteC1 = new Note(72,this.getVolume(),instrument);
        Note noteD1 = new Note(74,this.getVolume(),instrument);
        Note noteE1 = new Note(76,this.getVolume(),instrument);
        Note noteF1 = new Note(77,this.getVolume(),instrument);
        Note noteG1 = new Note(79,this.getVolume(),instrument);
        Note noteA1 = new Note(81,this.getVolume(),instrument);
        Note noteB1 = new Note(83,this.getVolume(),instrument);
        Note noteCSharp1 = new Note(73,this.getVolume(),instrument);
        Note noteDSharp1 = new Note(75,this.getVolume(),instrument);
        Note noteFSharp1 = new Note(78,this.getVolume(),instrument);
        Note noteGSharp1 = new Note(80,this.getVolume(),instrument);
        Note noteASharp1 = new Note(82,this.getVolume(),instrument);
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