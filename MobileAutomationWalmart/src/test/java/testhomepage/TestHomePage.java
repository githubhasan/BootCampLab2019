package testhomepage;

import base.MobileAPI2;
import homepage.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestHomePage extends MobileAPI2 {

    HomePage homePage;

    @BeforeMethod
    public void init() throws InterruptedException {
        homePage = PageFactory.initElements(appiumDriver, HomePage.class);
        Thread.sleep(10);
    }


    @Test(priority=1)
    public void clickOnAllTab()throws InterruptedException {
        homePage.clickOnAllTab();
        Thread.sleep(10);
    }
    @Test(priority=2)
    public void clickOnSavingsCenter()throws InterruptedException {
        homePage.clickOnSavingsCenter();
        Thread.sleep(10);
    }

    @Test(priority=3)
    public void clickOnSummerShop()throws InterruptedException {
        homePage.clickOnSummerShop();
        Thread.sleep(10);
    }

    @Test(priority=4)
    public void clickOnElectronics()throws InterruptedException {
        homePage.clickOnElectronics();
        Thread.sleep(10);
    }

    @Test(priority=5)
    public void clickOnNavigationDrawer()throws InterruptedException {
        homePage.clickOnNavigationDrawer();
        Thread.sleep(10);
    }

    @Test(priority=6)
    public void clickOnEasyRecorderButton()throws InterruptedException {
        homePage.clickOnEasyRecorderButton();
        Thread.sleep(10);
    }

    @Test(priority=7)
    public void clickOnBarcodeScanner()throws InterruptedException {
        homePage.clickOnBarcodeScanner();
        Thread.sleep(10);
    }

    @Test(priority=8)
    public void clickOnShoppingCartButton()throws InterruptedException {
        homePage.clickOnShoppingCartButton();
        Thread.sleep(10);
    }


    @Test(priority=9)
    public void clickOnSearchTextBox()throws InterruptedException {
        homePage.clickOnSearchTextBox();
        Thread.sleep(10);
    }

    @Test(priority=10)
    public void clickOnSearchButton()throws InterruptedException {
        homePage.clickOnSearchButton();
        Thread.sleep(10);
    }

//    @Test(priority=11, enabled = true)
//    public void SearchTextBox()throws InterruptedException{
//        Thread.sleep(20);
//        homePage.clickOnSearchTextBox();
//        homePage.SearchTextBox.clear();
//        Thread.sleep(5);
//        SearchTextBox.sendKeys("iphone xs max case", Keys.ENTER);
//        Thread.sleep(5);
//    }
}





