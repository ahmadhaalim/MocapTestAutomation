package demo.pages;

import demo.interfaces.TakePhotoPageLocator;
import pageobjects.AndroidPageObject;

public class TakePhotoPage extends AndroidPageObject {
    public void clickBackButton(){
        clickOn(TakePhotoPageLocator.BACK_BUTTON);
    }

}
