package com.zsgs.library.login;

import com.zsgs.library.LibraryApplication;

import java.util.Scanner;

public class LoginView {
    private LoginModel loginModel;
    public LoginView(){
        loginModel = new LoginModel(this);
    }

    public void getLibrarianInfo(){
        System.out.println("Welcome to "+ LibraryApplication.getInstance().getName());
        System.out.println("Version : "+ LibraryApplication.getInstance().getVersion());
        Scanner scanner = new Scanner(System.in);
        System.out.print("Email : ");
        String email = scanner.next();
        System.out.print("Password :");
        String password = scanner.next();
        System.out.println("Please Wait");
        loginModel.authenticate(email,password);
        scanner.close();
    }

    public void onLoginSuccess(){
        System.out.println("Login Successful");
    }

    public void onLoginFailed(String error){
        System.out.println(error);
        getLibrarianInfo();
    }

    public void getForgetPassword(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the email : ");
        String email = sc.next();
    }

    public void onForgetPasswordSuccess(){
        System.out.println("Login Successful");
    }

    public void onForgetPasswordFailed(String error){
        System.out.println(error);
        getLibrarianInfo();
    }
}
