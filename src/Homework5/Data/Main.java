package Homework5.Data;

import Homework5.Data.View.StudentGroupServiceView;

public class Main {
    public static void main(String[] args) {
        StudentGroupServiceView studentGroupServiceView = new StudentGroupServiceView();
        studentGroupServiceView.saveStudentGroup("Elena", "English");
        studentGroupServiceView.getStudentGroup("Margo");
        studentGroupServiceView.saveStudentGroup("Margo", "Franch");


    }

}
