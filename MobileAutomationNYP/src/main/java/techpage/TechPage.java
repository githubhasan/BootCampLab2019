package techpage;

import common.CommonAPI_mobile;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import reporting.TestLogger;

public class TechPage extends CommonAPI_mobile {

    public TechPage(){ PageFactory.initElements(ad, this);
    }

    @FindBy(xpath = "//android.widget.TextView[@text='TECH']")
    WebElement TechPage;

    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Turn On Notifications\"]\n")
    WebElement TurnOnNotifications;

    public WebElement getTechPage() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI_mobile.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        return TechPage;
    }

    public WebElement getTurnOnNotifications() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI_mobile.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        return TurnOnNotifications;
    }

    public void techPage() {
        TechPage.click();
        String title = ad.getTitle();
        Assert.assertEquals(title, "Appium");

        TurnOnNotifications.click();
        String title1 = ad.getTitle();
        Assert.assertEquals(title, "  ");

    }
}
