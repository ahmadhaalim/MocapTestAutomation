package demo.pages;

import demo.webdriver.AndroidDriverInstance;
import io.appium.java_client.android.AndroidElement;
import pageobjects.AndroidPageObject;
import demo.interfaces.MobileChargePageLocator;

import java.util.List;
import java.util.Random;

public class MobileChargePage extends AndroidPageObject {
    public boolean isInMainPage() {
        return checkIfDisplayed(MobileChargePageLocator.INPUT_PHONE);
    }


    public String getDefaultNumber() {
        AndroidElement editText = AndroidDriverInstance.androidDriver.findElement(MobileChargePageLocator.INPUT_PHONE);
        return editText.getText();
    }

    public void inputNumber(String number){
        typeON(MobileChargePageLocator.INPUT_PHONE,number);
    }

    public void mobileChargeOptionsIsDisplayed() {
        waitUntilDisplayed(MobileChargePageLocator.PRICE_OPTIONS);
    }

    public void providerIsDisplayed() {
        waitUntilDisplayed(MobileChargePageLocator.PROVIDER_LOGO);
    }

    public String chooseFirstOption(){
        String price = AndroidDriverInstance.androidDriver
                .findElement(MobileChargePageLocator.PRICE_OPTIONS).getText();
        clickOn(MobileChargePageLocator.PRICE_OPTIONS);
        return price;
    }

    public String chooseOptions(String provider) {
        int choice = 0;
        switch (provider) {
            case "XL":
                choice = random(11);
                break;
            case "TELKOMSEL":
                choice = random(12);
                break;
            case "TRI":
                choice = random(16);
                break;
            case "INDOSAT":
                choice = random(14);
                break;
            case "SMARTFREN":
                choice = random(12);
                break;
            case "AXIS":
                choice = random(8);
                break;
        }
        List<AndroidElement> options = AndroidDriverInstance.androidDriver
                .findElements(MobileChargePageLocator.PRICE_OPTIONS);
        String price =  options.get(choice).getText();
        options.get(choice).click();
        return price;
    }

    public String paymentMethodPopUpWithPrice(){
        AndroidElement price = AndroidDriverInstance.androidDriver
                .findElement(MobileChargePageLocator.PAYMENT_POPUP_PRICE);
        return price.getText();
    }

    public void paymentClickBalance(){
        clickOn(MobileChargePageLocator.PAYMENT_POPUP_BALANCE_RADIO);
    }

    public void paymentClickDirect(){
        clickOn(MobileChargePageLocator.PAYMENT_POPUP_DIRECT_RADIO);
    }

    public void paymentClickPayNow(){
        clickOn(MobileChargePageLocator.PAYMENT_POPUP_PAYNOW);
    }

    public void paymentClickExit(){
        clickOn(MobileChargePageLocator.PAYMENT_POPUP_EXIT);
    }

    public String paymentPriceSuccess(){
        AndroidElement price = AndroidDriverInstance.androidDriver
                .findElement(MobileChargePageLocator.PAYMENT_SUCCESSFUL_PRICE);
        return price.getText().replaceAll("\\D","");
    }

    public String paymentDestinationSuccess(){
        AndroidElement destination = AndroidDriverInstance.androidDriver
                .findElement(MobileChargePageLocator.PAYMENT_SUCCESSFUL_DESTINATION);
        return destination.getText();
    }

    public void clickTakePhotoReceipt(){
        clickOn(MobileChargePageLocator.PAYMENT_DIRECT_POPUP_PHOTORECEIPT_BUTTON);
    }

    public boolean TakePhotoReceiptIsDisplayed(){
        return checkIfDisplayed(MobileChargePageLocator.PAYMENT_DIRECT_POPUP_PHOTORECEIPT_BUTTON);
    }

    public void clickOkPaymentConfirmation(){
        clickOn(MobileChargePageLocator.PAYMENT_SUCCESSFUL_CONFIRM);
    }

    public void clickHistoryMenu(){
        clickOn(MobileChargePageLocator.HISTORY_TAB);
    }



    public String getToast(){
        return checkToast(MobileChargePageLocator.TOAST_POPUP);
    }

    public int random(int options) {
        Random rand = new Random();
        return rand.nextInt(options);
    }
}
