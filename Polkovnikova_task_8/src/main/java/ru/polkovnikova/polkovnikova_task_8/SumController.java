package ru.polkovnikova.polkovnikova_task_8;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.util.ArrayList;
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
    private TextField nubt;

    @FXML
    void OkButtonOnAction(ActionEvent event) {
        List<Integer> data = dataListView.getItems();
        if (data.size() != 2) {
            answerlbl.setText("Некорректные данные");

            return;
        }
        try {
            int a = data.get(0);
            int b = data.get(1);
            int count = 0;
            for (int i = a; i <= b; i++) {
                if (i % 2 == 0) {
                    count++;
                }
            }
            answerlbl.setText(String.valueOf(count));
        } catch (NumberFormatException e) {

            answerlbl.setText("Некорректные данные");
        }
    }




    @FXML
    void addButtonOnAction(ActionEvent event) {
        if (nubt.getText().isEmpty() ||nubT.getText().isEmpty()) {
// Если хотя бы одно из полей пустое, выходим из метода
            return;
        }
        try {
            int a = Integer.parseInt(nubt.getText(). toString());
            int b = Integer.parseInt (nubT.getText() .toString());
            List< Integer> list = new ArrayList<>();
            list.add(a);
            list.add (b);
            dataListView.getItems() .addAll(list);
        } catch (NumberFormatException ex) {

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("выведены некорректные данные");
            alert.showAndWait();
        } finally {

            nubt.setText("");
            nubT.setText("");
        }

    }


    @FXML
    void cancelButtonOnAction(ActionEvent event) {
        Platform.exit();
    }

}
