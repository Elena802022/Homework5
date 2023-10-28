package Data.Model;

public class Teacher extends User{
    public Teacher(String name, String surname, int birthday) {
        super(name, surname, birthday);
    }
    String disciplesTaught;

    public String getDisciplesTaught() {
        return disciplesTaught;
    }

    public void setDisciplesTaught(String disciplesTaught) {
        this.disciplesTaught = disciplesTaught;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "disciplesTaught='" + disciplesTaught + '\'' +
                '}';
    }
}
