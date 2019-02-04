package com.briteerp.pages;

import com.briteerp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewOrderPage {

    public NewOrderPage(){

        PageFactory.initElements(Driver.getDriver(),this);


    }

    public static @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[2]/div[1]/div/div[2]/button[1]")
    WebElement saveOrder;
    
      public static @FindBy(xpath = "//div[@class='o_form_sheet']//td[@class='o_field_x2many_list_row_add']/a")
    WebElement AddAnItem;

}
