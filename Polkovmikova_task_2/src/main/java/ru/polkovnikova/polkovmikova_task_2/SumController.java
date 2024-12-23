package ru.polkovnikova.polkovmikova_task_2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private Button ButtonColculation;

    @FXML
    private Label lblResult;

    @FXML
    private TextField txtN;

    @FXML
    void ButtonColculationOnAction(ActionEvent event) {
        int n = Integer.parseInt(txtN.getText().toString());
        if (n<0){
            lblResult.setText("N должно быть больше 0");
            return;
        }
       double sum = 0;
        for (double i = 1; i <= n; i++){
            double slog = 1.0 +i/10.0;
            sum = sum +(i% 2 ==0? -slog:+ slog);
        }
        lblResult.setText(String.valueOf(sum));
    }

}
