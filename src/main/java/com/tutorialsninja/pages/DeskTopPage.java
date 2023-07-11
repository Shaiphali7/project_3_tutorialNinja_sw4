package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class DeskTopPage extends Utility {
    By showAlldesktop = By.linkText("Show AllDesktops");
    By allProducts = By.xpath("//h4/a");
    By dropDown = By.id("input-sort");
    By poundCurrency = By.xpath("//span[contains(text(),'Currency')]");

    By productHp = By.xpath("//a[contains(text(),'HP LP3065')]");
    By verifyTextHp = By.xpath("//h1[contains(text(),'HP LP3065')]");
    By clickOnElementforDate = By.xpath("//div[@class = 'input-group date']//button");
    By getStringForDate = By.xpath("//div[@class = 'datepicker']/div[1]//th[@class='picker-switch']");
    By clickOnNextDate = By.xpath("//div[@class = 'datepicker']/div[1]//th[@class='next']");
    By lastDateElement = By.xpath("//div[@class = 'datepicker']/div[1]//tbody/tr/td[@class = 'day']");

    public void clickOnShowAllDesktop() {
        clickOnElement(showAlldesktop);
    }

    public ArrayList<String> getDesktopProduct() {
        List<WebElement> products = driver.findElements(allProducts);
        ArrayList<String> originalProductsName = new ArrayList<>();
        for (WebElement e : products) {
            originalProductsName.add(e.getText());
        }
        return originalProductsName;
    }

    public void selectFromDropDown() {
        selectByVisibleTextFromDropDown(dropDown, "Name (Z - A)");
    }

    public void clickOnCurrency() {
        clickOnElement(poundCurrency);
    }

    public void selectByA_ZDropDown() {
        selectByVisibleTextFromDropDown(dropDown, "Name (A - Z)");
    }

    public void selectHpProduct() {
        clickOnElement(productHp);
    }

    public String getTextForHpProduct() {
        return gettextFromElement(verifyTextHp);
    }

    public void clickOnDateElement() {
        clickOnElement(clickOnElementforDate);
    }

    public String getDate() {
        return gettextFromElement(getStringForDate);

    }

    public void clickOnNextDateElement() {
        clickOnElement(clickOnNextDate);
    }
    public List<WebElement> getDateElements()
    {
        return driver.findElements(lastDateElement);
    }
}
