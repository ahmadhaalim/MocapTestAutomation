package demo.pages;

import demo.interfaces.LoginPageLocator;
import demo.interfaces.MobileChargePageLocator;
import pageobjects.AndroidPageObject;

public class MobileChargePage extends AndroidPageObject {

    public void isOnPage() {
        waitUntilDisplayed(MobileChargePageLocator.PHONE_NUMBER);
    }
    public String getToastMessage() {
        return checkToast(MobileChargePageLocator.TOAST_POPUP);
    }
}
