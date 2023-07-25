package com.solvd.APITest.carina.api.webautomation;

import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = ContactUsPageBase.class)
public class ContactUsPage extends ContactUsPageBase {

    public ContactUsPage(WebDriver driver) {
        super(driver);
    }
}
