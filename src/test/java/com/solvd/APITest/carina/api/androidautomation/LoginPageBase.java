package com.solvd.APITest.carina.api.androidautomation;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class LoginPageBase extends AbstractPage {
    protected LoginPageBase(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "com.chewy.android:id/emailInput")
    private ExtendedWebElement emailField;
    @FindBy(id = "com.chewy.android:id/passwordInput")
    private ExtendedWebElement passwordField;

    @FindBy(xpath = "//*[@text ='Sign In']")
    private ExtendedWebElement signInButton;

    @FindBy(id = "com.chewy.android:id/textinput_error")
    private ExtendedWebElement invalidEmailText;

    public void enterEmail(String email) {
        emailField.type(email);
    }
    public void enterPassword(String password) {
        passwordField.type(password);
    }
    public void clickSignInButton() {

        signInButton.click();
    }
    public boolean isInvalidMessagePresent() {

        return invalidEmailText.isElementPresent();
    }
}
