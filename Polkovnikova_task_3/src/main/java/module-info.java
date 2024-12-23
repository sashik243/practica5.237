module ru.polkovnikova.polkovnikova_task_3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.polkovnikova.polkovnikova_task_3 to javafx.fxml;
    exports ru.polkovnikova.polkovnikova_task_3;
}