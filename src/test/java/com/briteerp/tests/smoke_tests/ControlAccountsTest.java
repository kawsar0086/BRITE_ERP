package com.briteerp.tests.smoke_tests;

import com.briteerp.utilities.BrowserUtils;
import com.briteerp.utilities.ConfigurationReader;
import com.briteerp.utilities.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ControlAccountsTest extends TestBase {

    @Test
    public void displayOrderTest(){
        extentLogger=report.createTest("Testing Control Accounts page");

        pages.login().managerLogin(ConfigurationReader.getProperty("managerUsername"),
                ConfigurationReader.getProperty("managerPassword"));

        extentLogger.info("Verifying all orders  is displayed");
        BrowserUtils.wait(3);
        pages.getMenu().control_account.click();
        BrowserUtils.wait(3);
        Assert.assertTrue(pages.getControlAccounts().allOrderList.isDisplayed());

    }

    @Test
    public void deleteAnOrderTest(){
        pages.login().managerLogin(ConfigurationReader.getProperty("managerUsername"),
                ConfigurationReader.getProperty("managerPassword"));
        BrowserUtils.waitForClickablility(pages.getMenu().control_account,10);
        BrowserUtils.wait(5);
        pages.getMenu().control_account.click();


        pages.getControlAccounts().Control_Accounts.click();
        pages.getControlAccounts().checkbox.click();
        Assert.assertTrue(pages.getControlAccounts().checkbox.isSelected());

        pages.getControlAccounts().actionButton.click();

        pages.getControlAccounts().deleteButton.click();

        pages.getControlAccounts().okButton.click();

    }
}
