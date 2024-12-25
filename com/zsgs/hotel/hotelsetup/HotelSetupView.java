package com.zsgs.hotel.hotelsetup;

import com.zsgs.hotel.hotelroomsetup.RoomSetupView;
import com.zsgs.hotel.main.AdminMainView;
import com.zsgs.hotel.util.Read;

public class HotelSetupView implements SetupListener{
    private HotelSetupModel hotelSetupModel;

    public HotelSetupView(){
        SetupListener setupListener = this;
        hotelSetupModel = new HotelSetupModel(setupListener);
    }

    public void init(){
        getHotelInfo();
    }

    private void getHotelInfo() {
        System.out.println("\n--------- Hotel Setup ---------");
        Read.getScanner().nextLine();
        System.out.print("Hotel Name : ");
        String hotelName = Read.getScanner().nextLine();
        System.out.print("Hotel Location : ");
        String location = Read.getScanner().next();
        System.out.print("Star Ratings : ");
        float starRatings = Read.getScanner().nextFloat();
        Read.getScanner().nextLine();
        System.out.print("Facilities : ");
        String facilities = Read.getScanner().nextLine();
        System.out.print("Total Rooms : ");
        int totalRooms = Read.getScanner().nextInt();
        hotelSetupModel.validate(hotelName,location,starRatings,facilities,totalRooms);
    }

    @Override
    public void alert(String error) {
        System.out.println(error);
        init();
    }

    @Override
    public void onSetupSuccess() {
        System.out.println("Hotel Setup Successfully");
        new RoomSetupView().init();
    }

}
