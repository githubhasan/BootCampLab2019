package searchTest;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;
import searchPages.SearchPage;

import java.io.IOException;
import java.sql.SQLException;

public class TestSearch extends CommonAPI {

    @Test
    public void searchItemsOnAmazonSearchBox() throws Exception, IOException, SQLException, ClassNotFoundException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);
        searchPage.searchItemsFromArrayListAndSubmitButton();
    }

    @Test
    public void searchItemsFromDB() throws Exception, IOException, SQLException, ClassNotFoundException {
        SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);
        searchPage.searchItemsFromArrayListAndSubmitButton();
    }
}
