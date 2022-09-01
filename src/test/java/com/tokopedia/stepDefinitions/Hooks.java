package com.tokopedia.stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class Hooks {
    public static WebDriver webDriver;
    private static File destFile;

    @Before
    public void setupDriver() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/chromedriver/chromedriver");
        webDriver = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50000));
    }

    @After
    public void tearDown() {
        webDriver.close();
        webDriver.quit();
    }

    public static WebDriver getWebdriver() {
        return webDriver;
    }

    public static void takeSS(String fileName) {
        TakesScreenshot scrShot = ((TakesScreenshot) webDriver);
        File srcFile = scrShot.getScreenshotAs(OutputType.FILE);
        String imgName = System.getProperty("user.dir") + "/src/test/resources/ScreenShoot/" + fileName + ".png";
        destFile = new File(imgName);
        try {
            FileUtils.copyFile(srcFile, destFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
