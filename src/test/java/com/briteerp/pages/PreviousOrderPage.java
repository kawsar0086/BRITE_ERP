package com.briteerp.pages;

import com.briteerp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PreviousOrderPage {


    public PreviousOrderPage(){

        PageFactory.initElements(Driver.getDriver(),this);


    }

    public static@FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div/div/div/table/tbody/tr[1]/td[1]/div/input")
    WebElement confirmOrderCheckBox;

    public static@FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[2]/div[2]/div/div[1]/button")
    WebElement printButon;

    public static@FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[2]/div[2]/div/div[1]/ul/li/a")
    WebElement lunchOrderButton;

    public static@FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[2]/div[2]/div/div[2]/button")
    WebElement actionButton;

    public static@FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[2]/div[2]/div/div[2]/ul/li[1]/a")
    WebElement exportButton;
}

