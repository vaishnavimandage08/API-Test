package com.solvd.APITest.carina.web.pages.common;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public abstract class TestAutomationPageBase extends AbstractPage {

    @FindBy(xpath = "//h1[@class='MuiTypography-root MuiTypography-body1 css-cs4ukt']")
    private ExtendedWebElement automationText;
    public TestAutomationPageBase(WebDriver driver) {
        super(driver);
    }

    public boolean isTextPresent(String searchQ) {
        System.out.println(automationText.getText());
        return automationText.isElementPresent();
    }
}
