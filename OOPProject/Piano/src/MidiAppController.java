import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Slider;

import java.net.URL;
import java.util.ResourceBundle;

public class MidiAppController implements Initializable {
    private double volume = 100.0;
    private LoadNote loadNote;
    @FXML
    private Button btnA1;
    @FXML
    private Button btnA1Sharp;

    @FXML
    private Button btnA2;

    @FXML
    private Button btnA2Sharp;

    @FXML
    private Button btnB1;

    @FXML
    private Button btnB2;

    @FXML
    private Button btnC1;

    @FXML
    private Button btnC1Sharp;

    @FXML
    private Button btnC2;

    @FXML
    private Button btnC2Sharp;

    @FXML
    private Button btnC3;

    @FXML
    private Button btnD1;

    @FXML
    private Button btnD1Sharp;

    @FXML
    private Button btnD2;

    @FXML
    private Button btnD2Sharp;

    @FXML
    private Button btnE1;

    @FXML
    private Button btnE2;

    @FXML
    private Button btnF1;

    @FXML
    private Button btnF1Sharp;

    @FXML
    private Button btnF2;

    @FXML
    private Button btnF2Sharp;

    @FXML
    private Button btnG1;

    @FXML
    private Button btnG1Sharp;

    @FXML
    private Button btnG2;

    @FXML
    private Button btnG2Sharp;
    @FXML
    private MenuItem btnDrum;

    @FXML
    private Slider volumeSlider;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        loadNote = new LoadPianoNote("piano");
        volumeSlider.setValue(1*100);
    }
    @FXML
    public void getVolume() {
        volume = volumeSlider.getValue()/100;
    }
    @FXML
    private void BtnC1Pressed(ActionEvent event) {loadNote.getNoteC().play(volume);}
    @FXML
    private void BtnC1SharpPressed(ActionEvent event) {
        loadNote.getNoteCSharp().play(volume);
    }
    @FXML
    private void BtnC2Pressed(ActionEvent event) { loadNote.getNoteC1().play(volume);}
    @FXML
    private void BtnC2SharpPressed(ActionEvent event) {loadNote.getNoteCSharp1().play(volume);}
    @FXML
    private void BtnD1Pressed(ActionEvent event){loadNote.getNoteD().play(volume);}
    @FXML
    private void BtnD1SharpPressed(ActionEvent event){loadNote.getNoteDSharp().play(volume);}
    @FXML
    private void BtnE1Pressed(ActionEvent event){loadNote.getNoteE().play(volume);};
    @FXML
    private void BtnF1Pressed(ActionEvent event){loadNote.getNoteF().play(volume);}
    @FXML
    private void BtnF1SharpPressed(ActionEvent event){loadNote.getNoteFSharp().play(volume);}
    @FXML
    private void BtnG1Pressed(ActionEvent event){loadNote.getNoteG().play(volume);}
    @FXML
    private void BtnG1SharpPressed(ActionEvent event){loadNote.getNoteGSharp().play(volume);}
    @FXML
    private void BtnA1Pressed(ActionEvent event){ loadNote.getNoteA().play(volume);}
    @FXML
    private void BtnA1SharpPressed(ActionEvent event){loadNote.getNoteASharp().play(volume);}
    @FXML
    private void BtnB1Pressed(ActionEvent event){loadNote.getNoteB().play(volume);}
    @FXML
    private void BtnD2Pressed(ActionEvent event){loadNote.getNoteD1().play(volume);}
    @FXML
    private void BtnD2SharpPressed(ActionEvent event){loadNote.getNoteDSharp1().play(volume);}
    @FXML
    private void BtnE2Pressed(ActionEvent event){loadNote.getNoteE1().play(volume);}
    @FXML
    private void BtnF2Pressed(ActionEvent event){loadNote.getNoteF1().play(volume);}
    @FXML
    private void BtnF2SharpPressed(ActionEvent event){loadNote.getNoteFSharp1().play(volume);}
    @FXML
    private void BtnG2Pressed(ActionEvent event){loadNote.getNoteG1().play(volume);}
    @FXML
    private void BtnG2SharpPressed(ActionEvent event){loadNote.getNoteGSharp1().play(volume);}
    @FXML
    private void BtnA2Pressed(ActionEvent event){loadNote.getNoteA1().play(volume);}
    @FXML
    private void BtnA2SharpPressed(ActionEvent event){loadNote.getNoteASharp1().play(volume);}
    @FXML
    private void BtnB2Pressed(ActionEvent event){loadNote.getNoteB1().play(volume);}
    @FXML
    private void loadDrum(ActionEvent event){
        loadNote = new LoadDrumNote("drum");
    }
}
