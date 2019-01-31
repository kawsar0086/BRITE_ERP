package com.briteerp.tests;

import com.briteerp.pages.LoginPage;
import com.briteerp.utilities.Driver;
import com.briteerp.utilities.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class SmokeTest extends TestBase {

    @Test
    public void ALlTests() throws InterruptedException {

        LoginPage.Managerlogin(Driver.getDriver());

        Driver.closeDriver();


    }

}