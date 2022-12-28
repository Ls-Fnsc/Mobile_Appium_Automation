package android.ProjectCollections;

import android.AccountTest;
import com.framework.base.android.Base;
import org.testng.annotations.Test;

public class RecommendedCollectionTest extends Base {

    @Test(description = "The user can browse for recommended projects under the Magic tab.")
    public static void recommendedCollectionMagicTab() throws InterruptedException {
        //Arrange
        verifyUserLoginStatus();

        //Act (Magic Tab)
        headerPage.tapMenuButton();
        menuPage.tapRecommendedCollectionButton();
        recommendedPage.tapMagicTab();

        //Assert
        softAssert.assertEquals(recommendedPage.getProjectListing().isDisplayed(), true, "Verifying a project listing is displayed under the Magic Tab of the Recommended Screen");
    }

    @Test(description = "The user can browse for recommended projects under the Popular tab.")
    public static void recommendedCollectionPopularTab() throws InterruptedException {
        //Arrange
        verifyUserLoginStatus();

        //Act (Magic Tab)
        headerPage.tapMenuButton();
        menuPage.tapRecommendedCollectionButton();
        recommendedPage.tapPopularTab();

        //Assert
        softAssert.assertEquals(recommendedPage.getProjectListing().isDisplayed(), true, "Verifying a project listing is displayed under the Popular Tab of the Recommended Screen");
    }

    @Test(description = "The user can browse for recommended projects under the Newest tab.")
    public static void recommendedCollectionNewestTab() throws InterruptedException {
        //Arrange
        verifyUserLoginStatus();

        //Act (Magic Tab)
        headerPage.tapMenuButton();
        menuPage.tapRecommendedCollectionButton();
        recommendedPage.tapNewestTab();

        //Assert
        softAssert.assertEquals(recommendedPage.getProjectListing().isDisplayed(), true, "Verifying a project listing is displayed under the Newest Tab of the Recommended Screen");
    }

    @Test(description = "The user can browse for recommended projects under the Ending Soon tab.")
    public static void recommendedCollectionEndingSoonTab() throws InterruptedException {
        //Arrange
        verifyUserLoginStatus();

        //Act (Magic Tab)
        headerPage.tapMenuButton();
        menuPage.tapRecommendedCollectionButton();
        recommendedPage.tapEndingSoonTab();

        //Assert
        softAssert.assertEquals(recommendedPage.getProjectListing().isDisplayed(), true, "Verifying a project listing is displayed under the Ending Soon Tab of the Recommended Screen");
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
