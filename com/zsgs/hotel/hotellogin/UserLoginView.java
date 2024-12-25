package com.zsgs.hotel.hotellogin;

import com.zsgs.hotel.forget.ForgetView;
import com.zsgs.hotel.main.UserMainView;
import com.zsgs.hotel.util.Read;

public class UserLoginView implements LoginListener{

    private LoginModel loginModel;

    public UserLoginView(){
        LoginListener loginListener = this;
        loginModel = new LoginModel(loginListener);
    }

    public void init(){
        getUserLoginCredential();
    }

    private void getUserLoginCredential() {
        System.out.println("\n------- User Login -------");
        System.out.print("Email : ");
        String email = Read.getScanner().next();
        System.out.print("Password : ");
        String password = Read.getScanner().next();
        loginModel.authenticate(email,password);
    }

    @Override
    public void onLoginFailed(String error) {
        System.out.println(error);
        if(error.equals("Wrong Password !")){
            System.out.println("1. Retry");
            System.out.println("2. ForgetPassword");
            System.out.print("Enter your choice : ");
            switch (Read.getScanner().nextInt()){
                case 1:
                    init();
                    break;
                case 2:
                    new ForgetView().init();
                    break;
            }
        }
        if(error.equals("Email not found.")){
            System.out.println("1. Retry");
            System.out.println("2. GoBack");
            System.out.print("Enter your choice : ");
            switch (Read.getScanner().nextInt()){
                case 1:
                    init();
                    break;
                case 2:
                    new ForgetView().init();
                    break;
            }
        }
    }

    @Override
    public void onLoginSuccess() {
        System.out.println("Login Successfully");
        new UserMainView().init();
    }
}
