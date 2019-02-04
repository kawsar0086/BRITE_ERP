package com.briteerp.pages;

import com.briteerp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YourLunchAccountPage {
    public YourLunchAccountPage(){

        PageFactory.initElements(Driver.getDriver(),this);


    }

    public static@FindBy(xpath = "/html/body/div[1]/div[1]/div[1]/div[13]/ul[1]/li[3]/a/span")
    WebElement yourLunchAccountButton;

    public static@FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div/div/div/table/tbody/tr/th/span")
    WebElement lunch_InvoicingManager3;

    public static@FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div/div/div/table/tbody[2]/tr[1]/td[2]/div/input")
    WebElement lunch_InvoicingCheckBox;

    public static@FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[2]/div[2]/div/div[2]/button")
    WebElement actionButon;

    public static@FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[2]/div[2]/div/div[2]/ul/li[1]/a")
    WebElement exportButton;

    public static@FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[2]/div[2]/div/div[2]/ul/li[2]/a")
    WebElement deleteButton;
}
