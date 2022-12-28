package pageObjects.android.LoginSignUp;

import com.framework.base.android.Base;
import io.appium.java_client.android.AndroidElement;

public class LoginSignUpPage extends Base {

    //Finding elements on the page
    public static AndroidElement getLogInButton() {
        String xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[2]";
        common.waitForXPathElement(xpath, 10);
        AndroidElement element = (AndroidElement) driver.findElementByXPath(xpath);
        return element;
    }

    public static AndroidElement getSignUpButton() {
        String xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[3]";
        common.waitForXPathElement(xpath, 10);
        AndroidElement element = (AndroidElement) driver.findElementByXPath(xpath);
        return element;
    }



    //Interacting with elements on the page
    public static void tapLogInButton() {
        getLogInButton().click();
    }

    public static void tapSignUpButton() {
        getSignUpButton().click();
    }

}
