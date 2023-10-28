package Homework5.Data.Model;

import Data.Model.Student;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

public class StudentGroup {
    String teacher;
    List<Student> students;

    public StudentGroup(String teacher, List<Student> students) {
        this.teacher = teacher;
        this.students = students;
    }



    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "StudentGroup{" +
                "teacher='" + teacher + '\'' +
                ", students=" + students +
                '}';



    }
    public void getInfoStudentGroup(String teacher, List<Student> students){
        System.out.println("StudentGroup:"+teacher+students);
    }

}

