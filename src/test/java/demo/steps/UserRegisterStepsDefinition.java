package demo.steps;

import demo.pages.RegisterVerificationPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class UserRegisterStepsDefinition {

    RegisterVerificationPage registerVerificationPage = new RegisterVerificationPage();

    @When("user input email {string} on register page")
    public void userInputEmailOnRegisterPage(String email) {
    }

    @And("user input phone number {string} on register page")
    public void userInputPhoneNumberOnRegisterPage(String phoneNumber) {
    }

    @And("user input password {string} on register page")
    public void userInputPasswordOnRegisterPage(String password) {
    }

    @And("user input password confirmation {string} on register page")
    public void userInputPasswordConfirmationOnRegisterPage(String passwordConfirmation) {
    }

    @And("user click register button")
    public void userClickRegisterButton() {
    }
    @Then("user see warning toast on register page")
    public void userSeeWarningToastOnRegisterPage() {
    }

    @Then("user directed to register verification page")
    public void userDirectedToRegisterVerificationPage() {
        registerVerificationPage.isOnPage();
        boolean actual = registerVerificationPage.checkIfRegisterButtonIsDisplayed();
        Assert.assertTrue(actual);
    }
}
