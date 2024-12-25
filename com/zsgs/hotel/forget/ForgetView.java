package com.zsgs.hotel.forget;

import com.zsgs.hotel.hotellogin.LoginAndSignup;
import com.zsgs.hotel.hotelsignup.ShowValidateListener;
import com.zsgs.hotel.util.Read;

public class ForgetView implements ShowValidateListener {

    private ForgetModel forgetModel;

    public ForgetView(){
        ShowValidateListener showValidateListener = this;
        forgetModel = new ForgetModel(showValidateListener);
    }


    public void init(){
        getForgetPasswordInfo();
    }

    private void getForgetPasswordInfo() {
        System.out.print("Email : ");
        String email = Read.getScanner().next();
        System.out.print("Nick Name : ");
        String nickName = Read.getScanner().next();
        System.out.print("New Password : ");
        String newPassword = Read.getScanner().next();
        forgetModel.validate(email,nickName,newPassword);
    }

    @Override
    public void alert(String error) {
        System.out.println(error);
        init();
    }

    @Override
    public void onSuccess() {
        System.out.println("Password changed successfully");
        new LoginAndSignup().init();
    }
}
