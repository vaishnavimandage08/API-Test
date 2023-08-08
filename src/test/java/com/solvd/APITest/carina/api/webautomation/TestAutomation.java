package com.solvd.APITest.carina.api.webautomation;

import com.solvd.APITest.carina.web.pages.common.BlogPageBase;
import com.solvd.APITest.carina.web.pages.common.ContactUsPageBase;
import com.solvd.APITest.carina.web.pages.common.HomePageBase;
import com.solvd.APITest.carina.web.pages.common.TestAutomationPageBase;
//import com.solvd.APITest.carina.web.pages.desktop.HomePage;
import com.solvd.APITest.carina.web.pages.mobile.HomePage;
import com.zebrunner.agent.core.annotation.TestLabel;
import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.core.registrar.ownership.MethodOwner;
import com.zebrunner.carina.core.registrar.tag.Priority;
import com.zebrunner.carina.core.registrar.tag.TestPriority;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAutomation implements IAbstractTest {
    @Test
    @MethodOwner(owner = "vmandage")
    @TestPriority(Priority.P1)
    @TestLabel(name = "feature", value = {"web", "regression"})
    public void testOpenWebPage() {
        HomePageBase homePage = initPage(getDriver(), HomePageBase.class);;
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened!");
    }

    @Test
    @MethodOwner(owner = "vmandage")
    @TestPriority(Priority.P1)
    @TestLabel(name = "feature", value = {"web", "regression"})
    public void testAutomationServicesPresentOnPage() {
        HomePageBase homePage = initPage(getDriver(), HomePageBase.class);;
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened!");
        TestAutomationPageBase page = homePage.selectService("Test Automation Services");
        Assert.assertTrue(page.isPageOpened(), "Test Automation page is not opened");
        final String searchQ = "Test Automation Services";

        boolean result = page.isTextPresent(searchQ);

        Assert.assertTrue(result, "Text '" + searchQ + "' not found on the page!");
    }

    @Test
    @MethodOwner(owner = "vmandage")
    @TestPriority(Priority.P1)
    @TestLabel(name = "feature", value = {"web", "regression"})
    public void testContactPageNavigation() {
        HomePageBase homePage = initPage(getDriver(), HomePageBase.class);;
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened!");
        ContactUsPageBase contact = homePage.clickContactUsButton();

        boolean result = contact.isFieldPresent();

        Assert.assertTrue(result, "Text not found on the page!");
    }

    @Test
    @MethodOwner(owner = "vmandage")
    @TestPriority(Priority.P1)
    @TestLabel(name = "feature", value = {"web", "regression"})
    public void testContactUsSubmissionInvalidEmail() {
        HomePageBase homePage = initPage(getDriver(), HomePageBase.class);;
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened!");

        ContactUsPageBase contact = homePage.clickContactUsButton();

        String fullName = "";
        String email = "pqrabc";

        contact.enterFullName(fullName);
        contact.enterEmail(email);
        contact.enterMessage("");

        boolean isInvalidEmailText = contact.isInvalidEmailTextPresent();

        Assert.assertTrue(isInvalidEmailText, "Please enter a valid email address.");
    }


    @Test
    @MethodOwner(owner = "vmandage")
    @TestPriority(Priority.P1)
    @TestLabel(name = "feature", value = {"web", "regression"})
    public void testContactUsSubmissionInvalidMessage() {
        HomePageBase homePage = initPage(getDriver(), HomePageBase.class);;
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened!");
        ContactUsPageBase contact = homePage.clickContactUsButton();

        String fullName = "";
        String email = "abc@pqr.com";
        String message = "Hello";

        contact.enterFullName(fullName);
        contact.enterMessage(message);
        contact.enterEmail(email);

        boolean isInvalidMessageText = contact.isInvalidMessagePresent();

        Assert.assertTrue(isInvalidMessageText, "Please enter at least 10 characters.");
    }
    @Test
    @MethodOwner(owner = "vmandage")
    @TestPriority(Priority.P1)
    @TestLabel(name = "feature", value = {"web", "regression"})
    public void testBlogPresentOnPage() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened!");
        BlogPageBase blog = homePage.clickCBlogButton();
        String text = "QA";
        blog.enterSearchField(text);
        boolean result = blog.isFieldPresent(text);
        Assert.assertTrue(result,"Text not found on the page!");
    }
}
