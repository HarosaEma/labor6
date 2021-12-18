package UI;

import Repository.StudentRepo;
import Model.Student;
import javafx.fxml.FXML;

import java.awt.*;
import java.awt.font.TextLayout;

import javafx.scene.control.TextField;
import javafx.stage.Stage;
import sun.font.TextLabel;
import sun.font.TextSourceLabel;

public class StudentLogInController {

    @FXML
    public void LogInAsStudent() throws Exception {
        TextField firstNameLabel = new TextField("firstName");
        String FirstName=firstNameLabel.getText();
        TextField LastNameLabel = new TextField("lastName");
        String LastName = firstNameLabel.getText();
        StudentRepo repo = new StudentRepo();
        Student student = repo.findStudent(FirstName,LastName);
        StudentInterfaceController controller = new StudentInterfaceController(student);
        StudentInterface studentInterface = new StudentInterface();
        Stage stage = new Stage();
        stage.setTitle("Student Interface");
        studentInterface.start(stage);
    }
}