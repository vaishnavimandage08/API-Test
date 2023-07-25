package com.solvd.APITest.carina.api.webautomation;

import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = TestAutomationPageBase.class)
public class TestAutomationPage extends TestAutomationPageBase {
    public TestAutomationPage(WebDriver driver) {
        super(driver);
    }

}
