package javaassignment.model.roomSubclass;

import javaassignment.model.Room;
import javaassignment.model.RoomType;

public class TwinRoom extends Room {

    public TwinRoom(int roomNumber, double roomPrice) {
        super(roomNumber, roomPrice);
    }

    @Override
    public RoomType getRoomType() {
        return RoomType.TWINS;
    }

    public boolean isFullyOccupied() {
        return getRoomCapacity() == 2;
    }

    public boolean hasOneSeatLeft() {
        return getRoomCapacity() == 1;
    }
}
