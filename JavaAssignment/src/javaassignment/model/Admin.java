package javaassignment.model;

/**
 *
 * @author yukichew
 */
public class Admin extends User {
    
    private String adminID;
    private String adminPassword;

    public Admin(String adminID, String adminPassword) {
        super(adminID, adminPassword);
        this.adminID = adminID; 
        this.adminPassword = adminPassword;
        
    }
    
    public String getAdminID() {
        return adminID;
    }

    public void setAdminID(String adminID) {
        this.adminID = adminID;
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }
}
