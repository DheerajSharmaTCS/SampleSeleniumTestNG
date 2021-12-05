package com.realTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstPro {
    static WebDriver driver;
    //@Test
    public static void main(String[] args) {
       // System.out.print("ABCD");

        System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\chromedriver 95\\chromedriver_win32 (1)\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.google.com");
        System.out.print("Tsted");
    }
}
