package demo.steps;

import demo.pages.ForgotPasswordPage;
import demo.pages.ForgotPasswordVerificationPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ForgotPasswordStepsDefinition {

    ForgotPasswordVerificationPage forgotPasswordVerificationPage = new ForgotPasswordVerificationPage();
    ForgotPasswordPage forgotPasswordPage = new ForgotPasswordPage();

    @When("user input OTP {string}")
    public void userInputOTP(String otp) {
        forgotPasswordVerificationPage.inputOTP(otp);
    }

    @When("user input email or phone number {string} on forgot password page")
    public void userInputEmailOrPhoneNumberOnForgotPasswordPage(String identifier) {
        forgotPasswordPage.inputEmailOrPhoneNumber(identifier);
    }

    @Then("user directed to forgot password verification page")
    public void userDirectedToForgotPasswordVerificationPage() {
        forgotPasswordVerificationPage.isOnPage();
        boolean actual = forgotPasswordVerificationPage.checkIfNextButtonIsDisplayed();
        Assert.assertTrue(actual);
    }

    @Then("user see warning toast on forgot password page {string}")
    public void userSeeWarningToastOnForgotPasswordPage(String comparison) {
        Assert.assertEquals(comparison,forgotPasswordPage.getToastMessage());
    }

    @Then("user see warning toast on forgot password verification page {string}")
    public void userSeeWarningToastOnForgotPasswordVerificationPage(String comparison) {
        Assert.assertEquals(comparison,forgotPasswordVerificationPage.getToastMessage());
    }

    @Then("user see next button is not active")
    public void userSeeNextButtonIsNotActive() {
        boolean actual = forgotPasswordPage.checkIfNextButtonIsEnabled();
        Assert.assertFalse(actual);
    }
}
