package com.solvd.APITest.carina.api.androidautomation;

import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = LoginPageBase.class)
public class LoginPage extends LoginPageBase {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

}
