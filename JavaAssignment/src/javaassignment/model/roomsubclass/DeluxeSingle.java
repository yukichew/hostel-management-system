package javaassignment.model.roomsubclass;

import javaassignment.model.Room;
import javaassignment.model.RoomType;

public class DeluxeSingle extends Room {

    public DeluxeSingle(int roomNumber, double roomPrice, int roomCapacity) {
        super(roomNumber, roomPrice, roomCapacity);
    }

    @Override
    public RoomType getRoomType() {
        return RoomType.DELUXESINGLE;
    }

}
