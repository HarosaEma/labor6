package Model;

import Model.Person;
import UIController.CourseController;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Student extends Person {
    public long studentID;
    private int totalCredits;
    private List<Course> enrolledCourse;
    public Student(long ID, String Name, String Surname){
        super();
        this.studentID=ID;

        totalCredits=0;
    }

    public long getStudentID() {
        return studentID;
    }

    public void setStudentID(long studentID) {
        this.studentID = studentID;
    }

    public int getTotalCredits() {
        return totalCredits;
    }

    public void setTotalCredits(int totalCredits) {
        this.totalCredits = totalCredits;
    }

    public List<Course> getEnrolledCourse() {
        return enrolledCourse;
    }

    public void setEnrolledCourse(List<Course> enrolledCourse) {
        this.enrolledCourse = enrolledCourse;
    }

    public boolean registerToCourse(Course course) {
        CourseController controller = new CourseController();
        List<Course> allcourses = new ArrayList<>();
        allcourses = controller.getAllCourses();
        for (Course c : allcourses
        ) {
            if (c == course) {
                course.register(this);
                return true;
            }
        }
        throw new NoSuchElementException("Course not found");
    }
}
