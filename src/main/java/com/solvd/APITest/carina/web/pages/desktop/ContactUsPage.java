package com.solvd.APITest.carina.web.pages.desktop;

import com.solvd.APITest.carina.web.pages.common.ContactUsPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = ContactUsPageBase.class)
public class ContactUsPage extends ContactUsPageBase {

    public ContactUsPage(WebDriver driver) {
        super(driver);
    }
}
