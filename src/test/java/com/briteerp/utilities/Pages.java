package com.briteerp.utilities;

import com.briteerp.pages.*;

public class Pages {

    private LoginPage loginPage;
    private Menu menu;
    private OrderByVendorPage orderByVendorPage;
    private LunchPage lunchPage;
    private EmployeePaymentsPage employeePaymentsPage;
    private  ControlAccountsPage controlAccountsPage;

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
    public EmployeePaymentsPage getPaymentPages(){
        if(employeePaymentsPage==null){
            employeePaymentsPage=new EmployeePaymentsPage();
        }
        return employeePaymentsPage;
    }
    public ControlAccountsPage getControlAccounts(){
        if(controlAccountsPage==null){
            controlAccountsPage=new ControlAccountsPage();
        }

        return  controlAccountsPage;
    }

}