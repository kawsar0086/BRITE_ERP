package com.briteerp.pages;

import com.briteerp.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class ViewAllMenu extends Menu {
    public ViewAllMenu(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

}
