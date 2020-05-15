package demo.interfaces;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public interface LoginPageLocator {

    By BUTTON_LOGIN = MobileBy.id("btn_login_login");
    By EMAILPHONE_FIELD = MobileBy.id("et_email_login");
    By PASSWORD_FIELD = MobileBy.id("et_password_login");
    By BUTTON_FORGOTPASSWORD = MobileBy.id("tv_forgot_pasword");
    By BUTTON_REGISTER = MobileBy.id("tv_register_account");
    By TOAST_POPUP = MobileBy.xpath("//android.widget.Toast[1]");


}
