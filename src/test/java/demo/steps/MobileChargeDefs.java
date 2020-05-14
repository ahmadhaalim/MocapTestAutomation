package demo.steps;

import demo.pages.MobileChargePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class MobileChargeDefs {
    MobileChargePage mobileChargePage = new MobileChargePage();
    String defaultNumber = "";
    String price = "";

    @Given("User is on the mobile top up page")
    public void userIsOnTheMobileTopUpPage() {
        mobileChargePage.isInMainPage();
    }

    @And("User see the account default number")
    public void userSeeTheAccountDefaultNumber() {
        defaultNumber = mobileChargePage.getDefaultNumber();
    }

    @And("User see the provider logo")
    public void userSeeTheProviderLogo() {
        //ambil nama logo disamain ama provider kalo bisa kalo enggak skip aja
        mobileChargePage.providerIsDisplayed();
    }

    @And("User see mobile charge options")
    public void userSeeMobileChargeOptions() {
        mobileChargePage.mobileChargeOptionsIsDisplayed();
    }

    @When("User choose one of the {string} options")
    public void userChooseOneOfTheOptions(String provider) {
        price = mobileChargePage.chooseOptions(provider);
        price = price.replaceAll("\\D", "");
    }

    @And("User see the choose payment method pop-up with correct amount to pay")
    public void userSeeTheChoosePaymentMethodPopUpWithCorrectAmountToPay() {
        String paymentprice = mobileChargePage.paymentMethodPopUpWithPrice();
        Assert.assertEquals(price, paymentprice);
    }

    @And("User click In App balance")
    public void userClickInAppBalance() {
        mobileChargePage.paymentClickBalance();
    }

    @And("User click Pay Now")
    public void userClickPayNow() {
        mobileChargePage.paymentClickPayNow();
    }

    @Then("User see payment successful pop up with the amount they buy")
    public void userSeePaymentSuccessfulPopUpWithTheAmountTheyBuy() {
        String priceresult = mobileChargePage.paymentPriceSuccess();
        Assert.assertEquals(price, priceresult);
    }

    @And("the destination phone number")
    public void theDestinationPhoneNumber() {
        String destinationnumber = mobileChargePage.paymentDestinationSuccess();
        Assert.assertEquals("+62" + defaultNumber, destinationnumber);
    }

    @And("User click exit button on the pop up")
    public void userClickExitButtonOnThePopUp() {
        mobileChargePage.paymentClickExit();
    }

    @Then("User focused back on the mobile top up page")
    public void userFocusedBackOnTheMobileTopUpPage() {
        boolean result = mobileChargePage.isInMainPage();
        Assert.assertTrue(result);
    }

    @Then("User see warning invalid number format")
    public void userSeeWarningInvalidNumberFormat() {
        String result = "";
        String warning = "";
        Assert.assertEquals(warning, result);
    }


    @When("User manually input {string}")
    public void userManuallyInput(String number) {
        mobileChargePage.inputNumber(number);
    }

    @When("User choose one of the options")
    public void userChooseOneOfTheOptions() {
        price = mobileChargePage.chooseFirstOption();
    }

    @And("User click direct transfer")
    public void userClickDirectTransfer() {

    }
}
