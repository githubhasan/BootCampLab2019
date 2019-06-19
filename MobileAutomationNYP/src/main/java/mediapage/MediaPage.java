package mediapage;

import common.CommonAPI_mobile;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import reporting.TestLogger;

public class MediaPage extends CommonAPI_mobile {

    public MediaPage(){ PageFactory.initElements(ad, this);
    }

    @FindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Open menu\"]")
    WebElement OpenMenu;

    @FindBy(xpath = "//android.widget.TextView[@text='MEDIA']")
    WebElement MediaPage;

    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Turn On Notifications\"]")
    WebElement TurOnNotifications;

    public WebElement getOpenMenu(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI_mobile.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return OpenMenu;
    }
    public WebElement getMediaPage() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI_mobile.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return MediaPage;
    }
    public WebElement getTurOnNotifications() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI_mobile.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return TurOnNotifications;
    }

    public void ShowMediaPage(){
        OpenMenu.click();
        String title = ad.getTitle ();
        Assert.assertEquals (title, "Appium");

        MediaPage.click();
        String title1 = ad.getTitle ();
        Assert.assertEquals (title, "Appium");

        TurOnNotifications.click();
        String title2 = ad.getTitle ();
        Assert.assertEquals (title, "Appium");
    }
}
