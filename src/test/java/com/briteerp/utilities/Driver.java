package com.briteerp.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Driver {
    private static WebDriver driver;

    private Driver() {
    }

    public static WebDriver getDriver() {
        if (driver == null) {
            String var0 = ConfigurationReader.getProperty("browser");
            byte var1 = -1;
            switch(var0.hashCode()) {
                case -1572972180:
                    if (var0.equals("chrome-headless")) {
                        var1 = 1;
                    }
                    break;
                case -1361128838:
                    if (var0.equals("chrome")) {
                        var1 = 0;
                    }
                    break;
                case -909897856:
                    if (var0.equals("safari")) {
                        var1 = 6;
                    }
                    break;
                case -849452327:
                    if (var0.equals("firefox")) {
                        var1 = 2;
                    }
                    break;
                case 3356:
                    if (var0.equals("ie")) {
                        var1 = 4;
                    }
                    break;
                case 3108285:
                    if (var0.equals("edge")) {
                        var1 = 5;
                    }
                    break;
                case 1501676525:
                    if (var0.equals("firefox-headless")) {
                        var1 = 3;
                    }
            }

            switch(var1) {
                case 0:
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
                case 1:
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver((new ChromeOptions()).setHeadless(true));
                    break;
                case 2:
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                case 3:
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver((new FirefoxOptions()).setHeadless(true));
                    break;
                case 4:
                    if (System.getProperty("os.name").toLowerCase().contains("mac")) {
                        throw new WebDriverException("Your operating system does not support the requested browser");
                    }

                    WebDriverManager.iedriver().setup();
                    driver = new InternetExplorerDriver();
                    break;
                case 5:
                    if (System.getProperty("os.name").toLowerCase().contains("mac")) {
                        throw new WebDriverException("Your operating system does not support the requested browser");
                    }

                    WebDriverManager.edgedriver().setup();
                    driver = new EdgeDriver();
                    break;
                case 6:
                    if (System.getProperty("os.name").toLowerCase().contains("windows")) {
                        throw new WebDriverException("Your operating system does not support the requested browser");
                    }

                    WebDriverManager.getInstance(SafariDriver.class).setup();
                    driver = new SafariDriver();
            }
        }

        return driver;
    }

    public static void closeDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }

    }
}