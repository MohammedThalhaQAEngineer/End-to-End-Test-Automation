package com.cloudautomation.tests;

import com.cloudautomation.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://example.com/login");
    }

    @Test
    public void validLoginTest() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername("validUser");
        loginPage.enterPassword("validPass");
        loginPage.clickLoginButton();
        // Add assertions to verify successful login
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
