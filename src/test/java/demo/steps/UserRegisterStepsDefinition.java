package demo.steps;

import demo.pages.RegisterPage;
import demo.pages.RegisterVerificationPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class UserRegisterStepsDefinition {

    RegisterVerificationPage registerVerificationPage = new RegisterVerificationPage();
    RegisterPage registerPage = new RegisterPage();

    @When("user input email {string} on register page")
    public void userInputEmailOnRegisterPage(String email) {
        registerPage.inputEmail(email);
    }

    @And("user input phone number {string} on register page")
    public void userInputPhoneNumberOnRegisterPage(String phoneNumber) {
        registerPage.inputPhoneNumber(phoneNumber);
    }

    @And("user input password {string} on register page")
    public void userInputPasswordOnRegisterPage(String password) {
        registerPage.inputPassword(password);
    }

    @And("user input password confirmation {string} on register page")
    public void userInputPasswordConfirmationOnRegisterPage(String passwordConfirmation) {
        registerPage.inputPasswordConfirmation(passwordConfirmation);
    }

    @And("user click register button")
    public void userClickRegisterButton() {
        registerPage.clickRegisterButton();
    }
    @Then("user see warning toast on register page {string}")
    public void userSeeWarningToastOnRegisterPage(String comparison) {
        Assert.assertEquals(comparison, registerPage.getToastMessage());
    }

    @Then("user directed to register verification page")
    public void userDirectedToRegisterVerificationPage() {
        registerVerificationPage.isOnPage();
        boolean actual = registerVerificationPage.checkIfRegisterButtonIsDisplayed();
        Assert.assertTrue(actual);
    }

    @Then("user see warning text below input field")
    public void userSeeWarningTextBelowInputField() {

    }

    @Then("user see warning register button is not active")
    public void userSeeWarningRegisterButtonIsNotActive() {
        boolean actual = registerPage.checkIfRegisterButtonIsEnabled();
        Assert.assertFalse(actual);
    }
}
