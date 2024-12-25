package com.zsgs.library;

import com.zsgs.library.login.LoginView;

public class LibraryApplication {
    private static LibraryApplication libraryapplication;
    private LibraryApplication(){}

    public static LibraryApplication getInstance(){
        if(libraryapplication == null){
            libraryapplication = new LibraryApplication();
        }
        return libraryapplication;
    }

    public String getName(){
        return LibraryApplication.class.getSimpleName();
    }

    public String getVersion(){
        return "0.0.1";
    }

    public static void main(String[] args) {
        getInstance().init();
    }

    private void init(){
        new LoginView().getLibrarianInfo();
    }

}
