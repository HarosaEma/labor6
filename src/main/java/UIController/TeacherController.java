package UIController;

import Model.Teacher;

import java.util.List;
import java.util.NoSuchElementException;

public class TeacherController {
public List<Teacher> getAllTeachers(){
    return null;
    //todo json or db
}
public Teacher LogIn(String FirstName,String LastName){
    for (Teacher t: this.getAllTeachers()
    ){
        if(t.getFirstName().equals(FirstName) && t.getLastName().equals(LastName)){
            return t;
        }
    }
    throw new NoSuchElementException("Teacher not found");
}
}
