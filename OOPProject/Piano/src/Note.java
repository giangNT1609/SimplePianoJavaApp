import javafx.scene.media.AudioClip;

import java.io.File;

public class Note implements Playable{
    private AudioClip audioClip;
    private String path;
    private String type_of_music;

    //private double volume = 100.0;
    public Note(String path) {
        this.path = path;
        this.audioClip = new AudioClip(new File(path).toURI().toString());
    }
    public Note(String path, String type_of_note) {
        this.path = path;
        this.type_of_music = type_of_music;
    }
    public String getType_of_music() {
        return type_of_music;
    }


    @Override
    public void play(double volume) {;
        audioClip.play(volume);
        audioClip.setRate(1);
    }

    @Override
    public void play() {
        audioClip.play();
        audioClip.setRate(1);
    }

}
