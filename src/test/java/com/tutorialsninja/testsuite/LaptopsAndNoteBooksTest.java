package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.LaptopsAndNotebooksPage;
import com.tutorialsninja.pages.TopMenuPage;
import com.tutorialsninja.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Collections;
import java.util.List;

public class LaptopsAndNoteBooksTest extends BaseTest {
    LaptopsAndNotebooksPage laptopAndNote=new LaptopsAndNotebooksPage();
    TopMenuPage menu=new TopMenuPage();
    @Test
    public void verifyProductsPriceDisplayHighToLowSuccessfully() {
        //1.1 Mouse hover on Laptops & Notebooks Tab.and click
        menu.mouseHoverMenuOnLaptopAndNotebook();
        //1.2 Click on “Show AllLaptops & Notebooks”
        laptopAndNote.clickOnLaptopAndNoteBook();
        // Get all the products price and stored into array list

        List<Double> originalProductsPrice = laptopAndNote.getPriceOfAllProduct();
        System.out.println(originalProductsPrice);
        // Sort By Reverse order
        Collections.sort(originalProductsPrice, Collections.reverseOrder());
        System.out.println(originalProductsPrice);
        //1.3 Select Sort By "Price (High > Low)"
        laptopAndNote.selectFromDropDown("Price (High > Low)");

        // After filter Price (High > Low) Get all the products price and stored into array list

        List<Double> afterSortByPrice = laptopAndNote.getPriceOfAllProduct();

        System.out.println(afterSortByPrice);
        //1.4 Verify the Product price will arrange in High to Low order.
        Assert.assertEquals(originalProductsPrice, afterSortByPrice,"Product not sorted by price High to Low");

    }


}
