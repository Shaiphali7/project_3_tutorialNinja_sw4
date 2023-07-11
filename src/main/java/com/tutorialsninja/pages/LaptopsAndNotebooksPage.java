package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class LaptopsAndNotebooksPage extends Utility {
    By clickOnLaptopAndNotebook=By.linkText("Show AllLaptops & Notebooks");
    By productPrice=By.xpath("//p[@class ='price']");
    By selectdropDown=By.id("input-sort");
    public void clickOnLaptopAndNoteBook()
    {
        clickOnElement(clickOnLaptopAndNotebook);
    }


public List<Double> getPriceOfAllProduct()
{
    List<WebElement> products = driver.findElements(productPrice);
    List<Double> originalProductsPrice = new ArrayList<>();
    for (WebElement e : products) {
        System.out.println(e.getText());
        String[] arr = e.getText().split("Ex Tax:");
        originalProductsPrice.add(Double.valueOf(arr[0].substring(1).replaceAll(",","")));
    }
    return originalProductsPrice;
}
public void selectFromDropDown(String option)
{
    selectByVisibleTextFromDropDown(selectdropDown, option);
}

}
