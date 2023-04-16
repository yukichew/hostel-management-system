package javaassignment.model.roomsubclass;

import javaassignment.model.Room;
import javaassignment.model.RoomType;

public class DeluxeTwin extends Room {

    public DeluxeTwin(int roomNumber, double roomPrice, int roomCapacity) {
        super(roomNumber, roomPrice, roomCapacity);
    }

    @Override
    public RoomType getRoomType() {
        return RoomType.DELUXETWINS;
    }
    
    @Override
    public void setRoomAvailability() {
        if (getRoomCapacity() == 0 || getRoomCapacity() == 1) {
            setRoomAvailability(true);
        } else {
            setRoomAvailability(false);
        }
    }

}
