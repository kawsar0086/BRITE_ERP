package com.briteerp.utilities;

import com.briteerp.pages.LoginPage;

public class Pages {

    private LoginPage loginPage;

    public LoginPage login(){
        if(loginPage==null){
            loginPage=new LoginPage();
        }
        return loginPage;
    }


}
