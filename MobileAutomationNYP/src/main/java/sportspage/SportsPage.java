package sportspage;

import common.CommonAPI_mobile;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import reporting.TestLogger;

public class SportsPage extends CommonAPI_mobile {

    public SportsPage(){ PageFactory.initElements(ad, this);
    }
    @FindBy(xpath = "//android.widget.TextView[@text='SPORTS']")
    WebElement SportsPage;

    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Turn On Notifications\"]\n")
    WebElement TurnOnNotifications;

    public WebElement getSportsPage() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI_mobile.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        return SportsPage;
    }

    public WebElement getTurnOnNotifications() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI_mobile.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        return TurnOnNotifications;
    }

    public void SportsPageTab() {
        SportsPage.click();
        String title = ad.getTitle();
        Assert.assertEquals(title, "Appium");

        TurnOnNotifications.click();
        String title1 = ad.getTitle();
        Assert.assertEquals(title, "Appium");
    }
}