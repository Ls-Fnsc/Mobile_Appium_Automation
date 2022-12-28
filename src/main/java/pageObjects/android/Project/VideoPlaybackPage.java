package pageObjects.android.Project;

import com.framework.base.android.Base;
import io.appium.java_client.android.AndroidElement;

public class VideoPlaybackPage extends Base {

    //Finding elements on the page
    public static AndroidElement getVideoFrame() {
        String xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout";
        common.waitForXPathElement(xpath, 10);
        AndroidElement element = (AndroidElement) driver.findElementByXPath(xpath);
        return element;
    }

    public static AndroidElement getPlayerControls() {
        String xpath = "//android.widget.FrameLayout[@content-desc='Show player controls']";
        common.waitForXPathElement(xpath, 10);
        AndroidElement element = (AndroidElement) driver.findElementByXPath(xpath);
        return element;
    }

    //Interacting with elements on the page
    public static void tapVideoFrame() {
        getVideoFrame().click();
    }

}
