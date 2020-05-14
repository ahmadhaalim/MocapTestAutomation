package demo.pages;

import demo.interfaces.RegisterPageLocator;
import pageobjects.AndroidPageObject;

public class RegisterPage extends AndroidPageObject {

    public void isOnPage() {
        waitUntilDisplayed(RegisterPageLocator.BUTTON_REGISTER);
    }
    public boolean checkIfRegisterButtonIsDisplayed() {
        return checkIfDisplayed(RegisterPageLocator.BUTTON_REGISTER);
    }
}
