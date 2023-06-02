package javaassignment.student;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javaassignment.HostelManagementSystem;
import javaassignment.model.BookingStatus;
import javaassignment.model.Room;
import javaassignment.model.RoomType;
import javaassignment.model.StudentBooking;
import javaassignment.model.StudentPayment;
import javaassignment.student.studentservices.PaymentData;
import javaassignment.student.studentservices.StudentBookingData;
import javaassignment.student.studentservices.RoomData;
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
public final class HostelBooking extends javax.swing.JFrame {

    private int contractPeriod = 12;
    private DefaultTableModel model;
    private ArrayList<Room> availableRooms = RoomData.checkAvailableRooms();

    int single;
    int twin;
    int deluxeSingle;
    int deluxeTwin;

    public HostelBooking() {
        initComponents();
        getHostelDetails();
        roomTypeComboBox();
    }

    public String getRoomAvailability(boolean roomAvailability) {
        if (roomAvailability == true) {
            return "Available";

        } else {
            return "Occupied";
        }
    }

    private void roomTypeComboBox() {
        for (RoomType roomType : RoomType.values()) {
            roomTypeCombo.addItem(roomType.getName());
        }
    }

    private RoomType checkRoomType(String roomType) {
        if (roomType.equals("Deluxe Single Room")) {
            return RoomType.DELUXESINGLE;
        } else if (roomType.equals("Single Room")) {
            return RoomType.SINGLE;
        } else if (roomType.equals("Deluxe Twin Room")) {
            return RoomType.DELUXETWINS;
        } else if (roomType.equals("Twin Room")) {
            return RoomType.TWINS;
        } else {
            return null;
        }
    }

    private void getHostelDetails() {
        String[] columnNames = {"Room Number", "Room Type", "Price", "Availability"};
        Object[][] data = new Object[availableRooms.size()][4];
        for (int i = 0; i < availableRooms.size(); i++) {
            Room room = availableRooms.get(i);
            data[i][0] = room.getRoomNumber();
            data[i][1] = room.getRoomType().getName();
            data[i][2] = room.getRoomPrice();
            String roomAvailable = getRoomAvailability(room.isRoomAvailability());
            data[i][3] = roomAvailable;

        }

        model = new DefaultTableModel(data, columnNames);
        hostelDetailsTable.setModel(model);

        single = RoomData.getAvailableRoomCount(RoomType.SINGLE);
        twin = RoomData.getAvailableRoomCount(RoomType.TWINS);
        deluxeSingle = RoomData.getAvailableRoomCount(RoomType.DELUXESINGLE);
        deluxeTwin = RoomData.getAvailableRoomCount(RoomType.DELUXETWINS);

        jLabel3.setText("Number of available Single Room: " + single);
        jLabel4.setText("Number of available Twin Room: " + twin);
        jLabel5.setText("Number of available Deluxe Single Room: " + deluxeSingle);
        jLabel6.setText("Number of available Deluxe Twin Room: " + deluxeTwin);
    }

    private void tableFilter(String query) {
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<DefaultTableModel>(model);
        hostelDetailsTable.setRowSorter(sorter);
        sorter.setRowFilter(RowFilter.regexFilter("(?i)" + query));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        hostelbooking = new javax.swing.JPanel();
        hostelDetailScrollPane = new javax.swing.JScrollPane();
        hostelDetailsTable = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        lblroomType = new javax.swing.JLabel();
        roomTypeCombo = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        confirmButton = new javax.swing.JButton();
        searchField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hostel Booking");

        hostelbooking.setBackground(new java.awt.Color(255, 255, 255));

        hostelDetailScrollPane.setViewportView(hostelDetailsTable);
        hostelDetailsTable.setDefaultEditor(Object.class, null);

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        lblroomType.setForeground(new java.awt.Color(0, 0, 0));
        lblroomType.setText("Room Type:");

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("**Only one room can be booked for each student.");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblroomType, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(roomTypeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(roomTypeCombo)
                    .addComponent(lblroomType, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        confirmButton.setText("Confirm");
        confirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmButtonActionPerformed(evt);
            }
        });

        searchField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchFieldKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel2.setText("Search:");

        jLabel3.setText("Number of available Single Room:");

        jLabel4.setText("Number of available Twin Room:");

        jLabel5.setText("Number of available Deluxe Single Room:");

        jLabel6.setText("Number of available Deluxe Twin Room:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addContainerGap(221, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout hostelbookingLayout = new javax.swing.GroupLayout(hostelbooking);
        hostelbooking.setLayout(hostelbookingLayout);
        hostelbookingLayout.setHorizontalGroup(
            hostelbookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hostelbookingLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(hostelbookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hostelDetailScrollPane)
                    .addGroup(hostelbookingLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(hostelbookingLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel2)
                        .addGap(39, 39, 39)
                        .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(hostelbookingLayout.createSequentialGroup()
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(confirmButton, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15))
        );
        hostelbookingLayout.setVerticalGroup(
            hostelbookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hostelbookingLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(hostelbookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(hostelDetailScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(hostelbookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(hostelbookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(confirmButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(hostelbooking, javax.swing.GroupLayout.DEFAULT_SIZE, 958, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(hostelbooking, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 589, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(964, 617));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void searchFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchFieldKeyReleased
        String query = searchField.getText().toLowerCase();
        tableFilter(query);
    }//GEN-LAST:event_searchFieldKeyReleased

    private void confirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmButtonActionPerformed
        String selectedRoomType = (String) roomTypeCombo.getItemAt(roomTypeCombo.getSelectedIndex());
        if (selectedRoomType != null) {
            try {
                int bookingId = StudentBookingData.getLastOrderID();
                int bookingID = ++bookingId;

                RoomType roomtype = checkRoomType(selectedRoomType);
                Room room = RoomData.checkAvailableRoomType(roomtype);
                double roomPrice = room.getRoomPrice();

                LocalDateTime date = LocalDateTime.now();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
                String paymentDate = date.format(formatter);

                DateTimeFormatter dateformat = DateTimeFormatter.ofPattern("dd.MM.yyyy");
                String bookingDate = date.format(dateformat);

                int roomNumber = room.getRoomNumber();

                String studentID = HostelManagementSystem.studentlogin.getUsername();

                ArrayList<StudentBooking> studentBookings = StudentBookingData.checkStudentBookings(studentID);
                boolean status = false;

                for (StudentBooking booking : studentBookings) {
                    if (booking.getBookingStatus() == BookingStatus.PENDING || booking.getBookingStatus() == BookingStatus.ACTIVE) {
                        status = true;
                        break;
                    }
                }

                if (status) {
                    JOptionPane.showMessageDialog(hostelbooking,
                            "You already have a pending or active room. You can only book another room after your contract end.");
                } else {
                    if (room == null) {
                        throw new Exception();

                    } else {

                        int option = JOptionPane.showConfirmDialog(hostelbooking, "Confirm booking?",
                                "Booking Confirmation", YES_NO_OPTION);
                        if (option == JOptionPane.YES_OPTION) {
                            double studentBalance = HostelManagementSystem.studentlogin.getStudentBalance();
                            int paymentId = PaymentData.getLastPaymentID();
                            int paymentID = ++paymentId;

                            if (studentBalance >= roomPrice) {
                                int roomCapacity = room.getRoomCapacity();
                                int roomcapacity = ++roomCapacity;
                                room.setRoomCapacity(roomcapacity);
                                room.setRoomAvailability();
                                RoomData.write();

                                StudentBookingData.studentsBooking.add(new StudentBooking(bookingID, roomPrice,
                                        bookingDate, studentID, roomNumber, contractPeriod, BookingStatus.PENDING));
                                StudentBookingData.write();

                                String paymentDetails = "Payment for " + room.getRoomType().getName();

                                PaymentData.studentPayments.add(new StudentPayment(paymentID, HostelManagementSystem.studentlogin.getUsername(),
                                        roomPrice, paymentDetails, paymentDate));
                                PaymentData.write();

                                JOptionPane.showMessageDialog(hostelbooking,
                                        "Congratulations! Your have booked a " + room.getRoomType().getName() + ". However, your booking will only be confirmed after  admin has approved your application.");
                                double balance = studentBalance - roomPrice;
                                HostelManagementSystem.studentlogin.setStudentBalance(balance);
                                StudentData.write();

                                StudentApplicationHistory studentHistory = new StudentApplicationHistory();
                                studentHistory.setVisible(true);
                                this.setVisible(false);

                            } else {
                                int a = JOptionPane.showConfirmDialog(hostelbooking, "Booking failed due to insufficient balance."
                                        + " Please top up your APCard to proceed. Do you want to top up your balance now?", "Top Up Confirmation", YES_NO_OPTION);
                                if (a == JOptionPane.YES_OPTION) {
                                    StudentTransaction studentTransaction = new StudentTransaction();
                                    studentTransaction.setVisible(true);
                                    this.setVisible(false);
                                }
                            }
                        }
                    }
                }

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(hostelbooking,
                        "Sorry, no available " + selectedRoomType + " at this time.");
            }
        }
    }//GEN-LAST:event_confirmButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        StudentDashboard studentDashboard = new StudentDashboard();
        studentDashboard.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton confirmButton;
    private javax.swing.JScrollPane hostelDetailScrollPane;
    private javax.swing.JTable hostelDetailsTable;
    private javax.swing.JPanel hostelbooking;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblroomType;
    private javax.swing.JComboBox<String> roomTypeCombo;
    private javax.swing.JTextField searchField;
    // End of variables declaration//GEN-END:variables
}
