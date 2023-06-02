package javaassignment.student.studentservices;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import javaassignment.model.BookingStatus;
import javaassignment.model.StudentBooking;

/**
 *
 * @author yukichew
 */
public class StudentBookingData {

    public static ArrayList<StudentBooking> studentsBooking = new ArrayList<StudentBooking>();

    public static void read() {
        String line;
        try {
            BufferedReader br = new BufferedReader(new FileReader("studentBooking.txt"));
            while ((line = br.readLine()) != null) {
                String[] bookingLine = line.split(";");
                String bookingId = bookingLine[0];
                int bookingID = Integer.parseInt(bookingId);
                String totalprice = bookingLine[1];
                double totalPrice = Double.parseDouble(totalprice);
                String bookingDate = bookingLine[2];
                String studentID = bookingLine[3];
                int roomID = Integer.parseInt(bookingLine[4]);
                int contractPeriod = Integer.parseInt(bookingLine[5]);
                BookingStatus bookingStatus = BookingStatus.valueOf(bookingLine[6]);

                studentsBooking.add(new StudentBooking(bookingID, totalPrice, bookingDate, studentID, roomID, contractPeriod, bookingStatus));
            }

        } catch (Exception e) {
            System.out.println("Error in read ...");
            e.printStackTrace();
        }
    }

    public static void write() {
        try {
            Collections.sort(studentsBooking, Comparator.comparingInt(StudentBooking::getBookingID));
            BufferedWriter writer = new BufferedWriter(new PrintWriter("studentBooking.txt"));
            for (int i = 0; i < studentsBooking.size(); i++) {
                StudentBooking sb = studentsBooking.get(i);
                writer.write(sb.getBookingID() + ";" + sb.getTotalPrice() + ";"
                        + sb.getBookingDate() + ";" + sb.getStudentID() + ";" + sb.getRoomID() + ";" + sb.getContractPeriod() + ";" + sb.getBookingStatus());
                writer.newLine();
            }
            writer.close();
        } catch (Exception e) {
            System.out.println("Error in write ...");
        }
    }

    public static void autoUpdateBookingStatus() {
        for (StudentBooking studentBooking : studentsBooking) {
            studentBooking.checkBookingStatus();
        }
    }

    public static StudentBooking checkStudentBooking(String studentID) {
        StudentBooking found = null;
        LocalDate currentDate = LocalDate.now();
        for (int i = 0; i < studentsBooking.size(); i++) {
            StudentBooking s = studentsBooking.get(i);
            LocalDate contractEndDate = s.getContractEndDate();
            if (studentID.equals(s.getStudentID())) {
                if (currentDate.isBefore(contractEndDate) && s.getBookingStatus() == BookingStatus.ACTIVE) {
                    found = s;
                    break;
                }
            }
        }
        return found;
    }

//    return a lists that consists of all bookings that contains all records of the particular student
    public static ArrayList<StudentBooking> checkStudentBookings(String studentID) {
        ArrayList<StudentBooking> studentBookings = new ArrayList<StudentBooking>();
        for (int i = 0; i < studentsBooking.size(); i++) {
            StudentBooking s = studentsBooking.get(i);
            if (studentID.equals(s.getStudentID())) {
                studentBookings.add(s);
            }
        }
        return studentBookings;
    }

    public static int getLastOrderID() {
        int bookingID = 0;
        for (int i = 0; i < studentsBooking.size(); i++) {
            StudentBooking sb = studentsBooking.get(i);
            bookingID = sb.getBookingID();
        }
        return bookingID;
    }

}
