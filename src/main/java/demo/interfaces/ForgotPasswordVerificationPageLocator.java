package demo.interfaces;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public interface ForgotPasswordVerificationPageLocator {
    By BUTTON_VERIFY = MobileBy.id("btn_verify_new_password");
    By OTP_FIELD = MobileBy.id("et_otp_new_verification");
    By BUTTOn_RESENDOTP = MobileBy.id("btn_timer_new_password");
    By TOAST_POPUP = MobileBy.xpath("//android.widget.Toast[1]");
}
