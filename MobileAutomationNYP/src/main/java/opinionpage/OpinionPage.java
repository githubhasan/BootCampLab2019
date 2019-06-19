package opinionpage;

import common.CommonAPI_mobile;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import reporting.TestLogger;

public class OpinionPage extends CommonAPI_mobile {

    public OpinionPage(){
        PageFactory.initElements(ad, this);
    }

    @FindBy(xpath = "//android.widget.TextView[@text='OPINION']")
    WebElement OpinionPage;

    @FindBy(xpath = "//android.widget.TextView[@content-desc='Turn On Notifications']")
    WebElement TurnOnNotifications;

    @FindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Open menu\"]\n")
    WebElement OpenMenuOpinionPage;

    public WebElement getOpinionPage() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI_mobile.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        return OpinionPage;
    }

    public WebElement getTurnOnNotifications() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI_mobile.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        return TurnOnNotifications;
    }

    public WebElement getOpenMenuOpinionPage() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI_mobile.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        return OpenMenuOpinionPage;
    }
    public void Opinion() {
        OpinionPage.click();
        String title = ad.getTitle();
        Assert.assertEquals(title, "Appium");

        TurnOnNotifications.click();
        String title1 = ad.getTitle();
        Assert.assertEquals(title, "Appium");

        OpenMenuOpinionPage.click();
        String title2 = ad.getTitle();
        Assert.assertEquals(title, "Appium");
    }
}