package Data;

import Data.View.StudentView;

public class Main {
    public static void main(String[] args) {
        StudentView studentView = new StudentView();
        studentView.saveStudent("Elena","Klodkovska",  24, "123", "12d" );
        studentView.getStudent("Elena");
        studentView.getStudent("Max");



    }
}
