package testmediapage;

import common.CommonAPI_mobile;
import mediapage.MediaPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MediaPageTest extends CommonAPI_mobile {

    MediaPage mediaPage;

    @BeforeMethod
    public void setUp(){
        mediaPage = PageFactory.initElements(ad, MediaPage.class);
    }

    @Test
    public void MediaPageTest() {
        mediaPage.getMediaPage();
    }

    @Test
    public void MediaPageTest2() {
        mediaPage.getOpenMenu();
    }

    @Test
    public void MediaPageTest3() {
        mediaPage.getTurOnNotifications();
    }
}