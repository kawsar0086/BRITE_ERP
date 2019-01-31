package com.briteerp.utilities;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;
public class TestBase {

    public static WebDriverWait wait;
    public static WebDriver driver;

    @BeforeMethod
    public void beforeEachTest() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait=new WebDriverWait(driver, 10);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);



    }

    @AfterMethod
    public void afterEachTest() {
        try {
            Thread.sleep(5000);
        } catch(Exception e) {
            e.getStackTrace();
        }
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
