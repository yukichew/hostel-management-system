
package javaassignment.admin.adminservices;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import javaassignment.model.Room;
import javaassignment.model.RoomType;
import static javaassignment.model.RoomType.DELUXESINGLE;
import static javaassignment.model.RoomType.DELUXETWINS;
import static javaassignment.model.RoomType.SINGLE;
import static javaassignment.model.RoomType.TWINS;
import javaassignment.model.roomsubclass.DeluxeSingle;
import javaassignment.model.roomsubclass.DeluxeTwin;
import javaassignment.model.roomsubclass.SingleRoom;
import javaassignment.model.roomsubclass.TwinRoom;
import static javaassignment.student.studentservices.RoomData.rooms;

/**
 *
 * @author NG WAN YUNG
 */
public class ManageRoomData {
    
    public static ArrayList<Room> rooms = new ArrayList<Room>();
    private RoomType[] roomTypes = {RoomType.DELUXESINGLE, RoomType.DELUXETWINS, RoomType.SINGLE, RoomType.TWINS};
    
    public static void read() {
        String line;
        try {
            BufferedReader br = new BufferedReader(new FileReader("room.txt"));
            while ((line = br.readLine()) != null) {
                String[] roomLine = line.split(";");
                int roomNumber = Integer.parseInt(roomLine[0]);
                double roomPrice = Double.parseDouble(roomLine[1]);
                int roomCapacity = Integer.parseInt(roomLine[2]);

                RoomType roomType = RoomType.valueOf(roomLine[3]);
                Room room = null;
                switch (roomType) {
                    case SINGLE:
                        room = new SingleRoom(roomNumber, roomPrice, roomCapacity);
                        break;
                    case TWINS:
                        room = new TwinRoom(roomNumber, roomPrice, roomCapacity);
                        break;
                    case DELUXESINGLE:
                        room = new DeluxeSingle(roomNumber, roomPrice, roomCapacity);
                        break;
                    case DELUXETWINS:
                        room = new DeluxeTwin(roomNumber, roomPrice, roomCapacity);
                        break;
                }
                room.setRoomAvailability();

                if (room != null) {
                    rooms.add(room);
                }
            }
        } catch (Exception e) {
            System.out.println("Error in read ...");
            e.printStackTrace();
        }
    }
    
     public static void write() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("room1.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("room.txt"));
            for (int i = 0; i < rooms.size(); i++) {
                Room room = rooms.get(i);
                writer.write(room.getRoomNumber() + ";"
                        + room.getRoomPrice() + ";"
                        + room.getRoomCapacity() + ";"
                        + room.getRoomType());
                writer.newLine();
            }
            writer.close();
        } catch (Exception e) {
            System.out.println("Error in write ...");
        }
    }
     
     
     public RoomType getRoomTypeByName(String name){
         for (RoomType roomType : roomTypes){
             if(roomType.getName().equals(name)){
                 return roomType;
             }
         }
         return null;
     }
     
     public static void update(RoomType selectedRoomType) {
    try {
        BufferedWriter writer = new BufferedWriter(new FileWriter("room1.txt"));
        for (int i = 0; i < rooms.size(); i++) {
            Room room = rooms.get(i);
            if (room.getRoomType() == selectedRoomType) {
                writer.write(room.getRoomNumber() + ";"
                        + room.getRoomPrice() + ";"
                        + room.getRoomCapacity() + ";"
                        + room.getRoomType().toString());
                writer.newLine();
            }
        }
        writer.close();
    } catch (Exception e) {
        System.out.println("Error in write ...");
        e.printStackTrace();
    }
    
    
}
     
     public ArrayList<Room> getRooms() {
    return rooms;
}
}
    
    
  