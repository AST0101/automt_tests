package com.navtest.one;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SiteLogin {

    static WebDriver driver = new ChromeDriver();

    @BeforeClass
    public static void testSetup() {
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterClass
    public static void testShutDown() {
        driver.close();
        driver.quit();
    }

    //not working
    @Test
    public void goToLogin() {
        HomepageElements lg = new HomepageElements();
        lg.signInButton.click();
        String currentUrl = driver.getCurrentUrl();
        System.out.println("The current page is " + currentUrl);
    }

}
