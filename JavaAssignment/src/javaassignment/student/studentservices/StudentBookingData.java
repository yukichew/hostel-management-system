package javaassignment.student.studentservices;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import javaassignment.model.Room;
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

                studentsBooking.add(new StudentBooking(bookingID, totalPrice, bookingDate, studentID, roomID, contractPeriod));
            }

            System.out.println(studentsBooking.size());
        } catch (Exception e) {
            System.out.println("Error in read ...");
            e.printStackTrace();
        }
    }

    public static void write() {
        try {
            BufferedWriter writer = new BufferedWriter(new PrintWriter("studentBooking.txt"));
            for (int i = 0; i < studentsBooking.size(); i++) {
                StudentBooking sb = studentsBooking.get(i);
                writer.write(sb.getBookingID() + ";" + sb.getTotalPrice() + ";"
                        + sb.getBookingDate() + ";" + sb.getStudentID() + ";" + sb.getRoomID() + ";" + sb.getContractPeriod());
                writer.newLine();
            }
            writer.close();
        } catch (Exception e) {
            System.out.println("Error in write ...");
        }
    }

    public static StudentBooking checkStudentBooking(String studentID) {
        StudentBooking found = null;
        for (int i = 0; i < studentsBooking.size(); i++) {
            StudentBooking s = studentsBooking.get(i);
            if (studentID.equals(s.getStudentID())) {
                found = s;
                break;
            }
        }
        return found;
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
