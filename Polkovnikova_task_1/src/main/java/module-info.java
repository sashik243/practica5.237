module ru.polkovnikova.polkovnikova_task_1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens ru.polkovnikova.polkovnikova_task_1 to javafx.fxml;
    exports ru.polkovnikova.polkovnikova_task_1;
}