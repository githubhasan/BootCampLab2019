package searchFeather;

import base.CommonAPI;
import reporting.TestLogger;


public class SearchFeature extends CommonAPI {

    public void searchMenu() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        typeOnElementNEnter("#twotabsearchtextbox", "books");
        navigateBack();
        typeOnElementNEnter("#twotabsearchtextbox", "honey");
        navigateBack();
        typeOnElementNEnter("#twotabsearchtextbox", "iPhone");

    }
}
