package com.nopcommerce.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ClothinPage extends Utils {

    public void sortBYPriceHighToLOw() {

        //Selecting Product
        Select sortByHighToLow = new Select(driver.findElement(By.id("products-orderby")));

        //Sort by Product price High to Low
        sortByHighToLow.selectByVisibleText("Price: High to Low");

    }

    public Float firstProductPrice;
    public Float lastProductPrice;

    //Method for result comparision
    public boolean assertForSortByPriceHighToLow() {
        //Taking all Product Price for List by using Xpath
        List<WebElement> price = driver.findElements(By.xpath("//div/div[2]/div[3]/div[1]/span"));
        System.out.println();
        //Converting Xpath List in ArrayList for getting price
        List<String> prices = new ArrayList<>();

        //adding prices in array list from webElement
        for (WebElement e : price) {
            prices.add(e.getText());
        }
        //Getting String Price for First Product
        String firstIndexPrice = prices.get(0);

        //Removing Character and Special Character from String for converting in Float & Result Comparision
        String firstIndexDigitsOnly = firstIndexPrice.replaceAll("[^0-9.]|$|Ђ +", "");

        //Converting String in Float For Comparing Assert
        firstProductPrice = Float.parseFloat(firstIndexDigitsOnly);

        //Getting String Price for last product
        String lastIndexPrice = prices.get(prices.size() - 1);

        //Removing Character and Special Character from String for converting in Float & Result Comparision
        String lastIndexDigitOnly = lastIndexPrice.replaceAll("[^0-9.]| $ | Ђ +", "");

        //Converting String in Float For Comparing Assert
        lastProductPrice = Float.parseFloat(lastIndexDigitOnly);


        //Verifying user should able to sort price high to low
        Assert.assertTrue(firstProductPrice > lastProductPrice, "Sorting high to low prices is not working ");

        //return the boolean result for to assert the result in test suit
        return firstProductPrice>lastProductPrice;
    }


    public void sortByProductLowToHIgh() {
        //Selecting Product From Index and filtering the price High to Low
        Select sortByHighToLow = new Select(driver.findElement(By.id("products-orderby")));
        sortByHighToLow.selectByVisibleText("Price: Low to High");
    }

    public void assertForSortByPriceLowToHigh() {
        //Getting Prices for List by using X path
        List<WebElement> price = driver.findElements(By.xpath("//div/div[2]/div[3]/div[1]/span"));

        //Converting List Price in Array
        List<String> prices = new ArrayList<String>();

        //adding prices in array list from webElement
        for (WebElement e : price) {
            prices.add(e.getText());
        }

        //Making List for Sorted price
        List<String> sortedPrices = new ArrayList<>(prices);

        //Reversing Price for result Comparision
        // Collections.reverse(price);
        Collections.sort(prices);

        //comparing both Prices
        System.out.println(sortedPrices.equals(prices));


        //verifying the prices are sort high to low
        Assert.assertEquals(prices, sortedPrices, "Sorting Prices - low to high is not working");


    }
}
