package com.zsgs.hotel.hotellogin;

import com.zsgs.hotel.HotelManagementApplication;
import com.zsgs.hotel.hotelsignup.AdminSignupView;
import com.zsgs.hotel.hotelsignup.UserSignupView;
import com.zsgs.hotel.util.Read;

public class LoginAndSignup {
    public void init(){
        getUserInput();
    }

    private void getUserInput() {
        System.out.println("\n------- Welcome to "+ HotelManagementApplication.getInstance().getName()+" -------");
        System.out.println("------- App-Version : "+HotelManagementApplication.getInstance().getVersion()+" -------");
        System.out.println("1. Login");
        System.out.println("2. Signup");
        System.out.print("Enter your choice : ");
        if (Read.getScanner().nextInt() == 1){
            System.out.println("1. Admin");
            System.out.println("2. User");
            System.out.print("Enter your choice : ");
            if (Read.getScanner().nextInt() == 1){
                new AdminLoginView().init();
            }else{
                new UserLoginView().init();
            }
        }else{
            System.out.println("1. Admin");
            System.out.println("2. User");
            System.out.print("Enter your choice : ");
            if (Read.getScanner().nextInt() == 1){
                new AdminSignupView().init();
            }else{
                new UserSignupView().init();
            }
        }
    }
}
