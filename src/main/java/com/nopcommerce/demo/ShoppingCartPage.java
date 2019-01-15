package com.nopcommerce.demo;

import org.openqa.selenium.By;

public class ShoppingCartPage extends Utils {

//Add
    public void clickCheckOutButton()

    {
        clickOnElement(By.id("checkout"));
    }

    public void clickOnTermsOfService(){clickOnElement(By.id("termsofservice"));}
}

