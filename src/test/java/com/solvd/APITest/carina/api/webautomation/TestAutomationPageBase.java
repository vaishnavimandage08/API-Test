package com.solvd.APITest.carina.api.webautomation;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class TestAutomationPageBase extends AbstractPage {

    @FindBy(xpath = "//*[contains(text(),'Test Automation Services')]")
    private ExtendedWebElement text;
    protected TestAutomationPageBase(WebDriver driver) {
        super(driver);
    }

    public boolean isTextPresent(String searchQ) {
        System.out.println(text.getText());
        return text.getText().equals(searchQ);
    }
}
