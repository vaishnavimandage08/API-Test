package com.solvd.APITest.carina.web.pages.desktop;

import com.solvd.APITest.carina.web.pages.common.BlogPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = BlogPageBase.class)
public class BlogPage extends BlogPageBase{
    public BlogPage(WebDriver driver) {
        super(driver);
    }
}
