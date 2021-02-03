package com.nextBaseCRM.Pages;

import com.nextBaseCRM.Utils.ConfigurationReader;
import com.nextBaseCRM.Utils.Driver;
import org.openqa.selenium.By;

public class LoginPage {
    public static final String loginBoxXpath = "//input[@placeholder='Login']";
    public static  final String passwordBoxXpath = "//input[@placeholder='Password']";
    public static final String rememberMeCheckBoxXpath = "//input[@id='USER_REMEMBER']";
    public static final String loginButtonXpath = "//input[@value='Log In']";
    public static final String forgotPasswordLink="//a[.='Forgot your password?']";

    public static void login(){

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        Driver.getDriver().findElement(By.xpath(loginBoxXpath)).sendKeys(ConfigurationReader.getProperty("userMarketing"));
        Driver.getDriver().findElement(By.xpath(passwordBoxXpath)).sendKeys(ConfigurationReader.getProperty("password"));
        Driver.getDriver().findElement(By.xpath(loginButtonXpath)).click();
    }
}
