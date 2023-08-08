package com.solvd.APITest.carina.mobile.common;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
public class EmptyCartPageBase extends AbstractPage {
    public EmptyCartPageBase(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//*[@text ='Your cart is empty.']")
    private ExtendedWebElement emptyCartTextElement;
    public boolean isCartEmpty() {
        return emptyCartTextElement.isPresent();
    }
}
