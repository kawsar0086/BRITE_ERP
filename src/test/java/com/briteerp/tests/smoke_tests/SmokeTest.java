package com.briteerp.tests.smoke_tests;

import com.briteerp.pages.LoginPage;
import com.briteerp.utilities.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class SmokeTest extends TestBase {

    @Test
    public void ALlTests(){

        LoginPage.Managerlogin(driver);
        LoginPage.Userlogin();


    }

}