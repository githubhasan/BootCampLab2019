package loginPageTest;

import loginPage.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LoginPageTest1 {

    @Test
    public void VerifyValidLogin()
    {
        WebDriver driver=new FirefoxDriver();
        //driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");


        LoginPage login=new LoginPage(driver);
        login.clickOnHelloSignin();


        //login.typeUserName();
        //login.typePassword();

        //use this line only if you want to use multiple input
        login.loginWithMultipleInput("shokat_hasan@yahoo.com","aA9175004510");

        //to Parameterize use this
        //login.typeUserName("shokat_hasan@yahoo.com");

        //to Parameterize use this
        //login.typePassword("aA9175004510");

        login.clickOnLoginButton();

        driver.quit();

    }
}
