package loginPageTest;

import base.CommonAPI;
import loginPage.LoginPageNew;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utility.BrowserFactory;

public class VerifyValidLogin extends CommonAPI {


    @Test
    private void checkValidUser() throws InterruptedException {
        //This will run browser & specific url
        WebDriver driver=BrowserFactory.startBrowser("Firefox","https://www.amazon.com");

        //created page object using page factory
        LoginPageNew login_page = PageFactory.initElements(driver, LoginPageNew.class);

        //called the method
        login_page.loginWithMultipleInput("shokat_hasan@yahoo.com","aA9175004510");

        Thread.sleep(5000);

        driver.quit();


    }



//    @Test
//    private void checkInvalidUser()
//    {
//        WebDriver driver=BrowserFactory.startBrowser("Firefox","https://www.amazon.com");
//        LoginPageNew login_page = PageFactory.initElements(driver,LoginPageNew.class);
//        login_page.loginWithMultipleInput("xyz@yahoo.com","9175004510");
//
//
//    }



}
