package HomeworkData;

import HomeworkData.View.StudentView;


public class Main {
    public static void main(String[] args) {
        StudentView stView = new StudentView();
        stView.saveStudent("Misha","25",22,"22b");

        stView.getStudent("Misha");
        stView.getStudent("Ivan");
        stView.getStudent("Ivan");
    }
}