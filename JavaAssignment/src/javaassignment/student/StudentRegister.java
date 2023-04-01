package javaassignment.student;

import static javaassignment.HostelManagementSystem.loginf;
import static javaassignment.HostelManagementSystem.registerf;
import javaassignment.model.Student;
import javaassignment.student.studentservices.StudentData;
import javax.swing.JOptionPane;

/**
 *
 * @author yukichew
 */
public class StudentRegister extends javax.swing.JFrame {

    public StudentRegister() {
        initComponents();
    }

    public String getGen() {
        if (male.isSelected()) {
            return "Male";

        } else if (female.isSelected()) {
            return "Female";

        } else {
            return null;
        }
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
        lblRegister = new javax.swing.JLabel();
        tfstudentPassword = new javax.swing.JPasswordField();
        tfstudentAddress = new javax.swing.JTextField();
        female = new javax.swing.JRadioButton();
        male = new javax.swing.JRadioButton();
        registerButton = new javax.swing.JButton();
        lblLogin = new javax.swing.JLabel();
        loginLink = new javax.swing.JLabel("<html><u>Login</u></html>");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student Register");
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

        lblRegister.setFont(new java.awt.Font("Helvetica Neue", 0, 36)); // NOI18N
        lblRegister.setText("REGISTER");

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

        lblLogin.setText("Already have an account?");

        loginLink.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginLink.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginLinkMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout RegisterLayout = new javax.swing.GroupLayout(Register);
        Register.setLayout(RegisterLayout);
        RegisterLayout.setHorizontalGroup(
            RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegisterLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RegisterLayout.createSequentialGroup()
                        .addGroup(RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblstudentContact, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblstudentAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(65, 65, 65)
                        .addGroup(RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfstudentContact, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfstudentAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 50, Short.MAX_VALUE))
                    .addGroup(RegisterLayout.createSequentialGroup()
                        .addGroup(RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblstudentID, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblstudentName, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblstudentNIC, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblstudentPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblstudentGender, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tfstudentID)
                                .addComponent(tfstudentName, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                                .addComponent(tfstudentNIC)
                                .addComponent(tfstudentPassword))
                            .addGroup(RegisterLayout.createSequentialGroup()
                                .addComponent(female)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(male)))
                        .addGap(53, 53, 53))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegisterLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblRegister)
                .addGap(195, 195, 195))
            .addGroup(RegisterLayout.createSequentialGroup()
                .addGroup(RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RegisterLayout.createSequentialGroup()
                        .addGap(222, 222, 222)
                        .addComponent(registerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(RegisterLayout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(lblLogin)
                        .addGap(31, 31, 31)
                        .addComponent(loginLink)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        RegisterLayout.setVerticalGroup(
            RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegisterLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lblRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
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
                .addGap(18, 18, 18)
                .addGroup(RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblstudentGender, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(female)
                    .addComponent(male))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblstudentContact, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfstudentContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfstudentAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblstudentAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(registerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLogin)
                    .addComponent(loginLink))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(Register, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(Register, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(618, 606));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tfstudentIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfstudentIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfstudentIDActionPerformed

    private void femaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_femaleActionPerformed

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
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
                    JOptionPane.showMessageDialog(Register, "Please enter a valid contact.");

                } else {

                    Boolean checkContact = true;
                    for (int a = 0; a < studentContact.length(); a++) {
                        if (a == 0 && studentContact.charAt(a) == '-') {
                            continue;
                        }

                        if (!Character.isDigit(studentContact.charAt(a))) {
                            checkContact = false;
                            JOptionPane.showMessageDialog(Register, "Please enter a valid contact.");
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
                                            studentNIC, studentPassword, studentGender, studentContact, studentAddress));
                                    StudentData.write();
                                    JOptionPane.showMessageDialog(Register,
                                            "Congratulations! You have now a member of XX System.");
                                    loginf.setVisible(true);
                                    tfstudentName.setText("");
                                    tfstudentID.setText("");
                                    tfstudentContact.setText("");
                                    tfstudentNIC.setText("");
                                    tfstudentPassword.setText("");
                                    tfstudentAddress.setText("");
                                    gender.clearSelection();
                                    registerf.setVisible(false);
                                    
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

    private void loginLinkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginLinkMouseClicked
        registerf.setVisible(false);
        loginf.setVisible(true);
    }//GEN-LAST:event_loginLinkMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Register;
    private javax.swing.JRadioButton female;
    private javax.swing.ButtonGroup gender;
    private javax.swing.JLabel lblLogin;
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
    private javax.swing.JTextField tfstudentAddress;
    private javax.swing.JTextField tfstudentContact;
    private javax.swing.JTextField tfstudentID;
    private javax.swing.JTextField tfstudentNIC;
    private javax.swing.JTextField tfstudentName;
    private javax.swing.JPasswordField tfstudentPassword;
    // End of variables declaration//GEN-END:variables
}
