import org.jfugue.pattern.Pattern;
import org.jfugue.player.Player;

public class NewNote implements Playable {
    private int title;
    private int volume;
    private int instrument;
    private Pattern pattern;

    public NewNote(int title, int volume, int instrument) {
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
    }

    @Override
    public void play(Pattern p) {
        Player player = new Player();
        player.play(this.pattern);
    }
}
