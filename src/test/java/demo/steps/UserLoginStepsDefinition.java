package demo.steps;

import demo.pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class UserLoginStepsDefinition {

    LoginPage loginPage = new LoginPage();
    MobileChargePage mobileChargePage = new MobileChargePage();
    ForgotPasswordPage forgotPasswordPage = new ForgotPasswordPage();
    RegisterPage registerPage = new RegisterPage();
    ValidateAccountPage validateAccountPage = new ValidateAccountPage();

    @Given("user is on login page")
    public void userIsOnLoginPage() {
        loginPage.isOnPage();
    }

    @When("user input email or phone number {string}")
    public void userInputEmailOrPhoneNumber(String identifier) {
        loginPage.inputEmailorPhone(identifier);
    }

    @And("user input password {string}")
    public void userInputPassword(String password) {
        loginPage.inputPassword(password);
    }

    @And("user click login button")
    public void userClickLoginButton() {
        loginPage.clickLoginButton();
    }

    @Then("user see warning toast on login page {string}")
    public void userSeeWarningToastOnLoginPage(String comparison) {
        String toast = loginPage.getToastMessage();
        Assert.assertEquals(comparison, toast);
    }

    @Then("user see login button doesn't active")
    public void userSeeLoginButtonDoesnTActive() {
        boolean actual = loginPage.checkLoginButton();
        Assert.assertFalse(actual);
    }

    @When("user click forgot password text")
    public void userClickForgotPasswordText() {
        loginPage.clickForgotPasswordText();
    }

    @Then("user directed to forgot password page")
    public void userDirectedToForgotPasswordPage() {
        forgotPasswordPage.isOnPage();
        boolean actual = forgotPasswordPage.checkIfNextButtonIsDisplayed();
        Assert.assertTrue(actual);
    }

    @When("user click register text")
    public void userClickRegisterText() {
        loginPage.clickRegisterText();
    }

    @Then("user directed to register page")
    public void userDirectedToRegisterPage() {
        registerPage.isOnPage();
        boolean actual = registerPage.checkIfRegisterButtonIsDisplayed();
        Assert.assertTrue(actual);
    }

    @Then("user directed to home page and see toast {string}")
    public void userDirectedToHomePageAndSeeToast(String comparison) {
        mobileChargePage.isOnPage();
        String toast = mobileChargePage.getToastMessage();
        Assert.assertEquals(toast, comparison);
    }

    @When("user click validate account text")
    public void userClickValidateAccountText() {
        loginPage.clickValidateText();
    }

    @Then("user directed to validate account page")
    public void userDirectedToValidateAccountPage() {
        validateAccountPage.isOnPage();
    }
}
