package com.nopcommerce.demo;

import org.openqa.selenium.By;

public class RegisterResultContinuePage extends Utils {

    public void clickOnRegisterContinueButton()
    {
        clickOnElement(By.name("register-continue"));
    }
}
