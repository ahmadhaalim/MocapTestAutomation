package demo.steps;

import demo.pages.ValidateAccountPage;
import demo.pages.ValidateAccountVerificationPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ValidateAccountStepsDefiniton {
    ValidateAccountPage validateAccountPage = new ValidateAccountPage();
    ValidateAccountVerificationPage validateAccountVerificationPage = new ValidateAccountVerificationPage();

    @When("user input email or phone number {string} on validate account page")
    public void userInputEmailOrPhoneNumberOnValidateAccountPage(String email) {
        validateAccountPage.inputEmail(email);
    }

    @Then("user input password {string} on validate account page")
    public void userInputPasswordOnValidateAccountPage(String password) {
        validateAccountPage.inputEmail(password);
    }

    @Then("user see warning toast on validate account page {string}")
    public void userSeeWarningToastOnValidateAccountPage(String comparison) {
        String toast = validateAccountPage.getToastMessage();
        Assert.assertEquals(comparison, toast);
    }

    @Then("user directed to validate account verification page")
    public void userDirectedToValidateAccountVerificationPage() {
        validateAccountVerificationPage.isOnPage();

    }

    @When("user input OTP {string} on validate account verification page")
    public void userInputOTPOnValidateAccountVerificationPage(String OTP) {
        validateAccountVerificationPage.inputOTP(OTP);
    }

    @Then("user see warning toast on validate account verification page {string}")
    public void userSeeWarningToastOnValidateAccountVerificationPage(String comparison) {
        String toast = validateAccountVerificationPage.getToastMessage();
        Assert.assertEquals(comparison, toast);
    }

    @Then("user see verify button doesn't active on validate account verification page")
    public void userSeeVerifyButtonDoesnTActiveOnValidateAccountVerificationPage() {
        boolean actual = validateAccountVerificationPage.checkIfButtonVerifyIsEnabled();
        Assert.assertFalse(actual);
    }
}
