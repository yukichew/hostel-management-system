package javaassignment.model;

public enum RoomType {
    DELUXESINGLE("Deluxe Single Room"),
    SINGLE("Single Room"),
    DELUXETWINS("Deluxe Twins Room"),
    TWINS("Twins Room");

    private String name;

    private RoomType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getRoomType() {
        return this.name;
    }
}
