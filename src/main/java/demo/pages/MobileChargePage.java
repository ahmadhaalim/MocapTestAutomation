package demo.pages;

import demo.webdriver.AndroidDriverInstance;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;

public class MobileChargePage {
    public boolean isInMainPage(){
        return AndroidDriverInstance.androidDriver.findElement(By.id("")).isDisplayed();
    }

    public String getDefaultNumber(){
        return  AndroidDriverInstance.androidDriver.findElement(By.id("et_phone_number_main")).getText();
    }

    public void mobileChargeOptionsIsDisplayed(){

    }
}
