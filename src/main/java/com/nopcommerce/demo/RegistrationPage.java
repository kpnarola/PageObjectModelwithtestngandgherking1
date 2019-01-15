package com.nopcommerce.demo;

import org.openqa.selenium.By;

public class RegistrationPage extends Utils {
    LoadProperty loadProperty = new LoadProperty();
    RegisterResultContinuePage registerResultContinuePage = new RegisterResultContinuePage();
    By genderMale = By.id("gender-male");
    By firstNameField = By.id("FirstName");
    By lastNameField = By.id("LastName");
    By dateOfBirthDayField = By.name("DateOfBirthDay");

    public void registration() {

        //Click on gender
        clickOnElement(genderMale);

        //Click on First Name
        enterText(firstNameField,loadProperty.getProperty("firstName"));

        //Click on Last Name
        enterText(lastNameField,loadProperty.getProperty("lastName"));

        //Date of Birth Field

        //Input Date of Birth Day by using Text
//
        selectText(dateOfBirthDayField,loadProperty.getProperty("dateOfBirthDay"));

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

