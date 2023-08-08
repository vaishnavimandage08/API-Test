package com.solvd.APITest.carina.api.androidautomation;

import com.solvd.APITest.carina.mobile.android.WelcomePage;
import com.solvd.APITest.carina.mobile.common.AddToCartPageBase;
import com.solvd.APITest.carina.mobile.common.EmptyCartPageBase;
import com.solvd.APITest.carina.mobile.common.LoginPageBase;
import com.solvd.APITest.carina.mobile.common.SearchPageBase;
import com.zebrunner.agent.core.annotation.TestLabel;
import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.core.registrar.ownership.MethodOwner;
import com.zebrunner.carina.utils.mobile.IMobileUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MobileSampleTest implements IAbstractTest, IMobileUtils {
    @Test
    @MethodOwner(owner = "vmandage")
    @TestLabel(name = "feature", value = {"mobile", "regression"})
    public void testWelcomePage() {
        WelcomePage welcomePage = new WelcomePage(getDriver());
        welcomePage.isPageOpened();
        Assert.assertTrue(welcomePage.isPageOpened(), "Welcome page isn't opened");
    }
    @Test
    @MethodOwner(owner = "vmandage")
    @TestLabel(name = "feature", value = {"mobile", "regression"})
    public void testSearchProduct() {
        WelcomePage welcomePage = new WelcomePage(getDriver());
        welcomePage.isPageOpened();
        SearchPageBase search = welcomePage.clickSearchButton();

        String productName = "Dog food";

        search.searchForProduct(productName);

        Assert.assertTrue(search.areSearchResultsDisplayed(), "Search results are not displayed for the search query: " + productName);
    }
    @Test
    @MethodOwner(owner = "vmandage")
    @TestLabel(name = "feature", value = {"mobile", "regression"})
    public void testCartFunctionality() {
        WelcomePage welcomePage = new WelcomePage(getDriver());
        welcomePage.isPageOpened();
        SearchPageBase search = welcomePage.clickSearchButton();
        String productName = "Dog food";
        search.searchForProduct(productName);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        AddToCartPageBase addToCart = search.selectFirstProduct();
        addToCart.addItem();

        Assert.assertTrue(addToCart.isProductAddedToCart(), "Product is not added to the cart.");
    }
    @Test
    @MethodOwner(owner = "vmandage")
    @TestLabel(name = "feature", value = {"mobile", "regression"})
    public void testLoginFunctionality() {
        WelcomePage welcomePage = new WelcomePage(getDriver());
        welcomePage.isPageOpened();
        LoginPageBase login = welcomePage.clickSignInButton();
        String password = "doggg";
        String email = "pqrabc";
        login.enterPassword(password);
        login.enterEmail(email);
        login.clickSignInButton();

        boolean isInvalidEmailText = login.isInvalidMessagePresent();
        Assert.assertTrue(isInvalidEmailText, "Please enter a valid email address.");
    }
    @Test
    @MethodOwner(owner = "vmandage")
    @TestLabel(name = "feature", value = {"mobile", "regression"})
    public void testEmptyCartFunctionality() {
        WelcomePage welcomePage = new WelcomePage(getDriver());
        welcomePage.isPageOpened();
        EmptyCartPageBase emptyCart = welcomePage.clickCartButton();
        Assert.assertTrue(emptyCart.isCartEmpty(), "Cart is not empty. Expected: 'Your cart is empty'");
    }

}
