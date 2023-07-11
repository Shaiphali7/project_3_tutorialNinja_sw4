package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.MyAccountPage;
import com.tutorialsninja.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccountTest extends BaseTest {
    @Test
    public void verifyThatUserShouldLoginAndLogoutSuccessfully() {
        MyAccountPage accountPage=new MyAccountPage();
        //4.1 Click on My Account Link.
        accountPage.clickOnMyAccountLink();
        //4.2 Call the method “selectMyAccountOptions” method and pass the parameter "Login”
        accountPage.selectMyAccountOptions("Login");
        //4.3 Enter Email address
        accountPage.enterEmail("prime1233@gmail.com");
        //4.4 Enter Password
        accountPage.sendTextToPassword("test1234");
        //4.5 Click on Login button
        accountPage.clickOnSubmitButton();
        //4.8 Click on My Account Link.
        accountPage.clickOnMyAccountLink();
        //4.9 Call the method “selectMyAccountOptions” method and pass the parameter “Logout”
        accountPage.selectMyAccountOptions("Logout");
        //4.10 Verify the text “Account Logout”
        String expectedMessage = "Account Logout";
        String actualMessage = accountPage.accountLogOutMessage();
        Assert.assertEquals(expectedMessage, actualMessage,"Not logged out");
        //4.11 Click on Continue button
        accountPage.clickOnContinue2();
    }


}
