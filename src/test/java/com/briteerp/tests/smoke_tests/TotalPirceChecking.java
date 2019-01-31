package com.briteerp.tests.smoke_tests;

import com.briteerp.pages.LoginPage;
import com.briteerp.utilities.Driver;
import org.testng.annotations.Test;

public class TotalPirceChecking {

    @Test
    public void test() throws InterruptedException {
        LoginPage.Managerlogin(Driver.getDriver());
    }
}
