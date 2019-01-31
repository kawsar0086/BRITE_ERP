package com.briteerp.pages;
import com.briteerp.utilities.Driver;
import com.briteerp.utilities.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class LoginPage extends TestBase {


    static LoginPage obj=PageFactory.initElements(Driver.getDriver(), LoginPage.class);
    static credentials infos= new credentials();

    static	@FindBy(xpath = "html/body/div[1]/div/div[2]/a[2]")
    WebElement firstClick;

    static	    @FindBy(xpath = ".//*[@id='login']")
    WebElement email;

    static    @FindBy(xpath = ".//*[@id='password']")
    WebElement password;

    static    @FindBy(xpath = ".//*[@id='wrapwrap']/main/div/form/div[4]/button")
    WebElement singinButton;

    static	 @FindBy(className="oe_menu_text")
    WebElement LucnModel;

    public  static void Managerlogin(WebDriver driver) throws InterruptedException {
        driver.get("http://52.39.162.23/web/login");

        firstClick.click();

        email.sendKeys(infos.getManagerEmail());
        password.sendKeys(infos.getManagerPassword());

        singinButton.click();

        Thread.sleep(6000);
        LucnModel.click();

    }
    public static void Userlogin(WebDriver driver) {
        driver.get("http://52.39.162.23/web/login");
        wait.until(ExpectedConditions.visibilityOf(firstClick));
        firstClick.click();

        wait.until(ExpectedConditions.visibilityOf(email));
        email.sendKeys(infos.getUserEmail());

        wait.until(ExpectedConditions.visibilityOf(password));
        password.sendKeys(infos.getUserPassword());

        wait.until(ExpectedConditions.visibilityOf(singinButton));
        singinButton.click();
    }


}
