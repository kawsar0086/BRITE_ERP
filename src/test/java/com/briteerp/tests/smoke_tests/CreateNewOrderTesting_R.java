package com.briteerp.tests.smoke_tests;

import com.briteerp.pages.NewOderPage;
import com.briteerp.utilities.ConfigurationReader;
import com.briteerp.utilities.Driver;
import com.briteerp.utilities.TestBase;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class CreateNewOrderTesting_R extends TestBase {

    public CreateNewOrderTesting_R() {
        PageFactory.initElements(Driver.getDriver(), NewOderPage.class);
    }
    @Test
    public void test() {

        extentLogger=report.createTest("Indivisual price test");
        extentLogger.info("Verifying Indivual price in each product by Vendor page");
        pages.login().managerLogin(ConfigurationReader.getProperty("managerUsername"),
                ConfigurationReader.getProperty("managerPassword"));
              mysleep(3);
        extentLogger.info("Verifying new order page displayed");
           Driver.getDriver().manage().window().maximize();
                         mysleep(3);
        NewOderPage.AddAnItem.click();
         NewOderPage.DropDownBox.click();
              mysleep(2);

               Actions SelectBox = new Actions(Driver.getDriver());

               SelectBox.moveToElement(NewOderPage.CreateButton).perform();

           NewOderPage.CreateButton.click();
                                           mysleep(2);
    NewOderPage.inputProductName.sendKeys("polo" + Keys.ENTER);

    SelectBox.moveToElement(NewOderPage.getDropDownBox).perform();
               NewOderPage.getDropDownBox.click();
                                              mysleep(3);

              NewOderPage.CreateItemButton.click();

                                                  mysleep(2); 
       NewOderPage.inputCategoryName.sendKeys("EERKIN Uyghur Food");


                                              mysleep(2);


         Actions SelectItemBox = new Actions(Driver.getDriver());

       SelectItemBox.moveToElement(NewOderPage.saveButton).perform();

          NewOderPage.saveButton.click();

            mysleep(3);

             Actions SaveItemBox = new Actions(Driver.getDriver());
                    SaveItemBox.moveToElement(NewOderPage.saveItemButton).perform();
                      NewOderPage.saveItemButton.click();

                        mysleep(3);       
    }


}
