package demo.interfaces;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public interface MobileChargePageLocator {

    By PROVIDER_LOGO = MobileBy.id("iv_logo_provider");
    By PHONE_NUMBER = MobileBy.id("et_phone_number_main");
    By TOAST_POPUP = MobileBy.xpath("//android.widget.Toast[1]");
}
