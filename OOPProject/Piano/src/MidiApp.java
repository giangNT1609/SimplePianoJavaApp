import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javax.sound.midi.*;
import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MidiApp extends Application {
    private MidiChannel channel;
    private Parent createContent() throws IOException {
        loadChannel();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/piano.fxml"));
        return loader.load();
    }
    private void loadChannel() {
        try {
            Synthesizer syth = MidiSystem.getSynthesizer();
            syth.open();
            syth.loadInstrument(syth.getDefaultSoundbank().getInstruments()[0]);

            channel = syth.getChannels()[0];

        } catch (MidiUnavailableException e) {
            System.out.println("Can't get synthesizer");
            //throw new RuntimeException(e);
            e.printStackTrace();
        }
    }
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Piano");
        stage.setScene(new Scene(createContent()));
        stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
