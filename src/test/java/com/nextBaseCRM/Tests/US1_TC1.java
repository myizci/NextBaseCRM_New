package com.nextBaseCRM.Tests;

import com.nextBaseCRM.Pages.LoginPage;
import com.nextBaseCRM.Utils.ConfigurationReader;
import com.nextBaseCRM.Utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US1_TC1 {

    @Test
    public void US1_TC1_userCanLogin() {

        LoginPage.login();
        String actualTitle = Driver.getDriver().getTitle();
        //String expectedTitle = "(61) Portal";
        Assert.assertTrue(actualTitle.contains("Portal"));
    }




}
