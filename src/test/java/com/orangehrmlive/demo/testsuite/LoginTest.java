package com.orangehrmlive.demo.testsuite;

import com.orangehrmlive.demo.pages.DashboardPage;
import com.orangehrmlive.demo.pages.LoginPage;
import com.orangehrmlive.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();

    @Test
    public void verifyUserShouldLoginSuccessFully() {

        loginPage.sendDataToUserNameField("Admin");
        loginPage.sendDataToPasswordField("admin123");
        loginPage.clickOnLoginButton();

        String expectedDashboardWelcomeText = "Dashboard";
        String actualDashboardWelcomeText = dashboardPage.verifyTheWelcomeText();
        Assert.assertEquals(actualDashboardWelcomeText, expectedDashboardWelcomeText);
    }

    @Test
    public void verifyThatTheLogoDisplayOnLoginPage() {
        Assert.assertTrue(loginPage.verifyHRForAllLogo(), "Logo is displayed");
    }

    @Test
    public void VerifyUserShouldLogOutSuccessFully() throws InterruptedException {
        loginPage.sendDataToUserNameField("Admin");
        loginPage.sendDataToPasswordField("admin123");
        loginPage.clickOnLoginButton();

        dashboardPage.clickOnUserProfileLogo();
        Thread.sleep(2000);
        dashboardPage.mouseHoverAndClickOnLogOut();

        loginPage.verifyTheLoginPanelText();
    }


}
