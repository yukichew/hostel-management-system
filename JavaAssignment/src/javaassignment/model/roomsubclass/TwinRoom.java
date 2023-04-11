package javaassignment.model.roomsubclass;

import javaassignment.model.Room;
import javaassignment.model.RoomType;

public class TwinRoom extends Room {

    public TwinRoom(int roomNumber, double roomPrice, int roomCapacity) {
        super(roomNumber, roomPrice, roomCapacity);
    }

//    public boolean isFullyOccupied() {
//        return getRoomCapacity() == 2;
//    }
    public boolean hasOneSeatLeft() {
        return getRoomCapacity() == 1;
    }

    @Override
    public RoomType getRoomType() {
        return RoomType.TWINS;
    }

    public void setRoomAvailability() {
        if (getRoomCapacity() == 0 || getRoomCapacity() == 1) {
            setRoomAvailability(true);
        } else {
            setRoomAvailability(false);
        }
    }

}
