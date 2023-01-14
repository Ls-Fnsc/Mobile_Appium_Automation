package android.Project;

import android.AccountTest;
import com.framework.base.android.Base;
import com.framework.base.android.Common;
import org.testng.annotations.Test;

public class ProjectTest extends Base {

    @Test (description = "The user can share a project on various websites and social media platforms.")
    public void shareProject() throws InterruptedException {
        //Arrange
        verifyUserLoginStatus();
        headerPage.tapMenuButton();
        menuPage.tapAllProjectsCollectionButton();
        allProjectsPage.tapMagicTab();

        //Act
        allProjectsPage.tapProjectListing();
        projectPage.tapShareButton();

        //Assert
        softAssert.assertEquals(projectPage.getShareViewTitle().getText(), "Share", "Verifying the Share view is displayed");

        common.swipeScreen(Common.Direction.DOWN, projectPage.getShareViewHeader().getLocation().x, projectPage.getShareViewHeader().getLocation().y);
        projectPage.tapBackButton();
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
