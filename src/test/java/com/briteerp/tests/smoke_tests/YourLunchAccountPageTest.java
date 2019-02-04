package com.briteerp.tests.smoke_tests;

import com.briteerp.pages.LoginPage;
import com.briteerp.pages.YourLunchAccountPage;
import com.briteerp.utilities.ConfigurationReader;
import com.briteerp.utilities.Driver;
import com.briteerp.utilities.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class YourLunchAccountPageTest extends TestBase {

    public YourLunchAccountPageTest() {
        PageFactory.initElements(Driver.getDriver(), LoginPage.class);
    }

    @Test
    public void test()throws InterruptedException{


        /**
         * we can call login method from pages which is located in utilities.
         * do not need to make managerLogin to static.
         */

        // LoginPage.managerLogin(ConfigurationReader.getProperty("managerUsername"),
        // ConfigurationReader.getProperty("managerPassword"));
        pages.login().managerLogin(ConfigurationReader.getProperty("managerUsername"),
                ConfigurationReader.getProperty("managerPassword"));

        Thread.sleep(3);

        YourLunchAccountPage.yourLunchAccountButton.click();
        YourLunchAccountPage.lunch_InvoicingManager3.click();
        YourLunchAccountPage.lunch_InvoicingCheckBox.click();
        YourLunchAccountPage.actionButon.click();
        YourLunchAccountPage.exportButton.click();
        YourLunchAccountPage.deleteButton.click();



    }
}
