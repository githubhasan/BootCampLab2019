package testfashionpage;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class FashionPageTest extends fashionpage.FashionPage {

//    FashionPage fashionPage;
//    @BeforeClass
//    public void initElements() {
//        fashionPage = PageFactory.initElements(ad, FashionPage.class);
//
//    }

    @Test
    public void FashionPageTest() {
        fashionpage.FashionPage fashionPage = PageFactory.initElements(ad, fashionpage.FashionPage.class);
        fashionPage.getFashionPage();
    }

    @Test
    public void FashionPageTest2() {
        fashionpage.FashionPage fashionPage = PageFactory.initElements(ad, fashionpage.FashionPage.class);
        fashionPage.getOpenMenu();
    }

    @Test
    public void FashionPageTest3() {
        fashionpage.FashionPage fashionPage = PageFactory.initElements(ad, fashionpage.FashionPage.class);
        fashionPage.getNotificationBell();
    }
}