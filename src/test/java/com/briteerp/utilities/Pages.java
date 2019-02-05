package com.briteerp.utilities;

import com.briteerp.pages.*;

public class Pages {

    private LoginPage loginPage;
    private ViewAllMenu allMenu;
    private OrderByVendorPage orderByVendorPage;
    private LunchPage lunchPage;
    private  NewOrderPage orderPage;

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
    public NewOrderPage neworderPage(){
        if(orderPage==null){
            orderPage= new NewOrderPage();
        }

        return  orderPage;
    }


}
