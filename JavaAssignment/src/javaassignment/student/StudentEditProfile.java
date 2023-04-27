package javaassignment.student;

import javaassignment.HostelManagementSystem;
import javaassignment.model.Student;
import javaassignment.student.studentservices.StudentData;
import javax.swing.JOptionPane;

/**
 *
 * @author yukichew
 */
public class StudentEditProfile extends javax.swing.JFrame {

    public StudentEditProfile() {
        initComponents();
        getStudentDetails();
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

    private void getStudentDetails() {
        tfstudentID.setText(HostelManagementSystem.studentlogin.getStudentID());
        tfstudentID.setEditable(false);
        tfstudentName.setText(HostelManagementSystem.studentlogin.getStudentName());
        tfstudentNIC.setText(HostelManagementSystem.studentlogin.getStudentNIC());
        tfstudentPassword.setText(HostelManagementSystem.studentlogin.getStudentPassword());
        tfstudentContact.setText(HostelManagementSystem.studentlogin.getStudentContact());
        tfstudentAddress.setText(HostelManagementSystem.studentlogin.getStudentAddress());
        showGender();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gender = new javax.swing.ButtonGroup();
        editProfilePanel = new javax.swing.JPanel();
        lblstudentID = new javax.swing.JLabel();
        tfstudentID = new javax.swing.JTextField();
        lblstudentName = new javax.swing.JLabel();
        tfstudentName = new javax.swing.JTextField();
        lblstudentNIC = new javax.swing.JLabel();
        tfstudentNIC = new javax.swing.JTextField();
        lblstudentPassword = new javax.swing.JLabel();
        lblstudentGender = new javax.swing.JLabel();
        lblstudentContact = new javax.swing.JLabel();
        tfstudentContact = new javax.swing.JTextField();
        lblstudentAddress = new javax.swing.JLabel();
        tfstudentPassword = new javax.swing.JPasswordField();
        tfstudentAddress = new javax.swing.JTextField();
        female = new javax.swing.JRadioButton();
        male = new javax.swing.JRadioButton();
        editButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student Edit Profile");
        setBounds(new java.awt.Rectangle(550, 300, 0, 0));

        lblstudentID.setText("Student ID:");

        tfstudentID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfstudentIDActionPerformed(evt);
            }
        });

        lblstudentName.setText("Name: ");

        lblstudentNIC.setText("NIC: ");

        lblstudentPassword.setText("Password: ");

        lblstudentGender.setText("Gender: ");

        lblstudentContact.setText("Contact: ");

        lblstudentAddress.setText("Address: ");

        gender.add(female);
        female.setText("Female");
        female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleActionPerformed(evt);
            }
        });

        gender.add(male);
        male.setText("Male");

        editButton.setText("Edit");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Edit Profile");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(19, 19, 19))
        );

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout editProfilePanelLayout = new javax.swing.GroupLayout(editProfilePanel);
        editProfilePanel.setLayout(editProfilePanelLayout);
        editProfilePanelLayout.setHorizontalGroup(
            editProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(editProfilePanelLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(editProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(editProfilePanelLayout.createSequentialGroup()
                        .addGroup(editProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblstudentContact, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblstudentAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(93, 93, 93)
                        .addGroup(editProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tfstudentContact, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfstudentAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 53, Short.MAX_VALUE))
                    .addGroup(editProfilePanelLayout.createSequentialGroup()
                        .addGroup(editProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblstudentName, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblstudentID, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblstudentNIC, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblstudentPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblstudentGender, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(editProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(editProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tfstudentID)
                                .addComponent(tfstudentName, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                                .addComponent(tfstudentNIC)
                                .addComponent(tfstudentPassword))
                            .addGroup(editProfilePanelLayout.createSequentialGroup()
                                .addComponent(female)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(male)))
                        .addGap(53, 53, 53))))
        );
        editProfilePanelLayout.setVerticalGroup(
            editProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editProfilePanelLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(editProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblstudentID, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfstudentID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(editProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblstudentName, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfstudentName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(editProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblstudentNIC, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfstudentNIC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(editProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfstudentPassword)
                    .addComponent(lblstudentPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(editProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblstudentGender, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(female)
                    .addComponent(male))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(editProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblstudentContact, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfstudentContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(editProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfstudentAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblstudentAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(editProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(editProfilePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(editProfilePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 515, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(618, 543));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tfstudentIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfstudentIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfstudentIDActionPerformed

    private void femaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_femaleActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
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
                if (studentContact.length() < 10 || studentContact.length() > 11 || studentContact.charAt(0) != '0') {
                    JOptionPane.showMessageDialog(editProfilePanel, "Please enter a valid contact.");

                } else {

                    Boolean checkContact = true;
                    for (int a = 0; a < studentContact.length(); a++) {
                        if (a == 0 && studentContact.charAt(a) == '-') {
                            continue;
                        }

                        if (!Character.isDigit(studentContact.charAt(a))) {
                            checkContact = false;
                            JOptionPane.showMessageDialog(editProfilePanel, "Please enter a valid contact.");
                            break;
                        }
                    }

                    if (checkContact) {

                        if (studentNIC.length() != 12) {
                            JOptionPane.showMessageDialog(editProfilePanel, "Please enter your NIC correctly.");

                        } else {
                            Boolean checkNIC = true;
                            for (int a = 0; a < studentNIC.length(); a++) {
                                if (a == 0 && studentNIC.charAt(a) == '-') {
                                    continue;
                                }

                                if (!Character.isDigit(studentNIC.charAt(a))) {
                                    checkContact = false;
                                    JOptionPane.showMessageDialog(editProfilePanel, "Please enter a valid NIC.");
                                    break;
                                }
                            }

                            if (checkNIC) {
                                Student found = StudentData.checkStudentID(studentID);
                                if (found != null) {

                                    HostelManagementSystem.studentlogin.setStudentName(studentName);
                                    HostelManagementSystem.studentlogin.setStudentNIC(studentNIC);
                                    HostelManagementSystem.studentlogin.setStudentPassword(studentPassword);
                                    HostelManagementSystem.studentlogin.setStudentGender(studentGender);
                                    HostelManagementSystem.studentlogin.setStudentContact(studentContact);
                                    HostelManagementSystem.studentlogin.setStudentAddress(studentAddress);

                                    StudentData.write();

                                    JOptionPane.showMessageDialog(editProfilePanel,
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
                }
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(editProfilePanel,
                    "Please ensure that you have entered all your details correctly.");

        }
    }//GEN-LAST:event_editButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        StudentDashboard studentDashboard = new StudentDashboard();
        studentDashboard.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton editButton;
    private javax.swing.JPanel editProfilePanel;
    private javax.swing.JRadioButton female;
    private javax.swing.ButtonGroup gender;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblstudentAddress;
    private javax.swing.JLabel lblstudentContact;
    private javax.swing.JLabel lblstudentGender;
    private javax.swing.JLabel lblstudentID;
    private javax.swing.JLabel lblstudentNIC;
    private javax.swing.JLabel lblstudentName;
    private javax.swing.JLabel lblstudentPassword;
    private javax.swing.JRadioButton male;
    private javax.swing.JTextField tfstudentAddress;
    private javax.swing.JTextField tfstudentContact;
    private javax.swing.JTextField tfstudentID;
    private javax.swing.JTextField tfstudentNIC;
    private javax.swing.JTextField tfstudentName;
    private javax.swing.JPasswordField tfstudentPassword;
    // End of variables declaration//GEN-END:variables
}
