package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {

    By userNameField = By.xpath("//input[@placeholder='Username']");
    By passwordField = By.xpath("//input[@placeholder='Password']");
    By loginButton = By.xpath("//button[normalize-space()='Login']");
    By loginPanelText = By.xpath("//h5[normalize-space()='Login']");
    By HRForAllLogo = By.xpath("//div[@class='orangehrm-login-logo']//img[@alt='orangehrm-logo']");


    public void sendDataToUserNameField(String userName) {
        sendTextToElement(userNameField,userName);
    }

    public void sendDataToPasswordField(String password) {
        sendTextToElement(passwordField, password);
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
    }

    public String verifyTheLoginPanelText() {
        return getTextFromElement(loginPanelText);
    }

    public Boolean verifyHRForAllLogo() {
        return driver.findElement(HRForAllLogo).isDisplayed();
    }

}
