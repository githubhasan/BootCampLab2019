package homepage;

import base.MobileAPI2;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class HomePage extends MobileAPI2 {

    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Savings Center button\"]")
    WebElement SavingsCenter;

    @FindBy(partialLinkText = "Browse all departments.")
    WebElement AllTab;

    @FindBy(xpath = "////android.widget.TextView[@content-desc=\"Summer Shop button\"]")
    WebElement SummerShop;

    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Electronics button\"]")
    WebElement Electronics;

    @FindBy(className = "android.widget.ImageButton")
    WebElement NavigationDrawer;

    @FindBy(xpath = "//android.widget.View[@content-desc=\"Barcode scanner\"]")
    WebElement EasyRecorderButton;

    @FindBy(id = "com.walmart.android:id/barcode_icon")
    WebElement BarcodeScanner;

    @FindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Shopping cart, no items\"]/android.widget.ImageView")
    WebElement ShoppingCartButton;

    @FindBy(id = "com.walmart.android:id/search_src_text")
    WebElement SearchTextBox;

    @FindBy(id = "com.walmart.android:id/search_mag_icon")
    public
    WebElement SearchButton;


    public void clickOnSavingsCenter() throws InterruptedException {
        SavingsCenter.click();
        Thread.sleep(5);
    }


    public void clickOnAllTab()throws InterruptedException {
        AllTab.click();
        Thread.sleep(5);
    }

    public void clickOnSummerShop()throws InterruptedException {
        SummerShop.click();
        Thread.sleep(5);
    }

    public void clickOnElectronics()throws InterruptedException {
        Electronics.click();
        Thread.sleep(5);
    }


    public void clickOnNavigationDrawer()throws InterruptedException {
        NavigationDrawer.click();
        Thread.sleep(5);

    }

    public void clickOnEasyRecorderButton()throws InterruptedException {
        EasyRecorderButton.click();
        Thread.sleep(5);
    }

    public void clickOnBarcodeScanner()throws InterruptedException {
        BarcodeScanner.click();
        Thread.sleep(5);
    }

    public void clickOnShoppingCartButton()throws InterruptedException {
        ShoppingCartButton.click();
        Thread.sleep(5);
    }

    @Test
    public void clickOnSearchTextBox()throws InterruptedException {
        SearchTextBox.click();
        Thread.sleep(5);
    }



    public void clickOnSearchButton()throws InterruptedException {
        SearchButton.click();
        Thread.sleep(5);


    }


}


