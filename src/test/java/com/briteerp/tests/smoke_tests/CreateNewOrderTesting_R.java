package com.briteerp.tests.smoke_tests;

import com.briteerp.pages.LoginPage;
import com.briteerp.utilities.ConfigurationReader;
import com.briteerp.utilities.Driver;
import com.briteerp.utilities.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class CreateNewOrderTesting_R extends TestBase {

   // Fail
    @Test
    public void test() throws InterruptedException {

        extentLogger=report.createTest("Indivisual price test");
        extentLogger.info("Verifying Indivual price in each product by Vendor page");
        pages.login().managerLogin(ConfigurationReader.getProperty("managerUsername"),
                ConfigurationReader.getProperty("managerPassword"));
        Thread.sleep(3);
        extentLogger.info("Verifying new order page displayed");
        NewOderPage.AddAnItem.click();











    }


}
