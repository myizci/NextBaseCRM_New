package com.nextBaseCRM.Pages;

import com.nextBaseCRM.Utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MainPage {

    public static final String sendMessageBoxXpath="//span[@id='feed-add-post-form-tab-message']";//outside the frame
    public static final String messageIframeXpath = "//*[@id='bx-html-editor-iframe-cnt-idPostFormLHE_blogPostForm']/iframe"; //located iframe as a web element
    public static final WebElement messageFrameWebElement = Driver.getDriver().findElement(By.xpath(messageIframeXpath));
    public static final String messageBodyXpath="//body[@contenteditable='true']"; // inside the frame, where we write actual message
    public static final String writtenMessageLocation ="/html/body";//needed for assertion, where written message is stored
    public static final String sendButton ="//*[@id='blog-submit-button-save']";//outside the frame

}
