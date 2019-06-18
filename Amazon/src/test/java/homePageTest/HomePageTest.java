package homePageTest;

import org.testng.annotations.Test;
import reporting.TestLogger;
import searchFeather.SearchFeature;

public class HomePageTest extends SearchFeature {

    @Test
    public void test1() {
        TestLogger.log("Browser is launched");
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        searchMenu();
        System.out.println("Test Pass");


    }



}
