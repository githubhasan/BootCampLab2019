package lateststories;

import common.CommonAPI_mobile;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class LatestStories extends CommonAPI_mobile {

//    public LatestStories() { PageFactory.initElements(ad, this);
//    }

    @FindBy(xpath = "//android.widget.TextView[@text='Search Articles']")
    WebElement SearchArticles;

    @FindBy(xpath = "//android.widget.CheckedTextView[@text='Latest Stories']")
    WebElement LatestStories;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ImageView\n")
    WebElement SearchFrameLayout;

    @FindBy(xpath = "//android.widget.CheckedTextView[@text='Saved Articles']")
    WebElement SavedArticlesTab;

    @FindBy(xpath = "//android.widget.CheckedTextView[@text='Settings']")
    WebElement SettingsTab;

    public WebElement getSearchArticles() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI_mobile.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        return SearchArticles;
    }
    public WebElement getLatestStories() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI_mobile.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        return LatestStories;
    }
    public WebElement getSearchFrameLayout() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI_mobile.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        return SearchFrameLayout;
    }
    public WebElement getSavedArticlesTab() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI_mobile.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        return SavedArticlesTab;
    }
    public WebElement getSettingsTab() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI_mobile.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        return SettingsTab;
    }

    public void Articles() {
        SearchArticles.click();
//        String title = ad.getTitle();
//        Assert.assertEquals(title, "Appium");

        LatestStories.click();
//        String title1 = ad.getTitle();
//        Assert.assertEquals(title, "Appium");

        SearchFrameLayout.click();
//        String title2 = ad.getTitle();
//        Assert.assertEquals(title, "Appium");

        SavedArticlesTab.click();
//        String title3 = ad.getTitle();
//        Assert.assertEquals(title, "Appium");

        SettingsTab.click();
//        String title4 = ad.getTitle();
//        Assert.assertEquals(title, "Appium");

    }

}
