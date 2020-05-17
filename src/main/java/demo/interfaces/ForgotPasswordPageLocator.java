package demo.interfaces;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public interface ForgotPasswordPageLocator {

    By BUTTON_NEXT = MobileBy.id("btn_forgot_password_next");
    By EMAILORPHONE_FIELD = MobileBy.id("et_forgot_password_email");
    By TOAST_POPUP = MobileBy.xpath("//android.widget.Toast[1]");
}
