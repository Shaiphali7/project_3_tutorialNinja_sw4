package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TopMenuPage extends Utility {
    By topMenuId = By.xpath("//nav[@id='menu']//ul/li[contains(@class, 'open')]/div/child::*");
    By desktop = (By.linkText("Desktops"));
    By desktopText = By.xpath("//h2[contains(text(),'Desktops')]");
    By laptopsAndNotebook = By.linkText("Laptops & Notebooks");
    By getLaptopsAndNotebookText = By.xpath("//h2[contains(text(),'Laptops & Notebooks')]");
    By components = By.linkText("Components");
    By componentText = By.xpath("//h2[contains(text(),'Components')]");

    public void selectMenu(String menu) {
        List<WebElement> topMenuList = getListOfElements(topMenuId);
        try {
            for (WebElement element : topMenuList) {
                if (element.getText().equalsIgnoreCase(menu)) {
                    element.click();
                }
            }
        } catch (StaleElementReferenceException e) {
            topMenuList = getListOfElements(topMenuId);
        }


    }
    public void mouseHoverMenuDesktop()
    {
        mouseHoverToElementAndClick(desktop);
    }
    public void mouseHoverMenuOnLaptopAndNotebook()
    {
        mouseHoverToElementAndClick(laptopsAndNotebook);
    }
    public void mouseHoverMenuComponent()
    {
        mouseHoverToElementAndClick(components);
    }

    public String getTextFromMenu(String text)
    {
        return  gettextFromElement(By.xpath("//h2[contains(text(),"+"'"+text+"'"+")]"));
    }
}


