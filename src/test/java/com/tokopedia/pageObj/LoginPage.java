package com.tokopedia.pageObj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver webDriver;

    public LoginPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(className = "login_logo")
    private WebElement logoSwagLabs;

    @FindBy(xpath = "//*[@id='login_credentials']/text()[2]")
    private WebElement userName;

    @FindBy(xpath = "//*[@class='login_password']/h4")
    private WebElement userPassword;

    @FindBy(xpath = "//input[@id='user-name']")
    private WebElement userNameTextField;

    @FindBy(id = "password")
    private WebElement passwordTextField;

    @FindBy(id = "login-button")
    private WebElement loginButton;

    public void goLoginPage() {
        webDriver.get("https://www.saucedemo.com");
        logoSwagLabs.isDisplayed();
    }

    public void inputUsername(String userName) {
        userNameTextField.isDisplayed();
        userNameTextField.click();
        userNameTextField.sendKeys(userName);
    }

    public void inputPassword(String Password) {
        passwordTextField.isDisplayed();
        passwordTextField.click();
        passwordTextField.sendKeys(Password);
    }

    public void clickLoginButton() {
        loginButton.isDisplayed();
        loginButton.click();
    }

}
