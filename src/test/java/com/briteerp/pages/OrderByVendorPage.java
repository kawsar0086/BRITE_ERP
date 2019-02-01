package com.briteerp.pages;

import com.briteerp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderByVendorPage {

    public OrderByVendorPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div/div/div/table/tfoot/tr/td[8]")
    public  WebElement totalPrice;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div/div/div/table/tbody[3]/tr[1]/td[2]/div/input")
    public WebElement eachProduct;

    @FindBy(xpath = "")
    public WebElement indivualPrice;

    @FindBy(xpath = "")
    public WebElement printOption;

    @FindBy(xpath = "")
    public WebElement actionOption;

}
