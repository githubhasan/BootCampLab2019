package loginPageTest;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginPageTest extends CommonAPI {


    @Test
    public void LoginByInvalidLoginIdPassword() {

        driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span[1]")).click();

        driver.findElement(By.id("ap_email")).sendKeys("Md");
        driver.findElement(By.id("ap_password")).sendKeys("Hasan");
        driver.findElement(By.id("signInSubmit")).click();
    }


    @Test
    public void LoginByValidLoginIdPassword(){

        driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span[1]")).click();
        driver.findElement(By.id("ap_email")).sendKeys("shokat_hasan@yahoo.com");
        driver.findElement(By.id("ap_password")).sendKeys("aA9175004510");
        driver.findElement(By.id("signInSubmit")).click();

    }

}