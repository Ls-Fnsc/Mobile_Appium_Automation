package com.framework.base.android;

import com.framework.listeners.android.AssertionLogging;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import pageObjects.android.Collections.AllProjectsPage;
import pageObjects.android.Collections.ProjectsWeLovePage;
import pageObjects.android.Collections.RecommendedPage;
import pageObjects.android.Collections.SavedProjectsPage;
import pageObjects.android.Header.HeaderPage;
import pageObjects.android.Header.MenuPage;
import pageObjects.android.LoginSignUp.LogInPage;
import pageObjects.android.LoginSignUp.LoginSignUpPage;
import pageObjects.android.Menu.SettingsPage;
import pageObjects.android.Project.ProjectPage;
import pageObjects.android.Project.VideoPlaybackPage;

import java.net.MalformedURLException;
import java.net.URL;

public class Base {

    public static AppiumDriver driver;
    public static Common common = new Common();
    public static AssertionLogging softAssert = new AssertionLogging();

    //Creating objects for PageObject classes
    public static AllProjectsPage allProjectsPage = new AllProjectsPage();
    public static RecommendedPage recommendedPage = new RecommendedPage();
    public static LoginSignUpPage loginSignUpPage = new LoginSignUpPage();
    public static LogInPage logInPage = new LogInPage();
    public static HeaderPage headerPage = new HeaderPage();
    public static MenuPage menuPage = new MenuPage();
    public static SettingsPage settingsPage = new SettingsPage();
    public static ProjectsWeLovePage projectsWeLovePage = new ProjectsWeLovePage();
    public static SavedProjectsPage savedProjectsPage = new SavedProjectsPage();
    public static ProjectPage projectPage = new ProjectPage();
    public static VideoPlaybackPage videoPlaybackPage = new VideoPlaybackPage();

    @BeforeSuite (alwaysRun = true)
    public void capabilities() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("automatioName", "uiautomator2");
        capabilities.setCapability("platformVersion", "11.0");
        capabilities.setCapability("deviceName", "Android Emulator");
        capabilities.setCapability("app", System.getProperty("user.dir")+"/src/main/resources/Kickstarter.apk");

        driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    }

    @AfterSuite (alwaysRun = true)
    public void tearDown(){
        driver.quit();
    }

}
