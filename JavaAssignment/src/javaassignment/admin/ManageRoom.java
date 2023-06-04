package javaassignment.admin;

import javaassignment.HostelManagementSystem;
import javaassignment.model.Room;
import javaassignment.model.RoomType;
import javaassignment.student.studentservices.RoomData;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.JOptionPane;
import javaassignment.model.roomsubclass.*;
import static javax.swing.JOptionPane.YES_NO_OPTION;

/**
 *
 * @author NG WAN YUNG
 */
public class ManageRoom extends javax.swing.JFrame {

    DefaultTableModel model;
    Room room;

    public ManageRoom() {
        initComponents();
        lblAdmin.setText(HostelManagementSystem.adminlogin.getAdminID());
        RoomNumber.setEditable(false);
        Status.setEditable(false);
        getRoomDetails();
        roomTypeOption();
    }

    private void tableFilter(String query) {
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<DefaultTableModel>(model);
        roomDetailsTable.setRowSorter(sorter);
        sorter.setRowFilter(RowFilter.regexFilter("(?i)" + query));
    }

    private void roomTypeOption() {
        for (RoomType roomType : RoomType.values()) {
            roomTypeOption.addItem(roomType.getName());
        }
    }

    private void getRoomDetails() {
        String[] columnNames = {"Room Number", "Room Type", "Price", "Number of Student in the Room"};
        Object[][] data = new Object[RoomData.rooms.size()][4];

        for (int i = 0; i < RoomData.rooms.size(); i++) {
            Room room = RoomData.rooms.get(i);
            data[i][0] = room.getRoomNumber();
            data[i][1] = room.getRoomType().getName();
            data[i][2] = room.getRoomPrice();
            data[i][3] = room.getRoomCapacity();
        }

        model = new DefaultTableModel(data, columnNames);
        roomDetailsTable.setModel(model);

    }

//    private void comboFilter(String query) {
//        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
//        roomDetailsTable.setRowSorter(tr);
//
//        if (query != "Select Room Type") {
//            tr.setRowFilter(RowFilter.regexFilter(query));
//        } else {
//            roomDetailsTable.setRowSorter(tr);
//        }
//    }

    private void getSpecificRoom() {
        if (room != null) {
            RoomNumber.setText(Integer.toString(room.getRoomNumber()));
            roomTypeOption.setSelectedItem(room.getRoomType().getName());
            RoomPrice.setText(Double.toString(room.getRoomPrice()));
            Status.setText(Integer.toString(room.getRoomCapacity()));

        } else {
            RoomNumber.setText("");
            roomTypeOption.setSelectedItem("Select Room Type");
            RoomPrice.setText("");
            Status.setText("");
        }
    }

    private Room checkRoomType(int roomID, double roomPrice, int roomCapacity) {
        Room room = null;
        switch (roomTypeOption.getSelectedItem().toString()) {
            case "Single Room":
                room = new SingleRoom(roomID, roomPrice, roomCapacity);
                break;
            case "Twin Room":
                room = new TwinRoom(roomID, roomPrice, roomCapacity);
                break;
            case "Deluxe Single Room":
                room = new DeluxeSingle(roomID, roomPrice, roomCapacity);
                break;
            case "Deluxe Twin Room":
                room = new DeluxeTwin(roomID, roomPrice, roomCapacity);
        }
        return room;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        manageRoomPanel = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        lblAdmin = new javax.swing.JLabel();
        roomDetailsJScrollPanel = new javax.swing.JScrollPane();
        roomDetailsTable = new javax.swing.JTable();
        searchBar = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        RoomNumber = new javax.swing.JTextField();
        RoomPrice = new javax.swing.JTextField();
        Status = new javax.swing.JTextField();
        roomTypeOption = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        deleteButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel6.setBackground(new java.awt.Color(102, 102, 102));

        jLabel5.setFont(new java.awt.Font("Sama Gurmukhi", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Room Management");

        lblAdmin.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        lblAdmin.setForeground(new java.awt.Color(204, 204, 204));
        lblAdmin.setText("user");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblAdmin)
                .addGap(18, 18, 18))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAdmin))
                .addContainerGap())
        );

        roomDetailsJScrollPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                roomDetailsJScrollPanelMouseReleased(evt);
            }
        });

        roomDetailsTable.setModel(new javax.swing.table.DefaultTableModel(
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
        roomDetailsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                roomDetailsTableMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                roomDetailsTableMouseReleased(evt);
            }
        });
        roomDetailsJScrollPanel.setViewportView(roomDetailsTable);

        searchBar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchBarKeyReleased(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel6.setText("Search :");

        jLabel7.setText("Room Type : ");

        jLabel8.setText("Room Number :");

        jLabel9.setText("Room Price :");

        jLabel10.setText("Availability :");

        roomTypeOption.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Room Type" }));
        roomTypeOption.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                roomTypeOptionItemStateChanged(evt);
            }
        });
        roomTypeOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roomTypeOptionActionPerformed(evt);
            }
        });

        deleteButton.setText("Delete Room");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        updateButton.setText("Update Room");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        addButton.setText("Add Room");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(updateButton)
                .addGap(11, 11, 11))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout manageRoomPanelLayout = new javax.swing.GroupLayout(manageRoomPanel);
        manageRoomPanel.setLayout(manageRoomPanelLayout);
        manageRoomPanelLayout.setHorizontalGroup(
            manageRoomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(manageRoomPanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(searchBar)
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, manageRoomPanelLayout.createSequentialGroup()
                .addGroup(manageRoomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(manageRoomPanelLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(manageRoomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(manageRoomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, manageRoomPanelLayout.createSequentialGroup()
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(180, 180, 180))
                                .addGroup(manageRoomPanelLayout.createSequentialGroup()
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(roomTypeOption, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(manageRoomPanelLayout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(RoomPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(manageRoomPanelLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RoomNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, manageRoomPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Status, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 58, Short.MAX_VALUE)
                .addComponent(roomDetailsJScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        manageRoomPanelLayout.setVerticalGroup(
            manageRoomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageRoomPanelLayout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(manageRoomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(manageRoomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(manageRoomPanelLayout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(manageRoomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(RoomNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(31, 31, 31)
                        .addGroup(manageRoomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(roomTypeOption, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(manageRoomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(RoomPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(manageRoomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(61, 61, 61))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, manageRoomPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(roomDetailsJScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(344, 344, 344))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(manageRoomPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(manageRoomPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(839, 530));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        try {
            int res = JOptionPane.showConfirmDialog(manageRoomPanel, "Are you sure to Delete this room?", "elete Confirmation", YES_NO_OPTION);
            if (res == JOptionPane.YES_OPTION) {
                if (room != null) {
                    RoomData.rooms.remove(room);
                    RoomData.write();
                    getRoomDetails();

                } else {
                    throw new Exception();
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Please select a room to delete!.");
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        try {
            if (room != null) {
                RoomData.rooms.remove(room);

                int roomNumber = Integer.parseInt(RoomNumber.getText());
                int roomCapacity = Integer.parseInt(Status.getText());
                double roomPrice = Double.parseDouble(RoomPrice.getText());

                Room newRoom = checkRoomType(roomNumber, roomPrice, roomCapacity);
                RoomData.rooms.add(newRoom);
                RoomData.write();
                newRoom.setRoomAvailability();

                RoomData.write();
                JOptionPane.showMessageDialog(this, "Room is edited successfully!");
                getRoomDetails();

            } else {
                JOptionPane.showMessageDialog(this, "Please select a room to edit!");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error editing the room. Please ensure you enter valid info.");
        }
    }//GEN-LAST:event_updateButtonActionPerformed

    private void roomTypeOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roomTypeOptionActionPerformed

    }//GEN-LAST:event_roomTypeOptionActionPerformed

    private void roomTypeOptionItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_roomTypeOptionItemStateChanged
//        String query = roomTypeOption.getSelectedItem().toString();
//        comboFilter(query);
    }//GEN-LAST:event_roomTypeOptionItemStateChanged

    private void searchBarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchBarKeyReleased
        String query = searchBar.getText().toLowerCase();
        tableFilter(query);
    }//GEN-LAST:event_searchBarKeyReleased

    private void roomDetailsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roomDetailsTableMouseClicked

    }//GEN-LAST:event_roomDetailsTableMouseClicked

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        AdminDashboard ad = new AdminDashboard();
        ad.setVisible(true);
        dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        addRoom ar = new addRoom();
        ar.setVisible(true);
    }//GEN-LAST:event_addButtonActionPerformed

    private void roomDetailsJScrollPanelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roomDetailsJScrollPanelMouseReleased

    }//GEN-LAST:event_roomDetailsJScrollPanelMouseReleased

    private void roomDetailsTableMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roomDetailsTableMouseReleased
        int row = roomDetailsTable.getSelectedRow();
        room = RoomData.checkRoom((int) model.getValueAt(row, 0));
        if (room!= null) {
            getSpecificRoom();
        } else {
            JOptionPane.showMessageDialog(this, "Please select a booking to proceed!");
        }
    }//GEN-LAST:event_roomDetailsTableMouseReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField RoomNumber;
    private javax.swing.JTextField RoomPrice;
    private javax.swing.JTextField Status;
    private javax.swing.JButton addButton;
    private javax.swing.JButton backButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel lblAdmin;
    private javax.swing.JPanel manageRoomPanel;
    private javax.swing.JScrollPane roomDetailsJScrollPanel;
    private javax.swing.JTable roomDetailsTable;
    private javax.swing.JComboBox<String> roomTypeOption;
    private javax.swing.JTextField searchBar;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
