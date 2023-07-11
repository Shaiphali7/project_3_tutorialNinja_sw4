package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MyAccountPage extends Utility {

    By myAccount = By.xpath("//div[@id='top-links']//li[contains(@class,'open')]/ul/li");

    public void selectMyAccountOptions(String option) {
        List<WebElement> myAccountList = getListOfElements(myAccount);
        try {
            for (WebElement options : myAccountList) {
                if (options.getText().equalsIgnoreCase(option)) {
                    options.click();
                }
            }
        } catch (StaleElementReferenceException e) {
            myAccountList = getListOfElements(myAccount);
        }
    }

    By myAccountLink = By.xpath("//span[contains(text(),'My Account')]");

    public void clickOnMyAccountLink() {
        clickOnElement(myAccountLink);
    }

    By verifyRegisterAcc = By.xpath("//h1[contains(text(),'Register Account')]");

    public String getTextFromRegisterPage() {
        return gettextFromElement(verifyRegisterAcc);
    }

    By verifyReturnCustomer = By.xpath("//h2[contains(text(),'Returning Customer')]");

    public String getTextFromLoginPage() {
        return gettextFromElement(verifyReturnCustomer);

    }

    By firstName = By.id("input-firstname");
    By lastName = By.id("input-lastname");
    By email = By.id("input-email");
    By phone = By.id("input-telephone");
    By password = By.id("input-password");
    By confirmPassword = By.id("input-confirm");
    By subscribeButton = By.xpath("//fieldset[3]//input");
    By privacyPolicy = By.xpath("//div[@class = 'buttons']//input[@name='agree']");
    By continueButton = By.xpath("//div[@class = 'buttons']//input[@value='Continue']");
    By successMessage = By.xpath("//h1[contains(text(),'Your Account Has Been Created!')]");
    By ContinueButton2 = By.xpath("//a[contains(text(),'Continue')]");
    By accountLogOut = By.xpath("//h1[contains(text(),'Account Logout')]");

    public void sendTextToFirstName(String firstname) {
        sendTextToElement(firstName, firstname + getAlphaNumericString(4));
    }

    public void sendTextToLastName(String lastname) {
        sendTextToElement(lastName, lastname + getAlphaNumericString(4));
    }

    public void sendTextToEmail(String email1) {
        sendTextToElement(email, email1 + getAlphaNumericString(4) + "@gmail.com");
    }

    public void sendTextToPhone(String phoneno) {
        sendTextToElement(phone, phoneno);
    }

    public void sendTextToPassword(String password1) {
        sendTextToElement(password, password1);
    }

    public void sendTextToConfirmPassword(String confirmPass) {
        sendTextToElement(confirmPassword, confirmPass);
    }

    public void setSubscribeButton() {
        selectByContainsTextFromListOfElements(subscribeButton, "Yes");
    }

    public void clickOnPrivacyPolicy() {
        clickOnElement(privacyPolicy);
    }

    public String successMessage() {
        return gettextFromElement(successMessage);
    }

    public void clickOnContinue() {
        clickOnElement(continueButton);
    }

    public String accountLogOutMessage() {
        return gettextFromElement(accountLogOut);
    }

    public void clickOnContinue2() {
        clickOnElement(ContinueButton2);
    }

    //User login
    By enterEmail=By.id("input-email");
    public void enterEmail(String email)
    {
        sendTextToElement(enterEmail,email);
    }
    By loginButton = By.xpath("//form[contains(@action,'login')]//input[@type='submit']");

    public void clickOnSubmitButton() {
        clickOnElement(loginButton);
    }



}


