package demo.pages;

import demo.interfaces.ValidateAccountPageLocator;
import demo.interfaces.ValidateAccountVerificationPageLocator;
import pageobjects.AndroidPageObject;

public class ValidateAccountVerificationPage extends AndroidPageObject {

    public void isOnPage(){checkIfDisplayed(ValidateAccountVerificationPageLocator.BUTTON_VERIFY);}
    public boolean checkIfButtonVerifyIsEnabled() {
        return checkIfEnabled(ValidateAccountVerificationPageLocator.BUTTON_VERIFY);
    }
    public void clickVerifyButton(){clickOn(ValidateAccountVerificationPageLocator.BUTTON_VERIFY);}
    public void clickResendOTPButton() {clickOn(ValidateAccountVerificationPageLocator.BUTTON_RESENDOTP);}
    public void inputOTP(String otp){typeON(ValidateAccountVerificationPageLocator.OTP_FIELD, otp);}
    public String getToastMessage() {
        return checkToast(ValidateAccountVerificationPageLocator.TOAST_POPUP);
    }
}
