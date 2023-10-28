package Data.Model;

public class Student extends User{

    public Student(String name, String surname, int birthday) {
        super(name, surname, birthday);
    }
    String studentId;
    String studentGroup;

    public Student(String name, String surname, int birthday, String studentId, String studentGroup) {
        super(name, surname, birthday);
        this.studentId = studentId;
        this.studentGroup = studentGroup;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentGroup() {
        return studentGroup;
    }

    public void setStudentGroup(String studentGroup) {
        this.studentGroup = studentGroup;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthday=" + birthday +
                '}';
    }


    public void getInfoStudent(String name, String surname, int birthday, String studentId, String studentGroup){
        System.out.println("Student:" + name+surname+birthday+studentId+studentGroup);

    }
}
