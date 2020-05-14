package demo.pages;

import demo.interfaces.HomePageLocator;
import demo.interfaces.LoginPageLocator;
import pageobjects.AndroidPageObject;

public class HomePage extends AndroidPageObject {

    public void isOnPage() {
        waitUntilDisplayed(HomePageLocator.DEFAULT_NUMBER);
    }
    public boolean checkDefaultNumberIsDisplayed() {
        return checkIfDisplayed(HomePageLocator.DEFAULT_NUMBER);
    }
}
