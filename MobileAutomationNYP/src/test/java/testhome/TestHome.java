package testhome;

import common.CommonAPI_mobile;
import entertainmentpage.EntertainmentPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestHome extends CommonAPI_mobile {

    @Test
    public void Test1() {
        EntertainmentPage entertainmentPage= PageFactory.initElements(ad, EntertainmentPage.class);
        entertainmentPage.getEntertainment();
    }
    @Test
    public void Test2() {
        EntertainmentPage entertainmentPage= PageFactory.initElements(ad, EntertainmentPage.class);
        entertainmentPage.getEntertainment();
    }
    @Test
    public void Test3() {
        EntertainmentPage entertainmentPage= PageFactory.initElements(ad, EntertainmentPage.class);
        entertainmentPage.getEntertainment();
    }
}
