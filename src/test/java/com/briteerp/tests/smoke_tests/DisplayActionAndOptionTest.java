package com.briteerp.tests.smoke_tests;

import com.briteerp.utilities.ConfigurationReader;
import com.briteerp.utilities.Driver;
import com.briteerp.utilities.TestBase;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DisplayActionAndOptionTest  extends TestBase {


    @Test
    public void individualPriceTest(){

        Driver.getDriver().manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        extentLogger=report.createTest("Indivisual price test");
        pages.login().managerLogin(ConfigurationReader.getProperty("managerUsername"),
                ConfigurationReader.getProperty("managerPassword"));

        extentLogger.info("Verifying Indivual price in each product by Vendor page");
        pages.getAllMenu().order_by_vendor.click();

    }
    @Test
    public void displayActionOptionTest(){
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.urlToBe(ConfigurationReader.getProperty("url")));

        Driver.getDriver().manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        extentLogger=report.createTest("Display Action option test");
        pages.login().managerLogin(ConfigurationReader.getProperty("managerUsername"),
                ConfigurationReader.getProperty("managerPassword"));

        extentLogger.info("Verifying Action option when clicking each product by Vendor page");
        pages.getAllMenu().order_by_vendor.click();
    }
    @Test
    public  void displayPrintOptionTest(){
        Driver.getDriver().manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        extentLogger=report.createTest("Display Print option test");
        pages.login().managerLogin(ConfigurationReader.getProperty("managerUsername"),
                ConfigurationReader.getProperty("managerPassword"));

        extentLogger.info("Verifying print option when clicking each product by Vendor page");
        pages.getAllMenu().order_by_vendor.click();

    }


}
