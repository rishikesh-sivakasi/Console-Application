package com.zsgs.hotel.addroom;

import com.zsgs.hotel.hotelroomsetup.RoomSetupModel;
import com.zsgs.hotel.hotelsetup.SetupListener;
import com.zsgs.hotel.main.AdminMainView;
import com.zsgs.hotel.repository.HotelRepository;
import com.zsgs.hotel.util.Read;

import java.sql.SQLOutput;

public class AddRoomView implements SetupListener {
    private RoomSetupModel roomSetupModel;

    public AddRoomView(){
        SetupListener setupListener = this;
        roomSetupModel = new RoomSetupModel(setupListener);
    }
    public void init(){
        getAddRoomInfo();
    }
    public void getAddRoomInfo(){
        System.out.print("Room Type (e.g : Standard,Deluxe,Suite) : ");
        String roomType = Read.getScanner().next();
        System.out.print("Room Capacity (e.g : 2 , 3) : ");
        int roomCapacity = Read.getScanner().nextInt();
        System.out.print("Bed Type (e.g : King,Queen,Single,Double) : ");
        Read.getScanner().nextLine();
        String bedType = Read.getScanner().next();
        System.out.print("Price Pre Night (e.g : 1000 , 1500) : ");
        double pricePreNight = Read.getScanner().nextDouble();
        roomSetupModel.validate(roomType,roomCapacity,bedType,pricePreNight);
        onSetupSuccess();
    }

    @Override
    public void alert(String error) {
        System.out.println(error);
        init();
    }

    @Override
    public void onSetupSuccess() {
        System.out.println("New room add Successfully");
        new AdminMainView().init();
    }
}
