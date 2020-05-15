package demo.interfaces;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public interface ForgotPasswordPageLocator {

    By BUTTON_NEXT = MobileBy.id("");
    By EMAILORPHONE_FIELD = MobileBy.id("");
    By TOAST_POPUP = MobileBy.xpath("//android.widget.Toast[1]");
}
