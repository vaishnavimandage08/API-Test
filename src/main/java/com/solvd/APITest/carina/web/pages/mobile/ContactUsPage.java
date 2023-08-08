package com.solvd.APITest.carina.web.pages.mobile;

import com.solvd.APITest.carina.web.pages.common.ContactUsPageBase;
import com.solvd.APITest.carina.web.pages.common.HomePageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = ContactUsPageBase.class)

public class ContactUsPage extends ContactUsPageBase {
    public ContactUsPage(WebDriver driver) {
        super(driver);
    }
}
