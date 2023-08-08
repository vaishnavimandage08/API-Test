package com.solvd.APITest.carina.mobile.android;

import com.solvd.APITest.carina.mobile.common.EmptyCartPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = EmptyCartPageBase.class)
public class EmptyCartPage extends EmptyCartPageBase {
    public EmptyCartPage(WebDriver driver) {
        super(driver);
    }
}
