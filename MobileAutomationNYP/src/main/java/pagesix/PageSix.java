package pagesix;

import common.CommonAPI_mobile;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import reporting.TestLogger;

public class PageSix extends CommonAPI_mobile {

    public PageSix(){
        PageFactory.initElements(ad, this);
    }
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.ImageView\n")
    WebElement PageSixPage;

    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Turn On Notifications\"]")
    WebElement TurnOnNotifications;

    public WebElement getPageSixPage() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI_mobile.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        return PageSixPage;
    }

    public WebElement getTurnOnNotifications() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI_mobile.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        return TurnOnNotifications;
    }

    public void PageSix() {
        PageSixPage.click();
        String title = ad.getTitle();
        Assert.assertEquals(title, "Appium");

        TurnOnNotifications.click();
//        String title1 = ad.getTitle();
//        Assert.assertEquals(title, "Appium");


        }

}
