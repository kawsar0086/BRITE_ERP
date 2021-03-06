package com.briteerp.tests.smoke_tests;

import com.briteerp.pages.CreateAlert;
import com.briteerp.pages.LoginPage;
import com.briteerp.utilities.ConfigurationReader;
import com.briteerp.utilities.Driver;
import com.briteerp.utilities.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class CreateNewAlert extends TestBase {

    public CreateNewAlert() {
        PageFactory.initElements(Driver.getDriver(), LoginPage.class);
    }

    @Test
    public void test() throws InterruptedException {

        pages.login().managerLogin(ConfigurationReader.getProperty("managerUsername"),
                ConfigurationReader.getProperty("managerPassword"));
        Thread.sleep(3);


       CreateAlert.NewAlert.click();


    }

}
