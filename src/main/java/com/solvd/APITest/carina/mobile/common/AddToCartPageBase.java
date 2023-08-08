package com.solvd.APITest.carina.mobile.common;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class AddToCartPageBase extends AbstractPage {
    protected AddToCartPageBase(WebDriver driver) {
        super(driver);
    }
    @FindBy(id = "com.chewy.android:id/addToCartView")
    private ExtendedWebElement addToCartButton;

    @FindBy(xpath = "//*[@resource-id='com.chewy.android:id/productTitle']")
    private ExtendedWebElement productCartImage;

    @FindBy(id = "com.chewy.android:id/headerTextView")
    private ExtendedWebElement addedToCartText;

    public void addItem() {
        productCartImage.click();
        addToCartButton.click();
    }
    public boolean isProductAddedToCart() {
        return addedToCartText.isElementPresent();
    }
}
