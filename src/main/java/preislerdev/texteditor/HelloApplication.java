package preislerdev.texteditor;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Group group = new Group();
        Scene scene = new Scene(group, 320, 240);
        Image icon = new Image("icon.png");
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.centerOnScreen();

        stage.getIcons().add(icon);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}