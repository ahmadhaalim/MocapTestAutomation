package demo.steps_definition;

import demo.pages.MobileChargePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MobileChargeDefs {
    MobileChargePage mobileChargePage = new MobileChargePage();
    String defaulNumber = "";
    @Given("User is logged In")
    public void userIsLoggedIn() {

    }

    @Given("User is on the mobile top up page")
    public void userIsOnTheMobileTopUpPage() {
        mobileChargePage.isInMainPage();
    }

    @And("User see the account default number")
    public void userSeeTheAccountDefaultNumber() {
        defaulNumber = mobileChargePage.getDefaultNumber();
    }

    @And("User see the provider logo")
    public void userSeeTheProviderLogo() {
        //ambil nama logo disamain ama provider kalo bisa kalo enggak skip aja
    }

    @And("User see mobile charge options")
    public void userSeeMobileChargeOptions() {

    }

    @When("User choose one of the options")
    public void userChooseOneOfTheOptions() {
    }

    @And("User see the choose payment method pop-up with correct amount to pay")
    public void userSeeTheChoosePaymentMethodPopUpWithCorrectAmountToPay() {
    }

    @And("User click In App balance")
    public void userClickInAppBalance() {
    }

    @And("User click Pay Now")
    public void userClickPayNow() {
    }

    @Then("User see payment succesfull pop up with the amount they buy")
    public void userSeePaymentSuccesfullPopUpWithTheAmountTheyBuy() {
    }

    @And("the destination phone number")
    public void theDestinationPhoneNumber() {
    }

    @And("User click exit button on the pop up")
    public void userClickExitButtonOnThePopUp() {
    }

    @Then("User focused back on the mobile top up page")
    public void userFocusedBackOnTheMobileTopUpPage() {
    }

    @When("User manually input <phone_number>")
    public void userManuallyInputPhone_number() {
    }

    @Then("User see warning invalid number format")
    public void userSeeWarningInvalidNumberFormat() {
    }


}
