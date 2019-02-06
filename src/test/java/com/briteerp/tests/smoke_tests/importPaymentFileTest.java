package com.briteerp.tests.smoke_tests;

import com.briteerp.utilities.ConfigurationReader;
import com.briteerp.utilities.Driver;
import com.briteerp.utilities.TestBase;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class importPaymentFileTest extends TestBase {

    @Test
    public void importButtonTest() throws InterruptedException {


        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Driver.getDriver().manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
        pages.login().managerLogin(ConfigurationReader.getProperty("managerUsername"),
                ConfigurationReader.getProperty("managerPassword"));

        pages.getMenu().employee_payment.click();
        pages.getPaymentPages().importButton.click();
        pages.getPaymentPages().loadFile.click();
        pages.getPaymentPages().input.sendKeys("/Users/zulyar/Desktop/testCase.xlsx"+ Keys.ENTER);

        Thread.sleep(7000);

    }
}
