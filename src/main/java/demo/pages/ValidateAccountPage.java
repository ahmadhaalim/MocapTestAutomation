package demo.pages;

import demo.interfaces.LoginPageLocator;
import demo.interfaces.ValidateAccountPageLocator;
import pageobjects.AndroidPageObject;

public class ValidateAccountPage  extends AndroidPageObject {
    public void isOnPage(){checkIfDisplayed(ValidateAccountPageLocator.BUTTOn_RESENDOTP);}
    public void checkIfResendOTPButtonIsEnable(){checkIfEnabled(ValidateAccountPageLocator.BUTTOn_RESENDOTP);}
    public void clickResendOTPButton() {clickOn(ValidateAccountPageLocator.BUTTOn_RESENDOTP);}
    public void inputEmail(String email) {typeON(ValidateAccountPageLocator.EMAIL_FIELD,email);}
    public void inputPassword(String password){typeON(ValidateAccountPageLocator.PASSWORD_FIELD, password);}
    public String getToastMessage() {
        return checkToast(ValidateAccountPageLocator.TOAST_POPUP);
    }
}
