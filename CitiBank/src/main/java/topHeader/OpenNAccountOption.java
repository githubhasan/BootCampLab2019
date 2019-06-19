package topHeader;
import base.CommonAPI;

public class OpenNAccountOption extends CommonAPI {

    public void openNAccountOpt(){
        clickOnElement("//*[@id=\"navUtility\"]/div/div/ul/li[2]/a");
        typeOnElement("//*[@id=\"state-dropdown-id\"]","NY");
        clickOnElement("//*[@id=\"oa-state-selector\"]/div/div/div[3]/div/citi-cta[1]/button");
        typeOnElement("//*[@id=\"myDropdown\"]", "Banking");
        clickOnElement("//*[@id=\"getStartedBtn\"]");
        clickOnElement("//*[@id=\"check_app_status\"]/div/citi-column/div/div/citi-cta/a");
        navigateBack();
        clickOnElement("body > app-root > cbol-core > citi-parent-layout > div > div > div > app-open-an-account > citi-simple-layout > app-banking > div.container-fluid.tabSection.checkingZebra > citi-nested-table > div.row.ng-star-inserted > div > button > span");
    }
}