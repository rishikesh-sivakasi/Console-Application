package com.zsgs.theatre;

import com.zsgs.theatre.login.LoginView;

public class TheatreApplication {
    private static TheatreApplication theatreApplication;
    private TheatreApplication(){}

    public static TheatreApplication getInstance(){
        return theatreApplication = (theatreApplication == null) ? new TheatreApplication() : theatreApplication;
    }

    public String getName(){
        return TheatreApplication.class.getSimpleName();
    }

    public String getVersion(){
        return "0.0.1";
    }
    public static void main(String[] args) {
        getInstance().init();
    }

    private void init(){
        new LoginView().getLoginInfo();
    }
}
