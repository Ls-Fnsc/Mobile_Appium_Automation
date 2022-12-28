package pageObjects.android.Header;

import com.framework.base.android.Base;
import io.appium.java_client.android.AndroidElement;

public class MenuPage extends Base {

    //Finding elements on the page
    public static AndroidElement getSettingsButton() {
        String xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView[1]/android.widget.LinearLayout[1]/android.widget.TextView[2]";
        common.waitForXPathElement(xpath, 10);
        AndroidElement element = (AndroidElement) driver.findElementByXPath(xpath);
        return element;
    }

    public static AndroidElement getRecommendedCollectionButton() {
        String xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView[1]/android.widget.TextView[2]";
        common.waitForXPathElement(xpath, 10);
        AndroidElement element = (AndroidElement) driver.findElementByXPath(xpath);
        return element;
    }

    public static AndroidElement getAllProjectsCollectionButton() {
        String xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView[1]/android.widget.TextView[3]";
        common.waitForXPathElement(xpath, 10);
        AndroidElement element = (AndroidElement) driver.findElementByXPath(xpath);
        return element;
    }

    public static AndroidElement getProjectsWeLoveCollectionButton() {
        String xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView[1]/android.widget.TextView[4]";
        common.waitForXPathElement(xpath, 10);
        AndroidElement element = (AndroidElement) driver.findElementByXPath(xpath);
        return element;
    }

    public static AndroidElement getSavedProjectsCollectionButton() {
        String xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView[1]/android.widget.TextView[5]";
        common.waitForXPathElement(xpath, 10);
        AndroidElement element = (AndroidElement) driver.findElementByXPath(xpath);
        return element;
    }

    //Interacting with elements on the page
    public static void tapSettingsButton() {
        getSettingsButton().click();
    }

    public static void tapRecommendedCollectionButton() {
        getRecommendedCollectionButton().click();
    }

    public static void tapAllProjectsCollectionButton() {
        getAllProjectsCollectionButton().click();
    }

    public static void tapProjectsWeLoveCollectionButton() {
        getProjectsWeLoveCollectionButton().click();
    }

    public static void tapSavedProjectsCollectionButton() {
        getSavedProjectsCollectionButton().click();
    }
}
