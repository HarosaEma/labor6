package UI;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class GUI extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {

        FXMLLoader loader = new FXMLLoader(
                getClass().getClassLoader().getResource("./resources/window.fxml")
        );
        Parent root = loader.load();
        primaryStage.setTitle("Main Menu");
        primaryStage.setScene(new Scene(root, 400, 200));
        primaryStage.show();
    }
}