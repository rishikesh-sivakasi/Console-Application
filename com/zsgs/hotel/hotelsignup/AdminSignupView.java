package com.zsgs.hotel.hotelsignup;

import com.zsgs.hotel.hotelsetup.HotelSetupView;
import com.zsgs.hotel.util.Read;

public class AdminSignupView implements ShowValidateListener {
    private SignupModel signupModel;

    public AdminSignupView(){
        ShowValidateListener showValidateListener = this;
        signupModel = new SignupModel(showValidateListener);
    }

    public void init(){
        getAdminInfo();
    }

    private void getAdminInfo() {
        System.out.println("\n------- Admin Signup -------");
        System.out.print("Name : ");
        String name = Read.getScanner().next();
        System.out.print("Email : ");
        String email = Read.getScanner().next();
        System.out.print("Password : ");
        String password = Read.getScanner().next();
        System.out.print("PhoneNumber : ");
        String phoneNumber = Read.getScanner().next();
        System.out.print("Nick Name : ");
        String securityQuestion = Read.getScanner().next();
        signupModel.validate(name,email,password,"admin",phoneNumber,securityQuestion);
    }

    @Override
    public void alert(String error) {
        System.out.println(error);
        init();
    }

    @Override
    public void onSuccess() {
        System.out.println("Signup Successfully !");
        new HotelSetupView().init();
    }
}
