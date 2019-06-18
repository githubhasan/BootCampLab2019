package pageobjecttest;

import base.CommonAPI;
import basepage.SearchFriend;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SearchTest extends CommonAPI {
    SearchFriend SF;
    @BeforeMethod
    public void initElements() {
        SF = PageFactory.initElements(driver, SearchFriend.class);
    }
        @Test
        public void test(){
         SF.Search();
         SF.btn();

        }
    }



