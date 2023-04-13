package javaassignment.student;

import javaassignment.HostelManagementSystem;

/**
 *
 * @author yukichew
 */
public class StudentDashboard extends javax.swing.JFrame {   

    public StudentDashboard() {
        initComponents();
        showStudentDetails();
    }
    
    private void showStudentDetails(){
        lbluser.setText(HostelManagementSystem.studentlogin.getStudentID());
        lblstudentID.setText(HostelManagementSystem.studentlogin.getStudentID());
        lblstudentName.setText(HostelManagementSystem.studentlogin.getStudentName());
        lblstudentNIC.setText(HostelManagementSystem.studentlogin.getStudentNIC());
        lblstudentGender.setText(HostelManagementSystem.studentlogin.getStudentGender());
        lblstudentContact.setText(HostelManagementSystem.studentlogin.getStudentContact());
        lblstudentAddress.setText(HostelManagementSystem.studentlogin.getStudentAddress());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        studentdashboard = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lbluser = new javax.swing.JLabel();
        hostelApplicationButton = new javax.swing.JButton();
        myApplicationsButton = new javax.swing.JButton();
        editProfileButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblstudentID = new javax.swing.JLabel();
        lblstudentName = new javax.swing.JLabel();
        lblstudentNIC = new javax.swing.JLabel();
        lblstudentGender = new javax.swing.JLabel();
        lblstudentContact = new javax.swing.JLabel();
        lblstudentAddress = new javax.swing.JLabel();
        transactionButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Sama Gurmukhi", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("APU Hostel");

        lbluser.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        lbluser.setForeground(new java.awt.Color(204, 204, 204));
        lbluser.setText("user");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbluser)
                .addGap(21, 21, 21))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbluser))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        hostelApplicationButton.setBackground(new java.awt.Color(255, 255, 255));
        hostelApplicationButton.setForeground(new java.awt.Color(153, 153, 153));
        hostelApplicationButton.setText("Hostel Application");
        hostelApplicationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hostelApplicationButtonActionPerformed(evt);
            }
        });

        myApplicationsButton.setBackground(new java.awt.Color(255, 255, 255));
        myApplicationsButton.setForeground(new java.awt.Color(153, 153, 153));
        myApplicationsButton.setText("My Application");
        myApplicationsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myApplicationsButtonActionPerformed(evt);
            }
        });

        editProfileButton.setBackground(new java.awt.Color(255, 255, 255));
        editProfileButton.setForeground(new java.awt.Color(153, 153, 153));
        editProfileButton.setText("Edit Profile");
        editProfileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editProfileButtonActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Personal Information");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Student ID: ");

        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Student Name: ");

        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Student NIC: ");

        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Student Contact:");

        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("Student Gender: ");

        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("Student Address: ");

        lblstudentID.setText("jLabel10");

        lblstudentName.setText("jLabel11");

        lblstudentNIC.setText("jLabel11");

        lblstudentGender.setText("jLabel13");

        lblstudentContact.setText("jLabel14");

        lblstudentAddress.setText("jLabel15");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 138, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblstudentID, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                    .addComponent(lblstudentName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblstudentNIC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblstudentGender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblstudentContact, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblstudentAddress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(258, 258, 258))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lblstudentID))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lblstudentName))
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lblstudentNIC))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(lblstudentGender))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(lblstudentContact))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(lblstudentAddress))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        transactionButton.setBackground(new java.awt.Color(255, 255, 255));
        transactionButton.setForeground(new java.awt.Color(153, 153, 153));
        transactionButton.setText("Transactions");
        transactionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transactionButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout studentdashboardLayout = new javax.swing.GroupLayout(studentdashboard);
        studentdashboard.setLayout(studentdashboardLayout);
        studentdashboardLayout.setHorizontalGroup(
            studentdashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(studentdashboardLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(studentdashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, studentdashboardLayout.createSequentialGroup()
                        .addGroup(studentdashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(studentdashboardLayout.createSequentialGroup()
                                .addComponent(hostelApplicationButton, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(editProfileButton, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(myApplicationsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(transactionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        studentdashboardLayout.setVerticalGroup(
            studentdashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(studentdashboardLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(studentdashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hostelApplicationButton, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(myApplicationsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editProfileButton, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(transactionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(studentdashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(studentdashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(779, 582));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void myApplicationsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myApplicationsButtonActionPerformed
       StudentApplicationHistory studentApplicationHistory = new StudentApplicationHistory();
       studentApplicationHistory.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_myApplicationsButtonActionPerformed

    private void hostelApplicationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hostelApplicationButtonActionPerformed
        HostelBooking hostelBooking = new HostelBooking();
        hostelBooking.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_hostelApplicationButtonActionPerformed

    private void transactionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transactionButtonActionPerformed
        StudentTransaction studentTransaction = new StudentTransaction();
        studentTransaction.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_transactionButtonActionPerformed

    private void editProfileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editProfileButtonActionPerformed
        StudentEditProfile studentEditProfile = new StudentEditProfile();
        studentEditProfile.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_editProfileButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton editProfileButton;
    private javax.swing.JButton hostelApplicationButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblstudentAddress;
    private javax.swing.JLabel lblstudentContact;
    private javax.swing.JLabel lblstudentGender;
    private javax.swing.JLabel lblstudentID;
    private javax.swing.JLabel lblstudentNIC;
    private javax.swing.JLabel lblstudentName;
    private javax.swing.JLabel lbluser;
    private javax.swing.JButton myApplicationsButton;
    private javax.swing.JPanel studentdashboard;
    private javax.swing.JButton transactionButton;
    // End of variables declaration//GEN-END:variables
}
