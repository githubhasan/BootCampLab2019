package loginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

    By username =By.id("ap_email");
    By pasword=By.id("ap_password");
    By loginButton =By.id("signInSubmit");
    By helloSignin=By.id("nav-link-accountList");

    public LoginPage(WebDriver driver)
    {
        this.driver=driver;
    }

    //if want to use multiple method in one
    public void loginWithMultipleInput(String userid, String pass){

        driver.findElement(username).sendKeys("userid");
        driver.findElement(pasword).sendKeys("pass");
        driver.findElement(loginButton).click();
    }
    //

//    public void typeUserName()

//    {
    //       driver.findElement(username).sendKeys("shokat_hasan@yahoo.com");

    //to Parameterize use this
    //public void typeUserName(String uid){
    //driver.findElement(username).sendKeys("uid");}
//    }

//    public void typePassword()

    //to Parameterize use this
    //public void typePassword(String pass){
    //driver.findElement(pasword).sendKeys("pass");}
    //   {
    //      driver.findElement(pasword).sendKeys("aA9175004510");

    //  }

    public void clickOnLoginButton()
    {
        driver.findElement(loginButton).click();
    }

    public void clickOnHelloSignin()
    {
        driver.findElement(helloSignin).click();
    }

}



