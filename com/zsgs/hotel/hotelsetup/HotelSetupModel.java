package com.zsgs.hotel.hotelsetup;

import com.zsgs.hotel.dto.Hotel;
import com.zsgs.hotel.dto.User;
import com.zsgs.hotel.repository.HotelRepository;

class HotelSetupModel {
    private SetupListener setupListener;
    HotelSetupModel(SetupListener setupListener){
        this.setupListener = setupListener;
    }

    public void validate(String hotelName, String location, float starRatings, String facilities, int totalRooms) {

        if (hotelName == null || hotelName.trim().isEmpty()) {
            setupListener.alert("Hotel name cannot be null or empty.");
        }
        if (location == null || location.trim().isEmpty()) {
            setupListener.alert("Location cannot be null or empty.");
        }
        if (starRatings < 0 && starRatings >= 5) {
            setupListener.alert("StarRatings must be 0 - 5 .");
        }
        if(totalRooms < 0){
            setupListener.alert("Total Rooms must be greater than 0");
        }

        HotelRepository.getInstance().addHotel(new Hotel(hotelName, location, starRatings, facilities, totalRooms, 0 , totalRooms));

        setupListener.onSetupSuccess();
    }

}
