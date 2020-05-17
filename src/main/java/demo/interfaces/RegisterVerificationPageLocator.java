package demo.interfaces;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public interface RegisterVerificationPageLocator {

    By BUTTON_VERIFY = MobileBy.id("btn_verify_register");
    By BUTTON_RESENDOTP = MobileBy.id("btn_timer_register");
    By OTP_FIELD = MobileBy.id("et_otp_register_verification");

}
