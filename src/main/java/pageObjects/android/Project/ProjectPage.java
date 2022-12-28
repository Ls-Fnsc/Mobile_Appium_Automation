package pageObjects.android.Project;

import com.framework.base.android.Base;
import io.appium.java_client.android.AndroidElement;

public class ProjectPage extends Base {

    //Finding elements on the page
    public static AndroidElement getBackButton() {
        String xpath = "//android.widget.Button[@content-desc='Close project']";
        common.waitForXPathElement(xpath, 120);
        AndroidElement element = (AndroidElement) driver.findElementByXPath(xpath);
        return element;
    }

    public static AndroidElement getShareButton() {
        String xpath = "//android.widget.ImageButton[@content-desc='Share this project']";
        common.waitForXPathElement(xpath, 10);
        AndroidElement element = (AndroidElement) driver.findElementByXPath(xpath);
        return element;
    }

    public static AndroidElement getSaveButton() {
        String xpath = "//android.widget.ImageButton[@content-desc='Save this project']";
        common.waitForXPathElement(xpath, 10);
        AndroidElement element = (AndroidElement) driver.findElementByXPath(xpath);
        return element;
    }

    public static AndroidElement getPlayVideoButton() {
        String xpath = "//android.widget.ImageButton[@content-desc='Play video']";
        common.waitForXPathElement(xpath, 10);
        AndroidElement element = (AndroidElement) driver.findElementByXPath(xpath);
        return element;
    }

    public static AndroidElement getOverviewTab() {
        String xpath = "//android.widget.LinearLayout[@content-desc='Overview']/android.widget.TextView";
        common.waitForXPathElement(xpath, 10);
        AndroidElement element = (AndroidElement) driver.findElementByXPath(xpath);
        return element;
    }

    public static AndroidElement getCampaignTab() {
        String xpath = "//android.widget.LinearLayout[@content-desc='Campaign']/android.widget.TextView";
        common.waitForXPathElement(xpath, 10);
        AndroidElement element = (AndroidElement) driver.findElementByXPath(xpath);
        return element;
    }

    public static AndroidElement getFAQTab() {
        String xpath = "//android.widget.LinearLayout[@content-desc='FAQ']/android.widget.TextView";
        common.waitForXPathElement(xpath, 10);
        AndroidElement element = (AndroidElement) driver.findElementByXPath(xpath);
        return element;
    }

    public static AndroidElement getRisksTab() {
        String xpath = "//android.widget.LinearLayout[@content-desc='Risks']/android.widget.TextView";
        common.waitForXPathElement(xpath, 10);
        AndroidElement element = (AndroidElement) driver.findElementByXPath(xpath);
        return element;
    }

    public static AndroidElement getEnvironmentalCommitmentsTab() {
        String xpath = "//android.widget.LinearLayout[@content-desc='Environmental commitments']/android.widget.TextView";
        common.waitForXPathElement(xpath, 10);
        AndroidElement element = (AndroidElement) driver.findElementByXPath(xpath);
        return element;
    }

    //Interacting with elements on the page
    public static void tapBackButton() {
        getBackButton().click();
    }

    public static void tapShareButton() {
        getShareButton().click();
    }

    public static void tapSaveButton() {
        getSaveButton().click();
    }

    public static void tapPlayVideoButton() {
        getPlayVideoButton().click();
    }

    public static void tapOverviewTab() {
        getOverviewTab().click();
    }

    public static void tapCampaignTab() {
        getCampaignTab().click();
    }

    public static void tapRisksTab() {
        getRisksTab().click();
    }

    public static void tapEnvironmentalCommitmentsTab() {
        getEnvironmentalCommitmentsTab().click();
    }

}
