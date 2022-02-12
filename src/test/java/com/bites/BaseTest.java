package com.bites;

import org.apache.commons.io.FileUtils;
import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;

public class BaseTest {

    private static String BASE_URL = "http://automationpractice.com/index.php";
    static WebDriver webDriver = null;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-notifications");
        options.addArguments("disable-popup-blocking");
        setWebDriver(new ChromeDriver(options));
        getWebDriver().manage().window().maximize();
        getWebDriver().get(BASE_URL);
    }

    public static WebDriver getWebDriver() {
        return webDriver;
    }

    public static void setWebDriver(WebDriver webDriver) {
        BaseTest.webDriver = webDriver;
    }

    public void tearDown(){
        getWebDriver().quit();
    }

    public static void takeSnapshot(WebDriver driver, String fileWithPath) throws Exception{
        TakesScreenshot ts = ((TakesScreenshot) driver);
        File srcFile = ts.getScreenshotAs(OutputType.FILE);
        File destFile = new File(fileWithPath);
        FileUtils.copyFile(srcFile,destFile);
    }
}