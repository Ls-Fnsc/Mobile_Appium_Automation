package com.framework.base.android;

import io.appium.java_client.AppiumDriver;
import lombok.SneakyThrows;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Random;

public class Common extends Base{

    public boolean isUserLoggedIn = false;
    Random rand = new Random();

    // isUserLoggedIn setter
    public void setUserLoginStatus(boolean isUserLoggedIn) {
        this.isUserLoggedIn = isUserLoggedIn;
    }
    // isUserLoggedIn getter
    public boolean getUserLoginStatus() {
        return isUserLoggedIn;
    }

    public static void getScreenshot(String testName) throws IOException {
        //Take screenshot
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

        //Save screenshot with the Assertion's Message as image title
        FileUtils.copyFile(scrFile,new File (System.getProperty("user.dir")+"/output/Screenshots/"+testName+".png"));
    }

    @SneakyThrows
    public void waitForXPathElement(String xpath, int seconds) {
        try {
            //Wait desired seconds for the element to show up
            FluentWait<AppiumDriver> wait = new FluentWait<>(driver)
                    .withTimeout(Duration.ofSeconds(seconds))
                    .pollingEvery(Duration.ofMillis(500))
                    .ignoring(NoSuchElementException.class);
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
        } catch (TimeoutException timeoutException) {
            //Take and save screenshot with a random number as image title
            System.out.println(timeoutException);
            String randString = String.valueOf(rand.nextInt(1000));
            common.getScreenshot(randString);
            System.out.println("Missing element. Screenshot saved at: output/Screenshots/"+randString+".png");
        }
    }

}
