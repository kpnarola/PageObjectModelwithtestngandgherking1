package com.nopcommerce.demo;

import org.openqa.selenium.By;

public class RegistrationPage extends Utils {

     RegisterResultContinuePage registerResultContinuePage = new RegisterResultContinuePage();
    public void registration() {

        //Click on gender
        clickOnElement(By.id("gender-male"));

        //Click on First Name
        enterText(By.id("FirstName"), "Kp");

        //Click on Last Name
        enterText(By.id("LastName"), "patel");

        //Date of Birth Field

        //Input Date of Birth Day by using Text
//
        selectText(By.name("DateOfBirthDay"),"1");

        //Input Date of Birth Month by using Index
        selectIndex(By.name("DateOfBirthMonth"),4);

        //Input Date of Birth Year
        selectValue(By.name("DateOfBirthYear"),"1979");

        //For Enter email Id

        //Enter email Address with Date Format

        //Variable Declaration for email Id
        String emailAddress = "kppatel+" + dateStamp() + "@yahoo.com";

        //Entering email id in the email field
        driver.findElement(By.id("Email")).sendKeys(emailAddress);

        //For Company Detail
        //Enter Company name
        enterText(By.id("Company"), "Yogiraj");

        //For Options - Click on Newsletters box
        clickOnElement(By.id("Newsletter"));

        //For Your Password Field - password for registration

        //Declaring variable for password
        String password = "test123";

        //Entering Password in Password field
        enterText(By.id("Password"), password);

        //Confirming Password
        enterText(By.id("ConfirmPassword"), password);

        //Click on Registration Button
        clickOnElement(By.id("register-button"));

    }

}

