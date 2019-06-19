package excelData;

import common.CommonAPI_mobile;
import excelFileReader.ExcelFileReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class SearchForData extends CommonAPI_mobile {

    ExcelFileReader excleFilereader = new ExcelFileReader();

    @FindBy(xpath = "//android.widget.ImageButton[@content-desc='Open menu']")
    private WebElement btnBurger;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ImageView")
    private WebElement searchTab;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ViewAnimator/android.widget.FrameLayout/androidx.viewpager.widget.ViewPager/android.widget.ViewAnimator/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.EditText")
    private WebElement sendKeysTosearch;

    @FindBy(id = "search")
    WebElement inputSearch;

    public void searchForItemFromExcel() {
        btnBurger.click();
        try {
            sleep(3);
            searchTab.click();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void sendKeysAndclearInput(String keys) {
        sendKeysTosearch.sendKeys(keys);
        sendKeysTosearch.clear();
    }

    public void SET_UP_TEST_LOGER(String search) {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + search);
    }

    String path = "../NYPost/src/test/resources/NYP dataTable.xls";

    public void searchForItems() {
        String[] searchList = excleFilereader.getExcelData(path, 0);
        for (String text : searchList) {
            SET_UP_TEST_LOGER(text);
            searchForItemFromExcel();
            sendKeysAndclearInput(text);
        }
    }
}




