package com.nopcommerce.demo;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSuit extends BaseTest {

    RegistrationPage register = new RegistrationPage();
    RegisterResultContinuePage registerResultContinuePage = new RegisterResultContinuePage();
    HomePage homePage = new HomePage();
    EmailAFriendPage emailAFriend = new EmailAFriendPage();
    CheckOutPage checkOutPage = new CheckOutPage();
    ClothinPage productPage = new ClothinPage();
    AddToCartPage addToCartPage = new AddToCartPage();
    JewelryPage jewelryPage = new JewelryPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    ClothinPage clothinPage = new ClothinPage();
    ProductPageForHomePageProducts productPageForHomePageProducts = new ProductPageForHomePageProducts();

    @Test(priority = 0)
    public void toVerifyUserShouldBeAbleToRegisterSuccessfully() {
        //click on registration button in home page
        homePage.clickOnRegistrationButton();

        //register an account
        register.registration();

        //Verifying the registration successful message
        Utils.assertByGetText("Your registration completed", By.xpath("//div[contains(text(),'Your registration completed')]"), "Sorry your registration is not successful");

    }

    @Test(priority = 1)

    public void toVerifyRegisteredUserShouldBeAbleToSendEmailWithProductSuccessfully() {
         /* /*https://demo.nopcommerce.com/
      click on Apple MacBook Pro 13-inch - email a friend -fill up required details and click on Send Email button
      Registered user should be able to send Email with product Successfully*/
        homePage.clickOnRegistrationButton();
        register.registration();
        registerResultContinuePage.clickOnRegisterContinueButton();
        homePage.clickOnAppleMacBookPro13_Inch();
        productPageForHomePageProducts.AppleMacBookPro13_Inch();
        emailAFriend.emailAFriendForRegisterUser();
        Utils.assertByGetText("Your message has been sent.", By.xpath("//div[@class= 'result']"), "Sorry You are not able to send email successfully");
    }

    @Test(priority = 5)

    public void toVerifyUnregisteredUserShouldNotBeAbleToSendEmail() {
        homePage.clickOnAppleMacBookPro13_Inch();
        emailAFriend.emailAFriendForUnRegisterUser();
        Utils.assertByGetText("Only registered customers can use email a friend feature", By.xpath("//li[contains(text(),'Only registered customers can use email a friend feature')]"), "Display Message is not as per expected, test is failed");
    }

    @Test(priority = 3)
    public void toVerifyUserMustHaveToAcceptTermsAndConditionForCheckOut() {
        homePage.clickOnRegistrationButton();
        register.registration();
        registerResultContinuePage.clickOnRegisterContinueButton();
        homePage.clickOnBuildYourOwnComputer();
        productPageForHomePageProducts.buildYourOwnComputer();
        shoppingCartPage.clickCheckOutButton();
        Utils.assertByGetText("Please accept the terms of service before the next step.", By.xpath("//p[contains(text(),'Please accept the terms of service before the next step.')]"), "Display message is not as per expected, Test failed"
        );
    }

    @Test(priority = 2)
    public void toVerifyRegisteredUserShouldBeAbleToBuyAnySingleProductSuccessfully() {
        homePage.clickOnRegistrationButton();
        register.registration();
        registerResultContinuePage.clickOnRegisterContinueButton();
        homePage.clickOnHTCOneM8AndroidL50Lollipop();
        productPageForHomePageProducts.HTCOneM8AndroidL5_0Lollipop();
        shoppingCartPage.clickOnTermsOfService();
        shoppingCartPage.clickCheckOutButton();
        checkOutPage.userIsAbleToBuyProductSuccessfully();
        Utils.assertByGetText("Your order has been successfully processed!", By.xpath("//strong[contains(text(),'Your order has been successfully processed!')]"), "You are not able to buy product successfully, test failed");
    }

    @Test(priority = 4)
    public void toVerifyUserShouldBeAbleToSortByPriceHighToLow() {
        homePage.clickOnAppareal();
        clothinPage.sortBYPriceHighToLOw();
        //verifying that clothing price sorting high to low
        System.out.println(clothinPage.assertForSortByPriceHighToLow());

        Assert.assertTrue(clothinPage.assertForSortByPriceHighToLow(),"Price is not sorted high to low");

    }

    @Test(priority = 5)
    public void toVerifyUserShouldBePricesSortingLowToHigh() {
        homePage.clickOnAppareal();
        clothinPage.sortByProductLowToHIgh();
        clothinPage.assertForSortByPriceLowToHigh();

    }

    @Test
    public void toVerifyAddToCartButtonIsPresentInAllProductOnHomePage() {
        homePage.openHomePage();
        addToCartPage.setAddToCartLIst();

    }

    @Test
    public void toVerifyCustomerCurrencyIsEuro() {
        homePage.clickOnCurrencyEuroAndJewelry();
        jewelryPage.assertForCurrencyIsEuro();
    }

    @Test
    public void toVerifyCustomerCurrencyIsDollar() {
        homePage.clickOnCurrencyUSDollarAndJewelry();
        jewelryPage.assertForCurrencyUSDollar();
    }
}