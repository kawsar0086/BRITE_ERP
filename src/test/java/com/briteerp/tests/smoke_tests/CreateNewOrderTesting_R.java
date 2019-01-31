package com.briteerp.tests.smoke_tests;

import com.briteerp.pages.LoginPage;
import com.briteerp.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CreateNewOrderTesting_R {



    @Test
    public void test() throws InterruptedException {

        LoginPage.Managerlogin(Driver.getDriver());


        WebElement addItem = Driver.getDriver().findElement(By.xpath("//td[@class='o_field_x2many_list_row_add']"));

        addItem.click();





    }






}
