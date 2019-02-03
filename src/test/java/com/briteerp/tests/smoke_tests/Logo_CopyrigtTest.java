package com.briteerp.tests.smoke_tests;

import com.briteerp.utilities.ConfigurationReader;
import com.briteerp.utilities.Driver;
import com.briteerp.utilities.TestBase;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Logo_CopyrigtTest  extends TestBase {

    @Test
    public void logoTest(){

        extentLogger=report.createTest("logo displaying test");
        extentLogger.info("Verifying logo is displayed on home page");

        pages.login().managerLogin(ConfigurationReader.getProperty("managerUsername"),
                ConfigurationReader.getProperty("managerPassword"));

        System.out.println(pages.lunchPages().logo.getText());
        Assert.assertTrue(pages.lunchPages().logo.isDisplayed());

    }
    @Test
    public void copyRigtTest(){
        extentLogger=report.createTest("Copyright displaying test");
        extentLogger.info("Verifying copyright is displayed on home page");

        pages.login().managerLogin(ConfigurationReader.getProperty("managerUsername"),
                ConfigurationReader.getProperty("managerPassword"));


        WebDriverWait wait= new WebDriverWait(Driver.getDriver(),10);
        wait.until(ExpectedConditions.visibilityOf(pages.lunchPages().copyRigt));
        String copyRigtText=pages.lunchPages().copyRigt.getText();

        System.out.println(copyRigtText);
        Assert.assertEquals(copyRigtText,"Odoo");
    }
}
