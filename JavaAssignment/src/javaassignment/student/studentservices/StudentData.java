package javaassignment.student.studentservices;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import javaassignment.model.Student;

/**
 *
 * @author yukichew
 */
public class StudentData {

    public static ArrayList<Student> students = new ArrayList<Student>();

    public static void read() {
        String line;
        try {
            BufferedReader br = new BufferedReader(new FileReader("student.txt"));
            while ((line = br.readLine()) != null) {
                String[] studentLine = line.split(";");
                String studentID = studentLine[0];
                String studentName = studentLine[1];
                String studentNIC = studentLine[2];
                String studentPassword = studentLine[3];
                String studentGender = studentLine[4];
                String studentContact = studentLine[5];
                String studentAddress = studentLine[6];
                double studentBalance = Double.parseDouble(studentLine[7]);

                students.add(new Student(studentID, studentName, studentNIC,
                        studentPassword, studentGender, studentContact, studentAddress, studentBalance));
            }
        } catch (Exception e) {
            System.out.println("Error in read ...");
            e.printStackTrace();
        }
    }

    public static void write() {
        try {
            BufferedWriter writer = new BufferedWriter(new PrintWriter("student.txt"));
            for (int i = 0; i < students.size(); i++) {
                Student s = students.get(i);
                writer.write(s.getStudentID() + ";" + s.getStudentName() + ";" + s.getStudentNIC()
                        + ";" + s.getStudentPassword() + ";" + s.getStudentGender() + ";"
                        + s.getStudentContact() + ";" + s.getStudentAddress() + ";" + s.getStudentBalance());
                writer.newLine();
            }
            writer.close();
        } catch (Exception e) {
            System.out.println("Error in write ...");
        }
    }

    public static Student checkStudentID(String studentID) {
        Student found = null;
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            if (studentID.equals(s.getStudentID())) {
                found = s;
                break;
            }
        }
        return found;
    }

}
