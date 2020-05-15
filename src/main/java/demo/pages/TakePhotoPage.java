package demo.pages;

import demo.interfaces.TakePhotoPageLocator;
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

}
