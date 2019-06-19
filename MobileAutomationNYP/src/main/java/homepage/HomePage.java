package homepage;

import common.CommonAPI_mobile;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import reporting.TestLogger;

public class HomePage extends CommonAPI_mobile {

    public HomePage() { PageFactory.initElements(ad, this);
    }

    @FindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Open menu\"]")
    WebElement BurgerButton;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.ImageView\n")
    WebElement NYPostLogo;

    @FindBy(xpath = "/android.widget.TextView[@content-desc=\"Turn On Notifications\"]")
    WebElement TurnOnNotificationsTab;

    public WebElement getBurgerButton() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI_mobile.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        return BurgerButton;
    }
    public WebElement getNYPostLogo() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI_mobile.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        return NYPostLogo;
    }
    public WebElement getTurnOnNotificationsTab() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI_mobile.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        return TurnOnNotificationsTab;
    }

    public void HomePage() {
        BurgerButton.click();
        String title = ad.getTitle();
        Assert.assertEquals(title, "Appium");

        NYPostLogo.click();
        String title1 = ad.getTitle();
        Assert.assertEquals(title, "Appium");

        TurnOnNotificationsTab.click();
        String title2 = ad.getTitle();
        Assert.assertEquals(title, "Appium");
    }
}