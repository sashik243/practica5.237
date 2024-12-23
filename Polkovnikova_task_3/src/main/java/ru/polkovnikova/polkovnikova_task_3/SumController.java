package ru.polkovnikova.polkovnikova_task_3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private Button ColculationButton;

    @FXML
    private Label lblresult;

    @FXML
    private TextField txtA;

    @FXML
    private TextField txtN;

    @FXML
    void ColculationButtonOnAction(ActionEvent event) {
        int n = Integer .parseInt(txtN.getText().toString());
        double a = Double.parseDouble(txtA.getText().toString());
        if (n <= 0){
            lblresult. setText("N должен быть больше 0");
            return; // Выход из метода
        }
            StringBuilder result = new StringBuilder();
            double currentPower = a;
            for (double i = 1; i <= n; i++) {
                result.append(String.format("%.2f", currentPower)).append("\n");
                currentPower *= a;
            }

            lblresult. setText(result.toString());
    }

}
