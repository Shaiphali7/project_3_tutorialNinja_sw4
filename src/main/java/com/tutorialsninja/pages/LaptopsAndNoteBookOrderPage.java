package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class LaptopsAndNoteBookOrderPage extends Utility {
    By poundCurrency = By.xpath("//span[contains(text(),'Currency')]");

    public void clickOnCurrencyOption() {
        clickOnElement(poundCurrency);
    }
    By dropDown=By.xpath("//ul[@class = 'dropdown-menu']/li");
    public void selectFromDropDown(String option)
    {
        selectByContainsTextFromDropDown(dropDown,option);
    }

    By macBook = By.linkText("MacBook");

    public void clickOnMackbook() {
        clickOnElement(macBook);
    }

    By clickOnAddButton = By.xpath("//button[@id='button-cart']");

    public void ClickOnAddButton() {
        clickOnElement(clickOnAddButton);
    }

    By successMessage = By.cssSelector("body:nth-child(2) div.container:nth-child(4) > div.alert.alert-success.alert-dismissible");

    public String getSuccessMessage() {
        return gettextFromElement(successMessage);
    }

    By shoppingCart = By.xpath("//a[contains(text(),'shopping cart')]");

    public void ClickOnShoppingCart() {
        clickOnElement(shoppingCart);
    }

    By shoppingCartText = By.xpath("//div[@id='content']//h1");

    public String getShoppingCartText() {
        return gettextFromElement(shoppingCartText);
    }

    By productName = By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[2]/a");

    public String productName() {
        return gettextFromElement(productName);
    }

    By changeQuantity = By.xpath("//input[contains(@name, 'quantity')]");

    public void changeQuantity() {
        sendTextToElement(changeQuantity, "2");
    }

    By clickOnUpdate = By.xpath("//button[contains(@data-original-title, 'Update')]");

    public void setClickOnUpdate() {
    clickOnElement(clickOnUpdate);
    }
By successMessage2=By.xpath("//div[@id='checkout-cart']/div[1]");
    public String getSuccessMessage2()
    {
        return gettextFromElement(successMessage2);

    }
    By productPrice=By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[6]");

    public String getProductPrice()
    {
        return gettextFromElement(productPrice);

    }
}
