package realestatepage;

import common.CommonAPI_mobile;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import reporting.TestLogger;

public class RealStatePage extends CommonAPI_mobile {

    public RealStatePage(){
        PageFactory.initElements(ad, this);
    }

    @FindBy(xpath = "//android.widget.TextView[@text='REAL ESTATE']")
    WebElement RealEstatePage;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.view.ViewGroup\n")
    WebElement LayoutOfRealEstate;

    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Turn On Notifications\"]")
    WebElement TurnOnNotifications;

    public WebElement getRealEstatePage() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI_mobile.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        return RealEstatePage;
    }
    public WebElement getLayoutOfRealEstate() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI_mobile.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        return LayoutOfRealEstate;
    }
    public WebElement getTurnOnNotifications() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI_mobile.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        return TurnOnNotifications;
    }
    public void RealStatePage(){

        RealEstatePage.click();
        String title = ad.getTitle();
        Assert.assertEquals(title, "Appium");

        LayoutOfRealEstate.click();
        String title1 = ad.getTitle();
        Assert.assertEquals(title, "Appium");

        TurnOnNotifications.click();
        String title2 = ad.getTitle();
        Assert.assertEquals(title, "Appium");
    }

}
