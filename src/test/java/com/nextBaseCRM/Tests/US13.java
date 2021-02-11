package com.nextBaseCRM.Tests;

import com.nextBaseCRM.Pages.LoginPage;

import com.nextBaseCRM.Pages.MainPage;
import com.nextBaseCRM.Utils.BrowserUtils;
import com.nextBaseCRM.Utils.ConfigurationReader;

import com.nextBaseCRM.Utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US13 { // this class does not extend the TestBase!

    @Test
    public void login_with_credentials_test() {
        String[] userNameArray = {"userHr", "userMarketing", "userHelpDesk"}; // userName array.
        for (String each : userNameArray) {
            LoginPage.loginWithCredentials(each, "password");// different userNames, but the same Passwords
            Driver.getDriver().findElement(By.xpath(MainPage.timeAndReportsTabXpath)).click();
            Assert.assertTrue(Driver.getDriver().getTitle().contains("Absence Chart"));
            // go to the username and click to see the option logout
            WebElement userName = Driver.getDriver().findElement(By.xpath(MainPage.usernameXPath));
            BrowserUtils.sleep(1);
            userName.click();
            WebElement logoutLink = Driver.getDriver().findElement(By.xpath(LoginPage.logoutXPath));
            BrowserUtils.sleep(1);
            logoutLink.click();
            Driver.closeDriver(); // Driver.getDriver().close() does not work.
        }
    }
}

/*
    US#13. As a user, I should be able to access to main modules of the app.
        1. Verify only authorized users can access to main modules. (authorized = hr & marketing)

     Group 4	Login names: helpdesk8@cybertekschool.com, hr8@cybertekschool.com,  marketing8@cybertekschool.com"
     password: UserUser	site: login2.nextbasecrm.com

    Only, HR and Marketing should be able to see "Absence Chart" under "Time and Report", but not helpDesk.
    However all three have the same access. So this is a bug!
*/
