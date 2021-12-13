package Model;

import Model.Person;
import Model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Course {
    private String name;
    private Person teacher;
    private int maxEnrollment;
    private List<Student> studentsEnrolled;
    private int credits;
    private long courseID;

    public Course(long ID, String name,int credits,Person teacher,int maxEnrollment){
        this.courseID=ID;
        this.name=name;
        this.credits=credits;
        this.teacher=teacher;
        this.maxEnrollment=maxEnrollment;
        this.studentsEnrolled=new ArrayList<Student>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person getTeacher() {
        return teacher;
    }

    public void setTeacher(Person teacher) {
        this.teacher = teacher;
    }

    public int getMaxEnrollment() {
        return maxEnrollment;
    }

    public void setMaxEnrollment(int maxEnrollment) {
        this.maxEnrollment = maxEnrollment;
    }

    public List<Student> getStudentsEnrolled() {
        return studentsEnrolled;
    }

    public void setStudentsEnrolled(List<Student> studentsEnrolled) {
        this.studentsEnrolled = studentsEnrolled;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public long getCourseID() {
        return courseID;
    }

    public void setCourseID(long courseID) {
        this.courseID = courseID;
    }

    public boolean register(Student student){
        if(this.maxEnrollment >this.studentsEnrolled.size()){
           this.studentsEnrolled.add(student);
           this.maxEnrollment++;
           return true;
        }
        else{
            throw new NoSuchElementException("Element not found");
        }

    }
}
