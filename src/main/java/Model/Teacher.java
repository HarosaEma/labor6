package Model;

import Model.Person;

import java.util.List;
import java.util.NoSuchElementException;

public class Teacher extends Person {
    private List<Course> courses;
    private long teacherID;
    private   String Name;
    private String Surname;
    private Teacher(long ID, String Name, String Surname){
        this.teacherID=ID;
        this.Name=Name;
        this.Surname=Surname;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public long getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(long teacherID) {
        this.teacherID = teacherID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }
    public List<Student> allStudentsInCourse(Course course){
        for (Course c: this.getCourses()
             ) {
            if(c.getCourseID() == course.getCourseID()){
                return c.getStudentsEnrolled();
            }
        }
        throw  new NoSuchElementException("Course not found");
    }
}
