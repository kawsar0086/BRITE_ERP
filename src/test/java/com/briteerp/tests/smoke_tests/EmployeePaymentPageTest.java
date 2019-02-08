package com.briteerp.tests.smoke_tests;

import com.briteerp.utilities.BrowserUtils;
import com.briteerp.utilities.ConfigurationReader;
import com.briteerp.utilities.Driver;
import com.briteerp.utilities.TestBase;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

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
        uploadFileWithRobot(filePath);

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

    //File upload by Robot Class
    public void uploadFileWithRobot (String filePath) {
        StringSelection stringSelection = new StringSelection(filePath);
        //Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        //clipboard.setContents(stringSelection, null);

        Robot robot = null;

        try {
            robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }

        /*

        //File upload by using robot class in Windowns OS
        robot.delay(250);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.delay(150);
        robot.keyRelease(KeyEvent.VK_ENTER);
        */

        //File upload by using robot class in MAC OS
        robot.keyPress(KeyEvent.VK_META);
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_META);
        robot.keyRelease(KeyEvent.VK_TAB);
        robot.delay(500);

        //Open Goto window
        robot.keyPress(KeyEvent.VK_META);
        robot.keyPress(KeyEvent.VK_SHIFT);
        robot.keyPress(KeyEvent.VK_G);
        robot.keyRelease(KeyEvent.VK_META);
        robot.keyRelease(KeyEvent.VK_SHIFT);
        robot.keyRelease(KeyEvent.VK_G);

        //Press Enter key to close the Goto window and Upload window
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        robot.delay(500);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

    }
}
