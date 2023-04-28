package javaassignment.model;

/**
 *
 * @author yukichew
 */
public class Admin extends User {
    private int adminID;

    public Admin(int adminID, String password) {
        super(password);
        this.adminID = adminID;
    }
    
    public int getAdminID() {
        return adminID;
    }

    public void setAdminID(int adminID) {
        this.adminID = adminID;
    }
}
