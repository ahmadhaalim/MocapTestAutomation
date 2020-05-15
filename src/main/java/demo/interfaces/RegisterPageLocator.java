package demo.interfaces;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public interface RegisterPageLocator {
    By BUTTON_REGISTER = MobileBy.id("");
    By EMAIL_FIELD = MobileBy.id("");
    By PHONE_FIELD = MobileBy.id("");
    By PASSWORD_FIELD = MobileBy.id("");
    By PASSWORDCONFIRM_FIELD = MobileBy.id("");
    By BUTTON_BACK = MobileBy.id("");
    By TOAST_POPUP = MobileBy.xpath("//android.widget.Toast[1]");
}
