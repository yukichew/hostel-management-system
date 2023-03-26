package javaassignment.model.roomsubclass;

import javaassignment.model.Room;
import javaassignment.model.RoomType;

public class DeluxeSingle extends Room {

    public DeluxeSingle(int roomNumber, double roomPrice) {
        super(roomNumber, roomPrice);
    }

    @Override
    public RoomType getRoomType() {
        return RoomType.DELUXESINGLE;
    }
}
