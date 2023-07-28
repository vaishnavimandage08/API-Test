package com.solvd.APITest.carina.api.androidautomation;

import com.zebrunner.carina.utils.factory.DeviceType;
;
import org.openqa.selenium.WebDriver;


@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = SearchPageBase.class)

public class SearchPage extends SearchPageBase {

    public SearchPage(WebDriver driver) {
        super(driver);
    }

}
