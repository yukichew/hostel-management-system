package javaassignment.student;

import javaassignment.HostelManagementSystem;
import static javaassignment.HostelManagementSystem.mainPage;
import javaassignment.model.Student;
import javaassignment.student.studentservices.StudentData;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.YES_NO_OPTION;

/**
 *
 * @author yukichew
 */
public class StudentDashboard extends javax.swing.JFrame {

    public StudentDashboard() {
        initComponents();
        showStudentDetails();
    }

    private String getGen() {
        String gender = male.isSelected() ? male.getText() : female.getText();
        return gender;
    }

    private void showGender() {
        if (HostelManagementSystem.studentlogin.getStudentGender() == "Male") {
            male.setSelected(true);

        } else {
            female.setSelected(true);
        }
    }

    private void showStudentDetails() {
        lbluser.setText(HostelManagementSystem.studentlogin.getUsername());
        tfstudentID.setText(HostelManagementSystem.studentlogin.getUsername());
        tfstudentName.setText(HostelManagementSystem.studentlogin.getStudentName());
        tfstudentNIC.setText(HostelManagementSystem.studentlogin.getStudentNIC());
        tfstudentPassword.setText(HostelManagementSystem.studentlogin.getPassword());
        tfstudentContact.setText(HostelManagementSystem.studentlogin.getStudentContact());
        tfstudentAddress.setText(HostelManagementSystem.studentlogin.getStudentAddress());
        showGender();

        tfstudentID.setEditable(false);
        tfstudentName.setEditable(false);
        tfstudentNIC.setEditable(false);
        tfstudentPassword.setEditable(false);
        tfstudentContact.setEditable(false);
        tfstudentAddress.setEditable(false);
        male.setEnabled(false);
        female.setEnabled(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        genderGroup = new javax.swing.ButtonGroup();
        studentdashboard = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lbluser = new javax.swing.JLabel();
        logoutLink = new javax.swing.JLabel();
        hostelApplicationButton = new javax.swing.JButton();
        myApplicationsButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        female = new javax.swing.JRadioButton();
        male = new javax.swing.JRadioButton();
        tfstudentID = new javax.swing.JTextField();
        tfstudentName = new javax.swing.JTextField();
        tfstudentNIC = new javax.swing.JTextField();
        tfstudentPassword = new javax.swing.JPasswordField();
        jLabel10 = new javax.swing.JLabel();
        tfstudentContact = new javax.swing.JTextField();
        tfstudentAddress = new javax.swing.JTextField();
        save = new javax.swing.JButton();
        transactionButton = new javax.swing.JButton();
        editProfileButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Sama Gurmukhi", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("APU Hostel");

        lbluser.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        lbluser.setForeground(new java.awt.Color(204, 204, 204));
        lbluser.setText("user");

        logoutLink.setForeground(new java.awt.Color(255, 204, 204));
        logoutLink.setText("Log Out");
        logoutLink.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutLinkMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbluser)
                .addGap(39, 39, 39)
                .addComponent(logoutLink)
                .addGap(27, 27, 27))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbluser)
                    .addComponent(logoutLink))
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
        jLabel6.setText("Student Password: ");

        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Student Contact:");

        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("Student Gender: ");

        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("Student Address: ");

        genderGroup.add(female);
        female.setSelected(true);
        female.setText("Female");
        female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleActionPerformed(evt);
            }
        });

        genderGroup.add(male);
        male.setText("Male");

        tfstudentID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfstudentIDActionPerformed(evt);
            }
        });

        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("Student NIC: ");

        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel10)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9))
                .addGap(91, 91, 91)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfstudentContact, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tfstudentName)
                                .addComponent(tfstudentNIC, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(female)
                                    .addGap(18, 18, 18)
                                    .addComponent(male))
                                .addComponent(tfstudentID)
                                .addComponent(tfstudentPassword)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(tfstudentAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(tfstudentID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(41, 41, 41))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(tfstudentName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tfstudentNIC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10))))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfstudentPassword)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(female)
                            .addComponent(male))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(tfstudentContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(tfstudentAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        transactionButton.setBackground(new java.awt.Color(255, 255, 255));
        transactionButton.setForeground(new java.awt.Color(153, 153, 153));
        transactionButton.setText("Transactions");
        transactionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transactionButtonActionPerformed(evt);
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

        javax.swing.GroupLayout studentdashboardLayout = new javax.swing.GroupLayout(studentdashboard);
        studentdashboard.setLayout(studentdashboardLayout);
        studentdashboardLayout.setHorizontalGroup(
            studentdashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(studentdashboardLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(studentdashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(studentdashboardLayout.createSequentialGroup()
                        .addGroup(studentdashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(studentdashboardLayout.createSequentialGroup()
                                .addComponent(hostelApplicationButton, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(myApplicationsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(transactionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(editProfileButton, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        studentdashboardLayout.setVerticalGroup(
            studentdashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(studentdashboardLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(studentdashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hostelApplicationButton, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(myApplicationsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(transactionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editProfileButton, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
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

        setSize(new java.awt.Dimension(779, 685));
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

    private void logoutLinkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutLinkMouseClicked
        mainPage.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_logoutLinkMouseClicked

    private void femaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_femaleActionPerformed

    private void tfstudentIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfstudentIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfstudentIDActionPerformed

    private void editProfileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editProfileButtonActionPerformed
        tfstudentName.setEditable(true);
        tfstudentNIC.setEditable(true);
        tfstudentPassword.setEditable(true);
        tfstudentContact.setEditable(true);
        tfstudentAddress.setEditable(true);
        male.setEnabled(true);
        female.setEnabled(true);
    }//GEN-LAST:event_editProfileButtonActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        int option = JOptionPane.showConfirmDialog(studentdashboard, "Confirm edit your profile?",
                "Booking Confirmation", YES_NO_OPTION);

        if (option == JOptionPane.YES_OPTION) {
            try {
                String studentID = tfstudentID.getText();
                String studentName = tfstudentName.getText();
                String studentNIC = tfstudentNIC.getText();
                String studentPassword = tfstudentPassword.getText();
                String studentGender = getGen();
                String studentContact = tfstudentContact.getText();
                String studentAddress = tfstudentAddress.getText();

                if (studentID.isEmpty() || studentName.isEmpty() || studentPassword.isEmpty() || studentGender.isEmpty() || studentAddress.isEmpty()) {
                    throw new Exception();

                } else {
                    if (studentContact.length() < 10 || studentContact.length() > 11 || studentContact.charAt(0) != '0' || !studentContact.matches("\\d+")) {
                        JOptionPane.showMessageDialog(studentdashboard, "Please enter a valid contact.");

                    } else {

                        if (studentNIC.length() != 12 || !studentNIC.matches("\\d+")) {
                            JOptionPane.showMessageDialog(studentdashboard, "Please enter your NIC correctly.");

                        } else {
                            Student found = StudentData.checkStudentID(studentID);
                            
                            if (found != null) {
                                HostelManagementSystem.studentlogin.setStudentName(studentName);
                                HostelManagementSystem.studentlogin.setStudentNIC(studentNIC);
                                HostelManagementSystem.studentlogin.setPassword(studentPassword);
                                HostelManagementSystem.studentlogin.setStudentGender(studentGender);
                                HostelManagementSystem.studentlogin.setStudentContact(studentContact);
                                HostelManagementSystem.studentlogin.setStudentAddress(studentAddress);

                                StudentData.write();

                                JOptionPane.showMessageDialog(studentdashboard,
                                        "You have successfully edit your profile.");

                                StudentDashboard studentDashboard = new StudentDashboard();
                                studentDashboard.setVisible(true);
                                this.setVisible(false);

                            } else {
                                throw new Exception();

                            }

                        }
                    }
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(studentdashboard,
                        "Please ensure that you have entered all your details correctly.");

            }
        }
    }//GEN-LAST:event_saveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton editProfileButton;
    private javax.swing.JRadioButton female;
    private javax.swing.ButtonGroup genderGroup;
    private javax.swing.JButton hostelApplicationButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lbluser;
    private javax.swing.JLabel logoutLink;
    private javax.swing.JRadioButton male;
    private javax.swing.JButton myApplicationsButton;
    private javax.swing.JButton save;
    private javax.swing.JPanel studentdashboard;
    private javax.swing.JTextField tfstudentAddress;
    private javax.swing.JTextField tfstudentContact;
    private javax.swing.JTextField tfstudentID;
    private javax.swing.JTextField tfstudentNIC;
    private javax.swing.JTextField tfstudentName;
    private javax.swing.JPasswordField tfstudentPassword;
    private javax.swing.JButton transactionButton;
    // End of variables declaration//GEN-END:variables
}
