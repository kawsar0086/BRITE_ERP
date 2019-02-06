package com.briteerp.utilities;

import com.briteerp.pages.LoginPage;
import com.briteerp.pages.LunchPage;
import com.briteerp.pages.Menu;
import com.briteerp.pages.OrderByVendorPage;

public class Pages {

    private LoginPage loginPage;
    private Menu menu;
    private OrderByVendorPage orderByVendorPage;
    private LunchPage lunchPage;

    public LoginPage login() {
        if (loginPage == null) {
            loginPage = new LoginPage();
        }
        return loginPage;
    }


    public Menu getMenu() {
        if (menu == null) {
            menu = new Menu();
        }

        return  menu;
    }

    public OrderByVendorPage byVendorPage() {
        if (orderByVendorPage == null) {
            orderByVendorPage = new OrderByVendorPage();
        }
        return orderByVendorPage;
    }

    public LunchPage lunchPages() {
        if (lunchPage == null) {
            lunchPage = new LunchPage();
        }

        return lunchPage;
    }
}



