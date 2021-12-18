package UI;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class StudentLogInUI extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(
                getClass().getClassLoader().getResource("resources/StudentLogIn.fxml"));
        Parent root = fxmlLoader.load();
        primaryStage.setTitle("Log in as Student");
        primaryStage.setScene(new Scene(root,400,200));
        primaryStage.show();
    }
}
