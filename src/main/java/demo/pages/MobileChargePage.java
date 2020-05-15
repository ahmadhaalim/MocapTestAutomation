package demo.pages;

import demo.interfaces.MobileChargePageLocator;
import pageobjects.AndroidPageObject;

public class MobileChargePage extends AndroidPageObject {

    public void isOnPage() {
        waitUntilDisplayed(MobileChargePageLocator.PHONE_NUMBER);
    }
    public boolean checkDefaultNumberIsDisplayed() {
        return checkIfDisplayed(MobileChargePageLocator.PHONE_NUMBER);
    }
}
