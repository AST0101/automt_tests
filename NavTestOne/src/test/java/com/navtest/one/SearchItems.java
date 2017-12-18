package com.navtest.one;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SearchItems {

    static WebDriver driver = new ChromeDriver();

    @BeforeClass
    public static void testSetup() {
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Test
    public void getSearchResult() {
        WebElement searchField = driver.findElement(By.id("search_query_top"));
        searchField.sendKeys("print");
        WebElement goSearch = driver.findElement(By.cssSelector("button.btn.btn-default.button-search"));
        goSearch.click();
    }


    @AfterClass
    public static void testShutDown() {
        driver.close();
        driver.quit();
    }
}
