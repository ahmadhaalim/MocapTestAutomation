package demo.interfaces;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public interface MobileChargePageLocator {
    By INPUT_PHONE = MobileBy.id("et_phone_number_main");
    By PROVIDER_LOGO = MobileBy.id("iv_logo_provider");
    By HISTORY_TAB = MobileBy.id("");
    By ACCOUNT_TAB = MobileBy.id("");
    By PRICE_OPTIONS = MobileBy.id("cv_credit_amount_main");

    By PAYMENT_POPUP_PRICE = MobileBy.id("tv_amount_pay");
    By PAYMENT_POPUP_BALANCE = MobileBy.id("radio_app_balance_main");
    By PAYMENT_POPUP_DIRECT = MobileBy.id("radio_direct_transfer_main");
    By PAYMENT_POPUP_PAYNOW = MobileBy.id("btn_pay_now_main");
    By PAYMENT_POPUP_EXIT = MobileBy.id("");

    By PAYMENT_SUCCESSFUL_PRICE = MobileBy.id("");
    By PAYMENT_SUCCESSFUL_DESTINATION = MobileBy.id("");
    By PAYMENT_SUCCESSFUL_CONFIRM = MobileBy.id("btn_back_to_main_app_balance");

    By PAYMENT_DIRECT_POPUP_PHOTORECEIPT_BUTTON = MobileBy.id("btn_take_photo_direct");

}
