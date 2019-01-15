package com.nopcommerce.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils extends BasePage {

    //Reusable method for click
    public static void clickOnElement(By by) {
        driver.findElement(by).click();
    }

    //Reusable method for SendKey
    public static void enterText(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }

    //Reusable method for time stamp

    public static String dateStamp() {

        DateFormat dateFormat = new SimpleDateFormat("DDMMYYYYSSmmHH");
        Date date = new Date();
        String date1 = dateFormat.format(date);
        return date1;

    }

    public static void selectBy(By by) {
        driver.findElement(by).isSelected();
    }

    public static void explicitWait(By by, int seconds) {

        WebDriverWait wait = new WebDriverWait(driver,seconds);

        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    public static void getText(By by) {
        driver.findElement(by).getText();
    }

    public static void assertByGetText(String expectedResult,By by, String errorMessage) {

        Assert.assertEquals(expectedResult, driver.findElement(by).getText(), errorMessage);
    }
    //send/type any data after clearing field/box
    public static void typeTextWithClearing(By by,String text){
        driver.findElement(by).clear();
        driver.findElement(by).sendKeys(text);
    }
    public static void typeTextWithoutClearing(By by,String text){
        driver.findElement(by).sendKeys();
    }
    // Re usable method for drop down selection
    public static void selectText(By by,String text){

        new Select(driver.findElement(by)).selectByVisibleText(text);
    }

    public static void selectValue(By by,String value){

        Select select = new Select(driver.findElement(by));
        select.selectByValue(value);
    }

    public static void selectIndex(By by,int indexNumber){
        new Select(driver.findElement(by)).selectByIndex(indexNumber);

    }

    //get text by attribute

    public static String getTextByAttribute(By by,String attributeName){
        String text = driver.findElement(by).getAttribute(attributeName);
        return text;
    }












}

