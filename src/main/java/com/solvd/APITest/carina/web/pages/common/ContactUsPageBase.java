package com.solvd.APITest.carina.web.pages.common;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public abstract class ContactUsPageBase extends AbstractPage {
    @FindBy(xpath = "//input[@aria-label='Full name']")
    private ExtendedWebElement fullNameField;

    @FindBy(xpath = "//input[@aria-label='Email']")
    private ExtendedWebElement emailField;

    @FindBy(xpath = "//textarea[@aria-label='Your message']")
    private ExtendedWebElement messageField;

    @FindBy(xpath = "//button[@aria-label='Submit the form']")
    private ExtendedWebElement submitButton;

    //    @FindBy(xpath = "//p[@class='MuiFormHelperText']")
    @FindBy(xpath = "//p[contains(text(),'Please enter a valid email address.')]")
    private ExtendedWebElement invalidEmailText;

    @FindBy(xpath = "//p[contains(text(),'Please enter at least 10 characters.')]")
    private ExtendedWebElement invalidMessageDisplay;

    @FindBy(xpath = "//button[text()='Accept']")
    private ExtendedWebElement acceptCookies;

    public ContactUsPageBase(WebDriver driver) {
        super(driver);
    }

    public boolean isFieldPresent() {
        return fullNameField.isElementPresent() && emailField.isElementPresent() && messageField.isElementPresent() && submitButton.isElementPresent();
    }

    public void enterFullName(String fullName) {
        fullNameField.type(fullName);
    }

    public void enterEmail(String email) {
        emailField.type(email);
    }

    public void enterMessage(String message) {
        messageField.type(message);
    }

    public void clickSubmitButton() {
        submitButton.click();
    }

    public boolean isInvalidMessagePresent() {
        return invalidMessageDisplay.isElementPresent();
    }

    public boolean isInvalidEmailTextPresent() {
        return invalidEmailText.isElementPresent();
    }

    @Override
    public void open() {
        super.open();
        acceptCookies.clickIfPresent(3);
    }
}
