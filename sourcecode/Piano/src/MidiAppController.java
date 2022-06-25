import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Slider;
import javafx.stage.Stage;
import keyboard.*;
import record.Record;
import record.RecordList;
import record.RecordScreen;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MidiAppController implements Initializable {
    private double volume = 100.0;
    private LoadNote loadNote;
    private boolean isRecord = false;
    private Record aRecord;
    
    @FXML
    private MenuItem changeRecordSc;
    
    @FXML
    private Button btnRecord;

    @FXML
    private Button btnStop;
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
    private MenuItem btnAboutUs;
    @FXML
    private MenuItem btnInstruction;

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
    private MenuItem btnGuitar;
    @FXML
    private MenuItem btnPiano;
    @FXML
    private MenuItem btnTrombone;

    @FXML
    private MenuItem btnVolin;

    @FXML
    private Slider volumeSlider;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        volumeSlider.setValue(volume);
        loadNote = new LoadPianoNote((int)volumeSlider.getValue());
    }
    @FXML
    public void getVolume() {
        volume = (volumeSlider.getValue()/100)*127;
        System.out.println(volume);
        loadNote.setVolume((int) volume);
    }
    @FXML
    private void BtnC1Pressed(ActionEvent event) {
    	loadNote.getNoteC().play();
    	if(isRecord) {
    		aRecord.addNote(loadNote.getNoteC());
    	}
    }
    @FXML
    private void BtnC1SharpPressed(ActionEvent event) {
        loadNote.getNoteCSharp().play();
        if(isRecord) {
    		aRecord.addNote(loadNote.getNoteCSharp());
    	}
    }
    @FXML
    private void BtnC2Pressed(ActionEvent event) { 
    	loadNote.getNoteC1().play();
    	if(isRecord) {
    		aRecord.addNote(loadNote.getNoteC1());
    	}
    }
    @FXML
    private void BtnC2SharpPressed(ActionEvent event) {
    	loadNote.getNoteCSharp1().play();
    	if(isRecord) {
    		aRecord.addNote(loadNote.getNoteCSharp1());
    	}
    	}
    @FXML
    private void BtnD1Pressed(ActionEvent event){
    	loadNote.getNoteD().play();
    	if(isRecord) {
    		aRecord.addNote(loadNote.getNoteD());
    	}
    }
    @FXML
    private void BtnD1SharpPressed(ActionEvent event){
    	loadNote.getNoteDSharp().play();
    	if(isRecord) {
    		aRecord.addNote(loadNote.getNoteDSharp());
    	}
    }
    @FXML
    private void BtnE1Pressed(ActionEvent event){
    	loadNote.getNoteE().play();
    	if(isRecord) {
    		aRecord.addNote(loadNote.getNoteE());
    	}
    }
    @FXML
    private void BtnF1Pressed(ActionEvent event){
    	loadNote.getNoteF().play();
    	if(isRecord) {
    		aRecord.addNote(loadNote.getNoteF());
    	}
    }
    @FXML
    private void BtnF1SharpPressed(ActionEvent event){
    	loadNote.getNoteFSharp().play();
    	if(isRecord) {
    		aRecord.addNote(loadNote.getNoteFSharp());
    	}
    }
    @FXML
    private void BtnG1Pressed(ActionEvent event){
    	loadNote.getNoteG().play();
    	if(isRecord) {
    		aRecord.addNote(loadNote.getNoteG());
    	}
    }
    @FXML
    private void BtnG1SharpPressed(ActionEvent event){
    	loadNote.getNoteGSharp().play();
    	if(isRecord) {
    		aRecord.addNote(loadNote.getNoteGSharp());
    	}
    }
    @FXML
    private void BtnA1Pressed(ActionEvent event){
    	loadNote.getNoteA().play();
    	if(isRecord) {
    		aRecord.addNote(loadNote.getNoteA());
    	}
    }
    @FXML
    private void BtnA1SharpPressed(ActionEvent event){
    	loadNote.getNoteASharp().play();
    	if(isRecord) {
    		aRecord.addNote(loadNote.getNoteASharp());
    	}
    }
    @FXML
    private void BtnB1Pressed(ActionEvent event){
    	loadNote.getNoteB().play();
    	if(isRecord) {
    		aRecord.addNote(loadNote.getNoteB());
    	}
    }
    @FXML
    private void BtnD2Pressed(ActionEvent event){
    	loadNote.getNoteD1().play();
    	if(isRecord) {
    		aRecord.addNote(loadNote.getNoteD1());
    	}
    }
    @FXML
    private void BtnD2SharpPressed(ActionEvent event){
    	loadNote.getNoteDSharp1().play();
    	if(isRecord) {
    		aRecord.addNote(loadNote.getNoteDSharp1());
    	}
    }
    @FXML
    private void BtnE2Pressed(ActionEvent event){
    	loadNote.getNoteE1().play();
    	if(isRecord) {
    		aRecord.addNote(loadNote.getNoteE1());
    	}
    }
    @FXML
    private void BtnF2Pressed(ActionEvent event){
    	loadNote.getNoteF1().play();
    	if(isRecord) {
    		aRecord.addNote(loadNote.getNoteF1());
    	}
    }
    @FXML
    private void BtnF2SharpPressed(ActionEvent event){
    	loadNote.getNoteFSharp1().play();
    	if(isRecord) {
    		aRecord.addNote(loadNote.getNoteFSharp1());
    	}
    }
    @FXML
    private void BtnG2Pressed(ActionEvent event){
    	loadNote.getNoteG1().play();
    	if(isRecord) {
    		aRecord.addNote(loadNote.getNoteG1());
    	}
    }
    @FXML
    private void BtnG2SharpPressed(ActionEvent event){
    	loadNote.getNoteGSharp1().play();
    	if(isRecord) {
    		aRecord.addNote(loadNote.getNoteGSharp1());
    	}
    }
    @FXML
    private void BtnA2Pressed(ActionEvent event){
    	loadNote.getNoteA1().play();
    	if(isRecord) {
    		aRecord.addNote(loadNote.getNoteA1());
    	}
    }
    @FXML
    private void BtnA2SharpPressed(ActionEvent event){
    	loadNote.getNoteASharp1().play();
    	if(isRecord) {
    		aRecord.addNote(loadNote.getNoteASharp1());
    	}
    }
    @FXML
    private void BtnB2Pressed(ActionEvent event){
    	loadNote.getNoteB1().play();
    	if(isRecord) {
    		aRecord.addNote(loadNote.getNoteB1());
    	}
    }
    
    @FXML
    private void loadGuitar(ActionEvent event){
        loadNote = new LoadGuitarNote((int) volume);
    }
    @FXML
    private void loadViolin(ActionEvent event){
        loadNote = new LoadViolinNote((int) volume);
    }
    @FXML
    private void loadPiano(ActionEvent event){
        loadNote = new LoadPianoNote((int) volume);
    }
    @FXML
    private void loadTrombone(ActionEvent event){
        loadNote = new LoadTrombone((int) volume);
    }
    @FXML
    private void showAboutUs(ActionEvent event) throws IOException {
        Stage newStage = new Stage();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/aboutUs.fxml"));
        newStage.setScene(new Scene(loader.load()));
        newStage.show();
    }
    @FXML
    private void showInstruction(ActionEvent event) throws IOException {
        Stage newStage = new Stage();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/instruction.fxml"));
        newStage.setScene(new Scene(loader.load()));
        newStage.show();
    }
    
    @FXML
    void changeScreen(ActionEvent event) {
    	if(event.getSource() == changeRecordSc) {
    		new RecordScreen();
    	}
    }
    
    @FXML
    void btnClk(ActionEvent event) {
    	if(event.getSource() == btnRecord) {
    		if(!isRecord) {
    			isRecord = true;
    			btnRecord.setStyle("-fx-background-color: green;");
    			btnStop.setStyle("-fx-background-color: red;");
        		aRecord = new Record();
        		System.out.println("Recording");
    		}
    	}else if(event.getSource() == btnStop) {
    		if(isRecord) {
    			isRecord = false;
    			btnRecord.setStyle("-fx-background-color: red;");
    			RecordList.addToRecordList(aRecord);
    			//record.RecordList.printOut();
    			//System.out.println("Stop Recording");
    		}
    	}
    }
}
