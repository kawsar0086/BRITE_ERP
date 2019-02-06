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

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div/div/div/table/tbody[1]/tr/td[7]")
    //
    //(//table/tbody/tr/td)[7]
    public WebElement indivualPrice;

    @FindBy(xpath = "(//input[@type='checkbox'])[4]")
    public  WebElement checkbox;


    @FindBy(xpath = "(//button[@class='o_dropdown_toggler_btn btn btn-sm dropdown-toggle'])[1]")
    public WebElement printOption;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[2]/div[2]/div/div[2]/button")
    public WebElement actionOption;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div/div/div/table/tbody[1]/tr/th")
    public  WebElement vendor;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div/div/div/table/tbody[2]/tr/th")
    public  WebElement prodcut;

    @FindBy(className = "o_data_cell o_list_button")
    public WebElement orderStatus;


}
