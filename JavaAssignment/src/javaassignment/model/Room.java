package javaassignment.model;

/**
 *
 * @author yukichew
 */
public abstract class Room {

    private int roomNumber;
    private int roomCapacity;
    private double roomPrice;
    private boolean roomAvailability;

    public Room(int roomNumber, double roomPrice, int roomCapacity) {
        this.roomNumber = roomNumber;
        this.roomPrice = roomPrice;
        this.roomCapacity = roomCapacity;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getRoomCapacity() {
        return roomCapacity;
    }

    public void setRoomCapacity(int roomCapacity) {
        this.roomCapacity = roomCapacity;
    }

    public double getRoomPrice() {
        return roomPrice;
    }

    public void setRoomPrice(double roomPrice) {
        this.roomPrice = roomPrice;
    }

    public boolean isRoomAvailability() {
        return roomAvailability;
    }

    public void setRoomAvailability(boolean roomAvailability) {
        this.roomAvailability = roomAvailability;
    }

    public void setRoomAvailability() {
        if (getRoomCapacity() == 0) {
            setRoomAvailability(true);
        } else {
            setRoomAvailability(false);
        }
    }

    public abstract RoomType getRoomType();
}
