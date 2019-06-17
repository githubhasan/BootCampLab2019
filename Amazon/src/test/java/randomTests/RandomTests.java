package randomTests;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class RandomTests extends CommonAPI {
    @Test
    public void search() {
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("laptop", Keys.ENTER);
    }


    @Test
    public void search2() {
        driver.findElement(By.xpath("/html/body/div[1]/header/div/div[2]/div[1]/div/span/a")).click();
    }

    @Test
    public void search3() {
        driver.navigate().forward();
    }

    @Test
    public void search4() {
        driver.navigate().back();
    }

    @Test
    public void search5() {
        driver.findElement(By.cssSelector("#nav-xshop > a:nth-child(4)")).click();
    }


    @Test
    public void search7() {
        driver.getTitle().length();
    }

    @Test
    public void search8() {
        driver.findElement(By.cssSelector(".icp-nav-language")).isDisplayed();
    }

    @Test
    public void clickhelp8() {
        driver.findElement(By.linkText("Help")).click();
    }


    @Test
    public void clicksellOnAmazon() {
        driver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[4]/table/tbody/tr[3]/td[1]/a")).click();
    }

    @Test
    public void YourAmazonCom10() {
        driver.findElement(By.id("nav-your-amazon")).click();
    }

    @Test
    public void Registry11() {
        driver.findElement(By.xpath("/html/body/div[1]/header/div/div[2]/div[3]/div[2]/div/a[4]")).click();
    }


    @Test
    public void TodayDeal12() {
        driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[3]")).isDisplayed();
    }

    @Test
    public void TodayDeal() {
        driver.findElement(By.xpath("//*[@id=\"navSwmHoliday\"]/a/img")).click();
        driver.findElement(By.linkText("Today's Deals")).isDisplayed();
    }


    @Test
    public void Cart14() {
        String dropdown = driver.findElement(By.tagName("span")).getText();
    }

    @Test
    public void SellOnAmazon() {
        WebElement title = driver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[4]/table/tbody/tr[3]/td[1]/a"));
        System.out.println(title.getText());
    }

}


