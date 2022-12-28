package android.ProjectCollections;

import android.AccountTest;
import com.framework.base.android.Base;
import org.testng.annotations.Test;

public class ProjectsWeLoveCollectionTest extends Base {

    @Test(description = "The user can browse for featured projects under the Magic tab.")
    public static void allProjectsCollectionMagicTab() throws InterruptedException {
        //Arrange
        verifyUserLoginStatus();

        //Act (Magic Tab)
        headerPage.tapMenuButton();
        menuPage.tapProjectsWeLoveCollectionButton();
        projectsWeLovePage.tapMagicTab();

        //Assert
        softAssert.assertEquals(projectsWeLovePage.getProjectListing().isDisplayed(), true, "Verifying a project listing is displayed under the Magic Tab of the Projects We Love Screen");
    }

    @Test(description = "The user can browse for featured projects under the Popular tab.")
    public static void allProjectsCollectionPopularTab() throws InterruptedException {
        //Arrange
        verifyUserLoginStatus();

        //Act (Magic Tab)
        headerPage.tapMenuButton();
        menuPage.tapProjectsWeLoveCollectionButton();
        projectsWeLovePage.tapPopularTab();

        //Assert
        softAssert.assertEquals(projectsWeLovePage.getProjectListing().isDisplayed(), true, "Verifying a project listing is displayed under the Popular Tab of the Projects We Love Screen");
    }

    @Test(description = "The user can browse for featured projects under the Newest tab.")
    public static void allProjectsCollectionNewestTab() throws InterruptedException {
        //Arrange
        verifyUserLoginStatus();

        //Act (Magic Tab)
        headerPage.tapMenuButton();
        menuPage.tapProjectsWeLoveCollectionButton();
        projectsWeLovePage.tapNewestTab();

        //Assert
        softAssert.assertEquals(projectsWeLovePage.getProjectListing().isDisplayed(), true, "Verifying a project listing is displayed under the Newest Tab of the Projects We Love Screen");
    }

    @Test(description = "The user can browse for featured projects under the Ending Soon tab.")
    public static void allProjectsCollectionEndingSoonTab() throws InterruptedException {
        //Arrange
        verifyUserLoginStatus();

        //Act (Magic Tab)
        headerPage.tapMenuButton();
        menuPage.tapProjectsWeLoveCollectionButton();
        projectsWeLovePage.tapEndingSoonTab();

        //Assert
        softAssert.assertEquals(projectsWeLovePage.getProjectListing().isDisplayed(), true, "Verifying a project listing is displayed under the Ending Soon Tab of the Projects We Love Screen");
    }

    /*
    General methods.
    */
    public static void verifyUserLoginStatus() throws InterruptedException {
        if (common.getUserLoginStatus() == false) {
            AccountTest.loginEmail();
        }
    }

}
