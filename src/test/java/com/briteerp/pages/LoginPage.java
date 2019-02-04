package com.briteerp.pages;
import com.briteerp.utilities.ConfigurationReader;
import com.briteerp.utilities.Driver;
import com.briteerp.utilities.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class LoginPage extends TestBase {

    public  LoginPage(){

        PageFactory.initElements(Driver.getDriver(),this);

    }

    static	@FindBy(xpath = "html/body/div[1]/div/div[2]/a[2]")
    WebElement demoAccount;

    static	    @FindBy(xpath = ".//*[@id='login']")
    WebElement email;

    static    @FindBy(xpath = ".//*[@id='password']")
    WebElement password;

    static    @FindBy(xpath = ".//*[@id='wrapwrap']/main/div/form/div[4]/button")
    WebElement singinButton;

    static	 @FindBy(xpath = "//*[@id=\"oe_main_menu_navbar\"]/div[2]/ul[1]/li[13]/a/span")
    WebElement LucnModel;

    static  @FindBy(xpath = "//button[@class='btn btn-sm btn-primary']")
    WebElement okButton;

    public static void managerLogin(String username,String psw){

        demoAccount.click();
        email.sendKeys(username);
        password.sendKeys(psw);
        singinButton.click();

        LucnModel.click();

        Actions actToOkButton = new Actions(Driver.getDriver());

        actToOkButton.moveToElement(okButton).perform();   // in Actions, we have to do the perform  in order to execute

        okButton.click();
    }
    public void userLogin(String username,String psw){
        demoAccount.click();
        email.sendKeys(username);
        password.sendKeys(psw);
        singinButton.click();
        LucnModel.click();
        Actions actToOkButton = new Actions(Driver.getDriver());

        actToOkButton.moveToElement(okButton).perform();   // in Actions, we have to do the perform  in order to execute

        okButton.click();
    }

    public void open(){
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }


}