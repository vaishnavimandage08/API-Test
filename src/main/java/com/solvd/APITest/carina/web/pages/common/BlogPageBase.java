package com.solvd.APITest.carina.web.pages.common;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public abstract class BlogPageBase extends AbstractPage {

    @FindBy(xpath = "//input[@name='word']")
    private ExtendedWebElement searchField;

    @FindBy(linkText = "QA")
    private ExtendedWebElement clickQAButton;

    public BlogPageBase(WebDriver driver) {
        super(driver);
    }
    public void enterSearchField(String text) {
        searchField.type(text);
    }

    public void clickButton(){
        clickQAButton.click();
    }
    public boolean isFieldPresent(String text){
        return clickQAButton.getText().equals(text);
    }
}
