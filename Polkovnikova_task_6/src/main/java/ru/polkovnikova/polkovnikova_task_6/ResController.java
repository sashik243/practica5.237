package ru.polkovnikova.polkovnikova_task_6;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ResController {

    @FXML
    private Label aL;

    @FXML
    private ImageView asdf;

    @FXML
    void qaew(ActionEvent event) {
        Image image=new Image(getClass().getResourceAsStream("/Screenshot_1.png"));
        asdf.setImage(image);
        int n = 15;
        double[] a = new double[n];
        a[0] = 1;
        a[1] = 1;

        for (int i = 2; i < n; i++) {
            a[i] = a[i - 2] + a[i - 1] / Math.pow(2, i - 1);
        }

        double b = 1;
        for (int i = 0; i < n; i++) {
            b *= a[i];
        }


        aL.setText(String.format("a0*a1...*a14=%.2f",b));

    }

}
