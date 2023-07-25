package com.solvd.APITest.carina.api.webautomation;

import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = HomePageBase.class)
public class HomePage extends HomePageBase {

    @FindBy(xpath = "//div[contains(@class, 'MuiBox-root css-1ndnrjr')]")
    private ExtendedWebElement serviceMenu;

    @FindBy(xpath = "//a[text()='Test Automation Services']")
    private ExtendedWebElement automationServiceButton;
    @FindBy(xpath = "//a[@aria-label='Open contact us form']")
    private ExtendedWebElement contactUsButton;

    protected HomePage(WebDriver driver) {
        super(driver);
    }

    public TestAutomationPageBase selectService(String service) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        serviceMenu.click();

        automationServiceButton.click();

        return initPage(driver, TestAutomationPageBase.class);
    }

    public ContactUsPageBase clickContactUsButton() {
        contactUsButton.click();
        return initPage(driver, ContactUsPageBase.class);
    }
}
