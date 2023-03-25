package javaassignment.model.roomSubclass;

import javaassignment.model.Room;
import javaassignment.model.RoomType;

public class DeluxeTwin extends Room {

    public DeluxeTwin(int roomNumber, double roomPrice) {
        super(roomNumber, roomPrice);
    }

    @Override
    public RoomType getRoomType() {
        return RoomType.DELUXETWINS;
    }
}