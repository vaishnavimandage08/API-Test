package com.solvd.APITest.carina.web.pages.mobile;

import com.solvd.APITest.carina.web.pages.common.TestAutomationPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = TestAutomationPageBase.class)

public class TestAutomationPage extends TestAutomationPageBase {
    public TestAutomationPage(WebDriver driver) {
        super(driver);
    }
}
