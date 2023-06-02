package javaassignment.student;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javaassignment.HostelManagementSystem;
import javaassignment.model.StudentPayment;
import javaassignment.student.studentservices.PaymentData;
import javaassignment.student.studentservices.StudentData;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author yukichew
 */
public class StudentTransaction extends javax.swing.JFrame {

    DefaultTableModel model;

    public StudentTransaction() {
        initComponents();
        setstudentBalanceField();
        lbluser.setText(HostelManagementSystem.studentlogin.getUsername());
        getTransactionHistory();
        transactionHistoryTable.setEnabled(false);
    }

    void setstudentBalanceField() {
        double studentbalance = HostelManagementSystem.studentlogin.getStudentBalance();
        String studentBalance = String.valueOf(studentbalance);
        studentBalanceField.setEditable(false);
        studentBalanceField.setText(studentBalance);
    }
    
    private void tableFilter(String query) {
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<DefaultTableModel>(model);
        transactionHistoryTable.setRowSorter(sorter);
        sorter.setRowFilter(RowFilter.regexFilter("(?i)" + query));
    }

    private void getTransactionHistory() {
        String[] columnNames = {"Transaction Type", "Amount", "Date"};
        Object[][] data = new Object[PaymentData.checkStudentPayments(HostelManagementSystem.studentlogin.getUsername()).size()][3];

        for (int i = 0; i < PaymentData.checkStudentPayments(HostelManagementSystem.studentlogin.getUsername()).size(); i++) {
            StudentPayment sb = PaymentData.checkStudentPayments(HostelManagementSystem.studentlogin.getUsername()).get(i);
            data[i][0] = sb.getTransactionDetail();
            data[i][1] = sb.getPaymentAmount();
            data[i][2] = sb.getTransactionDate();
        }

        model = new DefaultTableModel(data, columnNames);
        transactionHistoryTable.setModel(model);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        studentTransactionPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lblHostel = new javax.swing.JLabel();
        lbluser = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        studentBalanceField = new javax.swing.JTextField();
        topUpButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        transactionHistoryTable = new javax.swing.JTable();
        searchBar = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel2.setText("Search :");

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

        topUpButton.setBackground(new java.awt.Color(255, 204, 204));
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

        transactionHistoryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(transactionHistoryTable);

        searchBar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchBarKeyReleased(evt);
            }
        });

        jLabel3.setText("Search:");

        javax.swing.GroupLayout studentTransactionPanelLayout = new javax.swing.GroupLayout(studentTransactionPanel);
        studentTransactionPanel.setLayout(studentTransactionPanelLayout);
        studentTransactionPanelLayout.setHorizontalGroup(
            studentTransactionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(studentTransactionPanelLayout.createSequentialGroup()
                .addGroup(studentTransactionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(studentTransactionPanelLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(studentBalanceField, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(searchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, studentTransactionPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, studentTransactionPanelLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(topUpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)))
                .addContainerGap(9, Short.MAX_VALUE))
        );
        studentTransactionPanelLayout.setVerticalGroup(
            studentTransactionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(studentTransactionPanelLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(studentTransactionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(studentBalanceField, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(searchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(studentTransactionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(topUpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(studentTransactionPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(studentTransactionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(697, 528));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        StudentDashboard studentDashboard = new StudentDashboard();
        studentDashboard.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backButtonActionPerformed

    private void topUpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_topUpButtonActionPerformed
        try {
            int paymentId = PaymentData.getLastPaymentID();
            int paymentID = ++paymentId;

            LocalDateTime date = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
            String paymentDate = date.format(formatter);

            String topUpAmount = JOptionPane.showInputDialog(studentTransactionPanel,
                    "Insert amount that you want to top up into your APCard.");
            Double amount = Double.parseDouble(topUpAmount);

            if (amount <= 0) {
                throw new Exception();

            } else {
                double totalBalance = HostelManagementSystem.studentlogin.getStudentBalance() + amount;
                HostelManagementSystem.studentlogin.setStudentBalance(totalBalance);

                PaymentData.studentPayments.add(new StudentPayment(paymentID, HostelManagementSystem.studentlogin.getUsername(),
                        amount, "Top-Up", paymentDate));
                JOptionPane.showMessageDialog(studentTransactionPanel, "You have successfully top up RM"
                        + amount + " into your APCard.");

                StudentData.write();
                PaymentData.write();
                setstudentBalanceField();
                getTransactionHistory();
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(studentTransactionPanel, "Transaction Failed due to invalid amount.");
        }

    }//GEN-LAST:event_topUpButtonActionPerformed

    private void searchBarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchBarKeyReleased
        String query = searchBar.getText().toLowerCase();
        tableFilter(query);
    }//GEN-LAST:event_searchBarKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblHostel;
    private javax.swing.JLabel lbluser;
    private javax.swing.JTextField searchBar;
    private javax.swing.JTextField studentBalanceField;
    private javax.swing.JPanel studentTransactionPanel;
    private javax.swing.JButton topUpButton;
    private javax.swing.JTable transactionHistoryTable;
    // End of variables declaration//GEN-END:variables
}
