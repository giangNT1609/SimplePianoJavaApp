package screen;

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

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import static javax.swing.JOptionPane.showMessageDialog;

public class MidiAppController implements Initializable {
    private double volume = 100.0;
    private LoadKeyboard loadKeyboard;
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
        loadKeyboard = new LoadPianoKeyboard((int)volumeSlider.getValue()/100*127);
    }
    @FXML
    public void getVolume() {
        volume = (volumeSlider.getValue()/100)*127;
        System.out.println(volume);
        loadKeyboard.setVolume((int) volume);
    }
    @FXML
    private void BtnC1Pressed(ActionEvent event) throws NullPointerException{
        try{
            loadKeyboard.getNoteC().play();
            if(isRecord) {
                aRecord.addNote(loadKeyboard.getNoteC());
            }
        }catch(NullPointerException e){
            showMessageDialog(null, "The note is not loaded");
        }
    }
    @FXML
    private void BtnC1SharpPressed(ActionEvent event) throws NullPointerException{
        try {
            loadKeyboard.getNoteCSharp().play();
            if(isRecord) {
                aRecord.addNote(loadKeyboard.getNoteCSharp());
            }
        }
        catch(NullPointerException e){
            showMessageDialog(null, "The note is not loaded");
        }

    }
    @FXML
    private void BtnC2Pressed(ActionEvent event) throws NullPointerException{
            try {
                loadKeyboard.getNoteC1().play();
                if (isRecord) {
                    aRecord.addNote(loadKeyboard.getNoteC1());
                }
            } catch (NullPointerException e) {
                showMessageDialog(null, "The note is not loaded");
            }
    }
    @FXML
    private void BtnC2SharpPressed(ActionEvent event) throws NullPointerException{
        try {
            loadKeyboard.getNoteCSharp1().play();
            if(isRecord) {
                aRecord.addNote(loadKeyboard.getNoteCSharp1());
            }
        }catch (NullPointerException e){
            showMessageDialog(null, "The note is not loaded");
        }
    }
    @FXML
    private void BtnD1Pressed(ActionEvent event) throws NullPointerException{
        try{
            loadKeyboard.getNoteD().play();
            if(isRecord) {
                aRecord.addNote(loadKeyboard.getNoteD());
            }
        }catch (NullPointerException e){
            showMessageDialog(null, "The note is not loaded");
        }
    }
    @FXML
    private void BtnD1SharpPressed(ActionEvent event) throws NullPointerException{
        try{
            loadKeyboard.getNoteDSharp().play();
            if(isRecord) {
                aRecord.addNote(loadKeyboard.getNoteDSharp());
            }
        }catch (NullPointerException e){
            showMessageDialog(null, "The note is not loaded");
        }
    }
    @FXML
    private void BtnE1Pressed(ActionEvent event)throws NullPointerException{
        try{
            loadKeyboard.getNoteE().play();
            if(isRecord) {
                aRecord.addNote(loadKeyboard.getNoteE());
            }
        }catch (NullPointerException e){
            showMessageDialog(null, "The note is not loaded");
        }
    }
    @FXML
    private void BtnF1Pressed(ActionEvent event) throws NullPointerException{
        try{
            loadKeyboard.getNoteF().play();
            if(isRecord) {
                aRecord.addNote(loadKeyboard.getNoteF());
            }
        }catch (NullPointerException e){
            showMessageDialog(null, "The note is not loaded");
        }
    }
    @FXML
    private void BtnF1SharpPressed(ActionEvent event) throws NullPointerException{
        try {
            loadKeyboard.getNoteFSharp().play();
            if(isRecord) {
                aRecord.addNote(loadKeyboard.getNoteFSharp());
            }
        }catch (NullPointerException e){
            showMessageDialog(null, "The note is not loaded");
        }
    }
    @FXML
    private void BtnG1Pressed(ActionEvent event) throws NullPointerException{
        try{
            loadKeyboard.getNoteG().play();
            if(isRecord) {
                aRecord.addNote(loadKeyboard.getNoteG());
            }
        }catch (NullPointerException e){
            showMessageDialog(null, "The note is not loaded");
        }
    }
    @FXML
    private void BtnG1SharpPressed(ActionEvent event) throws NullPointerException{
        try{
            loadKeyboard.getNoteGSharp().play();
            if(isRecord) {
                aRecord.addNote(loadKeyboard.getNoteGSharp());
            }
        }
        catch (NullPointerException e){
            showMessageDialog(null, "The note is not loaded");
        }
    }
    @FXML
    private void BtnA1Pressed(ActionEvent event) throws NullPointerException{
        try{
            loadKeyboard.getNoteA().play();
            if(isRecord) {
                aRecord.addNote(loadKeyboard.getNoteA());
            }
        }
        catch (NullPointerException e){
            showMessageDialog(null, "The note is not loaded");
        }
    }
    @FXML
    private void BtnA1SharpPressed(ActionEvent event) throws NullPointerException{
        try{
            loadKeyboard.getNoteASharp().play();
            if(isRecord) {
                aRecord.addNote(loadKeyboard.getNoteASharp());
            }
        }
        catch (NullPointerException e){
            showMessageDialog(null, "The note is not loaded");
        }
    }
    @FXML
    private void BtnB1Pressed(ActionEvent event) throws NullPointerException{
        try{
            loadKeyboard.getNoteB().play();
            if(isRecord) {
                aRecord.addNote(loadKeyboard.getNoteB());
            }
        }
        catch (NullPointerException e) {
            showMessageDialog(null, "The note is not loaded");
        }
    }
    @FXML
    private void BtnD2Pressed(ActionEvent event) throws NullPointerException{
        try{
            loadKeyboard.getNoteD1().play();
            if(isRecord) {
                aRecord.addNote(loadKeyboard.getNoteD1());
            }
        }
        catch (NullPointerException e){
            showMessageDialog(null, "The note is not loaded");
        }
    }
    @FXML
    private void BtnD2SharpPressed(ActionEvent event) throws NullPointerException{
        try{
            loadKeyboard.getNoteDSharp1().play();
            if(isRecord) {
                aRecord.addNote(loadKeyboard.getNoteDSharp1());
            }
        }
        catch (NullPointerException e){
            showMessageDialog(null, "The note is not loaded");
        }
    }
    @FXML
    private void BtnE2Pressed(ActionEvent event) throws NullPointerException{
        try {
            loadKeyboard.getNoteE1().play();
            if(isRecord) {
                aRecord.addNote(loadKeyboard.getNoteE1());
            }
        }
        catch (NullPointerException e){
            showMessageDialog(null, "The note is not loaded");
        }
    }
    @FXML
    private void BtnF2Pressed(ActionEvent event) throws NullPointerException{
        try{
            loadKeyboard.getNoteF1().play();
            if(isRecord) {
                aRecord.addNote(loadKeyboard.getNoteF1());
            }
        }
        catch (NullPointerException e){
            showMessageDialog(null, "The note is not loaded");
        }
    }
    @FXML
    private void BtnF2SharpPressed(ActionEvent event) throws  NullPointerException{
        try{
            loadKeyboard.getNoteFSharp1().play();
            if(isRecord) {
                aRecord.addNote(loadKeyboard.getNoteFSharp1());
            }
        }
        catch (NullPointerException e){
            showMessageDialog(null, "The note is not loaded");
        }
    }
    @FXML
    private void BtnG2Pressed(ActionEvent event) throws NullPointerException{
        try {
            loadKeyboard.getNoteG1().play();
            if(isRecord) {
                aRecord.addNote(loadKeyboard.getNoteG1());
            }
        }
        catch (NullPointerException e){
            showMessageDialog(null, "The note is not loaded");
        }
    }
    @FXML
    private void BtnG2SharpPressed(ActionEvent event) throws NullPointerException{
        try{
            loadKeyboard.getNoteGSharp1().play();
            if(isRecord) {
                aRecord.addNote(loadKeyboard.getNoteGSharp1());
            }
        }
        catch (NullPointerException e){
            showMessageDialog(null, "The note is not loaded");
        }
    }
    @FXML
    private void BtnA2Pressed(ActionEvent event) throws NullPointerException{
        try{
            loadKeyboard.getNoteA1().play();
            if(isRecord) {
                aRecord.addNote(loadKeyboard.getNoteA1());
            }
        }
        catch (NullPointerException e){
            showMessageDialog(null, "The note is not loaded");
        }
    }
    @FXML
    private void BtnA2SharpPressed(ActionEvent event) throws NullPointerException{
        try{
            loadKeyboard.getNoteASharp1().play();
            if(isRecord) {
                aRecord.addNote(loadKeyboard.getNoteASharp1());
            }
        }
        catch (NullPointerException e){
            showMessageDialog(null, "The note is not loaded");
        }
    }
    @FXML
    private void BtnB2Pressed(ActionEvent event) throws NullPointerException{
        try{
            loadKeyboard.getNoteB1().play();
            if(isRecord) {
                aRecord.addNote(loadKeyboard.getNoteB1());
            }
        }
        catch (NullPointerException e){
            showMessageDialog(null, "The note is not loaded");
        }
    }

    @FXML
    private void loadGuitar(ActionEvent event){
        loadKeyboard = new LoadGuitarKeyboard((int) volume);
    }
    @FXML
    private void loadViolin(ActionEvent event){
        loadKeyboard = new LoadViolinKeyboard((int) volume);
    }
    @FXML
    private void loadPiano(ActionEvent event){
        loadKeyboard = new LoadPianoKeyboard((int) volume);
    }
    @FXML
    private void loadTrombone(ActionEvent event){
        loadKeyboard = new LoadTromboneKeyboard((int) volume);
    }
    @FXML
    private void showAboutUs(ActionEvent event) throws IOException{
        try{
            Stage newStage = new Stage();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/screen/fxml/aboutUs.fxml"));
            newStage.setScene(new Scene(loader.load()));
            newStage.show();
        }
        catch (IOException e){
            showMessageDialog(null, "The about us screen is not loaded");
        }
    }
    @FXML
    private void showInstruction(ActionEvent event) throws IOException {
        try{
            Stage newStage = new Stage();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/screen/fxml/instruction.fxml"));
            newStage.setScene(new Scene(loader.load()));
            newStage.show();
        }
        catch (IOException e) {
            showMessageDialog(null, "The instruction screen is not loaded");
        }
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