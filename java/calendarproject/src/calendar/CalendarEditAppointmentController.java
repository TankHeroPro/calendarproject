package calendar;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class CalendarEditAppointmentController {

    @FXML
    private TextArea editTextArea;

    @FXML
    private Button closeButton;

    @FXML
    private ListView<Appointment> myListView;
    private ObservableList<Appointment> listViewData = FXCollections.observableArrayList();
    private	Stage prevStage;
    private Main main;

    private Appointment appointment;

    public void setPrevStage(Stage stage){
        this.prevStage = stage;
    }

    public CalendarEditAppointmentController() throws IOException{
        listViewData.add(new Appointment("Essen am Samstag"));
        listViewData.add(new Appointment("Hausaufgaben"));
    }

    public void setAppointment(Appointment appointment) {
        this.appointment = appointment;
        editTextArea.setText(appointment.getText());
    }
    @FXML
    private void initialize() {

    }

    public void setMain(Main main){
        this.main = main;
    }


}

