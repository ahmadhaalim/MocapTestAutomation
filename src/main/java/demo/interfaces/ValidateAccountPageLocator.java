package demo.interfaces;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public interface ValidateAccountPageLocator {

    By EMAIL_FIELD = MobileBy.id("et_email_validate");
    By PASSWORD_FIELD = MobileBy.id("et_password_validate");
    By BUTTOn_RESENDOTP = MobileBy.id("btn_login_validate");
    By TOAST_POPUP = MobileBy.xpath("//android.widget.Toast[1]");

}
