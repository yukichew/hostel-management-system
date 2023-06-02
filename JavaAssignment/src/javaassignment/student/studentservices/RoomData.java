package javaassignment.student.studentservices;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import javaassignment.model.Room;
import javaassignment.model.RoomType;
import javaassignment.model.roomsubclass.*;

/**
 *
 * @author yukichew
 */
public class RoomData {

    public static ArrayList<Room> rooms = new ArrayList<Room>();

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
            Collections.sort(rooms, Comparator.comparingInt(Room::getRoomNumber));
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

    public static Room checkAvailableRoomType(RoomType roomtype) {
        for (Room room : rooms) {
            if (room.getRoomType() == roomtype && room.isRoomAvailability()) {
                return room;
            }
        }
        return null;
    }

    public static Room checkRoom(int roomNumber) {
        Room found = null;
        for (int i = 0; i < rooms.size(); i++) {
            Room s = rooms.get(i);
            if (roomNumber == s.getRoomNumber()) {
                found = s;
                break;
            }
        }
        return found;
    }

    public static ArrayList<Room> checkAvailableRooms() {
        ArrayList<Room> availableRooms = new ArrayList<Room>();
        for (Room room : rooms) {
            if (room.isRoomAvailability()) {
                availableRooms.add(room);
            }
        }
        return availableRooms;
    }

    public static int getAvailableRoomCount(RoomType roomType) {
        int count = 0;
        for (Room room : rooms) {
            if (room.getRoomType() == roomType && room.isRoomAvailability()) {
                count++;
            }
        }
        return count;
    }

}
