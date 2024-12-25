package com.zsgs.hotel.dto;

public class Room {
    private int id;
    private int hotelId;
    private int roomNumber;
    private String roomType;
    private int roomCapacity;
    private String bedType;
    private double pricePreNight;
    private boolean isAvailable;
    private static int sno = 0;

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getRoomCapacity() {
        return roomCapacity;
    }

    public void setRoomCapacity(int roomCapacity) {
        this.roomCapacity = roomCapacity;
    }

    public String getBedType() {
        return bedType;
    }

    public void setBedType(String bedType) {
        this.bedType = bedType;
    }

    public double getPricePreNight() {
        return pricePreNight;
    }

    public void setPricePreNight(double pricePreNight) {
        this.pricePreNight = pricePreNight;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public Room(String roomType, int roomCapacity, String bedType, double pricePreNight){
        sno = sno + 1;
        id = sno;
        hotelId = Hotel.sno;
        this.roomNumber = sno;
        this.roomType = roomType;
        this.roomCapacity = roomCapacity;
        this.bedType = bedType;
        this.pricePreNight = pricePreNight;
        isAvailable = true;
    }

    public int hashCode(){
        return getRoomNumber();
    }

    @Override
    public String toString() {
        return "Room Details {" +
                ", Room Number: " + roomNumber +
                ", Hotel ID: " + hotelId +
                ", Room Type: '" + roomType + '\'' +
                ", Capacity: " + roomCapacity +
                ", Bed Type: '" + bedType + '\'' +
                ", Price Per Night: $" + pricePreNight +
                ", Availability: " + (isAvailable ? "Available" : "Not Available") +
                "}\n";
    }

}
