package demo.interfaces;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public interface RegisterPageLocator {
    By BUTTON_REGISTER = MobileBy.id("btn_register");
    By NAME_FIELD = MobileBy.id("et_name_register");
    By EMAIL_FIELD = MobileBy.id("et_email_register");
    By PHONE_FIELD = MobileBy.id("et_phone_number_register");
    By PASSWORD_FIELD = MobileBy.id("et_password_register");
    By PASSWORDCONFIRM_FIELD = MobileBy.id("et_password2_register");
    By BUTTON_BACK = MobileBy.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]");
    By TOAST_POPUP = MobileBy.xpath("//android.widget.Toast[1]");
}
