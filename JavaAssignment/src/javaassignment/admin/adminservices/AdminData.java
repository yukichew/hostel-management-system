package javaassignment.admin.adminservices;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import javaassignment.model.Admin;

/**
 *
 * @author NG WAN YUNG
 */
public class AdminData {
    
     public static ArrayList<Admin> admin = new ArrayList<Admin>();
     
     public static void readAdminDetails() {
        String line;
        try {
            BufferedReader br = new BufferedReader(new FileReader("admin.txt"));
            while ((line = br.readLine()) != null) {
                String[] adminDetails = line.split(";");
                String adminID = adminDetails[0].toUpperCase();
                String adminPassword = adminDetails[1];
                
                admin.add(new Admin(adminID, adminPassword));
            }
        } catch (Exception e) {
            System.out.println("Error in reading...");
            e.printStackTrace();
        }
    }
     
    
    public static Admin checkAdminCredentials(String adminID, String adminPassword) {
    Admin found = null;
    for (int i = 0; i < admin.size(); i++) {
        Admin a = admin.get(i);
        if (adminID.equals(a.getAdminID()) && adminPassword.equals(a.getAdminPassword())) {
            found = a;
            break;
        }
    }
    return found;
}
}
