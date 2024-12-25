package com.zsgs.hotel.hotelroomsetup;

import com.zsgs.hotel.hotelsetup.SetupListener;
import com.zsgs.hotel.repository.HotelRepository;

public class RoomSetupModel {
    private SetupListener setupListener;

    public RoomSetupModel(SetupListener setupListener){
        this.setupListener = setupListener;
    }

    public void validate(String roomType, int roomCapacity, String bedType, double pricePerNight) {

        if (roomType == null || roomType.trim().isEmpty()) {
            setupListener.alert("Room type cannot be null or empty.");
        }
        if (!roomType.equalsIgnoreCase("Standard") &&
                !roomType.equalsIgnoreCase("Deluxe") &&
                !roomType.equalsIgnoreCase("Suite")) {
            setupListener.alert("Invalid room type. Allowed values: Standard, Deluxe, Suite.");
        }

        if (roomCapacity <= 0) {
            setupListener.alert("Room capacity must be greater than 0.");
        }

        if (bedType == null || bedType.trim().isEmpty()) {
            setupListener.alert("Bed type cannot be null or empty.");
        }
        if (!bedType.equalsIgnoreCase("Single") &&
                !bedType.equalsIgnoreCase("Double") &&
                !bedType.equalsIgnoreCase("Queen") &&
                !bedType.equalsIgnoreCase("King")) {
            setupListener.alert("Invalid bed type. Allowed values: Single, Double, Queen, King.");
        }

        if (pricePerNight <= 0) {
            setupListener.alert("Price per night must be greater than 0.");
        }

        HotelRepository.getInstance().addRoom(roomType,roomCapacity,bedType,pricePerNight);

    }

}
