package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class DesktopAddToCart extends Utility {

    By addToCart = By.xpath("//button[@id='button-cart']");
    By successMessage = By.cssSelector("body:nth-child(2) div.container:nth-child(4) > div.alert.alert-success.alert-dismissible");
    By clickOnShoppingCart = By.xpath("//a[contains(text(),'shopping cart')]");
    By verifyShoppingCartText = By.xpath("//div[@id='content']//h1");
    By verifyProductName = By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[2]/a");
    By verifyDate = By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[2]/small[1]");
    By verifyModel = By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[3]");
    By verifyTotal = By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[6]");

    public void clickOnAddToCart() {
        clickOnElement(addToCart);
    }
    public String getSuccessMessage()
    {
        return gettextFromElement(successMessage);
    }
    public void clickOnShoppingCart()
    {
        clickOnElement(clickOnShoppingCart);
    }
    public String getShoppingCartText()
    {
        return gettextFromElement(verifyShoppingCartText);
    }
    public String getHpProductName()
    {
        return gettextFromElement(verifyProductName);
    }
    public String getDate()
    {
        return gettextFromElement(verifyDate);
    }
    public String getModel()
    {
        return gettextFromElement(verifyModel);
    }
    public String getTotal()
    {
        return gettextFromElement(verifyTotal);
    }



}
