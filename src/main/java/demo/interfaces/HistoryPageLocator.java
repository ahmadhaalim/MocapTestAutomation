package demo.interfaces;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public interface HistoryPageLocator {
    By PAYNOW_BUTTON_PENDING = MobileBy.id("btn_pay_now_in_progress");
    By PAYMENT_HISTORY_ITEM = MobileBy.id("cv_history");
    By BUTTON_BACK_TO_MAIN  = MobileBy.id("iv_back_to_main_history");
}
