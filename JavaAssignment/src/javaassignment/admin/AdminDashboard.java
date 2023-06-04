package javaassignment.admin;

import static javaassignment.HostelManagementSystem.mainPage;
import javaassignment.HostelManagementSystem;
import javax.swing.JOptionPane;
/**
 *
 * @author NG WAN YUNG
 */
public class AdminDashboard extends javax.swing.JFrame {

    public AdminDashboard() {
        initComponents();
        showAdminDetails();
    }

    private void showAdminDetails() {
        lblAdmin.setText(HostelManagementSystem.adminlogin.getAdminID());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        studentdashboard = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblAdmin = new javax.swing.JLabel();
        logoutLink = new javax.swing.JLabel();
        manageButton = new javax.swing.JButton();
        readButton = new javax.swing.JButton();
        studentApplication = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Sama Gurmukhi", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Admin Dashboard");

        lblAdmin.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        lblAdmin.setForeground(new java.awt.Color(204, 204, 204));
        lblAdmin.setText("user");

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
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblAdmin)
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
                    .addComponent(lblAdmin)
                    .addComponent(logoutLink))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        manageButton.setForeground(new java.awt.Color(153, 153, 153));
        manageButton.setText("Manage Room");
        manageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageButtonActionPerformed(evt);
            }
        });

        readButton.setForeground(new java.awt.Color(153, 153, 153));
        readButton.setText("View Student Records");
        readButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                readButtonActionPerformed(evt);
            }
        });

        studentApplication.setForeground(new java.awt.Color(153, 153, 153));
        studentApplication.setText("Student Applications");
        studentApplication.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentApplicationActionPerformed(evt);
            }
        });

        deleteButton.setForeground(new java.awt.Color(153, 153, 153));
        deleteButton.setText("View Reports");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout studentdashboardLayout = new javax.swing.GroupLayout(studentdashboard);
        studentdashboard.setLayout(studentdashboardLayout);
        studentdashboardLayout.setHorizontalGroup(
            studentdashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, studentdashboardLayout.createSequentialGroup()
                .addContainerGap(79, Short.MAX_VALUE)
                .addGroup(studentdashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(studentdashboardLayout.createSequentialGroup()
                        .addComponent(manageButton, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(studentApplication, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(readButton, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(80, 80, 80))
        );
        studentdashboardLayout.setVerticalGroup(
            studentdashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(studentdashboardLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addGroup(studentdashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(studentApplication, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(manageButton, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(readButton, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66)
                .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(92, Short.MAX_VALUE))
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

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void logoutLinkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutLinkMouseClicked
        int result = JOptionPane.showConfirmDialog(this, "Are you sure you want to logout?", "Confirm",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
        if (result == JOptionPane.YES_OPTION) {
            mainPage.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_logoutLinkMouseClicked

    private void manageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageButtonActionPerformed
        ManageRoom manageRoom = new ManageRoom();
        manageRoom.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_manageButtonActionPerformed

    private void readButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_readButtonActionPerformed
        StudentRecord sr = new StudentRecord();
        sr.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_readButtonActionPerformed

    private void studentApplicationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentApplicationActionPerformed
        ManageApplication ma = new ManageApplication();
        ma.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_studentApplicationActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        ViewReportUI vr = new ViewReportUI();
        vr.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_deleteButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblAdmin;
    private javax.swing.JLabel logoutLink;
    private javax.swing.JButton manageButton;
    private javax.swing.JButton readButton;
    private javax.swing.JButton studentApplication;
    private javax.swing.JPanel studentdashboard;
    // End of variables declaration//GEN-END:variables
}
