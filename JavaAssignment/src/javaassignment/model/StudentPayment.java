package javaassignment.model;

public class StudentPayment {
    
    private int paymentID;
    private String studentID;
    private double paymentAmount;
    private String transactionDetail;
    private String transactionDate;

    public StudentPayment(int paymentID, String studentID, double paymentAmount, String transactionDetail, String transactionDate) {
        this.paymentID = paymentID;
        this.studentID = studentID;
        this.paymentAmount = paymentAmount;
        this.transactionDetail = transactionDetail;
        this.transactionDate = transactionDate;
    }

    public int getPaymentID() {
        return paymentID;
    }

    public void setPaymentID(int paymentID) {
        this.paymentID = paymentID;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public double getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(double paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public String getTransactionDetail() {
        return transactionDetail;
    }

    public void setTransactionDetail(String transactionDetail) {
        this.transactionDetail = transactionDetail;
    }

    public String getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
    }
}
