package com.solvd.APITest.carina.web.pages.common;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.decorator.PageOpeningStrategy;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public abstract class HomePageBase extends AbstractPage {
    protected HomePageBase(WebDriver driver) {
        super(driver);
        setPageOpeningStrategy(PageOpeningStrategy.BY_URL);
        //setPageAbsoluteURL("https://www.google.com");
    }

    @FindBy(xpath = "//button[@aria-label='Accept all cookies']")
    private ExtendedWebElement acceptCookies;

    public abstract TestAutomationPageBase selectService(String service);

    @Override
    public void open() {
        super.open();
        acceptCookies.clickIfPresent(3);
    }

    public abstract ContactUsPageBase clickContactUsButton();

}
