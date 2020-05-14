package demo.steps;

import demo.pages.HomePage;
import demo.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class UserLoginStepsDefinition {

    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();

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

    @Then("user directed to home page")
    public void userDirectedToHomePage() {
        homePage.isOnPage();
        boolean actual = homePage.checkDefaultNumberIsDisplayed();
        Assert.assertTrue(actual);
    }

}
