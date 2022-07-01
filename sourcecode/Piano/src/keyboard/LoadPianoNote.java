package keyboard;

import java.util.ArrayList;

public class LoadPianoNote extends LoadNote {

  private final int instrument = 0;
  public LoadPianoNote(int volume) {
    this.volume = volume;
    ArrayList<NewNote> pianoNotes = new ArrayList<NewNote>();
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
    pianoNotes.add(noteC);
    pianoNotes.add(noteD);
    pianoNotes.add(noteE);
    pianoNotes.add(noteF);
    pianoNotes.add(noteG);
    pianoNotes.add(noteA);
    pianoNotes.add(noteB);
    pianoNotes.add(noteCSharp);
    pianoNotes.add(noteDSharp);
    pianoNotes.add(noteFSharp);
    pianoNotes.add(noteGSharp);
    pianoNotes.add(noteASharp);
    pianoNotes.add(noteC1);
    pianoNotes.add(noteD1);
    pianoNotes.add(noteE1);
    pianoNotes.add(noteF1);
    pianoNotes.add(noteG1);
    pianoNotes.add(noteA1);
    pianoNotes.add(noteB1);
    pianoNotes.add(noteCSharp1);
    pianoNotes.add(noteDSharp1);
    pianoNotes.add(noteFSharp1);
    pianoNotes.add(noteGSharp1);
    pianoNotes.add(noteASharp1);
    this.notes = pianoNotes;
  }
  public int getVolume() {
    return volume;
  }
}
