package menuPage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class MenuPageTest extends CommonAPI {
    @Test
    public void readMenuText() {
        List <String> actualData = new ArrayList <>();
        List <WebElement> element = getListOfWebElementsByCss("searchDropdownDescription");
        for (WebElement text : element) {
            actualData.add(text.getText());
            System.out.println(text.getText());
        }
        //To Be implemented, to read from database
        List <String> menuData = new ArrayList <>();
        Assert.assertEquals(menuData, actualData);
    }
}
