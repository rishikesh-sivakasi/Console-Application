package com.zsgs.hotel;

import com.zsgs.hotel.hotellogin.LoginAndSignup;
import com.zsgs.hotel.util.Read;

public class HotelManagementApplication {
    private static HotelManagementApplication hotelManagementApplication;
    private HotelManagementApplication(){}

    public static HotelManagementApplication getInstance(){
        if (hotelManagementApplication == null){
            hotelManagementApplication = new HotelManagementApplication();
        }
        return hotelManagementApplication;
    }

    public String getName(){
        return HotelManagementApplication.class.getSimpleName();
    }

    public String getVersion(){
        return "0.0.1";
    }

    public static void main(String[] args) {
        getInstance().init();
        Read.getScanner().close();
    }

    private void init(){
        new LoginAndSignup().init();

    }
}
