package javaassignment.student;

import static javaassignment.HostelManagementSystem.mainPage;
import javaassignment.model.Student;
import javaassignment.student.studentservices.StudentData;
import javax.swing.JOptionPane;

/**
 *
 * @author yukichew
 */
public class StudentRegister extends javax.swing.JFrame {

    private double studentBalance = 0;

    public StudentRegister() {
        initComponents();
    }

    private String getGen() {
        String gender = male.isSelected() ? male.getText() : female.getText();
        return gender;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gender = new javax.swing.ButtonGroup();
        Register = new javax.swing.JPanel();
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
        registerButton = new javax.swing.JButton();
        loginLink = new javax.swing.JLabel("<html><u>Login</u></html>");
        jPanel1 = new javax.swing.JPanel();
        lblRegister = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        showPassword = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student Register");
        setBounds(new java.awt.Rectangle(550, 300, 0, 0));

        Register.setBackground(new java.awt.Color(255, 255, 255));

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

        registerButton.setText("Register");
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });

        loginLink.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginLink.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginLinkMouseClicked(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        lblRegister.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        lblRegister.setForeground(new java.awt.Color(102, 102, 102));
        lblRegister.setText("STUDENT REGISTER");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(lblRegister)
                .addContainerGap(348, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(lblRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        showPassword.setText("Show Password");
        showPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPasswordActionPerformed(evt);
            }
        });

        jLabel1.setText("Already have an account? ");

        javax.swing.GroupLayout RegisterLayout = new javax.swing.GroupLayout(Register);
        Register.setLayout(RegisterLayout);
        RegisterLayout.setHorizontalGroup(
            RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegisterLayout.createSequentialGroup()
                .addGroup(RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RegisterLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblstudentID, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblstudentName, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblstudentNIC, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblstudentPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblstudentGender, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblstudentContact, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblstudentAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(showPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfstudentID)
                                    .addComponent(tfstudentName, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                                    .addComponent(tfstudentNIC)
                                    .addComponent(tfstudentPassword))
                                .addComponent(tfstudentContact, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tfstudentAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(RegisterLayout.createSequentialGroup()
                                .addComponent(female)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(male))))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(RegisterLayout.createSequentialGroup()
                .addGroup(RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RegisterLayout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(registerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(RegisterLayout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(jLabel1)
                        .addGap(63, 63, 63)
                        .addComponent(loginLink)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        RegisterLayout.setVerticalGroup(
            RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegisterLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblstudentID, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfstudentID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblstudentName, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfstudentName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblstudentNIC, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfstudentNIC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfstudentPassword)
                    .addComponent(lblstudentPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(showPassword)
                .addGroup(RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RegisterLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(lblstudentGender, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(RegisterLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(female)
                            .addComponent(male))))
                .addGap(18, 18, 18)
                .addGroup(RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblstudentContact, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfstudentContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblstudentAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfstudentAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 34, Short.MAX_VALUE)
                .addGroup(RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginLink)
                    .addComponent(jLabel1))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Register, javax.swing.GroupLayout.PREFERRED_SIZE, 524, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Register, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(522, 606));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void showPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showPasswordActionPerformed
        if (showPassword.isSelected()) {
            tfstudentPassword.setEchoChar((char) 0);

        } else {
            Object echoCharObj = javax.swing.UIManager.get("PasswordField.echoChar");
            if (echoCharObj != null) {
                tfstudentPassword.setEchoChar((char) echoCharObj);
            } else {
                tfstudentPassword.setEchoChar('*');
            }
        }
    }//GEN-LAST:event_showPasswordActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        mainPage.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backButtonActionPerformed

    private void loginLinkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginLinkMouseClicked
        StudentLogin loginf = new StudentLogin();
        loginf.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_loginLinkMouseClicked

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        try {
            String studentID = tfstudentID.getText().toUpperCase();
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
                    JOptionPane.showMessageDialog(Register, "Invalid contact number. Please enter a valid phone number with 10 or 11 digits. "
                            + "Please ensure that the number is in the format of 0XXXXXXXXX or 0XXXXXXXX.");

                } else {

                    Boolean checkContact = true;
                    for (int a = 0; a < studentContact.length(); a++) {
                        if (a == 0 && studentContact.charAt(a) == '-') {
                            continue;
                        }

                        if (!Character.isDigit(studentContact.charAt(a))) {
                            checkContact = false;
                            JOptionPane.showMessageDialog(Register, "Invalid contact number. Please enter a valid phone number with 10 or 11 digits. "
                                    + "Please ensure that the number is in the format of 0XXXXXXXXX or 0XXXXXXXX.");
                            break;
                        }
                    }

                    if (checkContact) {

                        if (studentNIC.length() != 12) {
                            JOptionPane.showMessageDialog(Register, "Please enter your NIC correctly.");

                        } else {
                            Boolean checkNIC = true;
                            for (int a = 0; a < studentNIC.length(); a++) {
                                if (a == 0 && studentNIC.charAt(a) == '-') {
                                    continue;
                                }

                                if (!Character.isDigit(studentNIC.charAt(a))) {
                                    checkContact = false;
                                    JOptionPane.showMessageDialog(Register, "Please enter a valid NIC.");
                                    break;
                                }
                            }

                            if (checkNIC) {
                                Student found = StudentData.checkStudentID(studentID);

                                if (found == null) {
                                    StudentData.students.add(new Student(studentID, studentName,
                                            studentNIC, studentPassword, studentGender, studentContact, studentAddress, studentBalance));
                                    StudentData.write();

                                    JOptionPane.showMessageDialog(Register,
                                            "Congratulations! You are now a member of APU Hostel Management System.");

                                    StudentLogin loginf = new StudentLogin();
                                    loginf.setVisible(true);
                                    this.setVisible(false);

                                    tfstudentName.setText("");
                                    tfstudentID.setText("");
                                    tfstudentContact.setText("");
                                    tfstudentNIC.setText("");
                                    tfstudentPassword.setText("");
                                    tfstudentAddress.setText("");
                                    gender.clearSelection();
                                    this.setVisible(false);

                                } else {
                                    JOptionPane.showMessageDialog(Register,
                                            "You already have an account.");
                                }

                            }
                        }
                    }
                }
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(Register,
                    "Please ensure that you have entered all your details correctly.");

        }
    }//GEN-LAST:event_registerButtonActionPerformed

    private void femaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_femaleActionPerformed

    private void tfstudentIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfstudentIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfstudentIDActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Register;
    private javax.swing.JButton backButton;
    private javax.swing.JRadioButton female;
    private javax.swing.ButtonGroup gender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblRegister;
    private javax.swing.JLabel lblstudentAddress;
    private javax.swing.JLabel lblstudentContact;
    private javax.swing.JLabel lblstudentGender;
    private javax.swing.JLabel lblstudentID;
    private javax.swing.JLabel lblstudentNIC;
    private javax.swing.JLabel lblstudentName;
    private javax.swing.JLabel lblstudentPassword;
    private javax.swing.JLabel loginLink;
    private javax.swing.JRadioButton male;
    private javax.swing.JButton registerButton;
    private javax.swing.JCheckBox showPassword;
    private javax.swing.JTextField tfstudentAddress;
    private javax.swing.JTextField tfstudentContact;
    private javax.swing.JTextField tfstudentID;
    private javax.swing.JTextField tfstudentNIC;
    private javax.swing.JTextField tfstudentName;
    private javax.swing.JPasswordField tfstudentPassword;
    // End of variables declaration//GEN-END:variables
}
