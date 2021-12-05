package com.realTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AssertionExample {
    WebDriver driver;

    @BeforeClass
    @Parameters({"browser", "url"})
    void setUp(String browser, String app) {
        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\chromedriver 95\\chromedriver_win32 (1)\\chromedriver.exe");
            driver = new ChromeDriver();
            // driver.get("https://opensource-demo.orangehrmlive.com/");
            driver.get(app);
        }
        if (browser.equalsIgnoreCase("firefox")) {
            /*System.setProperty("webdriver.gecko.driver", "");
            driver = new FirefoxDriver();
            driver.get("https://opensource-demo.orangehrmlive.com/");*/
            Assert.assertTrue(true);
        }

    }

    @Test
    void logoTest() {
        WebElement logo = driver.findElement(By.xpath("//*[@id=\"divLogo\"]/img"));
        Assert.assertTrue(logo.isDisplayed(), "logo not displayed on page");
    }

    @AfterClass
    @Test
    void tearDown() {
        driver.quit();
    }
}
