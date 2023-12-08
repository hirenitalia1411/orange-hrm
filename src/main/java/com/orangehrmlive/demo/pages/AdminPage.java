package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;

public class AdminPage extends Utility {

    By welcomeText = By.xpath("//h6[normalize-space()='Admin']");
    By addButton = By.xpath("//button[normalize-space()='Add']");
    By addUserText = By.xpath("//h6[normalize-space()='Add User']");
    By userRoleDropDownInAddUser = By.xpath("(//div[@class = 'oxd-select-wrapper'])[1]");
    By adminOptionInUserRoleDropDownInAddUser = By.xpath("//span[contains(text(),'Admin')]");
    By employeeNameFieldInAddUser = By.xpath("//input[@placeholder='Type for hints...']");
    By userNameFieldInAddUser = By.xpath("//div[@class = 'oxd-form-row']//input[@class = 'oxd-input oxd-input--active']");
    By statusDropDownInAddUser = By.xpath("//div[contains(text(),'-- Select --')]");
    By disabledStatusOptionInAddUser = By.xpath("//span[normalize-space()='Disabled']");
    By passwordFieldInAddUser = By.xpath("//div[@class='oxd-grid-item oxd-grid-item--gutters user-password-cell']//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@type='password']");
    By confirmPasswordFieldInAddUser = By.xpath("//div[@class='oxd-grid-item oxd-grid-item--gutters']//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@type='password']");
    By saveButtonInAddUser = By.xpath("//button[normalize-space()='Save']");
    By successfullySavedMessageInAddUser = By.xpath("//p[@class='oxd-text oxd-text--p oxd-text--toast-message oxd-toast-content-text']");
    By systemUsersText = By.xpath("//h5[normalize-space()='System Users']");
    By userNameFieldInSystemUsers = By.xpath("//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']");
    By userRoleDropDownInSystemUsers = By.xpath("(//div[contains(text(),'-- Select --')])[1]");
    By adminOptionInUserRoleDropDownInSystemUsers = By.xpath("//span[contains(text(),'Admin')]");
    By statusDropDownInSystemUsers = By.xpath("(//i)[13]");
    By disableStatusOptionInSystemUsers = By.xpath("//span[normalize-space()='Disabled']");
    By searButtonInSystemUsers = By.xpath("//button[normalize-space()='Search']");
    By userNameInRecord = By.xpath("(//div[@data-v-6c07a142])[1]");
    By checkBoxAgainstFirstUserName = By.xpath("//div[@class='oxd-table-card-cell-checkbox']//i[@class='oxd-icon bi-check oxd-checkbox-input-icon']");
    By deleteButtonAgainstFirstUSerName = By.xpath("//button[normalize-space()='Delete Selected']");
    By yesDeleteOption = By.xpath("//button[normalize-space()='Yes, Delete']");


    public String getWelcomeText() {
        return getTextFromElement(welcomeText);
    }

    public void clickOnAddButton() {
        clickOnElement(addButton);
    }

    public String verifyAddUserText () {
        return getTextFromElement(addUserText);
    }

    public void mouseHoverAndClickOnUserRoleDropDownInAddUser() {
        mouseHoverToElementAndClick(userRoleDropDownInAddUser);
    }

    public void mouseHoverAndCLickOnAdminOptionInUserRoleDropDownInAddUser() {
        clickOnElement(adminOptionInUserRoleDropDownInAddUser);
    }

    public void sendDataToEmployeeNameFieldInAddUser(String eName) {
        sendTextToElement(employeeNameFieldInAddUser, eName);
    }

    public void clickOnStatusDropDownMenuInAddUser() {
        clickOnElement(statusDropDownInAddUser);
    }

    public void mouseHoverAndClickOnDisableOptionInAddUser() {
        mouseHoverToElementAndClick(disabledStatusOptionInAddUser);
    }

    public void sendDataToUserNameFieldInAddUser(String uName) {
        sendTextToElement(userNameFieldInAddUser, uName);
    }

    public void sendDataToPasswordFieldInAddUser(String password) {
        sendTextToElement(passwordFieldInAddUser, password);
    }

    public void sendDataToConfirmPasswordFieldInAddUser(String cPassword) {
        sendTextToElement(confirmPasswordFieldInAddUser, cPassword);
    }

    public void clickOnSaveButtonInAddUser() {
        clickOnElement(saveButtonInAddUser);
    }

    public String getSuccessfullySavedMessageInAddUser() {
        return getTextFromElement(successfullySavedMessageInAddUser);
    }

    public String getSystemUsersText() {
        return getTextFromElement(systemUsersText);
    }

    public void sendDataToUserNameFieldInSystemUsers(String uname) {
        sendTextToElement(userNameFieldInSystemUsers, uname);
    }

    public void clickOnUserRoleDropDownInSystemUsers() {
        clickOnElement(userRoleDropDownInSystemUsers);
    }

    public void mouseHoverAndClickOnAdminOptionInUserRoleDropDownInSystemUsers() {
        mouseHoverToElementAndClick(adminOptionInUserRoleDropDownInSystemUsers);
    }

    public void clickOnStatusDropDownInSystemUsers() {
        clickOnElement(statusDropDownInSystemUsers);
    }

    public void mouseHoverAndCLickOndDisableStatusOptionInSystemUsers() {
        mouseHoverToElementAndClick(disableStatusOptionInSystemUsers);
    }

    public void clickOnSearButtonInSystemUsers() {
        clickOnElement(searButtonInSystemUsers);
    }

    public String getDataFromUserNameInRecord() {
        return getTextFromElement(userNameInRecord);
    }

    public void clickOnCheckBoxAgainstFirstUserName() {
        clickOnElement(checkBoxAgainstFirstUserName);
    }

    public void clickOnDeleteSelectedOption() {
        clickOnElement(deleteButtonAgainstFirstUSerName);
    }

    public void clickOnYesDeleteOption() {
        clickOnElement(yesDeleteOption);
    }

}
