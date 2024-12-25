package com.zsgs.theatre.login;

import com.zsgs.theatre.TheatreApplication;

import java.util.Scanner;

public class LoginView {
    private LoginModel loginModel;
    public LoginView(){
        loginModel = new LoginModel(this);
    }

    public void getLoginInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to "+ TheatreApplication.getInstance().getName());
        System.out.println("Version : "+ TheatreApplication.getInstance().getVersion());
        System.out.print("Email : ");
        String email = sc.next();
        System.out.print("Password : ");
        String password = sc.next();
        System.out.println("Please Wait !");
        loginModel.authenticate(email,password);
    }

    public void onLoginSuccess() {
        System.out.println("Login Successful");
    }

    public void onLoginFailed(String error) {
        System.out.println(error);
        getLoginInfo();
    }
}
