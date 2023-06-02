package javaassignment;

import javaassignment.model.Student;
import javaassignment.student.StudentLogin;
import javaassignment.student.StudentRegister;
import javaassignment.admin.AdminLogin;
import javaassignment.model.Admin;
import javaassignment.model.Room;

public class HostelManagementSystem {
    
    public static MainPage mainPage = new MainPage();
    public static StudentRegister registerf = new StudentRegister();
    public static StudentLogin loginf = new StudentLogin();
    public static AdminLogin alogin = new AdminLogin();
    
    public static Student studentlogin;
    public static Admin adminlogin;
    public static Room roomInfo;

    public static void main(String[] args) {
        mainPage.setVisible(true);
    }
}
    

