package Homework5.Data.View;

import Homework5.Data.Controller.StudentGroupController;
import Homework5.Data.Model.StudentGroup;

import java.util.List;

public class StudentGroupServiceView {
    private List<StudentGroup> studentGroups;
    StudentGroupController controllerStudentGroup  = new StudentGroupController(studentGroups);
    private String teacher;
    private String students;

    public StudentGroupServiceView(StudentGroupController controllerStudentGroup) {
        this.controllerStudentGroup = controllerStudentGroup;
    }

    public StudentGroupServiceView() {

    }
    public void saveStudentGroup(String teacher, String students){
        this.teacher = teacher;
        this.students = students;
        controllerStudentGroup.addStudentGroup(teacher,students);
    }
    public void getStudentGroup(String teacher){
        controllerStudentGroup.getStudentGroup(teacher);
    }

    @Override
    public String toString() {
        return "StudentGroupServiceView{" +
                "studentGroups=" + studentGroups +
                ", controllerStudentGroup=" + controllerStudentGroup +
                ", teacher='" + teacher + '\'' +
                ", students='" + students + '\'' +
                '}';
    }
}
