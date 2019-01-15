package com.nopcommerce.demo;

import org.openqa.selenium.By;

public class HomePage extends Utils {
    public void openHomePage() {

        //Open website homepage
        driver.get("https://demo.nopcommerce.com/");
    }

    public void clickOnRegistrationButton() {
        //Click on Register Button
        clickOnElement(By.linkText("Register"));
        assertByGetText("Your Personal Details", By.xpath("//strong[contains(text(),'Your Personal Details')]"), "You are not on Registration Page");
    }

    public void clickOnBuildYourOwnComputer() {
        //Select Product
        clickOnElement(By.linkText("Build your own computer"));
    }

    public void clickOnHTCOneM8AndroidL50Lollipop() {
        //Select Product
        clickOnElement(By.linkText("HTC One M8 Android L 5.0 Lollipop"));
    }

    public void clickOnAppareal() {
        clickOnElement(By.linkText("Apparel"));
        //Clicking on Clothing
        clickOnElement(By.xpath("//img[@alt='Picture for category Clothing']"));
    }

    public void clickOnAppleMacBookPro13_Inch() {
        //Selecting Product Apple MavBook Pro 13-inch
        clickOnElement(By.linkText("Apple MacBook Pro 13-inch"));
    }

    public void clickOnCurrencyEuroAndJewelry() {
        //Click on currency box and select euro
        driver.findElement(By.id("customerCurrency")).findElement(By.xpath("//option[contains(text(),'Euro')]")).click();
        //Click on Jewelry category
        clickOnElement(By.linkText("Jewelry"));
    }

    public void clickOnCurrencyUSDollarAndJewelry() {
        //Select currency USDollar
        clickOnElement(By.id("customerCurrency"));
        //Click on Jewelry from category
        clickOnElement(By.linkText("Jewelry"));
    }
}
