package android.ProjectCollections;

import android.AccountTest;
import com.framework.base.android.Base;
import org.testng.annotations.Test;

public class CollectionsTest extends Base {

    @Test(description = "The user can browse projects that are recommended to them based on their activity", groups = {"Smoke"})
    public static void recommendedCollection() throws InterruptedException {
        //Arrange
        verifyUserLoginStatus();

        //Act
        headerPage.tapMenuButton();
        menuPage.tapRecommendedCollectionButton();

        //Asserting all tabs are present and with the correct label
        //Magic Tab
        softAssert.assertEquals(recommendedPage.getMagicTab().isDisplayed(), true, "Verifying Magic Tab of Recommended Screen is displayed");
        softAssert.assertEquals(recommendedPage.getMagicTab().getText(), "MAGIC", "Verifying Magic Tab's text of Recommended Screen is labeled correctly");
        //Popular tab
        softAssert.assertEquals(recommendedPage.getPopularTab().isDisplayed(), true, "Verifying Popular Tab of Recommended Screen is displayed");
        softAssert.assertEquals(recommendedPage.getPopularTab().getText(), "POPULAR", "Verifying Popular Tab's text of Recommended Screen is label correctly");
        //Newest tab
        softAssert.assertEquals(recommendedPage.getNewestTab().isDisplayed(), true, "Verifying Newest Tab of Recommended Screen is displayed");
        softAssert.assertEquals(recommendedPage.getNewestTab().getText(), "NEWEST", "Verifying Newest Tab's text of Recommended Screen is label correctly");
        //Ending Soon tab
        softAssert.assertEquals(recommendedPage.getEndingSoonTab().isDisplayed(), true, "Verifying Ending Soon Tab of Recommended Screen is displayed");
        softAssert.assertEquals(recommendedPage.getEndingSoonTab().getText(), "ENDING SOON", "Verifying Ending Soon Tab's text of Recommended Screen is label correctly");
    }

    @Test(description = "The user can browse all the projects available to fund.")
    public static void allProjectsCollection() throws InterruptedException {
        //Arrange
        verifyUserLoginStatus();

        //Act
        headerPage.tapMenuButton();
        menuPage.tapAllProjectsCollectionButton();

        //Asserting all tabs are present and with the correct label
        //Magic tab
        softAssert.assertEquals(allProjectsPage.getMagicTab().isDisplayed(), true, "Verifying Magic Tab of All Projects Screen is displayed");
        softAssert.assertEquals(allProjectsPage.getMagicTab().getText(), "MAGIC", "Verifying Magic Tab's text of All Projects Screen is labeled correctly");
        //Popular tab
        softAssert.assertEquals(allProjectsPage.getPopularTab().isDisplayed(), true, "Verifying Popular Tab of All Projects Screen is displayed");
        softAssert.assertEquals(allProjectsPage.getPopularTab().getText(), "POPULAR", "Verifying Popular Tab's text of All Projects Screen is label correctly");
        //Newest tab
        softAssert.assertEquals(allProjectsPage.getNewestTab().isDisplayed(), true, "Verifying Newest Tab of All Projects Screen is displayed");
        softAssert.assertEquals(allProjectsPage.getNewestTab().getText(), "NEWEST", "Verifying Newest Tab's text of All Projects Screen is label correctly");
        //Ending Soon tab
        softAssert.assertEquals(allProjectsPage.getEndingSoonTab().isDisplayed(), true, "Verifying Ending Soon Tab of All Projects Screen is displayed");
        softAssert.assertEquals(allProjectsPage.getEndingSoonTab().getText(), "ENDING SOON", "Verifying Ending Soon Tab's text of All Projects Screen is label correctly");
    }

    @Test(description = "The user can browse for featured projects tagged as Projects We Love.")
    public static void projectsWeLoveCollection() throws InterruptedException {
        //Arrange
        verifyUserLoginStatus();

        //Act
        headerPage.tapMenuButton();
        menuPage.tapProjectsWeLoveCollectionButton();

        //Asserting all tabs are present and with the correct label
        //Magic tab
        softAssert.assertEquals(projectsWeLovePage.getMagicTab().isDisplayed(), true, "Verifying Magic Tab of Projects We Love Screen is displayed");
        softAssert.assertEquals(projectsWeLovePage.getMagicTab().getText(), "MAGIC", "Verifying Magic Tab's text of Projects We Love Screen is labeled correctly");
        //Popular tab
        softAssert.assertEquals(projectsWeLovePage.getPopularTab().isDisplayed(), true, "Verifying Popular Tab of Projects We Love Screen is displayed");
        softAssert.assertEquals(projectsWeLovePage.getPopularTab().getText(), "POPULAR", "Verifying Popular Tab's text of Projects We Love Screen is label correctly");
        //Newest tab
        softAssert.assertEquals(projectsWeLovePage.getNewestTab().isDisplayed(), true, "Verifying Newest Tab of Projects We Love Screen is displayed");
        softAssert.assertEquals(projectsWeLovePage.getNewestTab().getText(), "NEWEST", "Verifying Newest Tab's text of Projects We Love Screen is label correctly");
        //Ending Soon tab
        softAssert.assertEquals(projectsWeLovePage.getEndingSoonTab().isDisplayed(), true, "Verifying Ending Soon Tab of Projects We Love Screen is displayed");
        softAssert.assertEquals(projectsWeLovePage.getEndingSoonTab().getText(), "ENDING SOON", "Verifying Ending Soon Tab's text of Projects We Love Screen is label correctly");
    }

    @Test(description = "The user can browse previously saved projects.")
    public static void savedProjectsCollection() throws InterruptedException {
        //Arrange
        verifyUserLoginStatus();

        //Act
        headerPage.tapMenuButton();
        menuPage.tapSavedProjectsCollectionButton();

        //Asserting all tabs are present and with the correct label
        //Magic tab
        softAssert.assertEquals(savedProjectsPage.getMagicTab().isDisplayed(), true, "Verifying Magic Tab of Saved Projects Screen is displayed");
        softAssert.assertEquals(savedProjectsPage.getMagicTab().getText(), "MAGIC", "Verifying Magic Tab's text of Saved Projects Screen is labeled correctly");
        //Popular tab
        softAssert.assertEquals(savedProjectsPage.getPopularTab().isDisplayed(), true, "Verifying Popular Tab of Saved Projects Screen is displayed");
        softAssert.assertEquals(savedProjectsPage.getPopularTab().getText(), "POPULAR", "Verifying Popular Tab's text of Saved Projects Screen is label correctly");
        //Newest tab
        softAssert.assertEquals(savedProjectsPage.getNewestTab().isDisplayed(), true, "Verifying Newest Tab of Saved Projects Screen is displayed");
        softAssert.assertEquals(savedProjectsPage.getNewestTab().getText(), "NEWEST", "Verifying Newest Tab's text of Saved Projects Screen is label correctly");
        //Ending Soon tab
        softAssert.assertEquals(savedProjectsPage.getEndingSoonTab().isDisplayed(), true, "Verifying Ending Soon Tab of Saved Projects Screen is displayed");
        softAssert.assertEquals(savedProjectsPage.getEndingSoonTab().getText(), "ENDING SOON", "Verifying Ending Soon Tab's text of Saved Projects Screen is label correctly");
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
