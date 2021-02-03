package com.nextBaseCRM.Tests;

import com.nextBaseCRM.Pages.MainPage;
import com.nextBaseCRM.Utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

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


        /*
        Another approach

        Driver.getDriver().findElement(By.xpath(MainPage.sendMessageBoxXpath)).click();
        WebElement frame = Driver.getDriver().findElement(By.xpath("//iframe[@class='bx-editor-iframe']"));
        Driver.getDriver().switchTo().frame(frame);
       Driver.getDriver().findElement(By.xpath("//body[@contenteditable='true']")).sendKeys("Hello8");
        Driver.getDriver().switchTo().defaultContent();
        Driver.getDriver().findElement(By.xpath(MainPage.sendButton)).click();
        // verify

        List<WebElement> list = Driver.getDriver().findElements(By.xpath("//div[@class='feed-post-text-block-inner-inner']"));
        boolean testFlag = true;
        for (WebElement webElement : list) {
            if (webElement.getText().equals("Hello8")) {
                System.out.println("Text displayed, PASS");
                testFlag = false;
                //break;
            }
        }

        if (testFlag) {
            System.out.println("Test Failed!");
        }
         */
    }

    @Test
    public void US2_TC2_userCancelMessage() {

    }
}
