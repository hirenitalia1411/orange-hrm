package com.orangehrmlive.demo.testsuite;

import com.orangehrmlive.demo.pages.AdminPage;
import com.orangehrmlive.demo.pages.DashboardPage;
import com.orangehrmlive.demo.pages.LoginPage;
import com.orangehrmlive.demo.propertyreader.PropertyReader;
import com.orangehrmlive.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UsersTest extends BaseTest {

    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();
    AdminPage adminPage = new AdminPage();

    @Test
    public void adminShouldAddUserSuccessFully() throws InterruptedException {
        loginPage.sendDataToUserNameField("Admin");
        loginPage.sendDataToPasswordField(PropertyReader.getInstance().getProperty("password"));
        loginPage.clickOnLoginButton();

        dashboardPage.clickOnAdminTab();

        String expectedAdminWelcomeText = "Admin";
        String actualAdminWelcomeText = adminPage.getWelcomeText();
        Assert.assertEquals(actualAdminWelcomeText, expectedAdminWelcomeText, "Welcome Text is not available");

        adminPage.clickOnAddButton();

        String expectedAddUSerText = "Add User";
        String actualAddUserText = adminPage.verifyAddUserText().substring(0, expectedAddUSerText.length());
        Assert.assertEquals(actualAddUserText, expectedAddUSerText);

        adminPage.mouseHoverAndClickOnUserRoleDropDownInAddUser();
        Thread.sleep(2000);
        adminPage.mouseHoverAndCLickOnAdminOptionInUserRoleDropDownInAddUser();

        adminPage.sendDataToEmployeeNameFieldInAddUser("hyder  ali");
        adminPage.sendDataToUserNameFieldInAddUser("Prime123");
        adminPage.clickOnStatusDropDownMenuInAddUser();
        Thread.sleep(2000);
        adminPage.mouseHoverAndClickOnDisableOptionInAddUser();
        adminPage.sendDataToPasswordFieldInAddUser("Prime@123");
        adminPage.sendDataToConfirmPasswordFieldInAddUser("Prime@123");
        adminPage.clickOnSaveButtonInAddUser();

        Thread.sleep(2000);
        String expectedMessage = "Successfully Saved";
        String actualMessage = adminPage.getSuccessfullySavedMessageInAddUser().substring(0, expectedMessage.length());
        Assert.assertEquals(actualMessage, expectedMessage);
    }

    @Test
    public void searchTheUserCreatedAndVerifyIt() {
        loginPage.sendDataToUserNameField("Admin");
        loginPage.sendDataToPasswordField(PropertyReader.getInstance().getProperty("password"));
        loginPage.clickOnLoginButton();

        dashboardPage.clickOnAdminTab();

        String expectedAdminWelcomeText = "System Users";
        String actualAdminWelcomeText = adminPage.getSystemUsersText();
        Assert.assertEquals(actualAdminWelcomeText, expectedAdminWelcomeText);

        adminPage.sendDataToUserNameFieldInSystemUsers("Prime123");
        adminPage.clickOnUserRoleDropDownInSystemUsers();
        adminPage.mouseHoverAndClickOnAdminOptionInUserRoleDropDownInSystemUsers();
        adminPage.clickOnStatusDropDownInSystemUsers();
        adminPage.mouseHoverAndCLickOndDisableStatusOptionInSystemUsers();
        adminPage.clickOnSearButtonInSystemUsers();

        String expectedUserName = "Prime123";
        String actualUserName = adminPage.getDataFromUserNameInRecord();
        Assert.assertEquals(actualUserName, expectedUserName);
    }

    @Test
    public void verifyThatAdminShouldDeleteTheUserSuccessFully() {

        loginPage.sendDataToUserNameField("Admin");
        loginPage.sendDataToPasswordField(PropertyReader.getInstance().getProperty("password"));
        loginPage.clickOnLoginButton();

        dashboardPage.clickOnAdminTab();

        String expectedAdminWelcomeText = "System Users";
        String actualAdminWelcomeText = adminPage.getSystemUsersText();
        Assert.assertEquals(actualAdminWelcomeText, expectedAdminWelcomeText);

        adminPage.sendDataToUserNameFieldInSystemUsers("Prime123");
        adminPage.clickOnUserRoleDropDownInSystemUsers();
        adminPage.mouseHoverAndClickOnAdminOptionInUserRoleDropDownInSystemUsers();
        adminPage.clickOnStatusDropDownInSystemUsers();
        adminPage.mouseHoverAndCLickOndDisableStatusOptionInSystemUsers();
        adminPage.clickOnSearButtonInSystemUsers();

        String expectedUserName = "Prime123";
        String actualUserName = adminPage.getDataFromUserNameInRecord();
        Assert.assertEquals(actualUserName, expectedUserName);

        adminPage.clickOnCheckBoxAgainstFirstUserName();
        adminPage.clickOnDeleteSelectedOption();
        adminPage.clickOnYesDeleteOption();
    }

}
