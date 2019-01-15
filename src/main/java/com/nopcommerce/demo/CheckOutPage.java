package com.nopcommerce.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class CheckOutPage extends Utils {


    public void userIsAbleToBuyProductSuccessfully() {

        //Selecting country for billing adress
        Select country = new Select(driver.findElement(By.id("BillingNewAddress_CountryId")));
        country.selectByVisibleText("United Kingdom");

        //Entering city name
        enterText(By.id("BillingNewAddress_City"), "London");

        //Entering first line of message
        enterText(By.id("BillingNewAddress_Address1"), "15,Talbet Road");

        //Entering Second line of message
        enterText(By.id("BillingNewAddress_Address2"), "Wembley");

        //Entering postal code
        enterText(By.id("BillingNewAddress_ZipPostalCode"), "HA04UA");

        //Entering phone number
        enterText(By.id("BillingNewAddress_PhoneNumber"), "07894234443");

        //Entering Fax number
        enterText(By.id("BillingNewAddress_FaxNumber"), "02073638352");

        //Clicking on continue button for shipping method
        clickOnElement(By.xpath("//input[@onclick='Billing.save()']"));

        //Step - 3 Shipping Method

        //Clicking on first option Ground from Shipping method
        clickOnElement(By.id("shippingoption_0"));

        //Clicking on continue button for Payment Method
        clickOnElement(By.xpath("//input[@onclick='ShippingMethod.save()']"));

        //Step-4 Payment method

        //Click on Credit Card option
        clickOnElement(By.id("paymentmethod_1"));

        //Click on continue button for payment information
        clickOnElement(By.xpath("//input[@onclick='PaymentMethod.save()']"));

        //Step 5- Payment Information

        //Entering card holder name
        enterText(By.id("CardholderName"), "Shital");

        //Entering Card number
        enterText(By.id("CardNumber"), "4111 1111 1111 1111");

        //Entering Expire month for Credit card
        Select expireDate = new Select(driver.findElement(By.id("ExpireMonth")));
        expireDate.selectByValue("2");

        //Entering Expire Year
        Select expireYear = new Select(driver.findElement(By.id("ExpireYear")));
        expireYear.selectByVisibleText("2020");

        //Entering short code
        enterText(By.id("CardCode"), "737");

        //Clicking on Continue button for order confirmation
        clickOnElement(By.xpath("//input[@onclick=\"PaymentInfo.save()\"]"));

        //Step 6-Confirm Order

        //Clicking on Confirm Order button
        clickOnElement(By.xpath("//input[@onclick=\"ConfirmOrder.save()\"]"));

           }

}

