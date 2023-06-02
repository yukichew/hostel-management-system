package javaassignment.student.studentservices;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import javaassignment.model.StudentPayment;

public class PaymentData {

    public static ArrayList<StudentPayment> studentPayments = new ArrayList<StudentPayment>();

    public static void read() {
        String line;
        try {
            BufferedReader br = new BufferedReader(new FileReader("studentTransactionHistory.txt"));
            while ((line = br.readLine()) != null) {
                String[] studentLine = line.split(";");
                int paymentID = Integer.parseInt(studentLine[0]);
                String studentID = studentLine[1].toUpperCase();
                double paymentAmount = Double.parseDouble(studentLine[2]);
                String transactionDetail = studentLine[3];
                String transactionDate = studentLine[4];

                studentPayments.add(new StudentPayment(paymentID, studentID, paymentAmount,
                        transactionDetail, transactionDate));
            }
            
        } catch (Exception e) {
            System.out.println("Error in read ...");
            e.printStackTrace();
        }
    }

    public static void write() {
        try {
            Collections.sort(studentPayments, Comparator.comparingInt(StudentPayment::getPaymentID));
            BufferedWriter writer = new BufferedWriter(new PrintWriter("studentTransactionHistory.txt"));
            for (int i = 0; i < studentPayments.size(); i++) {
                StudentPayment s = studentPayments.get(i);
                writer.write(s.getPaymentID() + ";" + s.getStudentID().toUpperCase() + ";" + s.getPaymentAmount() + ";"
                        + s.getTransactionDetail() + ";" + s.getTransactionDate());
                writer.newLine();
            }
            writer.close();
        } catch (Exception e) {
            System.out.println("Error in write ...");
        }
    }

    public static ArrayList<StudentPayment> checkStudentPayments(String studentID) {
        ArrayList<StudentPayment> studentPayment = new ArrayList<StudentPayment>();
        for (int i = 0; i < studentPayments.size(); i++) {
            StudentPayment s = studentPayments.get(i);
            if (studentID.equals(s.getStudentID())) {
                studentPayment.add(s);
            }
        }
        return studentPayment;
    }

    public static int getLastPaymentID() {
        int paymentID = 0;
        for (int i = 0; i < studentPayments.size(); i++) {
            StudentPayment sp = studentPayments.get(i);
            paymentID = sp.getPaymentID();
        }
        return paymentID;
    }
}
