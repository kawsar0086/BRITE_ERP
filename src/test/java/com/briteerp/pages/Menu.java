package com.briteerp.pages;

import com.briteerp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Menu{

    public Menu() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[contains(text(),'New Order')]")
    public WebElement new_order;

    @FindBy(xpath = "//span[contains(text(),'Previous Orders')]")
    public WebElement previous_order;

    @FindBy(xpath = "//span[contains(text(),'Your Lunch Account')]")
    public WebElement lunch_account;

    @FindBy(xpath = "//span[contains(text(),\"Today's Orders\")]")
    public WebElement todays_order;

    @FindBy(xpath = "//span[contains(text(),'Orders by Vendor')]")
    public WebElement order_by_vendor;

    @FindBy(xpath = "//span[contains(text(),'Control Accounts')]")
    public WebElement control_account;

    @FindBy(xpath = "//span[contains(text(),'Employee Payments')]")
    public WebElement employee_payment;

    @FindBy(xpath = "//div[@class='o_sub_menu_content']//div[13]//ul[3]//li[1]//a[1]")
    public WebElement products;

    @FindBy(xpath = "//span[contains(text(),'Product Categories')]")
    public WebElement product_categories;

    @FindBy(xpath = "//span[contains(text(),'Alerts')]")
    public WebElement alert;

}
