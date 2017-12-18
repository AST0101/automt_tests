package com.navtest.one;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TestUrl {

    static WebDriver driver = new ChromeDriver();

    @BeforeClass
    public static void testSetup() {
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @AfterClass
    public static void testShutDown() {
        driver.close();
        driver.quit();
    }


    @Test
    public void checkPageUrl() {
        String url = driver.getCurrentUrl();
        System.out.println("The url is " + url);
    }

    @Test
    public void checkPageTitle() {
        String pageTitle = driver.getTitle();
        System.out.println("The title of the page is " + pageTitle);
    }


}
