package newspage;

import common.CommonAPI_mobile;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import reporting.TestLogger;

public class NewsPage extends CommonAPI_mobile {

    public NewsPage(){ PageFactory.initElements(ad, this);
    }

    @FindBy(xpath = "//android.widget.TextView[@text='News']")
    WebElement NewsTab;

    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Save article\"]\n")
    WebElement SaveArticles;

    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Share\"]\n")
    WebElement ShareButton;

    @FindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Navigate up\"]\n")
    WebElement NavigateUp;

    public WebElement getNewsTab() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI_mobile.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return NewsTab;
    }
    public WebElement getSaveArticles() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI_mobile.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return SaveArticles;
    }
    public WebElement getShareButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI_mobile.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return ShareButton;
    }
    public WebElement getNavigateUp(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI_mobile.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return NavigateUp;
    }

    public void NewsButton(){
        NewsTab.click();
        String title = ad.getTitle ();
        Assert.assertEquals (title, "Appium");

        SaveArticles.click();
        String title1 = ad.getTitle ();
        Assert.assertEquals (title, "Appium");

        SaveArticles.click();
        String title2 = ad.getTitle ();
        Assert.assertEquals (title, "Appium");

        NavigateUp.click();
        String title4 = ad.getTitle ();
        Assert.assertEquals (title, "Appium");
    }

    }

