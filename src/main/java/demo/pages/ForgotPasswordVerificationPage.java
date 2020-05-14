package demo.pages;

import demo.interfaces.ForgotPasswordVerificationPageLocator;
import demo.interfaces.RegisterPageLocator;
import pageobjects.AndroidPageObject;

public class ForgotPasswordVerificationPage extends AndroidPageObject {

    public void isOnPage() {
        waitUntilDisplayed(ForgotPasswordVerificationPageLocator.BUTTON_NEXT);
    }

    public boolean checkIfNextButtonIsDisplayed() {
        return checkIfDisplayed(ForgotPasswordVerificationPageLocator.OTP_FIELD);
    }
    public void inputOTP(String otp) {typeON(ForgotPasswordVerificationPageLocator.OTP_FIELD, otp);}

    public String getToastMessage() { return checkToast(RegisterPageLocator.TOAST_POPUP); }
}
