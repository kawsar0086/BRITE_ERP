package com.briteerp.tests.smoke_tests;

import com.briteerp.pages.LoginPage;
import com.briteerp.utilities.ConfigurationReader;
import com.briteerp.utilities.Driver;
import com.briteerp.utilities.TestBase;
import org.testng.annotations.Test;


public class TotalPirceChecking extends TestBase {

    @Test
    public void test(){
        extentLogger=report.createTest("toal price checking");
        extentLogger.info("Loging to application");

        pages.login().managerLogin(ConfigurationReader.getProperty("managerUsername"),
                ConfigurationReader.getProperty("managerPassword"));



    }
}
