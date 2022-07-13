package keyboard;

import java.util.ArrayList;

public class LoadPianoKeyboard extends LoadKeyboard {

  private final int instrument = 0;
  public LoadPianoKeyboard(int volume) {
    this.volume = volume;
    ArrayList<Note> pianoNotes = new ArrayList<Note>();
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
