package javaassignment.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author yukichew
 */
public class StudentBooking {

    private int bookingID;
    private double totalPrice;
    private String bookingDate;
    private String studentID;
    private int roomID;
    private int contractPeriod;
    private BookingStatus bookingStatus;

    public StudentBooking(int bookingID, double totalPrice, String bookingDate, String studentID, int roomID, int contractPeriod, BookingStatus bookingStatus) {
        this.bookingID = bookingID;
        this.totalPrice = totalPrice;
        this.bookingDate = bookingDate;
        this.studentID = studentID;
        this.roomID = roomID;
        this.contractPeriod = contractPeriod;
        this.bookingStatus = bookingStatus;
    }

    public int getBookingID() {
        return bookingID;
    }

    public void setBookingID(int bookingID) {
        this.bookingID = bookingID;
    }

    public int getRoomID() {
        return roomID;
    }

    public void setRoomID(int roomID) {
        this.roomID = roomID;
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

    public int getContractPeriod() {
        return contractPeriod;
    }

    public void setContractPeriod(int contractPeriod) {
        this.contractPeriod = contractPeriod;
    }

    public BookingStatus getBookingStatus() {
        return bookingStatus;
    }

    public void setBookingStatus(BookingStatus bookingStatus) {
        this.bookingStatus = bookingStatus;
    }

    public LocalDate getContractEndDate() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate startDate = LocalDate.parse(bookingDate, formatter);
        LocalDate endDate = startDate.plusMonths(contractPeriod);
        return endDate;
    }

    public void setCompletedStatus(LocalDate endDate) {
        LocalDate currentDate = LocalDate.now();
        if (endDate.isAfter(currentDate)) {
            setBookingStatus(BookingStatus.COMPLETED);
        }
    }
}
