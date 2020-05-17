package demo.pages;
import demo.interfaces.HistoryPageLocator;
import pageobjects.AndroidPageObject;

public class HistoryPage extends AndroidPageObject {

    public boolean itemHistoryIsDisplayed(){
        return checkIfDisplayed(HistoryPageLocator.PAYMENT_HISTORY_ITEM);
    }


}
