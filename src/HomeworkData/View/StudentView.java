package HomeworkData.View;
import HomeworkData.Controller.StudentController;


public class StudentView {
    StudentController controllerStudent = new StudentController();

    public StudentView() {
        this.controllerStudent = controllerStudent;
    }

    public void saveStudent(String name, String group, int age, String studentId) {
        controllerStudent.addStudent(name, group, age, studentId);
    }

    public void getStudent(String name) {
        controllerStudent.getStudent(name);
    }


}


