package demo.pages;

import demo.interfaces.TakePhotoPageLocator;
import demo.webdriver.AndroidDriverInstance;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.By;
import pageobjects.AndroidPageObject;


public class TakePhotoPage extends AndroidPageObject {
    public void clickBackButton() {
        clickOn(TakePhotoPageLocator.BACK_BUTTON);
    }

    public void clickUploadButton() {
        clickOn(TakePhotoPageLocator.UPLOAD_BUTTON);
    }

    public void clickUploadGalleryButton() {
        clickOn(TakePhotoPageLocator.UPLOAD_GALLERY_BUTTON);
    }

    public void clickTakePhoto() {
        clickOn(TakePhotoPageLocator.TAKE_PHOTO_BUTTON);
    }

    public boolean paymentSuccessDirectIsDisplayed(){
        return checkIfDisplayed(TakePhotoPageLocator.PAYMENT_CONFIRMATION_DIRECT);
    }

    public void cameraTakePhoto(){
        //AndroidDriverInstance.androidDriver.pressKey(new KeyEvent(AndroidKey.CAMERA));
        AndroidDriverInstance.androidDriver.findElement(By.name("Camera")).click();
    }
}
