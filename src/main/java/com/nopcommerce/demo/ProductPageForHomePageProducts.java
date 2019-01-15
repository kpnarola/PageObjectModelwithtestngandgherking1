package com.nopcommerce.demo;

import org.openqa.selenium.By;

public class ProductPageForHomePageProducts extends Utils {

    public void buildYourOwnComputer() {
        //Selecting Hdd button in product Description
        clickOnElement(By.id("product_attribute_3_6"));

        //Clicking on add to cart button
        clickOnElement(By.id("add-to-cart-button-1"));

        //Clicking on shopping cart button
        clickOnElement(By.xpath("//span[@class='cart-label']"));

    }
    public void HTCOneM8AndroidL5_0Lollipop() {
        //Clicking on add to cart button
        clickOnElement(By.id("add-to-cart-button-18"));

        explicitWait(By.xpath("//a[contains(text(),'shopping cart')]"),30);
        //Clicking on shopping cart button
        clickOnElement(By.xpath("//a[contains(text(),'shopping cart')]"));
    }

    public void AppleMacBookPro13_Inch(){
        //Clicking on Email a Friend button to send Product detail with Email
        clickOnElement(By.xpath("//input[@value='Email a friend']"));
    }
}
