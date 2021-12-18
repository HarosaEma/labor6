package UI;

import Model.Student;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class StudentInterface extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader fxmlLoader =new FXMLLoader(
                getClass().getResource("resources/StudentInterface.fxml")
        );
        Parent root = fxmlLoader.load();
        primaryStage.setTitle("Student Interface");
        primaryStage.setScene(new Scene(root,400,200));
        primaryStage.show();
    }
}