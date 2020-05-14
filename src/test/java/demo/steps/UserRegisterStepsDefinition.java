package demo.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserRegisterStepsDefinition {

    @When("user input email {string} on register page")
    public void userInputEmailOnRegisterPage(String arg0) {
    }

    @And("user input phone number {string} on register page")
    public void userInputPhoneNumberOnRegisterPage(String arg0) {
    }

    @And("user input password {string} on register page")
    public void userInputPasswordOnRegisterPage(String arg0) {
    }

    @And("user input password confirmation{string} on register page")
    public void userInputPasswordConfirmationOnRegisterPage(String arg0) {
    }

    @And("user click register button")
    public void userClickRegisterButton() {
    }
    @Then("user see warning toast on register page")
    public void userSeeWarningToastOnRegisterPage() {
    }
}
