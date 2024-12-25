package com.zsgs.hotel.main;

import com.zsgs.hotel.HotelManagementApplication;
import com.zsgs.hotel.hotellogin.LoginAndSignup;
import com.zsgs.hotel.repository.HotelRepository;
import com.zsgs.hotel.util.Read;

public class AdminMainView {

    public AdminMainView(){}

    public void init() {
        getChoice();
    }

    private void getChoice() {
        int choice;
        do{
            System.out.println("\n ------- Welcome to "+ HotelManagementApplication.getInstance().getName()+"-------");
            System.out.println("1. Add room");
            System.out.println("2. Delete room");
            System.out.println("3. Modify room");
            System.out.println("4. Display Booked rooms information");
            System.out.println("9. Exit");
            System.out.println("0. Logout");
            System.out.print("Enter your choice : ");
            choice = Read.getScanner().nextInt();
            switch (choice){
                case 1:
                    System.out.println(HotelRepository.getInstance().getHotelList());
                    break;
                case 2:
                    System.out.println(HotelRepository.getInstance().getUserList());
                    break;
                case 3:
                    System.out.println(HotelRepository.getInstance().getAdminList());
                    break;
                case 4:
                    System.out.println(HotelRepository.getInstance().getRoomList());
                    break;
                case 0:
                    new LoginAndSignup().init();
                    return;
            }
        }while(choice != 9 );
    }
}
