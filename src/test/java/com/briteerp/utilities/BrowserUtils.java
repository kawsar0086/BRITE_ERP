package com.briteerp.utilities;

import com.google.common.base.Function;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class BrowserUtils {
    public BrowserUtils() {
    }

    public static void wait(int secs) {
        try {
            Thread.sleep((long)(1000 * secs));
        } catch (InterruptedException var2) {
        }

    }

    public static String getScreenshot(String name) {
        String time = (new SimpleDateFormat("yyyyMMddhhmmss")).format(new Date());
        TakesScreenshot takesScreenshot = (TakesScreenshot)Driver.getDriver();
        File source = (File)takesScreenshot.getScreenshotAs(OutputType.FILE);
        String target = System.getProperty("user.dir") + "/test-output/Screenshots" + name + time + ".png";
        File finalDestination = new File(target);

        try {
            FileUtils.copyFile(source, finalDestination);
        } catch (IOException var7) {
        }

        return target;
    }

    public static void switchToWindow(String targetTitle) {
        String origin = Driver.getDriver().getWindowHandle();
        Iterator var2 = Driver.getDriver().getWindowHandles().iterator();

        do {
            if (!var2.hasNext()) {
                Driver.getDriver().switchTo().window(origin);
                return;
            }

            String handle = (String)var2.next();
            Driver.getDriver().switchTo().window(handle);
        } while(!Driver.getDriver().getTitle().equals(targetTitle));

    }

    public static void hover(WebElement element) {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(element).perform();
    }

    public static List<String> getElementsText(List<WebElement> list) {
        List<String> elemTexts = new ArrayList();
        Iterator var2 = list.iterator();

        while(var2.hasNext()) {
            WebElement el = (WebElement)var2.next();
            elemTexts.add(el.getText());
        }

        return elemTexts;
    }

    public static List<String> getElementsText(By locator) {
        List<WebElement> elems = Driver.getDriver().findElements(locator);
        List<String> elemTexts = new ArrayList();
        Iterator var3 = elems.iterator();

        while(var3.hasNext()) {
            WebElement el = (WebElement)var3.next();
            elemTexts.add(el.getText());
        }

        return elemTexts;
    }

    public static WebElement waitForVisibility(WebElement element, int timeToWaitInSec) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), (long)timeToWaitInSec);
        return (WebElement)wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static WebElement waitForVisibility(By locator, int timeout) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), (long)timeout);
        return (WebElement)wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public static WebElement waitForClickablility(WebElement element, int timeout) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), (long)timeout);
        return (WebElement)wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static WebElement waitForClickablility(By locator, int timeout) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), (long)timeout);
        return (WebElement)wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public static void waitForPageToLoad(long timeOutInSeconds) {
        ExpectedCondition expectation = new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver driver) {
                return ((JavascriptExecutor)driver).executeScript("return document.readyState", new Object[0]).equals("complete");
            }
        };

        try {
            System.out.println("Waiting for page to load...");
            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), timeOutInSeconds);
            wait.until(expectation);
        } catch (Throwable var4) {
            System.out.println("Timeout waiting for Page Load Request to complete after " + timeOutInSeconds + " seconds");
        }

    }

    public static WebElement fluentWait(final WebElement webElement, int timeinsec) {
        FluentWait<WebDriver> wait = (new FluentWait(Driver.getDriver())).withTimeout(Duration.ofSeconds((long)timeinsec)).pollingEvery(Duration.ofMillis(500L)).ignoring(NoSuchElementException.class);
        WebElement element = (WebElement)wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return webElement;
            }
        });
        return element;
    }

    public static void verifyElementDisplayed(By by) {
        try {
            Assert.assertTrue(Driver.getDriver().findElement(by).isDisplayed(), "Element not visible: " + by);
        } catch (NoSuchElementException var2) {
            Assert.fail("Element not found: " + by);
        }

    }

    public static void verifyElementDisplayed(WebElement element) {
        try {
            Assert.assertTrue(element.isDisplayed(), "Element not visible: " + element);
        } catch (NoSuchElementException var2) {
            Assert.fail("Element not found: " + element);
        }

    }

    public void waitForStaleElement(WebElement element) {
        int y = 0;

        while(y <= 15) {
            if (y == 1) {
                try {
                    element.isDisplayed();
                    break;
                } catch (StaleElementReferenceException var7) {
                    ++y;

                    try {
                        Thread.sleep(300L);
                    } catch (InterruptedException var6) {
                        var6.printStackTrace();
                    }
                } catch (WebDriverException var8) {
                    ++y;

                    try {
                        Thread.sleep(300L);
                    } catch (InterruptedException var5) {
                        var5.printStackTrace();
                    }
                }
            }
        }

    }

    public WebElement selectRandomTextFromDropdown(Select select) {
        Random random = new Random();
        List<WebElement> weblist = select.getOptions();
        int optionIndex = 1 + random.nextInt(weblist.size() - 1);
        select.selectByIndex(optionIndex);
        return select.getFirstSelectedOption();
    }

    public void clickWithJS(WebElement element) {
        ((JavascriptExecutor)Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", new Object[]{element});
        ((JavascriptExecutor)Driver.getDriver()).executeScript("arguments[0].click();", new Object[]{element});
    }

    public void scrollToElement(WebElement element) {
        ((JavascriptExecutor)Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", new Object[]{element});
    }

    public void doubleClick(WebElement element) {
        (new Actions(Driver.getDriver())).doubleClick(element).build().perform();
    }

    public void setAttribute(WebElement element, String attributeName, String attributeValue) {
        ((JavascriptExecutor)Driver.getDriver()).executeScript("arguments[0].setAttribute(arguments[1], arguments[2]);", new Object[]{element, attributeName, attributeValue});
    }

    public void selectCheckBox(WebElement element, boolean check) {
        if (check) {
            if (!element.isSelected()) {
                element.click();
            }
        } else if (element.isSelected()) {
            element.click();
        }

    }
}
