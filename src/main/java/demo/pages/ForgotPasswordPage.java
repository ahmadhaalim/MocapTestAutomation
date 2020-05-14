package demo.pages;

import demo.interfaces.ForgotPasswordPageLocator;
import demo.interfaces.HomePageLocator;
import pageobjects.AndroidPageObject;

public class ForgotPasswordPage extends AndroidPageObject {

    public void isOnPage() {
        waitUntilDisplayed(ForgotPasswordPageLocator.BUTTON_NEXT);
    }
    public boolean checkIfNextButtonIsDisplayed() {
        return checkIfDisplayed(ForgotPasswordPageLocator.BUTTON_NEXT);
    }
}
