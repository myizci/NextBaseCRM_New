package com.nextBaseCRM.Tests;

import com.nextBaseCRM.Pages.LoginPage;
import com.nextBaseCRM.Utils.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US1 {

    @Test
    public void US1_userCanLogin() {

        LoginPage.login();
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "(51) Portal";

        Assert.assertEquals(actualTitle,expectedTitle);
    }
}
