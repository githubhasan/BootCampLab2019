package testexceldata;

import common.CommonAPI_mobile;
import excelData.SearchForData;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestExcelData extends CommonAPI_mobile {

    SearchForData searchForData ;

    @BeforeMethod
    public void init(){
        searchForData = PageFactory.initElements(ad, SearchForData.class);
    }

    @Test
    public void testDataDrivenFromExcel(){
        searchForData.searchForItems();
    }

}
