package javaassignment.model;

/**
 *
 * @author yukichew
 */
public class Student extends User {

    private String studentID;
    private String studentName;
    private String studentNIC;
    private String studentGender;
    private String studentContact;
    private String studentAddress;
    private double studentBalance;

    public Student(String studentID, String studentName, String studentNIC, 
            String studentPassword, String studentGender, String studentContact, 
            String studentAddress, double studentBalance) {
        super(studentPassword);
        this.studentID = studentID;
        this.studentName = studentName;
        this.studentNIC = studentNIC;
        this.studentGender = studentGender;
        this.studentContact = studentContact;
        this.studentAddress = studentAddress;
        this.studentBalance = studentBalance;
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
