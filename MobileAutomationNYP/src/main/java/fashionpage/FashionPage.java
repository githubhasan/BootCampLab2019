package fashionpage;

import common.CommonAPI_mobile;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import reporting.TestLogger;

public class FashionPage extends CommonAPI_mobile {

    public FashionPage(){
        PageFactory.initElements(ad, this);
    }

    @FindBy(xpath = "//android.widget.TextView[@text='FASHION']")
    WebElement FashionPage;

    @FindBy(xpath = "//android.widget.ImageButton[@content-desc='Open menu']")
    WebElement OpenMenu;

    @FindBy(xpath = "//android.widget.TextView[@content-desc='Turn On Notifications']")
    WebElement NotificationBell;

    public WebElement getFashionPage() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI_mobile.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return FashionPage;
    }

    public WebElement getOpenMenu() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI_mobile.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return OpenMenu;
    }

    public WebElement getNotificationBell() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI_mobile.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return NotificationBell;
    }
    public void ShowFashoinPage(){
        FashionPage.click();
        String title = ad.getTitle ();
        Assert.assertEquals (title, "Appium");

        OpenMenu.click();
        String title1 = ad.getTitle ();
        Assert.assertEquals (title, "Appium");

        NotificationBell.click();
        String title2 = ad.getTitle ();
        Assert.assertEquals (title, "Appium");
    }
}
