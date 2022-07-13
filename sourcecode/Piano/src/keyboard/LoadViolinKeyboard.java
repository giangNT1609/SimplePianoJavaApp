package keyboard;

import java.util.ArrayList;

public class LoadViolinKeyboard extends LoadKeyboard {

  public final int instrument = 40;

  public LoadViolinKeyboard(int volume) {
    this.volume = volume;
    ArrayList<Note> violinNotes = new ArrayList<Note>();
    Note noteC = new Note(60,this.getVolume(),instrument);
    Note noteD = new Note(62,this.getVolume(),instrument);
    Note noteE = new Note(64,this.getVolume(),instrument);
    Note noteF = new Note(65,this.getVolume(),instrument);
    Note noteG = new Note(67,this.getVolume(),instrument);
    Note noteA = new Note(69,this.getVolume(),instrument);
    Note noteB = new Note(71,this.getVolume(),instrument);
    //NewNote noteCSharp = new NewNote(61,this.getVolume(),instrument);
    //NewNote noteDSharp = new NewNote(63,this.getVolume(),instrument);
    //NewNote noteFSharp = new NewNote(66,this.getVolume(),instrument);
    //NewNote noteGSharp = new NewNote(68,this.getVolume(),instrument);
    //NewNote noteASharp = new NewNote(70,this.getVolume(),instrument);
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
    violinNotes.add(noteC);
    violinNotes.add(noteD);
    violinNotes.add(noteE);
    violinNotes.add(noteF);
    violinNotes.add(noteG);
    violinNotes.add(noteA);
    violinNotes.add(noteB);
    //violinNotes.add(noteCSharp);
    //violinNotes.add(noteDSharp);
    //violinNotes.add(noteFSharp);
    //violinNotes.add(noteGSharp);
    //violinNotes.add(noteASharp);
    violinNotes.add(noteC1);
    violinNotes.add(noteD1);
    violinNotes.add(noteE1);
    violinNotes.add(noteF1);
    violinNotes.add(noteG1);
    violinNotes.add(noteA1);
    violinNotes.add(noteB1);
    violinNotes.add(noteCSharp1);
    violinNotes.add(noteDSharp1);
    violinNotes.add(noteFSharp1);
    violinNotes.add(noteGSharp1);
    violinNotes.add(noteASharp1);
    this.notes = violinNotes;
  }
  public int getVolume() {
    return volume;
  }
}
