package keyboard;

import java.util.ArrayList;

public class LoadViolinNote extends LoadNote {

  public final int instrument = 40;

  public LoadViolinNote(int volume) {
    this.volume = volume;
    ArrayList<NewNote> violinNotes = new ArrayList<NewNote>();
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
    violinNotes.add(noteC);
    violinNotes.add(noteD);
    violinNotes.add(noteE);
    violinNotes.add(noteF);
    violinNotes.add(noteG);
    violinNotes.add(noteA);
    violinNotes.add(noteB);
    violinNotes.add(noteCSharp);
    violinNotes.add(noteDSharp);
    violinNotes.add(noteFSharp);
    violinNotes.add(noteGSharp);
    violinNotes.add(noteASharp);
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
