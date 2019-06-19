package metropage;

import common.CommonAPI_mobile;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import reporting.TestLogger;


public class MetroPage extends CommonAPI_mobile {

    public MetroPage(){ PageFactory.initElements(ad, this);
    }

    @FindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Menu\"]")
    WebElement Menu;

    @FindBy(xpath = "//android.widget.TextView[@text='METRO']")
    WebElement MetroPage;

    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Turn On Notifications\"]")
    WebElement TurnOnNotificationsTab;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.view.ViewGroup\n")
    WebElement FrameLayout;

    public WebElement getMenu() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI_mobile.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        return Menu;
    }

    public WebElement getMetroPage() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI_mobile.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        return MetroPage;
    }

    public WebElement getTurnOnNotificationsTab() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI_mobile.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        return TurnOnNotificationsTab;
    }

    public WebElement getFrameLayout() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI_mobile.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        return FrameLayout;
    }

    public void MetroPage() {
        Menu.click();
        String title = ad.getTitle();
        Assert.assertEquals(title, "Appium");

        MetroPage.click();
        String title1 = ad.getTitle();
        Assert.assertEquals(title, "Appium");

        TurnOnNotificationsTab.click();
        String title2 = ad.getTitle();
        Assert.assertEquals(title, "Appium");

        FrameLayout.click();
        String title4 = ad.getTitle();
        Assert.assertEquals(title, "Appium");

    }
}