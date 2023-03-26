package javaassignment.model;

import java.util.ArrayList;
import java.util.List;
import javaassignment.model.roomsubclass.SingleRoom;
import javaassignment.model.roomsubclass.TwinRoom;

public class Hostel {

    private List<Room> rooms;
    private int numberOfDeluxeSingleRooms;
    private int numberOfSingleRooms;
    private int numberOfDeluxeTwinRooms;
    private int numberOfTwinRooms;

    public Hostel() {
        rooms = new ArrayList<>();
        numberOfDeluxeSingleRooms = 0;
        numberOfSingleRooms = 0;
        numberOfDeluxeTwinRooms = 0;
        numberOfTwinRooms = 0;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    public int getNumberOfDeluxeSingleRooms() {
        return numberOfDeluxeSingleRooms;
    }

    public void setNumberOfDeluxeSingleRooms(int numberOfDeluxeSingleRooms) {
        this.numberOfDeluxeSingleRooms = numberOfDeluxeSingleRooms;
    }

    public int getNumberOfSingleRooms() {
        return numberOfSingleRooms;
    }

    public void setNumberOfSingleRooms(int numberOfSingleRooms) {
        this.numberOfSingleRooms = numberOfSingleRooms;
    }

    public int getNumberOfDeluxeTwinRooms() {
        return numberOfDeluxeTwinRooms;
    }

    public void setNumberOfDeluxeTwinRooms(int numberOfDeluxeTwinRooms) {
        this.numberOfDeluxeTwinRooms = numberOfDeluxeTwinRooms;
    }

    public int getNumberOfTwinRooms() {
        return numberOfTwinRooms;
    }

    public void setNumberOfTwinRooms(int numberOfTwinRooms) {
        this.numberOfTwinRooms = numberOfTwinRooms;
    }

    public static List<SingleRoom> getAvailableSingleRooms(List<Room> rooms) {
        List<SingleRoom> availableSingleRooms = new ArrayList<>();
        for (Room room : rooms) {
            if (room.getRoomType() == RoomType.SINGLE && room.isRoomAvailability()) {
                availableSingleRooms.add((SingleRoom) room);
            }
        }
        return availableSingleRooms;
    }

    public static List<TwinRoom> getAvailableTwinRooms(List<Room> rooms) {
        List<TwinRoom> availableTwinRooms = new ArrayList<>();
        for (Room room : rooms) {
            if (room.getRoomType() == RoomType.TWINS && room.isRoomAvailability()) {
                availableTwinRooms.add((TwinRoom) room);
            }
        }
        return availableTwinRooms;
    }

//    public void addRoom(Room room) {
//        rooms.add(room);
//        if (room.getRoomType() == RoomType.SINGLE) {
//            setNumberOfSingleRooms(numberOfSingleRooms++);
//        }
//    }
}
