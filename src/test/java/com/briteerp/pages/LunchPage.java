package com.briteerp.pages;

import com.briteerp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LunchPage {

    public LunchPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "/html/body/div[1]/div[1]/a/img")
    public WebElement logo;

    @FindBy(xpath = "/html/body/div[1]/div[1]/div[2]/a/span")
    public WebElement copyRigt;



}
