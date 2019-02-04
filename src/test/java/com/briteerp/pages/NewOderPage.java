package com.briteerp.pages;

import com.briteerp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewOderPage {


    public NewOderPage(){

        PageFactory.initElements(Driver.getDriver(),this);


    }

    public static @FindBy(xpath = "//div[@class='o_form_sheet']//td[@class='o_field_x2many_list_row_add']/a")
    WebElement AddAnItem;







}
