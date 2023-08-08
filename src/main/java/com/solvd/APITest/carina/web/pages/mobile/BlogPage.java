package com.solvd.APITest.carina.web.pages.mobile;

import com.solvd.APITest.carina.web.pages.common.BlogPageBase;
import com.solvd.APITest.carina.web.pages.common.HomePageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = BlogPageBase.class)

public class BlogPage extends BlogPageBase {
    public BlogPage(WebDriver driver) {
        super(driver);
    }
}
