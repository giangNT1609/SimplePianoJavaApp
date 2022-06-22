import org.jfugue.pattern.Pattern;

public interface Playable {
    void play();

    //void play(double volume);
    void play(Pattern p);
}
