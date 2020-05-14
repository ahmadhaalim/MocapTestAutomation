package demo.pages;

import demo.interfaces.LoginPageLocator;
import demo.interfaces.RegisterPageLocator;
import pageobjects.AndroidPageObject;

public class RegisterPage extends AndroidPageObject {

    public void isOnPage() { waitUntilDisplayed(RegisterPageLocator.BUTTON_REGISTER); }
    public boolean checkIfRegisterButtonIsDisplayed() {
        return checkIfDisplayed(RegisterPageLocator.BUTTON_REGISTER);
    }
    public void inputEmail(String email) {typeON(RegisterPageLocator.EMAIL_FIELD, email);}
    public void inputPhoneNumber(String phoneNumber) {typeON(RegisterPageLocator.PHONE_FIELD, phoneNumber);}
    public void inputPassword(String password) {typeON(RegisterPageLocator.PASSWORD_FIELD, password);}
    public void inputPasswordConfirmation(String passwordConfirmation) {typeON(RegisterPageLocator.PASSWORDCONFIRM_FIELD, passwordConfirmation);}
    public void clickRegisterButton(){clickOn(RegisterPageLocator.BUTTON_REGISTER);}
    public void clickBackButton(){clickOn(RegisterPageLocator.BUTTON_BACK);}
    public String getToastMessage() { return checkToast(RegisterPageLocator.TOAST_POPUP); }
}
