package Homework5.Data.Controller;

import Data.Model.Student;
import Homework5.Data.Model.StudentGroup;

import java.util.List;

public class StudentGroupController {
    private List<StudentGroup> studentGroups;

    public StudentGroupController(List<StudentGroup> studentGroups) {
        this.studentGroups = studentGroups;
    }

    public void addStudentGroup(String teacher, List<Student> students) {
        studentGroups.add(new StudentGroup(teacher,students));

    }

    public void getStudentGroup(String teacher) {
        for (int i=0; i<studentGroups.size(); i++){
            if (studentGroups.get(i).getTeacher().equals(teacher)){
                System.out.println("Group is found");
                System.out.println(studentGroups.get(i));
            }else {
                System.out.println("Such group is not found");
            }
        }

    }

    public List<StudentGroup> getStudentGroups() {
        return studentGroups;
    }

    public void setStudentGroups(List<StudentGroup> studentGroups) {
        this.studentGroups = studentGroups;
    }

    @Override
    public String toString() {
        return "StudentGroupController{" +
                "studentGroups=" + studentGroups +
                '}';
    }
}
