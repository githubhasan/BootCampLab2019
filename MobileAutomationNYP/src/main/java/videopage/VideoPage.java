package videopage;

import common.CommonAPI_mobile;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import reporting.TestLogger;

public class VideoPage extends CommonAPI_mobile {

    public VideoPage(){
        PageFactory.initElements(ad, this);
    }

    @FindBy(xpath = "//android.widget.TextView[@text='VIDEO']")
    WebElement videoPage;

    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Turn On Notifications\"]")
    WebElement TurnOnNotifications;

    public WebElement getVideoPage() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI_mobile.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        return videoPage;
    }

    public WebElement getTechPage() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI_mobile.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        return TurnOnNotifications;
    }
    public void VedioPageButton(){
        videoPage.click();
        String title = ad.getTitle();
        Assert.assertEquals(title, "Appium");

        TurnOnNotifications.click();
        String title1 = ad.getTitle();
        Assert.assertEquals(title, "Appium");

    }
}