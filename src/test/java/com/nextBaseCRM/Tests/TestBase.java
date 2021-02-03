package com.nextBaseCRM.Tests;

import com.nextBaseCRM.Pages.LoginPage;
import com.nextBaseCRM.Utils.BrowserUtils;
import com.nextBaseCRM.Utils.Driver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class TestBase {

    @BeforeMethod
    public void setUp() {
        LoginPage.login();
    }


    @AfterMethod
    public void tearDown() {
        BrowserUtils.sleep(5);
        Driver.closeDriver();
    }
}
