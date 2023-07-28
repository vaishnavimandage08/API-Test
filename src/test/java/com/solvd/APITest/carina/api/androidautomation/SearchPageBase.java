package com.solvd.APITest.carina.api.androidautomation;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import com.zebrunner.carina.webdriver.locator.ExtendedFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchPageBase extends AbstractPage {
    @FindBy(id = "com.chewy.android:id/searchInputText")
    private ExtendedWebElement searchBox;

    @ExtendedFindBy(accessibilityId = "Dry Food")
    private ExtendedWebElement searchResults;

    @FindBy(id = "com.chewy.android:id/suggestionItemText")
    private List<ExtendedWebElement> searchElements;
    public SearchPageBase(WebDriver driver) {
        super(driver);
    }
    public void searchForProduct(String productName) {
        searchBox.type(productName);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        ExtendedWebElement firstElement = searchElements.get(0);
        firstElement.click();
    }
    public boolean areSearchResultsDisplayed() {
        return searchResults.isPresent();
    }
    public AddToCartPageBase selectFirstProduct() {
        searchResults.click();
        return initPage(AddToCartPageBase.class);
        }
}
