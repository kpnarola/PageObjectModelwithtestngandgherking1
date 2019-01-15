package com.nopcommerce.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.NoSuchElementException;

public class Utils extends BasePage {

    //Reusable method for click
    public static void clickOnElement(By by) {
        driver.findElement(by).click();
    }

    //Reusable method for Enter text with SendKey
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
        return;
    }
    //Reusable Method For assert
    public static void assertByGetText(String expectedResult,By by, String errorMessage) {

        Assert.assertEquals(expectedResult, driver.findElement(by).getText(), errorMessage);
    }

    //send/type any data after clearing field/box
    public static void typeTextWithClearing(By by,String text){
        driver.findElement(by).clear();
        driver.findElement(by).sendKeys(text);
    }
    //send/type any data without clearing field/box
    public static void typeTextWithoutClearing(By by,String text){
        driver.findElement(by).sendKeys();
    }

    // drop down selection  by visible text
    public static void selectText(By by,String text){

        new Select(driver.findElement(by)).selectByVisibleText(text);
    }

    // Drop down selection by value
    public static void selectValue(By by,String value){

        Select select = new Select(driver.findElement(by));
        select.selectByValue(value);
    }

    // Drop down selection by index number
    public static void selectIndex(By by,int indexNumber){
        new Select(driver.findElement(by)).selectByIndex(indexNumber);

    }

    //get text by attribute
    public static String getTextByAttribute(By by,String attributeName){
        String text = driver.findElement(by).getAttribute(attributeName);
        return text;
    }

    //Checking WebElement present in DOM
    public  static boolean isElenetPresent (By by){
        try {
            driver.findElement(by);
            return true;

        }catch(NoSuchElementException e){
            return false;
        }
    }

    //Checking WebElement displayed or not
    public static boolean isElementPresent(By by)
    {
        try {
            return driver.findElement(by).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
//Wait for fixed time given in seconds
    public static void sleep(int second) {
        try {
            Thread.sleep(second, 1000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
        //Try to click element three times if not available in first go

    public static boolean retrayingfindclick(By by){
        boolean result = false;
        int attemps = 0;
        while (attemps<3){
            try {
                Thread.sleep(1000);
                driver.findElement(by).click();
                result = true;
                break;
            }catch (Exception e){}attemps ++;
        }return  result;
    }

    
    }













