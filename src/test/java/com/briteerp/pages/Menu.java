package com.briteerp.pages;

import com.briteerp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class Menu {

    public Menu() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "")
    public WebElement new_order;

    @FindBy()
    public WebElement previous_order;

    @FindBy()
    public WebElement lunch_account;

    @FindBy()
    public WebElement todays_order;

    @FindBy(xpath = "/html/body/div[1]/div[1]/div[1]/div[13]/ul[2]/li[2]/a/span")
    public WebElement order_by_vendor;

    @FindBy()
    public WebElement control_account;

    @FindBy()
    public WebElement employee_payment;

    @FindBy()
    public WebElement products;

    @FindBy()
    public WebElement product_categories;

    @FindBy()
    public WebElement alert;


}
