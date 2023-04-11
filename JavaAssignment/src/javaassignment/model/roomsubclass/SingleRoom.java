package javaassignment.model.roomsubclass;

import javaassignment.model.Room;
import javaassignment.model.RoomType;

public class SingleRoom extends Room {

    public SingleRoom(int roomNumber, double roomPrice, int roomCapacity) {
        super(roomNumber, roomPrice, roomCapacity);
    }

    @Override
    public RoomType getRoomType() {
        return RoomType.SINGLE;
    }

    public boolean isFullyOccupied() {
        return getRoomCapacity() == 1;
    }

}
