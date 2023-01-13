package android.ProjectCollections;

import android.AccountTest;
import com.framework.base.android.Base;
import org.testng.annotations.Test;

public class AllProjectsCollectionTest extends Base {

    @Test(description = "The user can browse all the available projects under the Magic tab.", groups = {"allProjectsSmokeTest"})
    public static void allProjectsCollectionMagicTab() throws InterruptedException {
        //Arrange
        verifyUserLoginStatus();

        //Act (Magic Tab)
        headerPage.tapMenuButton();
        menuPage.tapAllProjectsCollectionButton();
        allProjectsPage.tapMagicTab();

        //Assert
        softAssert.assertEquals(allProjectsPage.getProjectListing().isDisplayed(), true, "Verifying a project listing is displayed under the Magic Tab of the All Projects Screen");
    }

    @Test(description = "The user can browse all the available projects under the Popular tab.", groups = {"allProjectsSmokeTest"})
    public static void allProjectsCollectionPopularTab() throws InterruptedException {
        //Arrange
        verifyUserLoginStatus();

        //Act (Magic Tab)
        headerPage.tapMenuButton();
        menuPage.tapAllProjectsCollectionButton();
        allProjectsPage.tapPopularTab();

        //Assert
        softAssert.assertEquals(allProjectsPage.getProjectListing().isDisplayed(), true, "Verifying a project listing is displayed under the Popular Tab of the All Projects Screen");
    }

    @Test(description = "The user can browse all the available projects under the Newest tab.", groups = {"allProjectsSmokeTest"})
    public static void allProjectsCollectionNewestTab() throws InterruptedException {
        //Arrange
        verifyUserLoginStatus();

        //Act (Magic Tab)
        headerPage.tapMenuButton();
        menuPage.tapAllProjectsCollectionButton();
        allProjectsPage.tapNewestTab();

        //Assert
        softAssert.assertEquals(allProjectsPage.getProjectListing().isDisplayed(), true, "Verifying a project listing is displayed under the Newest Tab of the All Projects Screen");
    }

    @Test(description = "The user can browse all the available projects under the Ending Soon tab.", groups = {"allProjectsSmokeTest"})
    public static void allProjectsCollectionEndingSoonTab() throws InterruptedException {
        //Arrange
        verifyUserLoginStatus();

        //Act (Magic Tab)
        headerPage.tapMenuButton();
        menuPage.tapAllProjectsCollectionButton();
        allProjectsPage.tapEndingSoonTab();

        //Assert
        softAssert.assertEquals(allProjectsPage.getProjectListing().isDisplayed(), true, "Verifying a project listing is displayed under the Ending Soon Tab of the All Projects Screen");
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
