package pageObjects.android.Collections;

import com.framework.base.android.Base;
import io.appium.java_client.android.AndroidElement;

public class SavedProjectsPage extends Base {

    //Finding elements on the page
    public static AndroidElement getMagicTab() {
        String xpath = "//android.widget.LinearLayout[@content-desc='Magic']/android.widget.TextView";
        common.waitForXPathElement(xpath, 10);
        AndroidElement element = (AndroidElement) driver.findElementByXPath(xpath);
        return element;
    }

    public static AndroidElement getPopularTab() {
        String xpath = "//android.widget.LinearLayout[@content-desc='Popular']/android.widget.TextView";
        common.waitForXPathElement(xpath, 10);
        AndroidElement element = (AndroidElement) driver.findElementByXPath(xpath);
        return element;
    }

    public static AndroidElement getNewestTab() {
        String xpath = "//android.widget.LinearLayout[@content-desc='Newest']/android.widget.TextView";
        common.waitForXPathElement(xpath, 10);
        AndroidElement element = (AndroidElement) driver.findElementByXPath(xpath);
        return element;
    }

    public static AndroidElement getEndingSoonTab() {
        String xpath = "//android.widget.LinearLayout[@content-desc='Ending Soon']/android.widget.TextView";
        common.waitForXPathElement(xpath, 10);
        AndroidElement element = (AndroidElement) driver.findElementByXPath(xpath);
        return element;
    }

    public static AndroidElement getProjectListing(){
        String xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.ScrollView/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout";
        common.waitForXPathElement(xpath, 10);
        AndroidElement element = (AndroidElement) driver.findElementByXPath(xpath);
        return element;
    }

    //Interacting with elements on the page
    public static void tapMagicTab() {
        getMagicTab().click();
    }

    public static void tapPopularTab() {
        getPopularTab().click();
    }

    public static void tapNewestTab() {
        getNewestTab().click();
    }

    public static void tapEndingSoonTab() {
        getEndingSoonTab().click();
    }

}
