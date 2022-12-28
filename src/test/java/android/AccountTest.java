package android;

import com.framework.base.android.Base;
import org.testng.annotations.Test;

public class AccountTest extends Base {

    @Test (description = "An existing user attempts to login to their account", groups = {"Smoke"})
    public static void loginEmail() throws InterruptedException {
        //Arrange
        allProjectsPage.tapMagicTab();
        allProjectsPage.tapSignInButton();

        //Act
        loginSignUpPage.tapLogInButton();
        logInPage.tapEmailTextField();
        logInPage.typeEmail("portfoliotestmail001@gmail.com");
        logInPage.tapPasswordTextField();
        logInPage.typePassword("ytO6736D");
        logInPage.tapLogInButton();

        //Assert
        softAssert.assertEquals(recommendedPage.getTitle().getText(), "Recommended", "Verifying user logged in by checking the user is in Recommended Screen");

        common.setUserLoginStatus(true);
        System.out.println("User status: "+common.getUserLoginStatus());
    }

    @Test (description = "An existing user attempts to log out of their account", groups = {"Smoke"})
    public static void logoutEmail() throws InterruptedException {
        //Arrange
        verifyUserLoginStatus();

        //Act
        headerPage.tapMenuButton();
        menuPage.tapSettingsButton();
        settingsPage.tapLogoutButton();
        settingsPage.tapLogoutOkButton();

        //Assert
        softAssert.assertEquals(allProjectsPage.getTitle().getText(), "All Projects", "Verifying user logged out by checking the user is in All Projects Screen");

        common.setUserLoginStatus(false);
        System.out.println("User status: "+common.getUserLoginStatus());
    }

    /*
    General methods.
    */
    public static void verifyUserLoginStatus() throws InterruptedException {
        if (common.getUserLoginStatus() == false) {
            loginEmail();
        }
    }

}
