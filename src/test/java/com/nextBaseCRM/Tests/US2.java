package com.nextBaseCRM.Tests;

import com.nextBaseCRM.Pages.MainPage;
import com.nextBaseCRM.Utils.Driver;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US2 extends TestBase {

    @Test
    public void US2_TC1_sendMessage() throws InterruptedException {


        Driver.getDriver().findElement(By.xpath(MainPage.sendMessageBoxXpath)).click();
        // locate the iframe first and save a webElement
        // place the webElement inside the switch() expression
        Thread.sleep(3000);
        Driver.getDriver().switchTo().frame(MainPage.messageFrameWebElement);
        // write the message
        String message = "KAAABBCC";
        Driver.getDriver().findElement(By.xpath(MainPage.messageBodyXpath)).sendKeys(message);

        String actualMessage = Driver.getDriver().findElement(By.xpath(MainPage.writtenMessageLocation)).getText();

        Driver.getDriver().switchTo().parentFrame();// getting out iframe
        Driver.getDriver().findElement(By.xpath(MainPage.sendButton)).click();

        Assert.assertEquals(actualMessage, message);
        Driver.getDriver().switchTo().parentFrame();// getting out iframe
    }
}
