package javaassignment.model;

public class Student {

    private String studentID;
    private String studentName;
    private String studentNIC;
    private String studentPassword;
    private String studentGender;
    private String studentContact;
    private String studentAddress;

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
    }

    public String getStudentID() {
        return studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getStudentNIC() {
        return studentNIC;
    }

    public String getStudentPassword() {
        return studentPassword;
    }

    public String getStudentGender() {
        return studentGender;
    }

    public String getStudentContact() {
        return studentContact;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setStudentNIC(String studentNIC) {
        this.studentNIC = studentNIC;
    }

    public void setStudentPassword(String studentPassword) {
        this.studentPassword = studentPassword;
    }

    public void setStudentGender(String studentGender) {
        this.studentGender = studentGender;
    }

    public void setStudentContact(String studentContact) {
        this.studentContact = studentContact;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

}
