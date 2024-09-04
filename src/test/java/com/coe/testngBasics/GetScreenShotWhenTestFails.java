package com.coe.testngBasics;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class GetScreenShotWhenTestFails {
    WebDriver driver;
    @Test
    public void getScreenshot() throws IOException {
        driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement loginButton = driver.findElement(By.cssSelector(".submit-button.btn_action"));

        TakesScreenshot takesScreenshot = (TakesScreenshot)driver;
        File source = takesScreenshot.getScreenshotAs(OutputType.FILE);
        File dest = new File(System.getProperty("user.dir")+"/screenshots/sauceHomeScreen.png");
        FileUtils.copyFile(source, dest);

        File sourceWebElement = loginButton.getScreenshotAs(OutputType.FILE);
        File destWebElement = new File(System.getProperty("user.dir")+"/screenshots/loginButton.png");
        FileUtils.copyFile(sourceWebElement, destWebElement);
        driver.quit();

    }
}
