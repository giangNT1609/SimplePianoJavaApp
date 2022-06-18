import javafx.scene.input.KeyCode;

public class Note implements Playable {
    private String name;
    private KeyCode keyCode;
    private int number;

    public Note(String name, KeyCode keyCode, int number) {
        this.name = name;
        this.keyCode = keyCode;
        this.number = number;
    }
    @Override
    public void play() {
        System.out.println(name + " " + keyCode + " " + number);
    }
}
