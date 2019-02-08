package com.briteerp.tests.smoke_tests;

import com.briteerp.utilities.BrowserUtils;
import com.briteerp.utilities.ConfigurationReader;
import com.briteerp.utilities.Driver;
import com.briteerp.utilities.TestBase;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

/**
 *
 * @Author Zulyar Kurban
 * @Since Feb 7 2019
 */

public class EmployeePaymentPageTest extends TestBase {

    @Test
    public void importButtonTest() {
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Driver.getDriver().manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
        pages.login().managerLogin(ConfigurationReader.getProperty("managerUsername"),
                ConfigurationReader.getProperty("managerPassword"));

        pages.getMenu().employee_payment.click();
        pages.getPaymentPages().importButton.click();
        pages.getPaymentPages().loadFile.click();
        //Using robot class to upload file

        String filePath="/Users/zulyar/Desktop/testCase.xlsx";
        BrowserUtils.uploadFile(filePath);

        WebDriverWait wait=new WebDriverWait(Driver.getDriver(),10);
        wait.until(ExpectedConditions.visibilityOf(pages.getPaymentPages().allMap));

        System.out.println(pages.getPaymentPages().allMap.isDisplayed());
        Assert.assertTrue(pages.getPaymentPages().allMap.isDisplayed());

    }
    @Test
    public void allEmployeesOrderTesting(){
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Driver.getDriver().manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
        pages.login().managerLogin(ConfigurationReader.getProperty("managerUsername"),
                ConfigurationReader.getProperty("managerPassword"));

        BrowserUtils.wait(3);
        pages.getMenu().employee_payment.click();

        BrowserUtils.wait(7);
        Assert.assertTrue(pages.getPaymentPages().allOrders.isDisplayed());

    }
    @Test
    public void EmployeesPaymentTest(){
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Driver.getDriver().manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
        pages.login().managerLogin(ConfigurationReader.getProperty("managerUsername"),
                ConfigurationReader.getProperty("managerPassword"));

        BrowserUtils.wait(3);
        pages.getMenu().employee_payment.click();

        Assert.assertTrue(pages.getPaymentPages().eachPrice.isDisplayed());
    }


}
