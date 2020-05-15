package demo.pages;

import demo.interfaces.ForgotPasswordPageLocator;
import demo.interfaces.HomePageLocator;
import demo.interfaces.RegisterPageLocator;
import pageobjects.AndroidPageObject;

public class ForgotPasswordPage extends AndroidPageObject {

    public void isOnPage() {
        waitUntilDisplayed(ForgotPasswordPageLocator.BUTTON_NEXT);
    }
    public boolean checkIfNextButtonIsDisplayed() {
        return checkIfDisplayed(ForgotPasswordPageLocator.BUTTON_NEXT);
    }
    public void clickNextButton() {clickOn(ForgotPasswordPageLocator.BUTTON_NEXT);}
    public void inputEmailOrPhoneNumber(String identifier) {typeON(ForgotPasswordPageLocator.EMAILORPHONE_FIELD, identifier);}
    public String getToastMessage() { return checkToast(RegisterPageLocator.TOAST_POPUP); }
    public boolean checkIfNextButtonIsEnabled() { return  checkIfEnabled(ForgotPasswordPageLocator.BUTTON_NEXT);}
}
