package demo.steps;

import demo.interfaces.TakePhotoPageLocator;
import demo.pages.HistoryPage;
import demo.pages.MobileChargePage;
import demo.pages.TakePhotoPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class MobileChargeDefs {
    MobileChargePage mobileChargePage = new MobileChargePage();
    String defaultNumber = "";
    String price = "";
    TakePhotoPage takePhotoPage = new TakePhotoPage();
    HistoryPage historyPage = new HistoryPage();

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
        mobileChargePage.paymentClickDirect();
    }

    @And("User click take photo receipt")
    public void userClickTakePhotoReceipt() {
        mobileChargePage.clickTakePhotoReceipt();
    }


    @And("User click back button")
    public void userClickBackButton() {
        takePhotoPage.clickBackButton();
    }


    @Then("User is back to the direct transfer pop up")
    public void userIsBackToTheDirectTransferPopUp() {
        boolean result = mobileChargePage.TakePhotoReceiptIsDisplayed();
        Assert.assertTrue(result);
    }

    @Then("User see warning server is offline {string}")
    public void userSeeWarningServerIsOffline(String expected) {
        String toast = mobileChargePage.getToast();
        Assert.assertEquals(expected,toast);
    }

    @And("User click OK button on the payment confirmation")
    public void userClickOKButtonOnThePaymentConfirmation() {
        mobileChargePage.clickOkPaymentConfirmation();
    }

    @And("User click the history tab")
    public void userClickTheHistoryTab() {
        mobileChargePage.clickHistoryMenu();
    }

    @Then("User can see his successful transaction")
    public void userCanSeeHisSuccessfulTransaction() {
        boolean result = historyPage.itemHistoryIsDisplayed();
        Assert.assertTrue(result);
    }

    @And("User click upload")
    public void userClickUpload() {
        takePhotoPage.clickUploadButton();
    }

    @And("User click take photo")
    public void userClickTakePhoto() {
        takePhotoPage.clickTakePhoto();
    }
}
