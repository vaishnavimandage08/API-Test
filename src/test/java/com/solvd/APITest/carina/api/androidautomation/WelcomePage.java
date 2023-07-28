package com.solvd.APITest.carina.api.androidautomation;

import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = WelcomePageBase.class)
public class WelcomePage extends WelcomePageBase {
    @FindBy(id = "com.chewy.android:id/mainToolbar")
    private ExtendedWebElement title;

    @FindBy(id = "com.chewy.android:id/search_hint_text")
    private ExtendedWebElement searchButton;

    @FindBy(xpath = "//*[@text ='Sign In']")
    private ExtendedWebElement signInButton;

    @FindBy(id = "com.chewy.android:id/action_shopping_cart")
    private ExtendedWebElement cartButton;

    public WelcomePage(WebDriver driver) {
        super(driver);
    }
    @Override
    public boolean isPageOpened() {
        return title.isElementPresent();
    }

    public SearchPageBase clickSearchButton() {
        searchButton.click();
        return initPage(SearchPageBase.class);
    }
    public LoginPageBase clickSignInButton() {
        signInButton.click();
        return initPage(LoginPageBase.class);
    }
    public EmptyCartPageBase clickCartButton() {
        cartButton.click();
        return initPage(EmptyCartPageBase.class);
    }
}
