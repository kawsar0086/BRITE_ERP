package com.briteerp.tests.smoke_tests;

import com.briteerp.utilities.ConfigurationReader;
import com.briteerp.utilities.Driver;
import com.briteerp.utilities.TestBase;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

public class importPaymentFileTest extends TestBase {

    @Test
    public void importButtonTest() throws InterruptedException, AWTException {


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

        Thread.sleep(7000);

    }
    //File upload by Robot Class
    public void uploadFileWithRobot (String filePath) {
        StringSelection stringSelection = new StringSelection(filePath);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, null);

        Robot robot = null;

        try {
            robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }

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
    }
}
