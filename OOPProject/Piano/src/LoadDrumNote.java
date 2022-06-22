public class LoadDrumNote extends LoadNote {
    public LoadDrumNote(String type_of_instrument) {
        this.type_of_instrument = type_of_instrument;
        noteC = new Note("src/notesound/drum/C_Drum.wav");
        noteD = new Note("src/notesound/drum/D_Drum.wav");
        noteE = new Note("src/notesound/drum/E_Drum.wav");
        noteF = new Note("src/notesound/drum/F_Drum.wav");
        noteG = new Note("src/notesound/drum/G_Drum.wav");
        noteA = new Note("src/notesound/drum/A_Drum.wav");
        noteB = new Note("src/notesound/drum/B_Drum.wav");
        noteCSharp = new Note("src/notesound/drum/Cq_Drum.wav");
        noteDSharp = new Note("src/notesound/drum/Dq_Drum.wav");
        noteFSharp = new Note("src/notesound/drum/Fq_Drum.wav");
        noteGSharp = new Note("src/notesound/drum/Gq_Drum.wav");
        noteASharp = new Note("src/notesound/drum/Bb_Drum.wav");
        noteC1 = new Note("src/notesound/drum/C1_Drum.wav");
        noteD1 = new Note("src/notesound/drum/D1_Drum.wav");
        noteE1 = new Note("src/notesound/drum/E1_Drum.wav");
        noteF1 = new Note("src/notesound/drum/F1_Drum.wav");
        noteG1 = new Note("src/notesound/drum/Gq_Drum.wav");
        //noteA1 = new Note("src/notesound/piano/a5.mp3");
        //noteB1 = new Note("src/notesound/piano/b5.mp3");
        //noteCSharp1 = new Note("src/notesound/piano/c-5.mp3");
        //noteDSharp1 = new Note("src/notesound/piano/d-5.mp3");
        //noteFSharp1 = new Note("src/notesound/piano/f-5.mp3");
        //noteGSharp1 = new Note("src/notesound/piano/g-5.mp3");
        //noteASharp1 = new Note("src/notesound/piano/a-5.mp3");
    }
}
