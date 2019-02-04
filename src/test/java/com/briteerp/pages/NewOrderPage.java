package com.briteerp.pages;

import com.briteerp.utilities.Driver;
import com.briteerp.utilities.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewOrderPage extends TestBase {

    public NewOrderPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//td[@class='o_field_x2many_list_row_add'])//a")
    public WebElement addAnItemButton;

    @FindBy(className = "o_input ui-autocomplete-input")
    public WebElement typeBox;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div/div/div/div/div[2]/div[4]/div/div[1]/div/button/span[2]")
    public  WebElement addLagman;


}
