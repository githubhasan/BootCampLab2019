package livingpage;

import common.CommonAPI_mobile;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import reporting.TestLogger;

public class LivingPage extends CommonAPI_mobile {

    public LivingPage(){ PageFactory.initElements(ad, this);
    }

    @FindBy(xpath = "//android.widget.TextView[@text='LIVING']")
    WebElement LivingPage;

    @FindBy(id = "br.com.golmobile.nypost:id/notifications")
    WebElement TurnOnNotifications;

    @FindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Open menu\"]")
    WebElement menubar;

    public WebElement getLivingPage(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI_mobile.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return LivingPage;
    }
    public WebElement getTurnOnNotifications(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI_mobile.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return TurnOnNotifications;
    }
    public WebElement getMenubar() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI_mobile.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return menubar;
    }

    public void ShowLivingPage(){
        LivingPage.click();
        String title = ad.getTitle ();
        Assert.assertEquals (title, "Appium");

        TurnOnNotifications.click();
        String title1 = ad.getTitle ();
        Assert.assertEquals (title, "Appium");

        menubar.click();
        String title2 = ad.getTitle ();
        Assert.assertEquals (title, "Appium");
    }
}

