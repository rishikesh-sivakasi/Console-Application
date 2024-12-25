package com.zsgs.hotel.hotelsignup;

import com.zsgs.hotel.main.UserMainView;
import com.zsgs.hotel.util.Read;

public class UserSignupView implements ShowValidateListener {
    private SignupModel signupModel;
    public UserSignupView(){
        ShowValidateListener showValidateListener = this;
        signupModel = new SignupModel(showValidateListener);
    }

    public void init(){
        getUserInfo();
    }

    private void getUserInfo() {
        System.out.println("\n------- User Signup -------");
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
        signupModel.validate(name,email,password,"user",phoneNumber,securityQuestion);
    }

    @Override
    public void alert(String error) {
        System.out.println(error);
        init();
    }

    @Override
    public void onSuccess() {
        System.out.println("User registered successfully");
        new UserMainView().init();
    }
}
