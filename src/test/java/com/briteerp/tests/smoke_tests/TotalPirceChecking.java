package com.briteerp.tests.smoke_tests;


import com.briteerp.utilities.ConfigurationReader;
import com.briteerp.utilities.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TotalPirceChecking extends TestBase {

    @Test
    public void priceCheckingTest(){
        extentLogger=report.createTest("Total price test");
        extentLogger.info("Loging to application");

        pages.login().managerLogin(ConfigurationReader.getProperty("managerUsername"),
                ConfigurationReader.getProperty("managerPassword"));

        extentLogger.info("Verifying total price from Orders by Vendor page");
        pages.getAllMenu().order_by_vendor.click();
       Assert.assertTrue(pages.byVendorPage().totalPrice.isDisplayed());


    }

}
