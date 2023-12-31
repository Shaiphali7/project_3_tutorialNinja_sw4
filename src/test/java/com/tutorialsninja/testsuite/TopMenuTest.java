package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.TopMenuPage;
import com.tutorialsninja.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TopMenuTest extends BaseTest
{
    TopMenuPage menu=new TopMenuPage();
@Test
public void verifyUserShouldNavigateToDesktopsPageSuccessfully() {
    //1.1 Mouse hover on “Desktops” Tab and click
    menu.mouseHoverMenuDesktop();
    //1.2 call selectMenu method and pass the menu = “Show AllDesktops”
    menu.selectMenu("Show AllDesktops");
    //1.3 Verify the text ‘Desktops’
    String expectedText = "Desktops";
    String actualText=menu.getTextFromMenu("Desktops");
    Assert.assertEquals(actualText,expectedText,"Wrong menu");
}
    @Test
    public void verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully() {
        //2.1 Mouse hover on “Laptops & Notebooks” Tab and click
        menu.mouseHoverMenuOnLaptopAndNotebook();
        //2.2 call selectMenu method and pass the menu = “Show AllLaptops & Notebooks”
        menu.selectMenu("Show AllLaptops & Notebooks");
        //2.3 Verify the text ‘Laptops & Notebooks’
        String actualText=menu.getTextFromMenu("Laptops & Notebooks");
        Assert.assertEquals(actualText,"Laptops & Notebooks","Wrong text");
    }
    @Test
    public void verifyUserShouldNavigateToComponentsPageSuccessfully() {
        //3.1 Mouse hover on “Components” Tab and click
        menu.mouseHoverMenuComponent();
        //3.2 call selectMenu method and pass the menu = “Show AllComponents”
        menu.selectMenu("Show AllComponents");
        //3.3 Verify the text ‘Components’
        String actualText=menu.getTextFromMenu("Components");
       Assert.assertEquals(actualText,"Components","Wrong menu");
    }
}
