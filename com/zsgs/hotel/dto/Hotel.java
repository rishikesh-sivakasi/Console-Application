package com.zsgs.hotel.dto;


public class Hotel {

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getTotalRooms() {
        return totalRooms;
    }

    public void setTotalRooms(int totalRooms) {
        this.totalRooms = totalRooms;
    }

    public int getAvailableRooms() {
        return availableRooms;
    }

    public void setAvailableRooms(int availableRooms) {
        this.availableRooms = availableRooms;
    }

    public int getBookedRooms() {
        return bookedRooms;
    }

    public void setBookedRooms(int bookedRooms) {
        this.bookedRooms = bookedRooms;
    }

    public float getStarRatings() {
        return starRatings;
    }

    public void setStarRatings(float starRatings) {
        this.starRatings = starRatings;
    }

    public String getFacilities() {
        return facilities;
    }

    public void setFacilities(String facilities) {
        this.facilities = facilities;
    }

    public int getId() {
        return id;
    }
    private int id;
    private String hotelName;
    private String location;
    private float starRatings;
    private String facilities;
    private int totalRooms;
    private int availableRooms;
    private int bookedRooms;
    public static int sno = 0;

    public Hotel(String hotelName, String location, float starRatings, String facilities, int totalRooms, int bookedRooms, int availableRooms){
        sno = sno + 1;
        id = sno;
        this.hotelName = hotelName;
        this.location = location;
        this.starRatings = starRatings;
        this.facilities = facilities;
        this.totalRooms = totalRooms;
        this.bookedRooms = bookedRooms;
        this.availableRooms = availableRooms;
    }

    public int hashCode(){
        return hotelName.hashCode();
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "id=" + id +
                ", hotelName='" + hotelName + '\'' +
                ", location='" + location + '\'' +
                ", starRatings=" + starRatings +
                ", facilities='" + facilities + '\'' +
                ", Total Rooms='" + totalRooms + '\'' +
                "}\n";
    }
}
