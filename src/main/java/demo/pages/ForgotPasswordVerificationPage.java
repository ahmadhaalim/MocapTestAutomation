package demo.pages;

import demo.interfaces.ForgotPasswordVerificationPageLocator;
import demo.interfaces.RegisterPageLocator;
import pageobjects.AndroidPageObject;

public class ForgotPasswordVerificationPage extends AndroidPageObject {

    public void isOnPage() { waitUntilDisplayed(ForgotPasswordVerificationPageLocator.BUTTON_VERIFY); }
    public void inputOTP(String otp) {typeON(ForgotPasswordVerificationPageLocator.OTP_FIELD, otp);}
    public String getToastMessage() { return checkToast(ForgotPasswordVerificationPageLocator.TOAST_POPUP); }
    public void clickVerifyButton() {clickOn(ForgotPasswordVerificationPageLocator.BUTTON_VERIFY);}
    public boolean checkIfVerifyButtonIsEnabled() {
        return checkIfEnabled(ForgotPasswordVerificationPageLocator.BUTTON_VERIFY);}
    public boolean checkIfVerifyButtonIsDisplayed() {
        return checkIfDisplayed(ForgotPasswordVerificationPageLocator.BUTTON_VERIFY);
    }
}
