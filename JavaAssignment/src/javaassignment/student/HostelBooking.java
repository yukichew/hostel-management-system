package javaassignment.student;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javaassignment.HostelManagementSystem;
import javaassignment.model.Room;
import javaassignment.model.RoomType;
import javaassignment.model.StudentBooking;
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
    DefaultTableModel model;

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
        } else if (roomType.equals("Deluxe Twins Room")) {
            return RoomType.DELUXETWINS;
        } else if (roomType.equals("Twins Room")) {
            return RoomType.TWINS;
        } else {
            return null;
        }
    }

    private void getHostelDetails() {
        String[] columnNames = {"Room Number", "Room Type", "Price", "Availability"};
        Object[][] data = new Object[RoomData.rooms.size()][4];

        for (int i = 0; i < RoomData.rooms.size(); i++) {
            Room room = RoomData.rooms.get(i);
            data[i][0] = room.getRoomNumber();
            data[i][1] = room.getRoomType().getName();
            data[i][2] = room.getRoomPrice();
            String roomAvailable = getRoomAvailability(room.isRoomAvailability());
            data[i][3] = roomAvailable;
        }

        model = new DefaultTableModel(data, columnNames);
        hostelDetailsTable.setModel(model);
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
        availableRoom = new javax.swing.JButton();
        showAllRooms = new javax.swing.JButton();
        searchField = new javax.swing.JTextField();

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
                .addGap(25, 25, 25)
                .addComponent(lblroomType, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(roomTypeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(168, 168, 168)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblroomType, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(roomTypeCombo)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41))
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

        availableRoom.setText("Show Available Rooms Only");
        availableRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                availableRoomActionPerformed(evt);
            }
        });

        showAllRooms.setText("Show All Rooms");
        showAllRooms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showAllRoomsActionPerformed(evt);
            }
        });

        searchField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchFieldKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout hostelbookingLayout = new javax.swing.GroupLayout(hostelbooking);
        hostelbooking.setLayout(hostelbookingLayout);
        hostelbookingLayout.setHorizontalGroup(
            hostelbookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hostelbookingLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(hostelbookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(hostelbookingLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(confirmButton, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9))
                    .addComponent(hostelDetailScrollPane, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(hostelbookingLayout.createSequentialGroup()
                        .addComponent(availableRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79)
                        .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(showAllRooms, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        hostelbookingLayout.setVerticalGroup(
            hostelbookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hostelbookingLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(hostelbookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(availableRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(showAllRooms, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(hostelDetailScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(hostelbookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(confirmButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(hostelbooking, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(hostelbooking, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(964, 688));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void confirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmButtonActionPerformed
        String selectedRoomType = (String) roomTypeCombo.getItemAt(roomTypeCombo.getSelectedIndex());

        try {
            int bookingId = StudentBookingData.getLastOrderID();
            int bookingID = ++bookingId;

            RoomType roomtype = checkRoomType(selectedRoomType);
            Room room = RoomData.checkAvailableRoomType(roomtype);
            double roomPrice = room.getRoomPrice();

            SimpleDateFormat dateformat = new SimpleDateFormat("dd.MM.yyyy");
            Date date = new Date();
            String bookingDate = dateformat.format(date);

            String studentID = HostelManagementSystem.studentlogin.getStudentID();
            StudentBooking found = StudentBookingData.checkStudentBooking(studentID);

            int roomNumber = room.getRoomNumber();

            if (found == null) {
                if (room == null) {
                    throw new Exception();

                } else {
                    int option = JOptionPane.showConfirmDialog(hostelbooking, "Confirm booking?",
                            "Booking Confirmation", YES_NO_OPTION);
                    if (option == JOptionPane.YES_OPTION) {
                        double studentBalance = HostelManagementSystem.studentlogin.getStudentBalance();

                        if (studentBalance >= roomPrice) {
                            int roomCapacity = room.getRoomCapacity();
                            int roomcapacity = ++roomCapacity;
                            room.setRoomCapacity(roomcapacity);
                            RoomData.write();

                            StudentBookingData.studentsBooking.add(new StudentBooking(bookingID, roomPrice,
                                    bookingDate, studentID, roomNumber, contractPeriod));
                            StudentBookingData.write();
                            JOptionPane.showMessageDialog(hostelbooking,
                                    "Congratulations! Your room number is " + roomNumber);
                            double balance = studentBalance - roomPrice;
                            HostelManagementSystem.studentlogin.setStudentBalance(balance);
                            StudentData.write();

                            StudentTransaction studentTransaction = new StudentTransaction();
                            studentTransaction.setVisible(true);
                            this.setVisible(false);

                        } else {
                            int a = JOptionPane.showConfirmDialog(hostelbooking, "Booking failed due to insufficient balance."
                                    + " Please top up your APCard to proceed. Do you want to top up your balance now?", "Top Up Confirmation", YES_NO_OPTION);
                            if (a == JOptionPane.YES_OPTION) {
                                try {
                                    String topUpAmount = JOptionPane.showInputDialog(hostelbooking,
                                            "Insert amount that you want to top up into your APCard.");
                                    Double amount = Double.parseDouble(topUpAmount);
                                    if (amount <= 0) {
                                        throw new Exception();

                                    } else {
                                        HostelManagementSystem.studentlogin.setStudentBalance(amount);
                                        JOptionPane.showMessageDialog(hostelbooking, "You have successfully top tup RM"
                                                + amount + " into your APCard.");
                                        StudentData.write();

                                    }
                                } catch (Exception e) {
                                    JOptionPane.showMessageDialog(hostelbooking, "Transaction Failed due to invalid amount.");
                                }
                            }
                        }
                    }
                }

            } else {
                JOptionPane.showMessageDialog(hostelbooking,
                        "You already booked a room. You can only book another room after your contract end.");
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(hostelbooking,
                    "Sorry, there are no available " + selectedRoomType + " at this time.");
        }

    }//GEN-LAST:event_confirmButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        StudentDashboard studentDashboard = new StudentDashboard();
        studentDashboard.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backButtonActionPerformed

    private void availableRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_availableRoomActionPerformed
        String[] columnNames = {"Room Number", "Room Type", "Price", "Availability"};
        List<Object[]> data = new ArrayList<>();
        for (Room room : RoomData.rooms) {
            if (room.isRoomAvailability()) {
                Object[] row = new Object[4];
                row[0] = room.getRoomNumber();
                row[1] = room.getRoomType().getName();
                row[2] = room.getRoomPrice();
                row[3] = getRoomAvailability(room.isRoomAvailability());
                data.add(row);
            }
        }
        DefaultTableModel availableRooms = new DefaultTableModel(data.toArray(new Object[0][]), columnNames);
        hostelDetailsTable.setModel(availableRooms);
    }//GEN-LAST:event_availableRoomActionPerformed

    private void showAllRoomsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showAllRoomsActionPerformed
        getHostelDetails();
    }//GEN-LAST:event_showAllRoomsActionPerformed

    private void searchFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchFieldKeyReleased
        String query = searchField.getText().toLowerCase();
        tableFilter(query);
    }//GEN-LAST:event_searchFieldKeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton availableRoom;
    private javax.swing.JButton backButton;
    private javax.swing.JButton confirmButton;
    private javax.swing.JScrollPane hostelDetailScrollPane;
    private javax.swing.JTable hostelDetailsTable;
    private javax.swing.JPanel hostelbooking;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblroomType;
    private javax.swing.JComboBox<String> roomTypeCombo;
    private javax.swing.JTextField searchField;
    private javax.swing.JButton showAllRooms;
    // End of variables declaration//GEN-END:variables
}
