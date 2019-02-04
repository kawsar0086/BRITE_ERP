package com.briteerp.utilities;

import com.briteerp.pages.LoginPage;
import com.briteerp.pages.NewOrderPage;
import com.briteerp.pages.OrderByVendorPage;
import com.briteerp.pages.ViewAllMenu;
import com.sun.tools.corba.se.idl.constExpr.Or;

public class Pages {

    private LoginPage loginPage;
    private ViewAllMenu allMenu;
    private OrderByVendorPage orderByVendorPage;
    private NewOrderPage newOrderPage;

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

    public NewOrderPage newOrder(){
        if(newOrderPage == null){
            newOrderPage = new NewOrderPage();
        }
        return newOrderPage;
    }

}
