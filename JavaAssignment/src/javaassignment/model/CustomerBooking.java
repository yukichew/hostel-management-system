package javaassignment.model;

/**
 *
 * @author yukichew
 */

public class CustomerBooking {
    private int bookingID;
    private double totalPrice;
    private String bookingDate;
    private String studentID;

    public CustomerBooking(int bookingID, double totalPrice, String bookingDate, String studentID) {
        this.bookingID = bookingID;
        this.totalPrice = totalPrice;
        this.bookingDate = bookingDate;
        this.studentID = studentID;
    }

    public int getBookingID() {
        return bookingID;
    }

    public void setBookingID(int bookingID) {
        this.bookingID = bookingID;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(String bookingDate) {
        this.bookingDate = bookingDate;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }
}