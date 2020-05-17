package demo.interfaces;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public interface ValidateAccountVerificationPageLocator {
    By OTP_FIELD = MobileBy.id("");
    By BUTTON_VERIFY = MobileBy.id("");
    By BUTTON_RESENDOTP = MobileBy.id("");
    By TOAST_POPUP = MobileBy.xpath("//android.widget.Toast[1]");
}
