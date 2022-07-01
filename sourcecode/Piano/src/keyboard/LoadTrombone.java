package keyboard;

import java.util.ArrayList;

public class LoadTrombone extends LoadNote {

    public final int instrument = 57;
    public LoadTrombone(int volume) {
        this.volume = volume;
        ArrayList<NewNote> tromboneNotes = new ArrayList<NewNote>();
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
        tromboneNotes.add(noteCSharp1);
        tromboneNotes.add(noteDSharp1);
        tromboneNotes.add(noteFSharp1);
        tromboneNotes.add(noteGSharp1);
        tromboneNotes.add(noteASharp1);
        this.notes = tromboneNotes;
    }
    public int getVolume() {
        return volume;
    }
}