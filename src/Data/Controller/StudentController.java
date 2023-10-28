package Data.Controller;

import Data.Model.Student;

import java.util.ArrayList;
import java.util.List;

/*Создаем класс StudentController – реализующий логику, путем написания и вызова
                соответствующих методов :
        1. Создание Студента
        2. Возвращение всех студентов в сервисе
        3. Вызов view и передача списка найденных студентов*/
public class StudentController {

    private List<Student> student;

    public StudentController() {
        this.student = new ArrayList<>();
    }

    public void addStudent(String name, String surname, int birthday, String studentId, String studentGroup) {
        student.add(new Student(name, surname, birthday, studentId, studentGroup));
    }
    public Student getStudent(String name){
        for (int i=0; i<student.size(); i++){
            if (student.get(i).getName().equals(name)){
                System.out.println("Student is found");
                System.out.println(student.get(i));
            }else {
                System.out.println("No student");
            }
        }


        return null;
    }

    public List<Student> getStudent() {
        return student;
    }

    public void setStudent(List<Student> student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "StudentController{" +
                "student=" + student +
                '}';
    }
}


