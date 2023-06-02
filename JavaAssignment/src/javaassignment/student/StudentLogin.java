package javaassignment.student;

import javaassignment.HostelManagementSystem;
import static javaassignment.HostelManagementSystem.mainPage;
import javaassignment.model.Student;
import javaassignment.student.studentservices.StudentData;
import javax.swing.JOptionPane;

/**
 *
 * @author yukichew
 */
public class StudentLogin extends javax.swing.JFrame {

    public StudentLogin() {
        initComponents();
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        login = new javax.swing.JPanel();
        lblstudentID = new javax.swing.JLabel();
        tfstudentID = new javax.swing.JTextField();
        lblstudentPassword = new javax.swing.JLabel();
        tfstudentPassword = new javax.swing.JPasswordField();
        showPassword = new javax.swing.JCheckBox();
        loginButton = new javax.swing.JButton();
        lblRegister = new javax.swing.JLabel();
        registerLink = new javax.swing.JLabel("<html><u>Register</u></html>");
        backButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblLogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student Login");
        setBounds(new java.awt.Rectangle(500, 300, 0, 0));

        login.setBackground(new java.awt.Color(255, 255, 255));

        lblstudentID.setText("Student ID:");

        tfstudentID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfstudentIDActionPerformed(evt);
            }
        });

        lblstudentPassword.setText("Password: ");

        showPassword.setText("Show Password");
        showPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPasswordActionPerformed(evt);
            }
        });

        loginButton.setText("Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        lblRegister.setText("Don't have an account?");

        registerLink.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registerLink.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registerLinkMouseClicked(evt);
            }
        });

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        lblLogin.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        lblLogin.setForeground(new java.awt.Color(102, 102, 102));
        lblLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogin.setText("STUDENT LOGIN");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(115, 115, 115)
                    .addComponent(lblLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(124, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(28, 28, 28)
                    .addComponent(lblLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(28, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout loginLayout = new javax.swing.GroupLayout(login);
        login.setLayout(loginLayout);
        loginLayout.setHorizontalGroup(
            loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblRegister)
                .addGap(53, 53, 53)
                .addComponent(registerLink)
                .addGap(155, 155, 155))
            .addGroup(loginLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginLayout.createSequentialGroup()
                        .addComponent(lblstudentID, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfstudentID, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(loginLayout.createSequentialGroup()
                        .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblstudentPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(loginLayout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(showPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfstudentPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(loginLayout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(81, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        loginLayout.setVerticalGroup(
            loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblstudentID, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfstudentID, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblstudentPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfstudentPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(showPassword)
                .addGap(32, 32, 32)
                .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registerLink)
                    .addComponent(lblRegister))
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(558, 473));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tfstudentIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfstudentIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfstudentIDActionPerformed

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

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        try {
            String studentId = tfstudentID.getText().toUpperCase();
            String studentPassword = tfstudentPassword.getText();

            Student found = StudentData.checkStudentID(studentId);

            if (studentId.isEmpty() || studentPassword.isEmpty()) {
                throw new Exception();

            } else {
                if (found != null && studentPassword.equals(found.getPassword())) {
                    HostelManagementSystem.studentlogin = found;
                    JOptionPane.showMessageDialog(login,
                            "Congratulations! You have now successfully login to APU Hostel Management System!"
                                    + "\nPlease top up your APCard before you book a room.");
                    
                    StudentDashboard studentDashboard = new StudentDashboard();
                    studentDashboard.setVisible(true);
                    tfstudentID.setText("");
                    tfstudentPassword.setText("");
                    this.setVisible(false);

                } else {
                    throw new Exception();
                }
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(login,
                    "Please ensure that you have entered your student ID and password correctly.");

        }
    }//GEN-LAST:event_loginButtonActionPerformed

    private void registerLinkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerLinkMouseClicked
        this.setVisible(false);
        StudentRegister registerf = new StudentRegister();
        registerf.setVisible(true);
    }//GEN-LAST:event_registerLinkMouseClicked

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        this.setVisible(false);
        mainPage.setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblRegister;
    private javax.swing.JLabel lblstudentID;
    private javax.swing.JLabel lblstudentPassword;
    private javax.swing.JPanel login;
    private javax.swing.JButton loginButton;
    private javax.swing.JLabel registerLink;
    private javax.swing.JCheckBox showPassword;
    private javax.swing.JTextField tfstudentID;
    private javax.swing.JPasswordField tfstudentPassword;
    // End of variables declaration//GEN-END:variables
}
