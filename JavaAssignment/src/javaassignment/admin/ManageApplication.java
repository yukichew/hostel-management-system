package javaassignment.admin;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javaassignment.HostelManagementSystem;
import javaassignment.model.BookingStatus;
import javaassignment.model.Room;
import javaassignment.model.Student;
import javaassignment.model.StudentBooking;
import javaassignment.model.StudentPayment;
import javaassignment.student.studentservices.PaymentData;
import javaassignment.student.studentservices.RoomData;
import javaassignment.student.studentservices.StudentBookingData;
import javaassignment.student.studentservices.StudentData;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.YES_NO_OPTION;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author NG WAN YUNG
 */
public class ManageApplication extends javax.swing.JFrame {

    StudentBooking studentbooking;
    DefaultTableModel model;

    public ManageApplication() {
        initComponents();
        getTransactionDetails();
        bID.setEditable(false);
        roomNum.setEditable(false);
        studentID.setEditable(false);
        contractPeriod.setEditable(false);
        bookingDate.setEditable(false);
        lblAdmin.setText(HostelManagementSystem.adminlogin.getAdminID());

    }

    private void getSpecificBookingStatus() {
        switch (studentbooking.getBookingStatus()) {
            case PENDING:
                applicationStatus.setSelectedItem("PENDING");
                break;
            case ACTIVE:
                applicationStatus.setSelectedItem("ACTIVE");
                break;
            case COMPLETED:
                applicationStatus.setSelectedItem("COMPLETED");
                break;
            case REJECTED:
                applicationStatus.setSelectedItem("REJECTED");
                break;
        }
    }

    private void getSpecificBooking() {
        if (studentbooking != null) {
            bID.setText(Integer.toString(studentbooking.getBookingID()));
            roomNum.setText(Integer.toString(studentbooking.getRoomID()));
            studentID.setText(studentbooking.getStudentID());
            contractPeriod.setText(Integer.toString(studentbooking.getContractPeriod()));
            bookingDate.setText(studentbooking.getBookingDate());
            getSpecificBookingStatus();

        } else {
            bID.setText("");
            roomNum.setText("");
            studentID.setText("");
            contractPeriod.setText("");
            bookingDate.setText("");
        }
    }

    private void getTransactionDetails() {

        String[] colname = {"Booking ID", "Amount", "Booking Date", "Student ID", "Room Number", "Contract Period", "Application Status"};
        Object[][] data = new Object[StudentBookingData.studentsBooking.size()][7];

        for (int i = 0; i < StudentBookingData.getPendingBookings().size(); i++) {
            StudentBooking sb = StudentBookingData.getPendingBookings().get(i);
            data[i][0] = sb.getBookingID();
            double totalPrice = sb.getTotalPrice();
            data[i][1] = String.valueOf(totalPrice);
            data[i][2] = sb.getBookingDate();
            data[i][3] = sb.getStudentID();
            data[i][4] = sb.getRoomID();
            data[i][5] = sb.getContractPeriod();
            data[i][6] = sb.getBookingStatus();
        }

        model = new DefaultTableModel(data, colname);
        studentApplicationTable.setModel(model);

        int rowCount = model.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {
            boolean isRowNull = true;
            for (int j = 0; j < model.getColumnCount(); j++) {
                Object value = model.getValueAt(i, j);
                if (value != null) {
                    isRowNull = false;
                    break;
                }
            }
            if (isRowNull) {
                model.removeRow(i);
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        applicationButton = new javax.swing.ButtonGroup();
        studentsApplicationPanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblAdmin = new javax.swing.JLabel();
        studentsApplicationTable = new javax.swing.JScrollPane();
        studentApplicationTable = new javax.swing.JTable();
        searchBar = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        updateStatusButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        bookingDate = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        bID = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        roomNum = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        studentID = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        contractPeriod = new javax.swing.JTextField();
        backButton1 = new javax.swing.JButton();
        applicationStatus = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Sama Gurmukhi", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Students Application");

        lblAdmin.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        lblAdmin.setForeground(new java.awt.Color(204, 204, 204));
        lblAdmin.setText("user");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblAdmin)
                .addGap(18, 18, 18))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAdmin))
                .addContainerGap())
        );

        studentApplicationTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7"
            }
        ));
        studentApplicationTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                studentApplicationTableMouseReleased(evt);
            }
        });
        studentsApplicationTable.setViewportView(studentApplicationTable);

        searchBar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchBarKeyReleased(evt);
            }
        });

        updateStatusButton.setText("Update Status");
        updateStatusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateStatusButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(updateStatusButton, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(updateStatusButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 16, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel2.setText("Search :");

        jLabel3.setText("Booking Date : ");

        bookingDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookingDateActionPerformed(evt);
            }
        });

        jLabel4.setText("Booking ID : ");

        jLabel5.setText("Room Number :");

        jLabel7.setText("Student ID : ");

        jLabel8.setText("Application Status : ");

        jLabel9.setText("Contract Period : ");

        backButton1.setText("Back");
        backButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButton1ActionPerformed(evt);
            }
        });

        applicationStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PENDING", "ACTIVE", "REJECTED", "COMPLETED" }));

        javax.swing.GroupLayout studentsApplicationPanelLayout = new javax.swing.GroupLayout(studentsApplicationPanel);
        studentsApplicationPanel.setLayout(studentsApplicationPanelLayout);
        studentsApplicationPanelLayout.setHorizontalGroup(
            studentsApplicationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(studentsApplicationPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(studentsApplicationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(studentsApplicationPanelLayout.createSequentialGroup()
                        .addComponent(backButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(studentsApplicationPanelLayout.createSequentialGroup()
                        .addGroup(studentsApplicationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(studentsApplicationPanelLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(studentsApplicationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(studentsApplicationPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(searchBar))
                                    .addGroup(studentsApplicationPanelLayout.createSequentialGroup()
                                        .addGroup(studentsApplicationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(studentsApplicationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, studentsApplicationPanelLayout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(bID, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(studentsApplicationPanelLayout.createSequentialGroup()
                                                .addGap(72, 72, 72)
                                                .addGroup(studentsApplicationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(roomNum, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                                                    .addComponent(bookingDate))))
                                        .addGap(33, 33, 33)
                                        .addGroup(studentsApplicationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(studentsApplicationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(contractPeriod)
                                            .addComponent(studentID)
                                            .addComponent(applicationStatus, 0, 186, Short.MAX_VALUE))
                                        .addGap(16, 16, 16))))
                            .addComponent(studentsApplicationTable, javax.swing.GroupLayout.PREFERRED_SIZE, 708, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        studentsApplicationPanelLayout.setVerticalGroup(
            studentsApplicationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(studentsApplicationPanelLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(studentsApplicationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(52, 52, 52)
                .addGroup(studentsApplicationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(bID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(studentID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(studentsApplicationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bookingDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel9)
                    .addComponent(contractPeriod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(studentsApplicationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(roomNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(applicationStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(57, 57, 57)
                .addComponent(studentsApplicationTable, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(studentsApplicationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(studentsApplicationPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(studentsApplicationPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButton1ActionPerformed
        AdminDashboard ad = new AdminDashboard();
        ad.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backButton1ActionPerformed

    private void bookingDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookingDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bookingDateActionPerformed

    private void updateStatusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateStatusButtonActionPerformed

        int res = JOptionPane.showConfirmDialog(jPanel1, "Sure to change the status of this booking application?", "Edit Confirmation", YES_NO_OPTION);
        if (res == JOptionPane.YES_OPTION) {
            if (studentbooking != null) {

                if (studentbooking.getBookingStatus() == BookingStatus.PENDING) {
                    String selectedStatus = (String) applicationStatus.getSelectedItem();

                    if (selectedStatus.equals("ACTIVE")) {
                        studentbooking.setBookingStatus(BookingStatus.ACTIVE);
                        StudentBookingData.write();
                        getTransactionDetails();
                        JOptionPane.showMessageDialog(jPanel1, "Booking status is edited successfully!");

                    } else if (selectedStatus.equals("REJECTED")) {
                        double roomPrice = studentbooking.getTotalPrice();
                        Student booked_student = StudentData.checkStudentID(studentbooking.getStudentID());
                        double currentBalance = booked_student.getStudentBalance();
                        double updatedBalance = currentBalance + roomPrice;
                        booked_student.setStudentBalance(updatedBalance);
                        StudentData.write();

                        int paymentId = PaymentData.getLastPaymentID();
                        int paymentID = ++paymentId;

                        LocalDateTime date = LocalDateTime.now();
                        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
                        String paymentDate = date.format(formatter);

                        PaymentData.studentPayments.add(new StudentPayment(paymentID, studentbooking.getStudentID(),
                                roomPrice, "Payment Refund for Rejected Booking", paymentDate));
                        PaymentData.write();

                        Room room = RoomData.checkRoom(studentbooking.getRoomID());
                        int capacity = room.getRoomCapacity() - 1;
                        room.setRoomCapacity(capacity);
                        RoomData.write();

                        studentbooking.setBookingStatus(BookingStatus.REJECTED);
                        StudentBookingData.write();
                        getTransactionDetails();
                        JOptionPane.showMessageDialog(jPanel1, "Booking status is edited successfully!");

                    }

                } else {
                    JOptionPane.showMessageDialog(jPanel1, "Failed to update status!");
                }

            } else {
                JOptionPane.showMessageDialog(jPanel1, "Please select a booking to edit!");
            }

        }
    }//GEN-LAST:event_updateStatusButtonActionPerformed

    private void searchBarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchBarKeyReleased

    }//GEN-LAST:event_searchBarKeyReleased

    private void studentApplicationTableMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentApplicationTableMouseReleased
        int row = studentApplicationTable.getSelectedRow();
        studentbooking = StudentBookingData.checkBooking((int) model.getValueAt(row, 0));
        if (studentbooking != null) {
            getSpecificBooking();
        } else {
            JOptionPane.showMessageDialog(this, "Please select a booking to proceed!");
        }

    }//GEN-LAST:event_studentApplicationTableMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup applicationButton;
    private javax.swing.JComboBox<String> applicationStatus;
    private javax.swing.JTextField bID;
    private javax.swing.JButton backButton1;
    private javax.swing.JTextField bookingDate;
    private javax.swing.JTextField contractPeriod;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblAdmin;
    private javax.swing.JTextField roomNum;
    private javax.swing.JTextField searchBar;
    private javax.swing.JTable studentApplicationTable;
    private javax.swing.JTextField studentID;
    private javax.swing.JPanel studentsApplicationPanel;
    private javax.swing.JScrollPane studentsApplicationTable;
    private javax.swing.JButton updateStatusButton;
    // End of variables declaration//GEN-END:variables
}
