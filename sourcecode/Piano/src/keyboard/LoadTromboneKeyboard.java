package keyboard;

import java.util.ArrayList;

public class LoadTromboneKeyboard extends LoadKeyboard {
    public LoadTromboneKeyboard(int volume) {
        this.instrument = 57;
        this.volume = volume;
        ArrayList<Note> tromboneNotes = new ArrayList<Note>();
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
        tromboneNotes.add(noteC);
        tromboneNotes.add(noteD);
        tromboneNotes.add(noteE);
        tromboneNotes.add(noteF);
        tromboneNotes.add(noteG);
        tromboneNotes.add(noteA);
        tromboneNotes.add(noteB);
        tromboneNotes.add(noteCSharp);
        tromboneNotes.add(noteDSharp);
        tromboneNotes.add(noteFSharp);
        tromboneNotes.add(noteGSharp);
        tromboneNotes.add(noteASharp);
        tromboneNotes.add(noteC1);
        tromboneNotes.add(noteD1);
        tromboneNotes.add(noteE1);
        tromboneNotes.add(noteF1);
        tromboneNotes.add(noteG1);
        tromboneNotes.add(noteA1);
        tromboneNotes.add(noteB1);
        this.notes = tromboneNotes;
    }
    public int getVolume() {
        return volume;
    }
}