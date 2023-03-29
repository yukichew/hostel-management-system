package javaassignment.model;

/**
 *
 * @author yukichew
 */

public abstract class Room {

    private int roomNumber;
    private double roomPrice;
    private boolean roomAvailability;
    private int roomCapacity;

    public Room(int roomNumber, double roomPrice) {
        this.roomNumber = roomNumber;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public double getRoomPrice() {
        return roomPrice;
    }

    public boolean isRoomAvailability() {
        return roomAvailability;
    }

    public int getRoomCapacity() {
        return roomCapacity;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void setRoomPrice(double roomPrice) {
        this.roomPrice = roomPrice;
    }

    public void setRoomAvailability(boolean roomAvailability) {
        this.roomAvailability = roomAvailability;
    }

    public void setRoomCapacity(int roomCapacity) {
        this.roomCapacity = roomCapacity;
    }

    public abstract RoomType getRoomType();
}