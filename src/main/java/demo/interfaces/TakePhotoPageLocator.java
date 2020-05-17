package demo.interfaces;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public interface TakePhotoPageLocator {
    By UPLOAD_GALLERY_BUTTON = MobileBy.id("btn_chose_from_gallery");
    By TAKE_PHOTO_BUTTON = MobileBy.id("btn_take_photo");
    By UPLOAD_BUTTON = MobileBy.id("btn_upload");
    By BACK_BUTTON = MobileBy.id("tv_back_receipt_preview");
    By PHOTO_PREVIEW = MobileBy.id("iv_receipt_preview");

    By PAYMENT_CONFIRMATION_DIRECT = MobileBy.id("btn_back_to_main_direct");
}
