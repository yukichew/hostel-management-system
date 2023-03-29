package javaassignment.model;

/**
 *
 * @author yukichew
 */
public class CustomerBookingRoom {
    private Room room;
    private int quantity;
    private double subtotalPrice;

    public CustomerBookingRoom(Room room, int quantity, double subtotalPrice) {
        this.room = room;
        this.quantity = quantity;
        this.subtotalPrice = subtotalPrice;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getSubtotalPrice() {
        return subtotalPrice;
    }

    public void setSubtotalPrice(double subtotalPrice) {
        this.subtotalPrice = subtotalPrice;
    }  
}