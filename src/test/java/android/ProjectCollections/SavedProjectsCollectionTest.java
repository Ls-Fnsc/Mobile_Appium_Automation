package android.ProjectCollections;

import android.AccountTest;
import com.framework.base.android.Base;
import org.testng.annotations.Test;

public class SavedProjectsCollectionTest extends Base {

    @Test(description = "The user can browse previously saved projects under the Magic tab.", groups = {"savedProjectsSmokeTest"})
    public static void savedProjectsCollectionMagicTab() throws InterruptedException {
        //Arrange
        verifyUserLoginStatus();

        //Act (Magic Tab)
        headerPage.tapMenuButton();
        menuPage.tapSavedProjectsCollectionButton();
        savedProjectsPage.tapMagicTab();

        //Assert
        softAssert.assertEquals(savedProjectsPage.getProjectListing().isDisplayed(), true, "Verifying a project listing is displayed under the Magic Tab of the Saved Projects");
    }

    @Test(description = "The user can browse previously saved projects under the Popular tab.", groups = {"savedProjectsSmokeTest"})
    public static void savedProjectsCollectionPopularTab() throws InterruptedException {
        //Arrange
        verifyUserLoginStatus();

        //Act (Magic Tab)
        headerPage.tapMenuButton();
        menuPage.tapSavedProjectsCollectionButton();
        savedProjectsPage.tapPopularTab();

        //Assert
        softAssert.assertEquals(savedProjectsPage.getProjectListing().isDisplayed(), true, "Verifying a project listing is displayed under the Popular Tab of the Saved Projects");
    }

    @Test(description = "The user can browse previously saved projects under the Newest tab.", groups = {"savedProjectsSmokeTest"})
    public static void savedProjectsCollectionNewestTab() throws InterruptedException {
        //Arrange
        verifyUserLoginStatus();

        //Act (Magic Tab)
        headerPage.tapMenuButton();
        menuPage.tapSavedProjectsCollectionButton();
        savedProjectsPage.tapNewestTab();

        //Assert
        softAssert.assertEquals(savedProjectsPage.getProjectListing().isDisplayed(), true, "Verifying a project listing is displayed under the Newest Tab of the Saved Projects");
    }

    @Test(description = "The user can browse previously saved projects under the Ending Soon tab.", groups = {"savedProjectsSmokeTest"})
    public static void savedProjectsCollectionEndingSoonTab() throws InterruptedException {
        //Arrange
        verifyUserLoginStatus();

        //Act (Magic Tab)
        headerPage.tapMenuButton();
        menuPage.tapSavedProjectsCollectionButton();
        savedProjectsPage.tapEndingSoonTab();

        //Assert
        softAssert.assertEquals(savedProjectsPage.getProjectListing().isDisplayed(), true, "Verifying a project listing is displayed under the Ending Soon Tab of the Saved Projects");
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
