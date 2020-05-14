package demo.pages;

import demo.interfaces.LoginPageLocator;
import pageobjects.AndroidPageObject;

public class LoginPage extends AndroidPageObject {


    public void isOnPage() {waitUntilDisplayed(LoginPageLocator.BUTTON_LOGIN);}
    public void clickLoginButton() { clickOn(LoginPageLocator.BUTTON_LOGIN); }
    public void inputEmailorPhone(String text) {typeON(LoginPageLocator.EMAILPHONE_FIELD, text);}
    public void inputPassword(String password) {typeON(LoginPageLocator.PASSWORD_FIELD, password);}
    public boolean checkLoginButton() {
        return checkIfEnabled(LoginPageLocator.BUTTON_LOGIN);
    }
    public String getToastMessage() {
        return checkToast(LoginPageLocator.TOAST_POPUP);
    }
    public void clickForgotPasswordText() {clickOn(LoginPageLocator.BUTTON_FORGOTPASSWORD);}
}
