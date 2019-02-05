package com.briteerp.pages;

import com.briteerp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewOderPage {


    public NewOderPage(){

        PageFactory.initElements(Driver.getDriver(),this);


    }

    public static @FindBy(linkText = "Add an item")

            WebElement AddAnItem;

    public static @FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div/div/div/div/div[2]/div[6]/div[2]/table/tbody/tr[1]/td[1]/div/div/in  put")

    WebElement DropDownBox ;



    public static @FindBy(xpath = " //a[contains(text(),'Create and Edit...')]")

    WebElement CreateButton ;


    public static @FindBy(xpath = "//input[@class='o_field_char o_field_widget o_input o_required_modifier']")

    WebElement inputProductName ;

     public static @FindBy (xpath = "/html[1]/body[1]/div[5]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/div[1]/input[1]")

     WebElement getDropDownBox;




    public static @FindBy(xpath = "/html[1]/body[1]/div[7]/div[1]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/input[1]")
    WebElement inputCategoryName ;

    public static @FindBy(xpath = "/html[1]/body[1]/ul[2]/li[9]")

    WebElement CreateItemButton ;

    public static @FindBy(xpath = "/html[1]/body[1]/div[7]/div[1]/div[1]/div[3]/button[1]/span[1]")

    WebElement saveButton ;


    public static @FindBy(xpath = "/html[1]/body[1]/div[5]/div[1]/div[1]/div[3]/button[1]/span[1]")

    WebElement saveItemButton ;



}
