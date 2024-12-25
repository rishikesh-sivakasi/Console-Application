package com.zsgs.hotel.main;

import com.zsgs.hotel.HotelManagementApplication;
import com.zsgs.hotel.hotellogin.LoginAndSignup;
import com.zsgs.hotel.repository.HotelRepository;
import com.zsgs.hotel.util.Read;

public class UserMainView {

    public UserMainView(){

    }

    public void init() {
        getChoice();
    }

    public void getChoice(){
        int choice;
        do{
            System.out.println("\n ------- Welcome to "+ HotelManagementApplication.getInstance().getName()+"-------");
            System.out.println("1. Booking rooms ");
            System.out.println("2. Display booked rooms");
            System.out.println("9. Exit");
            System.out.println("0. Logout");
            System.out.print("Enter your choice : ");
            choice = Read.getScanner().nextInt();
            switch (choice){
                case 1:
                    System.out.println("Room Booked");
                    break;
                case 2:
                    System.out.println("Report");
                    break;
                case 0:
                    new LoginAndSignup().init();
                    return;
            }
        }while(choice != 9 );
    }
}
