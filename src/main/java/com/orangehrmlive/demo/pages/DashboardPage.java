package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;

public class DashboardPage extends Utility {

    By welcomeText = By.xpath("//h6[normalize-space()='Dashboard']");
    By adminTab = By.xpath("//li[1]//a[1]//span[1]");
    By userProfileLogo = By.xpath("//img[@class='oxd-userdropdown-img']");
    By logout = By.xpath("//a[normalize-space()='Logout']");

    public String verifyTheWelcomeText() {
        return getTextFromElement(welcomeText);
    }

    public void clickOnAdminTab() {
        clickOnElement(adminTab);
    }

    public void clickOnUserProfileLogo () {
        clickOnElement(userProfileLogo);
    }

    public void mouseHoverAndClickOnLogOut() {
        mouseHoverToElementAndClick(logout);
    }
}
