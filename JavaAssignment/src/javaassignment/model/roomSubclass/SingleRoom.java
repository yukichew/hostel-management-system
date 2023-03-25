package javaassignment.model.roomSubclass;

import javaassignment.model.Room;
import javaassignment.model.RoomType;

public class SingleRoom extends Room {

    public SingleRoom(int roomNumber, double roomPrice) {
        super(roomNumber, roomPrice);
    }

    @Override
    public RoomType getRoomType() {
        return RoomType.SINGLE;
    }
   
}
