package javaassignment.student;

import javaassignment.HostelManagementSystem;
import javaassignment.student.studentservices.StudentData;
import javax.swing.JOptionPane;

/**
 *
 * @author yukichew
 */
public class StudentTransaction extends javax.swing.JFrame {

    public StudentTransaction() {
        initComponents();
        setstudentBalanceField();
        lbluser.setText(HostelManagementSystem.studentlogin.getStudentID());
    }

    private void setstudentBalanceField() {
        double studentbalance = HostelManagementSystem.studentlogin.getStudentBalance();
        String studentBalance = String.valueOf(studentbalance);
        studentBalanceField.setEditable(false);
        studentBalanceField.setText(studentBalance);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        studentTransactionPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lblHostel = new javax.swing.JLabel();
        lbluser = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        studentBalanceField = new javax.swing.JTextField();
        topUpButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        studentTransactionPanel.setBackground(new java.awt.Color(255, 255, 255));

        lblHostel.setFont(new java.awt.Font("Sama Gurmukhi", 1, 18)); // NOI18N
        lblHostel.setForeground(new java.awt.Color(51, 51, 51));
        lblHostel.setText("APU Hostel");

        lbluser.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        lbluser.setForeground(new java.awt.Color(102, 102, 102));
        lbluser.setText("user");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblHostel, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbluser)
                .addGap(23, 23, 23))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHostel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbluser))
                .addContainerGap())
        );

        jLabel1.setText("Your balance in APCard :");

        topUpButton.setBackground(new java.awt.Color(204, 204, 255));
        topUpButton.setForeground(new java.awt.Color(102, 102, 102));
        topUpButton.setText("Top Up");
        topUpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                topUpButtonActionPerformed(evt);
            }
        });

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout studentTransactionPanelLayout = new javax.swing.GroupLayout(studentTransactionPanel);
        studentTransactionPanel.setLayout(studentTransactionPanelLayout);
        studentTransactionPanelLayout.setHorizontalGroup(
            studentTransactionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, studentTransactionPanelLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(studentTransactionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(studentTransactionPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 131, Short.MAX_VALUE)
                        .addComponent(studentBalanceField, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(backButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(topUpButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(19, 19, 19))
        );
        studentTransactionPanelLayout.setVerticalGroup(
            studentTransactionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(studentTransactionPanelLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(studentTransactionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(studentBalanceField, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(topUpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(studentTransactionPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(studentTransactionPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(527, 371));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        StudentDashboard studentDashboard = new StudentDashboard();
        studentDashboard.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backButtonActionPerformed

    private void topUpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_topUpButtonActionPerformed
        try {
            String topUpAmount = JOptionPane.showInputDialog(studentTransactionPanel,
                    "Insert amount that you want to top up into your APCard.");
            Double amount = Double.parseDouble(topUpAmount);
            if (amount <= 0) {
                throw new Exception();
//                JOptionPane.showMessageDialog(studentTransactionPanel, "Please enter a valid amount.");
            } else {
                HostelManagementSystem.studentlogin.setStudentBalance(amount);
                JOptionPane.showMessageDialog(studentTransactionPanel, "You have successfully top tup RM"
                        + amount + " into your APCard.");
                StudentData.write();
                setstudentBalanceField();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(studentTransactionPanel, "Transaction Failed due to invalid amount.");
        }

    }//GEN-LAST:event_topUpButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblHostel;
    private javax.swing.JLabel lbluser;
    private javax.swing.JTextField studentBalanceField;
    private javax.swing.JPanel studentTransactionPanel;
    private javax.swing.JButton topUpButton;
    // End of variables declaration//GEN-END:variables
}
