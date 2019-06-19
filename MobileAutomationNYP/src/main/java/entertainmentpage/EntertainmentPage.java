package entertainmentpage;

import common.CommonAPI_mobile;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import reporting.TestLogger;

public class EntertainmentPage  extends CommonAPI_mobile {

    public EntertainmentPage(){
        PageFactory.initElements(ad, this);
    }

    @FindBy(id = "Id=br.com.golmobile.nypost:id/headline_text_view)")
    WebElement Entertainment;

    @FindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Open menu\"]")
    WebElement OpenMenu;

    public WebElement getEntertainment() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI_mobile.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return Entertainment;
    }
    public WebElement getOpenMenu(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI_mobile.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return OpenMenu;

}
    public void showEntertainment(){
        OpenMenu.click();

        Entertainment.click();


    }

}


