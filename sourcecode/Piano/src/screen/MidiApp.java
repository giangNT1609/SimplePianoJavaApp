package screen;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

import javax.swing.*;
import java.io.IOException;

public class MidiApp extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        try{
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/screen/fxml/piano.fxml"));
            stage.setTitle("Midi Electric Piano");
            stage.setScene(new Scene(loader.load()));
            stage.show();
            stage.setOnCloseRequest(new EventHandler<WindowEvent>() {
                @Override
                public void handle(WindowEvent windowEvent) {
                    Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                    alert.setTitle("Exit Confirm");
                    alert.setHeaderText("Exit Confirm");
                    alert.setContentText("Do you want to exit?");
                    if(alert.showAndWait().get() == ButtonType.OK){
                        stage.close();
                    }
                    windowEvent.consume();
                }
            });
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"Error: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        launch(args);
    }
}
