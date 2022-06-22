public class LoadGuitarNote extends LoadNote {
    private int volume;
    private final int instrument = 24 ;
    NewNote NoteC;

    public int getVolume() {
        return volume;
    }
    public LoadGuitarNote(int volume){
        this.volume = volume;
        noteC = new NewNote(60,this.getVolume(),instrument);
        noteD = new NewNote(62,this.getVolume(),instrument);
        noteE = new NewNote(64,this.getVolume(),instrument);
        noteF = new NewNote(65,this.getVolume(),instrument);
        noteG = new NewNote(67,this.getVolume(),instrument);
        noteA = new NewNote(69,this.getVolume(),instrument);
        noteB = new NewNote(71,this.getVolume(),instrument);
        noteCSharp = new NewNote(61,this.getVolume(),instrument);
        noteDSharp = new NewNote(63,this.getVolume(),instrument);
        noteFSharp = new NewNote(66,this.getVolume(),instrument);
        noteGSharp = new NewNote(68,this.getVolume(),instrument);
        noteASharp = new NewNote(70,this.getVolume(),instrument);
        noteC1 = new NewNote(72,this.getVolume(),instrument);
        noteD1 = new NewNote(74,this.getVolume(),instrument);
        noteE1 = new NewNote(76,this.getVolume(),instrument);
        noteF1 = new NewNote(77,this.getVolume(),instrument);
        noteG1 = new NewNote(79,this.getVolume(),instrument);
        noteA1 = new NewNote(81,this.getVolume(),instrument);
        noteB1 = new NewNote(83,this.getVolume(),instrument);
        noteCSharp1 = new NewNote(73,this.getVolume(),instrument);
        noteDSharp1 = new NewNote(75,this.getVolume(),instrument);
        noteFSharp1 = new NewNote(78,this.getVolume(),instrument);
        noteGSharp1 = new NewNote(80,this.getVolume(),instrument);
        noteASharp1 = new NewNote(82,this.getVolume(),instrument);
    }
    public static void main(String[] args) {
        LoadGuitarNote loadGuitarNote = new LoadGuitarNote(100);
        loadGuitarNote.getNoteC().play();
    }

}
