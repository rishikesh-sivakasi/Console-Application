package com.zsgs.hotel.dto;

public class Admin extends User{
    private int hotelId;

    public int getHotelId() {
        return hotelId;
    }

    public void setHotelId(int hotelId) {
        this.hotelId = hotelId;
    }

    private static int sno = 0;
    public Admin(String name, String email, String password, String role, String phoneNumber, String securityQuestion){
        super(name, email, password, role, phoneNumber, securityQuestion);
        sno = sno + 1;
        hotelId = sno;
    }

    public int hashCode(){
        return this.email.hashCode();
    }

    public String toString(){
        return "Admin{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                "}\n";
    }

}
