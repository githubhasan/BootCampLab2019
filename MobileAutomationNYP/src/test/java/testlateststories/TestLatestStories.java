package testlateststories;

import common.CommonAPI_mobile;
import lateststories.LatestStories;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestLatestStories extends CommonAPI_mobile {

    LatestStories latestStories;

    @BeforeMethod
    public void setup(){
        latestStories = PageFactory.initElements(ad, LatestStories.class);
    }

    @Test
    public void Test1() {
        latestStories.getLatestStories();
    }

    @Test
    public void Test2() {
        latestStories.getSavedArticlesTab();
    }

    @Test
    public void Test3() {
        latestStories.getSearchArticles();
    }

    @Test
    public void Test4() {
        latestStories.getSearchFrameLayout();
    }

    @Test
    public void Test5() {
        latestStories.getSettingsTab();

    }
}





