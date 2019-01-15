package com.nopcommerce.demo;

import org.openqa.selenium.By;

public class EmailAFriendPage extends Utils {

    public void emailAFriendForRegisterUser() {

        //Enter Friends Email Address
        enterText(By.id("FriendEmail"), "pkpatel@yahoo.com");

        //Enter Personal Message
        enterText(By.id("PersonalMessage"), "It is very nice product have a look");

        //Click on send email button
        clickOnElement(By.name("send-email"));

    }

    public void emailAFriendForUnRegisterUser() {
        //Click on email a friend button from the selected product
        clickOnElement(By.xpath("//input[@value='Email a friend']"));

        //Enter friend's email address
        enterText(By.id("FriendEmail"), "pnpatel@gmail.com");

        //Enter my email address
        enterText(By.id("YourEmailAddress"), "skpatel@hotmail.com");

        //Enter personal message
        enterText(By.id("PersonalMessage"), "I wanted to show you this nice product");

        //Click on send email button
        clickOnElement(By.name("send-email"));
    }
}
