package com.briteerp.tests.smoke_tests;

import com.briteerp.pages.NewOrderPage;
import com.briteerp.utilities.ConfigurationReader;
import com.briteerp.utilities.Driver;
import com.briteerp.utilities.TestBase;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class AddNewOrder_K extends TestBase {

    @Test
    public void AddingANewOrder() throws InterruptedException {

        pages.login().managerLogin(ConfigurationReader.getProperty("managerUsername"),
                ConfigurationReader.getProperty("managerPassword"));


        Thread.sleep(5000);
//        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),50);
//        wait.until(ExpectedConditions.elementToBeClickable(pages.newOrder().addLagman));

        System.out.println(pages.newOrder().addLagman.getText());

        //Assert.assertEquals(pages.newOrder().typeBox.getText(),"lagman");

    }


}
