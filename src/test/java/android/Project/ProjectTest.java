package android.Project;

import android.AccountTest;
import com.framework.base.android.Base;
import org.testng.annotations.Test;

public class ProjectTest extends Base {

    @Test(description = "The user can reproduce an introductory video to learn more about that specific project.")
    public void projectVideoPlayback() throws InterruptedException {
        //Arrange
        verifyUserLoginStatus();
        headerPage.tapMenuButton();
        menuPage.tapRecommendedCollectionButton();
        recommendedPage.tapMagicTab();

        //Act
        recommendedPage.tapProjectListing();
        projectPage.tapPlayVideoButton();
        videoPlaybackPage.tapVideoFrame();

        //Assert
        softAssert.assertEquals(videoPlaybackPage.getPlayerControls().isDisplayed(), "true", "Verifying the video played by checking video controls");

        projectPage.tapBackButton();
    }

    @Test (description = "The user can share the project on various websites and social media platforms.")
    public void shareProject() {

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
