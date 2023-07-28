package com.solvd.APITest.carina.api.androidautomation;

import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = AddToCartPageBase.class)
public class AddToCartPage extends AddToCartPageBase{

    public AddToCartPage(WebDriver driver) {
        super(driver);
    }
}
