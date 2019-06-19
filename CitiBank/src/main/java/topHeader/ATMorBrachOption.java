package topHeader;

import base.CommonAPI;

public class ATMorBrachOption extends CommonAPI {

    public void atmBrachOpt() {

        // ATM or Branch Option
        clickOnElement("//*[@id=\"navUtility\"]/div/div/ul/li[1]/a");

        //right corner search button to turn on
        clickOnElement("//button[@id='personetics-citi-menu']");

        //right corner search button to turn off
        clickOnElement("//button[@id='personetics-citi-menu']");

        //SearchBox and write address
        typeOnElement("//*[@id=\"search\"]", "132 Dawson Lane Jericho,NY,USA");

        //search button
        clickOnElement("//citi-search-cta[@aria-label='Search near by']//button[@type='button']");

        //Filter tab
        clickOnElement("#null-label");

        // ??????? Scroll Button locator ("//div[@id='resultListContainer']")

        //Full Service tab for Selection
        clickOnElement("//label[@id='fullservice-label']");

        //Check Deposite ATMs tab for Selection
        clickOnElement("//label[@id='cdatms-label']");

        //Drive Up ATMs
        clickOnElement("//label[@id='duatms-label']");

        //Relationship Manager tab for Selection
        clickOnElement("//label[@id='rm-label']");

        //Home Lending Officer tab for Selection
        clickOnElement("//label[@id='hlo-label']");

        //International Banking Center
        clickOnElement("//label[@id='ibc-label']");

        //Financial Advisor tab for Selection
        clickOnElement("//label[@id='fa-label']");

        // ATM tab for Selection
        clickOnElement("//label[@id='atms-label']");

        //Branch tab for Selection
        clickOnElement("//label[@id='branches-label']");

        //Apply all tab for Selection
        clickOnElement("//button[contains(text(),'Apply Filters')]");
    }
}
