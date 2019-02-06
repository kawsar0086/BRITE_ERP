package com.briteerp.tests.smoke_tests;

import com.briteerp.utilities.ConfigurationReader;
import com.briteerp.utilities.Driver;
import com.briteerp.utilities.TestBase;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class OrderbyVendorPageTest extends TestBase {


    @Test
    public void individualPriceTest(){

        //PASS
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        extentLogger=report.createTest("Indivisual price test");
        pages.login().managerLogin(ConfigurationReader.getProperty("managerUsername"),
                ConfigurationReader.getProperty("managerPassword"));

        extentLogger.info("Verifying Indivual price in each product by Vendor page");
        pages.getMenu().order_by_vendor.click();

        WebDriverWait wait= new WebDriverWait(Driver.getDriver(),10);
        wait.until(ExpectedConditions.visibilityOf(pages.byVendorPage().indivualPrice));

        System.out.println(pages.byVendorPage().indivualPrice.getText());
        Assert.assertTrue(pages.byVendorPage().indivualPrice.isDisplayed());


    }
    @Test
    public void priceCheckingTest(){
        extentLogger.info("Loging to application");

        pages.login().managerLogin(ConfigurationReader.getProperty("managerUsername"),
                ConfigurationReader.getProperty("managerPassword"));

        extentLogger.info("Verifying total price from Orders by Vendor page");
        pages.getMenu().order_by_vendor.click();
        Assert.assertTrue(pages.byVendorPage().totalPrice.isDisplayed());


    }

    @Test
    public void displayActionOptionTest(){

        Driver.getDriver().manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        pages.login().managerLogin(ConfigurationReader.getProperty("managerUsername"),
                ConfigurationReader.getProperty("managerPassword"));

        extentLogger.info("Verifying Action option when clicking each product by Vendor page");
        pages.getMenu().order_by_vendor.click();


        pages.byVendorPage().vendor.click();
        pages.byVendorPage().prodcut.click();
        pages.byVendorPage().checkbox.click();
        pages.byVendorPage().actionOption.click();

        Assert.assertTrue(pages.byVendorPage().actionOption.isDisplayed());

        String  actionText=pages.byVendorPage().actionOption.getText();
        Assert.assertEquals(actionText,"Action");

    }
    @Test
    public  void displayPrintOptionTest(){
        Driver.getDriver().manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        pages.login().managerLogin(ConfigurationReader.getProperty("managerUsername"),
                ConfigurationReader.getProperty("managerPassword"));

        extentLogger.info("Verifying Action option when clicking each product by Vendor page");
        pages.getMenu().order_by_vendor.click();


        pages.byVendorPage().vendor.click();
        pages.byVendorPage().prodcut.click();
        pages.byVendorPage().checkbox.click();


        Assert.assertTrue(pages.byVendorPage().printOption.isDisplayed());
        System.out.println(pages.byVendorPage().printOption.getText());

        String  printText=pages.byVendorPage().printOption.getText();
        Assert.assertEquals(printText,"Print");

    }
    @Test
    public  void orderStatusIcon() throws InterruptedException {
        Driver.getDriver().manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        pages.login().managerLogin(ConfigurationReader.getProperty("managerUsername"),
                ConfigurationReader.getProperty("managerPassword"));

        extentLogger.info("Verifying order status icon is displaying");

        pages.getMenu().order_by_vendor.click();
        pages.byVendorPage().vendor.click();
        pages.byVendorPage().prodcut.click();
        pages.byVendorPage().checkbox.click();

        Thread.sleep(3000);


        System.out.println(pages.byVendorPage().orderStatus.isDisplayed());


    }

}
