package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.MyAccountPage;
import com.tutorialsninja.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckMyAccountOptions extends BaseTest {
    MyAccountPage myAccount=new MyAccountPage();
    @Test
    public void verifyUserShouldNavigateToRegisterPageSuccessfully()throws InterruptedException {
        //1.1 Click on My Account Link.
        myAccount.clickOnMyAccountLink();
        //1.2 Call the method “selectMyAccountOptions” method and pass the parameter "Register”
        myAccount.selectMyAccountOptions("Register");
        Thread.sleep(1000);
        //1.3 Verify the text “Register Account”.
        String expectedMessage = "Register Account";
        String actualMessage = myAccount.getTextFromRegisterPage();
        Assert.assertEquals(expectedMessage, actualMessage,"Register page not displayed");
    }
    @Test
    public void verifyUserShouldNavigateToLoginPageSuccessfully() throws InterruptedException {
        //2.1 Click on My Account Link.
        myAccount.clickOnMyAccountLink();
        //2.2 Call the method “selectMyAccountOptions” method and pass the parameter “Login”
        myAccount.selectMyAccountOptions("Login");
        Thread.sleep(1000);
        //2.3 Verify the text “Returning Customer”.
        String expectedMessage = "Returning Customer";
        String actualMessage = myAccount.getTextFromLoginPage();
        Assert.assertEquals( expectedMessage, actualMessage,"Login page not displayed");
    }

}
