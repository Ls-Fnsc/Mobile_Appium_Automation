package com.framework.base.android;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
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

    /**
     * Performs swipe from the center of screen
     *
     * @param dir the direction of swipe
     * @version java-client: 7.3.0
     **/
    public void swipeScreen(Direction dir, int xOffset, int yOffset) {
        System.out.println("swipeScreen(): dir: '" + dir + "'");

        // Animation default time:
        //  - Android: 300 ms
        //  - iOS: 200 ms
        // final value depends on your app and could be greater
        final int ANIMATION_TIME = 200; // ms

        final int PRESS_TIME = 200; // ms

        int edgeBorder = 10; // better avoid edges
        PointOption pointOptionStart, pointOptionEnd;

        // init screen variables
        Dimension dims = driver.manage().window().getSize();

        // start point depending on the target component
        pointOptionStart = PointOption.point(xOffset, yOffset);

        switch (dir) {
            case DOWN: // center of footer
                pointOptionEnd = PointOption.point(dims.width / 2, dims.height - edgeBorder);
                break;
            case UP: // center of header
                pointOptionEnd = PointOption.point(dims.width / 2, edgeBorder);
                break;
            case LEFT: // center of left side
                pointOptionEnd = PointOption.point(edgeBorder, dims.height / 2);
                break;
            case RIGHT: // center of right side
                pointOptionEnd = PointOption.point(dims.width - edgeBorder, dims.height / 2);
                break;
            default:
                throw new IllegalArgumentException("swipeScreen(): dir: '" + dir + "' NOT supported");
        }

        // execute swipe using TouchAction
        try {
            new TouchAction(driver)
                    .press(pointOptionStart)
                    // a bit more reliable when we add small wait
                    .waitAction(WaitOptions.waitOptions(Duration.ofMillis(PRESS_TIME)))
                    .moveTo(pointOptionEnd)
                    .release().perform();
        } catch (Exception e) {
            System.err.println("swipeScreen(): TouchAction FAILED\n" + e.getMessage());
            return;
        }

        // always allow swipe action to complete
        try {
            Thread.sleep(ANIMATION_TIME);
        } catch (InterruptedException e) {
            // ignore
        }
    }

    public enum Direction {
        UP,
        DOWN,
        LEFT,
        RIGHT;
    }
}
