package ru.polkovnikova.polkovnikova_task_1;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.util.List;

public class SumController {

    @FXML
    private Button OkButton;

    @FXML
    private Button addButton;

    @FXML
    private Label answerlbl;

    @FXML
    private Button cancelButton;

    @FXML
    private ListView<Integer> dataListView;

    @FXML
    private TextField nubT;

    @FXML
    void OkButtonOnAction(ActionEvent event) {
        List<Integer> data = dataListView.getItems();
        int sum = 0;
        for(Integer n:data){
            if (n%7==0&&n%10==2){
                sum = sum +n;
            }
        }
        answerlbl.setText(String.valueOf(sum));

    }

    @FXML
    void addButtonOnAction(ActionEvent event) {
        if (nubT.getText().isEmpty()) {
        return;
    }
        try {
        int x = Integer.parseInt (nubT.getText().toString());
        dataListView.getItems().add(x);
    } catch (NumberFormatException ex) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Введены некорректные данные");
            alert.showAndWait();
        }
            finally {
        nubT.setText("");
    }}

    @FXML
    void cancelButtonOnAction(ActionEvent event) {
            Platform.exit();
    }

}
