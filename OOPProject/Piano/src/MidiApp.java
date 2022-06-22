import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MidiApp extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/piano.fxml"));
        stage.setTitle("Piano");
        stage.setScene(new Scene(loader.load()));
        stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
