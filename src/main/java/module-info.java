module preislerdev.texteditor {
    requires javafx.controls;
    requires javafx.fxml;


    opens preislerdev.texteditor to javafx.fxml;
    exports preislerdev.texteditor;
}