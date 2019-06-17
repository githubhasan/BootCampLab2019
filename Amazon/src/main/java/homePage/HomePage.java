package homePage;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HomePage extends CommonAPI {

        @FindBy(id = "nav-orders")
        WebElement orderTab;
        @FindBy(xpath = "//*[@id=\"nav-hamburger-menu\"]/i")
        WebElement hamberger;
        @FindBy(id = "twotabsearchtextbox")
        WebElement inputSearch;
        @FindBy(xpath = "//*[@id=\"nav-link-prime\"]/span[2]")
        WebElement Tryprime;
        @FindBy(id = "nav-your-amazon")
        WebElement Todaysdeal;
        @FindBy(xpath = "//*[@id=\"nav-link-accountList\"]/span[1]")
        WebElement Signin;
        @FindBy(xpath = "//*[@id=\"navFooter\"]/div[1]/div/div[1]/ul/li[1]/a")
        WebElement careers;
        @FindBy(xpath = "//*[@id=\"navFooter\"]/div[1]/div/div[1]/ul/li[2]/a")
        WebElement Blog;
        @FindBy(xpath = "//*[@id=\"navFooter\"]/div[1]/div/div[1]/ul/li[2]/a")
        WebElement Presscenter;
        @FindBy(xpath = "//*[@id=\"nav-logo\"]/a[1]/span[1]")
        WebElement AmazonLogo;
        @FindBy(xpath = "//*[@id=\"navFooter\"]/div[1]/div/div[7]/ul/li[8]/a")
        WebElement Help;
        @FindBy(xpath = "//*[@id=\"nav-xshop\"]/a[4]")
        WebElement Registry;
        @FindBy(xpath = "//*[@id=\"navFooter\"]/div[4]/table/tbody/tr[1]/td[1]/a")
        WebElement AmazonMusic;
        @FindBy(xpath = "//*[@id=\"navFooter\"]/div[4]/table/tbody/tr[3]/td[1]/a")
        WebElement AmazonBusiness;
        @FindBy(xpath = "//*[@id=\"navFooter\"]/div[4]/table/tbody/tr[5]/td[1]/a")
        WebElement AmazonWebServices;
        @FindBy(xpath = "//*[@id=\"navFooter\"]/div[4]/table/tbody/tr[7]/td[1]/a")
        WebElement EastDane;
        @FindBy(xpath = "//*[@id=\"navFooter\"]/div[4]/table/tbody/tr[9]/td[1]/a")
        WebElement PrimeNow;
        @FindBy(xpath = "//*[@id=\"navFooter\"]/div[4]/table/tbody/tr[1]/td[13]/a")
        WebElement Alexa;
        @FindBy(xpath = "//*[@id=\"navFooter\"]/div[4]/table/tbody/tr[3]/td[13]/a")
        WebElement AmazonRestaurants;

        @FindBy(xpath = "//*[@id=\"navFooter\"]/div[4]/table/tbody/tr[5]/td[13]/a")
        WebElement DPReview;

        @FindBy(xpath = "//*[@id=\"navFooter\"]/div[4]/table/tbody/tr[7]/td[13]/a")
        WebElement KindleDirectPublishing;

        @FindBy(xpath = "//*[@id=\"navFooter\"]/div[4]/table/tbody/tr[9]/td[13]/a")
        WebElement Woot;

        @FindBy(xpath = "//*[@id=\"navFooter\"]/div[4]/table/tbody/tr[1]/td[3]/a")
        WebElement AmazonAdvertising;


        @FindBy(xpath = "//*[@id=\"navFooter\"]/div[4]/table/tbody/tr[1]/td[3]/a")
        WebElement AmazonFresh;

        @FindBy(xpath = "//*[@id=\"navFooter\"]/div[4]/table/tbody/tr[5]/td[3]/a[2]")
        WebElement Audible;

        @FindBy(xpath = "//*[@id=\"navFooter\"]/div[4]/table/tbody/tr[7]/td[3]/a")
        WebElement Fabric;

        @FindBy(xpath = "//*[@id=\"navFooter\"]/div[4]/table/tbody/tr[9]/td[3]/a")
        WebElement AmazonPhotos;

        @FindBy(xpath = "//*[@id=\"navFooter\"]/div[4]/table/tbody/tr[9]/td[3]/a")
        WebElement Zappos;

        @FindBy(xpath = "//*[@id=\"navFooter\"]/div[4]/table/tbody/tr[1]/td[5]/a")
        WebElement AmazonDrive;

        @FindBy(xpath = "//*[@id=\"navFooter\"]/div[4]/table/tbody/tr[1]/td[5]/a")
        WebElement AmazonGlobal;

        @FindBy(xpath = "//*[@id=\"navFooter\"]/div[4]/table/tbody/tr[1]/td[5]/a")
        WebElement BookDepository;

        @FindBy(xpath = "//*[@id=\"navFooter\"]/div[4]/table/tbody/tr[1]/td[5]/a")
        WebElement Goodreads;
        @FindBy(xpath = "//*[@id=\"navFooter\"]/div[4]/table/tbody/tr[9]/td[5]/a")
        WebElement PrimeVideoDirect;

        @FindBy(xpath = "//*[@id=\"navFooter\"]/div[4]/table/tbody/tr[9]/td[5]/a")
        WebElement SubscribewithAmazon;



        public void setAmazonDrive() {
                AmazonDrive.click();
        }

        public void setAmazonGlobal() {
                AmazonGlobal.click();
        }

        public void setBookDepository() {
                BookDepository.click();
        }


        public void setGoodreads() {
                Goodreads.click();
        }


        public void setPrimeVideoDirect() {
                PrimeVideoDirect.click();
        }


        public void setSubscribewithAmazon() {
                SubscribewithAmazon.click();
        }

        public void setFabric() {
                Fabric.click();
        }

        public void setZappos() {
                Zappos.click();
        }

        public void setAmazonPhotos() {
                AmazonPhotos.click();
        }

        public void setAudible() {
                Audible.click();
        }

        public void setAmazonFresh() {
                AmazonFresh.click();
        }

        public void setAmazonAdvertising() {
                AmazonAdvertising.click();
        }

        public void setKindleDirectPublishing() {
                KindleDirectPublishing.click();
        }



        public void setOrderTab() {
                orderTab.click();
        }

        public void setWoot() {
                Woot.click();
        }


        public void setHamb() {
                if (hamberger.isDisplayed()) {
                        hamberger.click();
                        Assert.assertTrue(true);
                }
        }

        public void setinputSerch(String name) throws InterruptedException {
                if (inputSearch.isDisplayed()) {
                        inputSearch.sendKeys(name, Keys.ENTER);
                }
                Thread.sleep(5000);

        }

        public void setTryprime() {
                Tryprime.click();
        }

        public void setTodaysdeal() {
                Todaysdeal.click();
        }

        public void clickOnDPReview() {
                DPReview.click();
        }


        public void clickSignin() {
                Signin.click();
        }

        public void setCareers() {
                careers.click();
        }

        public void clickOnBlog() {
                Blog.click();
        }

        public void clickOnAmazonRestaurants() {
                AmazonRestaurants.click();
        }


        public void clickOnAlexa() {
                Alexa.click();
        }


        public void setPresscenter() {
                Presscenter.click();
        }

        public void setPrimeNow() {
                PrimeNow.click();
        }

        public void clickAamzonLogo() {
                if (AmazonLogo.isDisplayed()) {
                        AmazonLogo.click();
                        Assert.assertTrue(true);
                }
        }

        public void setAmazonWebServices() {
                AmazonWebServices.click();
        }

        public void setHelp() {
                Help.click();
        }

        public void setEastDane() {
                EastDane.click();
        }

        public void setRegistry() {
                Registry.click();
        }

        public void setAmazonMusic() {
                AmazonMusic.click();
        }

        public void setAmazonBusiness() {
                AmazonBusiness.click();
        }

}

