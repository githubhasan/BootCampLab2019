package loginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPageNew {

    WebDriver driver;
    public LoginPageNew(WebDriver lDriver)
    {
        this.driver=lDriver;
    }

    @FindBy(id="ap_email")
    @CacheLookup
    WebElement username;

    @FindBy(id="ap_password")
    @CacheLookup
    WebElement password;

    @FindBy(id="signInSubmit")
    @CacheLookup
    WebElement loginButton;

    @FindBy(id="nav-link-accountList")
    @CacheLookup
    WebElement helloSignin;

    public void loginWithMultipleInput(String uid, String pass){

        helloSignin.click();
        username.sendKeys(uid);
        password.sendKeys(pass);
        loginButton.click();
    }
}
