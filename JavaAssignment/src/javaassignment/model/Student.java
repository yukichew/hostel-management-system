package javaassignment.model;

/**
 *
 * @author yukichew
 */
public class Student {

    private String studentID;
    private String studentName;
    private String studentNIC;
    private String studentPassword;
    private String studentGender;
    private String studentContact;
    private String studentAddress;
    private double studentBalance;

    public Student(String studentID, String studentName, String studentNIC,
            String studentPassword, String studentGender, String studentContact,
            String studentAddress) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.studentNIC = studentNIC;
        this.studentPassword = studentPassword;
        this.studentGender = studentGender;
        this.studentContact = studentContact;
        this.studentAddress = studentAddress;
        studentBalance = 0;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentNIC() {
        return studentNIC;
    }

    public void setStudentNIC(String studentNIC) {
        this.studentNIC = studentNIC;
    }

    public String getStudentPassword() {
        return studentPassword;
    }

    public void setStudentPassword(String studentPassword) {
        this.studentPassword = studentPassword;
    }

    public String getStudentGender() {
        return studentGender;
    }

    public void setStudentGender(String studentGender) {
        this.studentGender = studentGender;
    }

    public String getStudentContact() {
        return studentContact;
    }

    public void setStudentContact(String studentContact) {
        this.studentContact = studentContact;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    public double getStudentBalance() {
        return studentBalance;
    }

    public void setStudentBalance(double studentBalance) {
        this.studentBalance = studentBalance;
    }

}
