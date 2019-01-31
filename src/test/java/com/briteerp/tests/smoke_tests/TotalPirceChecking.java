package com.briteerp.tests.smoke_tests;

import com.briteerp.pages.LoginPage;
import com.briteerp.pages.Menu;
import com.briteerp.pages.OrderByVendorPage;
import com.briteerp.utilities.ApplicationConstants;
import com.briteerp.utilities.ConfigurationReader;
import com.briteerp.utilities.Driver;
import com.briteerp.utilities.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TotalPirceChecking extends TestBase {

    @Test
    public void priceCheckingTest(){
        extentLogger=report.createTest("login with manager username and password");
        extentLogger.info("Loging to application");

        pages.login().managerLogin(ConfigurationReader.getProperty("managerUsername"),
                ConfigurationReader.getProperty("managerPassword"));


        extentLogger=report.createTest("total price from Orders by Vendor page");
        pages.getAllMenu().order_by_vendor.click();
       Assert.assertTrue(pages.byVendorPage().totalPrice.isDisplayed());

    }

}
