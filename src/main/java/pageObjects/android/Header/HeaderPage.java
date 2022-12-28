package pageObjects.android.Header;

import com.framework.base.android.Base;
import io.appium.java_client.android.AndroidElement;

public class HeaderPage extends Base {

    //Finding elements on the page
    public static AndroidElement getMenuButton() {
        String xpath = "//android.widget.ImageButton[@content-desc='User menu']";
        common.waitForXPathElement(xpath, 10);
        AndroidElement element = (AndroidElement) driver.findElementByXPath(xpath);
        return element;
    }

    //Interacting with elements on the page
    public static void tapMenuButton() {
        getMenuButton().click();
    }

}
