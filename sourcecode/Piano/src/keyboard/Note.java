package keyboard;

import org.jfugue.pattern.Pattern;
import org.jfugue.player.Player;

public class Note implements Playable {
    private int title;
    private int volume;
    private int instrument;
    private Pattern pattern;

    public int getTitle() {
        return title;
    }

    public void setTitle(int title) {
        this.title = title;
    }

    public int getVolume() {
        return volume;
    }

    public int getInstrument() {
        return instrument;
    }

    public void setInstrument(int instrument) {
        this.instrument = instrument;
    }

    public void setVolume(int volume) {
        this.volume = volume;
        String b = String.valueOf(getTitle());
        String a = String.valueOf(getVolume());
        String c = String.valueOf(getInstrument());
        String s = ":CON(7,"+a+") I"+c+" " + b;
        this.pattern  = new Pattern(s);
    }
    public Note(int title, int volume, int instrument) {
        this.title = title;
        this.volume = volume;
        this.instrument = instrument;
        String b = String.valueOf(title);
        String a = String.valueOf(volume);
        String c = String.valueOf(instrument);
        String s = ":CON(7,"+a+") I"+c+" " + b;
        this.pattern  = new Pattern(s);
    }
    @Override
    public void play() {
        Player player = new Player();
        player.play(this.pattern);
        //System.out.println(this.pattern.toString());
    }
}