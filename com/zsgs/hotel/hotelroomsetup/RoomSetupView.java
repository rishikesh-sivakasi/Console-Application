package com.zsgs.hotel.hotelroomsetup;

import com.zsgs.hotel.hotelsetup.SetupListener;
import com.zsgs.hotel.main.AdminMainView;
import com.zsgs.hotel.repository.HotelRepository;
import com.zsgs.hotel.util.Read;

public class RoomSetupView implements SetupListener {
    private RoomSetupModel roomSetupModel;
    public RoomSetupView(){
        SetupListener setupListener = this;
        roomSetupModel = new RoomSetupModel(setupListener);
    }


    public void init(){
        getRoomInfo();
    }
    public void getRoomInfo(){
        System.out.println("-------Room Setup-------");
        int totalRooms = HotelRepository.getInstance().currentAdminTotalRoom();
        for(int i=1; i<=totalRooms; i++){
            System.out.print("Room "+i+" Type (e.g : Standard,Deluxe,Suite) : ");
            String roomType = Read.getScanner().next();
            System.out.print("Room "+i+" Capacity (e.g : 2 , 3) : ");
            int roomCapacity = Read.getScanner().nextInt();
            System.out.print("Bed Type (e.g : King,Queen,Single,Double) : ");
            Read.getScanner().nextLine();
            String bedType = Read.getScanner().next();
            System.out.print("Price Pre Night (e.g : 1000 , 1500) : ");
            double pricePreNight = Read.getScanner().nextDouble();
            roomSetupModel.validate(roomType,roomCapacity,bedType,pricePreNight);
            System.out.println("Room "+i+" Setup Successfully");
        }
        onSetupSuccess();
    }

    @Override
    public void alert(String error) {
        System.out.println(error);
        init();
    }

    @Override
    public void onSetupSuccess() {
        System.out.println("Room setup Successfully");
        new AdminMainView().init();
    }

}
