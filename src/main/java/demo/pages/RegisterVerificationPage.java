package demo.pages;

import demo.interfaces.RegisterPageLocator;
import demo.interfaces.RegisterVerificationPageLocator;
import pageobjects.AndroidPageObject;

public class RegisterVerificationPage extends AndroidPageObject {

    public void isOnPage() {
        waitUntilDisplayed(RegisterVerificationPageLocator.BUTTON_VERIFY);
    }
    public boolean checkIfRegisterButtonIsDisplayed() {
        return checkIfDisplayed(RegisterVerificationPageLocator.BUTTON_VERIFY);
    }
}
