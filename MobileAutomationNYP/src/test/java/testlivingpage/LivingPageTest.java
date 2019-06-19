package testlivingpage;


import common.CommonAPI_mobile;
import livingpage.LivingPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LivingPageTest extends CommonAPI_mobile {


    @Test
    public void LivingPageTest() {
        LivingPage livingPage = PageFactory.initElements(ad, LivingPage.class);
        livingPage.getLivingPage();
    }

    @Test
    public void LivingPageTest2() {
        LivingPage livingPage = PageFactory.initElements(ad, LivingPage.class);
        livingPage.getTurnOnNotifications();
    }

    @Test
    public void LivingPageTest3() {
        LivingPage livingPage = PageFactory.initElements(ad, LivingPage.class);
        livingPage.getMenubar();
    }
}