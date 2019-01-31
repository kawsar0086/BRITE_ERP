package com.briteerp.utilities;

import com.aventstack.extentreports.ExtentReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public abstract class TestBase {
    protected WebDriver driver;
    protected Pages pages;
    protected static ExtentReports report;
    private static ExtentHtmlReporter htmlReporter;
    protected static ExtentTest extentLogger;

    public TestBase() {
    }

    @BeforeMethod(
            alwaysRun = true
    )
    public void setupMethod() {
        this.driver = Driver.getDriver();
        this.pages = new Pages();
        this.driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
        this.driver.get(ConfigurationReader.getProperty("url"));
    }

    @AfterMethod(
            alwaysRun = true
    )
    public void tearDownMethod(ITestResult result) throws IOException {
        if (result.getStatus() == 2) {
            String screenshotLocation = BrowserUtils.getScreenshot(result.getName());
            extentLogger.fail(result.getName());
            extentLogger.addScreenCaptureFromPath(screenshotLocation);
            extentLogger.fail(result.getThrowable());
        } else if (result.getStatus() == 3) {
            extentLogger.skip("Test Case Skipped: " + result.getName());
        }

        Driver.closeDriver();
    }

    @BeforeTest(
            alwaysRun = true
    )
    public void setUpTest() {
        report = new ExtentReports();
        String filePath = System.getProperty("user.dir") + "/test-output/report.html";
        htmlReporter = new ExtentHtmlReporter(filePath);
        report.attachReporter(new ExtentReporter[]{htmlReporter});
        report.setSystemInfo("Environment", "Staging");
        report.setSystemInfo("Browser", ConfigurationReader.getProperty("browser"));
        report.setSystemInfo("OS", System.getProperty("os.name"));
        report.setSystemInfo("QA Engineer", "Admiral Kunkka");
        htmlReporter.config().setDocumentTitle("Prestashop Reports");
        htmlReporter.config().setReportName("Prestashop Automated Test Reports");
    }

<<<<<<< HEAD


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
=======
    @AfterTest(
            alwaysRun = true
    )
    public void tearDownTest() {
        report.flush();
>>>>>>> 7961694dea84fc931147a80686dee821d40f54d9
    }
}
