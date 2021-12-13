package UIController;

import Model.Student;
import Repository.StudentRepository;

import java.util.List;

public class StudentController {

    public List<Student> allStudents(){return null;
    //todo get all students from db or json files
        }

    public Student logIn(String FirstName,String LastName){
        for (Student student :this.allStudents()
            ) {
            if(student.getFirstName().equals(FirstName) && student.getLastName().equals(LastName))
            {
                return student;
            }
        }
        throw  new IndexOutOfBoundsException();
    }

}
