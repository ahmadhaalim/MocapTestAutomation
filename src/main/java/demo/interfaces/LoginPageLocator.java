package demo.interfaces;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public interface LoginPageLocator {

    By BUTTON_LOGIN = MobileBy.id("");
    By EMAILPHONE_FIELD = MobileBy.id("");
    By PASSWORD_FIELD = MobileBy.id("");
    By BUTTON_FORGOTPASSWORD = MobileBy.id("");
    By BUTTON_REGISTER = MobileBy.id("");
    By TOAST_POPUP = MobileBy.xpath("//android.widget.Toast[1]");


}
