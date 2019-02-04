package com.briteerp.pages;

import com.briteerp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TodaysOrderPage {

    public TodaysOrderPage(){

        PageFactory.initElements(Driver.getDriver(),this);


    }

    public static@FindBy(xpath = "/html/body/div[1]/div[1]/div[1]/div[13]/ul[2]/li[1]/a")
    WebElement todaysOrderPageButton;
}