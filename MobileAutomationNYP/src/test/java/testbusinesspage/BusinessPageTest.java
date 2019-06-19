package testbusinesspage;

import businesspage.BusinessPage;
import common.CommonAPI_mobile;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class BusinessPageTest extends CommonAPI_mobile {

//    BusinessPage businessPage;
//
//    @BeforeMethod
//    public void initElements(){
//       businessPage  = PageFactory.initElements(ad, BusinessPage.class);
//    }

    @Test
    public void Menu() {
        BusinessPage businessPage = PageFactory.initElements(ad, BusinessPage.class);
        businessPage.getMenu();
    }

    @Test
    public void Business() {
        BusinessPage businessPage = PageFactory.initElements(ad, BusinessPage.class);
        businessPage.getBusiness();
    }
}

