package preislerdev.texteditor;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        int width = 1280;
        int height = 720;

        TextField textField = new TextField();
        textField.setLayoutX(width/ 2 - 100);
        textField.setLayoutY(height / 2 - 25);
        textField.setPrefWidth(200);
        textField.setPrefHeight(50);

        Image icon = new Image("icon.png");
        Group group = new Group(textField);
        Scene scene = new Scene(group, width, height);



        stage.setScene(scene);
        stage.centerOnScreen();
        stage.setResizable(false);
        stage.setTitle("Hello!");
        stage.getIcons().add(icon);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}