package com.nextBaseCRM.Tests;

import com.nextBaseCRM.Pages.LoginPage;
import com.nextBaseCRM.Utils.BrowserUtils;
import com.nextBaseCRM.Utils.ConfigurationReader;
import com.nextBaseCRM.Utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US1_TC1_TC2_Omer {

    @Test
    public void US1_TC1_userCanLogin() {

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        WebElement remember= Driver.getDriver().findElement(By.xpath(LoginPage.rememberMeCheckBoxXpath));
        BrowserUtils.sleep(1);
        remember.click();
        BrowserUtils.sleep(1);
        Assert.assertTrue(remember.isSelected());


        LoginPage.login();
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "(51) Portal";

        Assert.assertEquals(actualTitle,expectedTitle);
    }

/*
    @Test
    public void US1_TC2_userCanCheckRememberMe() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
       WebElement remember= Driver.getDriver().findElement(By.xpath(LoginPage.rememberMeCheckBoxXpath));
        remember.click();
       Assert.assertTrue(remember.isSelected());

    }

 */

}
