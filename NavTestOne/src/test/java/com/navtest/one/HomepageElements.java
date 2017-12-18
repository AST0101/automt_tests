package com.navtest.one;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomepageElements {

    WebDriver newDriver = new ChromeDriver();

    public WebElement signInButton = newDriver.findElement(By.cssSelector(".login"));
}
