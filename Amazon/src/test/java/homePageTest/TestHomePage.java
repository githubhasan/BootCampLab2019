package homePageTest;

import base.CommonAPI;
import homePage.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class TestHomePage extends CommonAPI {
    HomePage homePage;
    String url = "https://www.amazon.com/";

    @BeforeMethod
    public void init() {
        homePage = PageFactory.initElements(driver, HomePage.class);
        driver.get(url);
    }


    @Test
    public void clickOnAmazonDrive() {
        homePage.setAmazonDrive();

    }

    @Test
    public void clickOnBookDepository() {
        homePage.setBookDepository();

    }

    @Test
    public void clickOnGoodreads() {
        homePage.setGoodreads();

    }

    @Test
    public void clickOnPrimeVideoDirect() {
        homePage.setPrimeVideoDirect();

    }

    @Test
    public void clickOnSubscribewithAmazon() {
        homePage.setSubscribewithAmazon();

    }


    @Test
    public void clickOnAmazonGlobal() {
        homePage.setAmazonGlobal();

    }









    @Test
    public void clickOnAudible() {
        homePage.setAudible();

    }

    @Test
    public void clickOnFabric() {
        homePage.setFabric();

    }

    @Test
    public void clickOnZappos() {
        homePage.setZappos();

    }


    @Test
    public void clickOnAmazonPhotos() {
        homePage.setAmazonPhotos();

    }

    @Test
    public void clickOnOrder() {
        homePage.setOrderTab();

    }

    @Test
    public void clickOnHam() {
        homePage.setHamb();
    }

    @Test
    public void serchItems() throws InterruptedException {
        homePage.setinputSerch("iPhone");

    }

    @Test
    public void clickOnTryprime() {
        homePage.setTryprime();
    }

    @Test
    public void clickOnTodays() {
        homePage.setTodaysdeal();
    }

    @Test
    public void clickOnSignin() {
        homePage.clickSignin();
    }

    @Test
    public void clickOnAmazonFresh() {
        homePage.setAmazonFresh();
    }

    @Test
    public void clickOncarrers() {
        homePage.setCareers();
    }

    @Test
    public void clickOnBlog() {
        homePage.clickOnBlog();
    }

    @Test
    public void clickOnAmazonAdvertising() {
        homePage.setAmazonAdvertising();
    }

    @Test
    public void clickOnWoot() {
        homePage.setWoot();
    }


    @Test
    public void clickOnPreesCenter() {
        homePage.setPresscenter();
    }

    @Test
    public void clickAmazonLogo() {
        homePage.clickAamzonLogo();
    }

    @Test
    public void clickOnAmazonRestaurants() {
        homePage.clickOnAmazonRestaurants();
    }

    @Test
    public void clickOnDPReview() {
        homePage.clickOnDPReview();
    }

    @Test
    public void setKindleDirectPublishing() {
        homePage.setKindleDirectPublishing();
    }




    @Test
    public void clickOnAlexa() {
        homePage.clickOnAlexa();
    }

    @Test
    public void setPrimeNow() {
        homePage.setPrimeNow();
    }

    @Test
    public void setEastDane() {
        homePage.setEastDane();
    }

    @Test
    public void clickFindaGift() {
        homePage.setHelp();
    }

    @Test
    public void setAmazonWebServices() {
        homePage.setAmazonWebServices();
    }

    @Test
    public void clickOntRegistry() {
        homePage.setRegistry();
    }
    @Test
    public void setAmazonMusic() {
        homePage.setAmazonMusic();
    }

    @Test
    public void signInValidation() {
        driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("shokat_hasan@yahoo.com");
        driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys("aA9175004510");
        driver.findElement(By.xpath("//*[@id=\"signInSubmit\"]")).click();
    }


    @Test
    public void setAmazonBusiness() {
        homePage.setAmazonBusiness();
    }

    @Test
    public void CartValidation() {
        driver.findElement(By.xpath("//*[@id=\"nav-cart\"]/span[2]")).click();
    }

    @Test
    public void sellOnAmazonTest() {
        driver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[1]/div/div[3]/ul/li[1]/a")).click();
    }


}

