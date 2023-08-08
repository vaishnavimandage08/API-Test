package com.solvd.APITest.carina.web.pages.mobile;

import com.solvd.APITest.carina.web.pages.common.BlogPageBase;
import com.solvd.APITest.carina.web.pages.common.ContactUsPageBase;
import com.solvd.APITest.carina.web.pages.common.HomePageBase;
import com.solvd.APITest.carina.web.pages.common.TestAutomationPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = HomePageBase.class)
public class HomePage extends HomePageBase {

    @FindBy(xpath = "//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium css-1oyo5tm']")
    private ExtendedWebElement tapMenu;

    @FindBy(xpath = "//div[@class='MuiBox-root css-13cgf4h']")
    private ExtendedWebElement serviceMenu;
    @FindBy(xpath = "//a[text()='Test Automation Services']")
    private ExtendedWebElement automationServiceButton;
    @FindBy(xpath = "//a[@aria-label='Open contact us form']")
    private ExtendedWebElement contactUsButton;

    @FindBy(linkText = "Blog")
    private ExtendedWebElement blogButton;

    public HomePage(WebDriver driver) {
        super(driver);
    }
    public TestAutomationPageBase selectService(String service) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        tapMenu.click();
        serviceMenu.click();

        automationServiceButton.click();

        return initPage(driver, TestAutomationPageBase.class);
    }
    public ContactUsPageBase clickContactUsButton() {
        tapMenu.click();
        contactUsButton.click();
        return initPage(driver, ContactUsPageBase.class);
    }
    public BlogPageBase clickCBlogButton() {
        tapMenu.click();
        blogButton.click();
        return initPage(driver, BlogPageBase.class);
    }

}
