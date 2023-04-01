package javaassignment;

import javaassignment.model.Student;
import javaassignment.student.StudentLogin;
import javaassignment.student.StudentRegister;

public class HostelManagementSystem {
    
    public static MainPage mainPage = new MainPage();
    public static StudentRegister registerf = new StudentRegister();
    public static StudentLogin loginf = new StudentLogin();
    
    
    public static Student studentlogin;

    public static void main(String[] args) {
        mainPage.setVisible(true);
    }
    
}
