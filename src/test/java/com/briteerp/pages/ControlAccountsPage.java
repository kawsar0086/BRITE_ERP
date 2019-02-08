package com.briteerp.pages;

import com.briteerp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ControlAccountsPage {
    public ControlAccountsPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "//button[contains(text(),'Import')]")
    public WebElement importButton;

    @FindBy(xpath = "//button[contains(text(),'Create')]")
    public WebElement createButton;

    @FindBy(xpath = "//table[@class='o_list_view table table-condensed table-striped o_list_view_grouped']//tbody")
    public  WebElement allOrderList;

    @FindBy(xpath = "//li[contains(text(),'Control Accounts')]")
    public  WebElement pageTitle;

    @FindBy(xpath = "//th[contains(text(),'EventsCRM_Manager (31)')]")
    public WebElement Control_Accounts;

    @FindBy(xpath = "//tbody//tr[2]//td[2]//div[1]//input[1]")
    public WebElement checkbox;

    @FindBy(xpath = "//button[contains(text(),'Action')]")
    public  WebElement actionButton;

    @FindBy(xpath = "//a[@data-index='1']")
    public  WebElement deleteButton;

    @FindBy (xpath = "//span[contains(text(),'Ok')]")
    public  WebElement okButton;


}
