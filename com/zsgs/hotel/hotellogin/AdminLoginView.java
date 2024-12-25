package com.zsgs.hotel.hotellogin;

import com.zsgs.hotel.util.Read;

public class AdminLoginView implements LoginListener{
    private LoginModel loginModel;

    public AdminLoginView(){
        LoginListener loginListener = this;
        loginModel = new LoginModel(loginListener);
    }

    public void init(){
        getAdminLoginCredentials();
    }

    private void getAdminLoginCredentials() {
        System.out.println("\n------- Admin Login -------");
        System.out.print("Email :");
        String email = Read.getScanner().next();
        System.out.print("Password : ");
        String password = Read.getScanner().next();
        loginModel.authenticate(email,password);
    }

    @Override
    public void onLoginFailed(String error) {
        System.out.println(error);
        init();
    }

    @Override
    public void onLoginSuccess() {
        System.out.println("Login Successfully");
    }
}
