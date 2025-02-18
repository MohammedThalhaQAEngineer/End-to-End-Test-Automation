package com.cloudautomation.tests;

import com.cloudautomation.pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Assert;

public class HomeTest {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://example.com/home");
    }

    @Test
    public void verifyWelcomeMessageTest() {
        HomePage homePage = new HomePage(driver);
        String welcomeMsg = homePage.getWelcomeMessage();
        Assert.assertEquals(welcomeMsg, "Welcome, validUser!");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
