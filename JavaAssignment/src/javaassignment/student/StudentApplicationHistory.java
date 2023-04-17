package javaassignment.student;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javaassignment.HostelManagementSystem;
import javaassignment.model.Room;
import javaassignment.model.StudentBooking;
import javaassignment.student.studentservices.RoomData;
import javaassignment.student.studentservices.StudentBookingData;
import javaassignment.student.studentservices.StudentData;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.YES_NO_OPTION;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author yukichew
 */
public class StudentApplicationHistory extends javax.swing.JFrame {

    DefaultTableModel model;

    public StudentApplicationHistory() {
        initComponents();
        lbluser.setText(HostelManagementSystem.studentlogin.getStudentID());
        getApplicationHistory();
    }

    private String checkHostelRoomStatus(LocalDate endDate) {
        LocalDate currentDate = LocalDate.now();
        if (endDate.isBefore(currentDate)) {
            return "Active";
        } else {
            return "Completed";
        }

    }

    private void tableFilter(String query) {
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<DefaultTableModel>(model);
        applicationHistoryTable.setRowSorter(sorter);
        sorter.setRowFilter(RowFilter.regexFilter("(?i)" + query));
    }

    private void getApplicationHistory() {
        String[] columnNames = {"Room Number", "Room Type", "Contract Start Date", "Contract End Date", "Status"};
        Object[][] data = new Object[StudentBookingData.checkStudentBookings(HostelManagementSystem.studentlogin.getStudentID()).size()][5];

        for (int i = 0; i < StudentBookingData.checkStudentBookings(HostelManagementSystem.studentlogin.getStudentID()).size(); i++) {
            StudentBooking sb = StudentBookingData.checkStudentBookings(HostelManagementSystem.studentlogin.getStudentID()).get(i);
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
            String contractEndDate = formatter.format(sb.getContractEndDate());

            data[i][0] = sb.getRoomID();
            Room room = RoomData.checkRoom(sb.getRoomID());
            data[i][1] = room.getRoomType().getName();
            data[i][2] = sb.getBookingDate();
            data[i][3] = contractEndDate;

            LocalDate currentDate = LocalDate.now();
            data[i][4] = checkHostelRoomStatus(sb.getContractEndDate());
        }

        model = new DefaultTableModel(data, columnNames);
        applicationHistoryTable.setModel(model);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        studentHistoryPanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lbluser = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        applicationHistoryTable = new javax.swing.JTable();
        searchBar = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        extendContractButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Sama Gurmukhi", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("My Applications History");

        lbluser.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        lbluser.setForeground(new java.awt.Color(204, 204, 204));
        lbluser.setText("user");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbluser)
                .addGap(18, 18, 18))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbluser))
                .addContainerGap())
        );

        applicationHistoryTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(applicationHistoryTable);

        searchBar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchBarKeyReleased(evt);
            }
        });

        extendContractButton.setText("Extend Contract Period");
        extendContractButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                extendContractButtonActionPerformed(evt);
            }
        });

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(extendContractButton, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(extendContractButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel2.setText("Search :");

        javax.swing.GroupLayout studentHistoryPanelLayout = new javax.swing.GroupLayout(studentHistoryPanel);
        studentHistoryPanel.setLayout(studentHistoryPanelLayout);
        studentHistoryPanelLayout.setHorizontalGroup(
            studentHistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(studentHistoryPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(studentHistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 645, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, studentHistoryPanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(searchBar)))
                .addContainerGap())
        );
        studentHistoryPanelLayout.setVerticalGroup(
            studentHistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(studentHistoryPanelLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(studentHistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(studentHistoryPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(studentHistoryPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(657, 393));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        StudentDashboard studentDashboard = new StudentDashboard();
        studentDashboard.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backButtonActionPerformed

    private void extendContractButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_extendContractButtonActionPerformed
        try {
            String contractPeriod = JOptionPane.showInputDialog(studentHistoryPanel,
                    "How many year you want to extend? The minimum year is 1 year.");
            int year = Integer.parseInt(contractPeriod);

            if (year < 1) {
                JOptionPane.showInputDialog(studentHistoryPanel, "The minimum year is 1 year.");
            } else {
                StudentBooking studentBooking = StudentBookingData.checkStudentBooking(HostelManagementSystem.studentlogin.getStudentID());

                if (studentBooking != null) {
                    double studentBalance = HostelManagementSystem.studentlogin.getStudentBalance();
                    Room room = RoomData.checkRoom(studentBooking.getRoomID());
                    double roomPrice = room.getRoomPrice() * year;
                    int contractMonths = studentBooking.getContractPeriod() + (year * 12);

                    if (studentBalance >= roomPrice) {
                        studentBooking.setContractPeriod(contractMonths);
                        StudentBookingData.write();
                        getApplicationHistory();

                    } else {
                        int a = JOptionPane.showConfirmDialog(studentHistoryPanel, "Booking failed due to insufficient balance."
                                + " Please top up your APCard to proceed. Do you want to top up your balance now?", "Top Up Confirmation", YES_NO_OPTION);
                        if (a == JOptionPane.YES_OPTION) {
                            try {
                                String topUpAmount = JOptionPane.showInputDialog(studentHistoryPanel,
                                        "Insert amount that you want to top up into your APCard.");
                                Double amount = Double.parseDouble(topUpAmount);
                                if (amount <= 0) {
                                    throw new Exception();

                                } else {
                                    HostelManagementSystem.studentlogin.setStudentBalance(amount + HostelManagementSystem.studentlogin.getStudentBalance());
                                    JOptionPane.showMessageDialog(studentHistoryPanel, "You have successfully top tup RM"
                                            + amount + " into your APCard.");
                                    StudentData.write();

                                }
                            } catch (Exception e) {
                                JOptionPane.showMessageDialog(studentHistoryPanel, "Transaction Failed due to invalid amount.");
                            }
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(studentHistoryPanel, "There's no active room right now.");
                }

            }

        } catch (Exception ex) {
            JOptionPane.showInputDialog(studentHistoryPanel, "Fail to extend your contract period.");

        }
    }//GEN-LAST:event_extendContractButtonActionPerformed

    private void searchBarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchBarKeyReleased
        String query = searchBar.getText().toLowerCase();
        tableFilter(query);
    }//GEN-LAST:event_searchBarKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable applicationHistoryTable;
    private javax.swing.JButton backButton;
    private javax.swing.JButton extendContractButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbluser;
    private javax.swing.JTextField searchBar;
    private javax.swing.JPanel studentHistoryPanel;
    // End of variables declaration//GEN-END:variables
}
