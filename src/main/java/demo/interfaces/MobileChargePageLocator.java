package demo.interfaces;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public interface MobileChargePageLocator {
    By INPUT_PHONE = MobileBy.id("et_phone_number_main");
    By PROVIDER_LOGO = MobileBy.id("iv_logo_provider");
    By HISTORY_TAB = MobileBy.id("menu_history");
    By ACCOUNT_TAB = MobileBy.id("menu_profile");
    By PRICE_OPTIONS = MobileBy.id("tv_item_list_price");
    By TOAST_POPUP = MobileBy.xpath("//android.widget.Toast[1]");

    By PAYMENT_POPUP_PRICE = MobileBy.id("tv_amount_pay");
    By PAYMENT_POPUP_BALANCE_RADIO = MobileBy.id("rb_app_balance");
    By PAYMENT_POPUP_DIRECT_RADIO = MobileBy.id("rb_direct");
    By PAYMENT_POPUP_PAYNOW = MobileBy.id("cv_pay_now");
    By PAYMENT_POPUP_EXIT = MobileBy.id("iv_close_bottom_sheet");

    By PAYMENT_SUCCESSFUL_PRICE = MobileBy.id("tv_message_2");
    By PAYMENT_SUCCESSFUL_DESTINATION = MobileBy.id("tv_message_4");
    By PAYMENT_SUCCESSFUL_CONFIRM = MobileBy.id("btn_back_to_main_app_balance");

    By PAYMENT_DIRECT_POPUP_PHOTORECEIPT_BUTTON = MobileBy.id("btn_take_photo_direct");

}
