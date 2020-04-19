package org.example;

import org.example.support.WebDriverUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class LoginPage extends baseClass {


    @FindBy(how = How.LINK_TEXT, using = "Log in")
    WebElement loginLink;

    @FindBy(how = How.LINK_TEXT, using = "Log out")
    WebElement logoutLink;


    @FindBy(how = How.LINK_TEXT, using = "My account")
    WebElement myAccount;

    @FindBy(how = How.ID, using = "Email")
    WebElement EmailText;

    @FindBy(how = How.ID, using = "Password")
    WebElement PasswordText;


    @FindBy(how = How.CSS, using = "input.button-1.login-button")
    WebElement LoginButton;

    WebDriverUtils utils = new WebDriverUtils();

    public void gotoLoginPage() {
        loginLink.click();
    }

    public void verifySigninpage() {

        Assert.assertTrue(utils.verifyTextPresentOnPage("Welcome, Please Sign In!"));
    }

    public void enterlogindetails(String email, String pWord) {
        EmailText.sendKeys(email);
        PasswordText.sendKeys(pWord);
    }

    public void submitLogin() {
        LoginButton.click();

    }

    public void checkMyaccounttext() throws InterruptedException {
        Assert.assertTrue(utils.isLinkWithTextPresent("My account"));
    }

    public void errorMessage() {
        Assert.assertTrue(utils.verifyTextPresentOnPage("Login was unsuccessful. Please correct the errors and try again."));
    }

    public void logout() {

        logoutLink.click();
    }


}
