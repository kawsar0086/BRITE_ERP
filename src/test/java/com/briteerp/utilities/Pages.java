package com.briteerp.utilities;

import com.briteerp.pages.*;

public class Pages {

    private LoginPage loginPage;
    private ViewAllMenu allMenu;
    private OrderByVendorPage orderByVendorPage;
    private LunchPage lunchPage;
    private NewOderPage newOderPage;

    public LoginPage login(){
        if(loginPage==null){
            loginPage=new LoginPage();
        }
        return loginPage;
    }

    public ViewAllMenu getAllMenu(){
        if(allMenu==null){
            allMenu=new ViewAllMenu();
        }

        return  allMenu;
    }

    public OrderByVendorPage byVendorPage(){
        if(orderByVendorPage==null){
            orderByVendorPage=new OrderByVendorPage();
        }
        return  orderByVendorPage;
    }

    public LunchPage lunchPages(){
        if(lunchPage==null){
            lunchPage=new LunchPage();
        }

        return  lunchPage;
    }

    public NewOderPage newOderPage(){

        if (newOderPage ==null){

            newOderPage = newOderPage();
        }

        return newOderPage ;
    }

}
