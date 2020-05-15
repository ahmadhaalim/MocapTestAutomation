package demo.interfaces;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public interface ForgotPasswordVerificationPageLocator {
    By BUTTON_NEXT = MobileBy.id("");
    By OTP_FIELD = MobileBy.id("");
    By TOAST_POPUP = MobileBy.xpath("//android.widget.Toast[1]");
}
