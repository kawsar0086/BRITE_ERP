package com.briteerp.pages;

import com.briteerp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAlert {

    public CreateAlert(){

        PageFactory.initElements(Driver.getDriver(),this);


    }

    public static @FindBy(xpath = "/html/body/div[1]/div[1]/div[1]/div[13]/ul[3]/li[3]/a/span")
    WebElement NewAlert;


}
