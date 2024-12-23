module ru.polkovnikova.polkovmikova_task_2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.polkovnikova.polkovmikova_task_2 to javafx.fxml;
    exports ru.polkovnikova.polkovmikova_task_2;
}