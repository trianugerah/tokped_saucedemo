package com.tokopedia.stepDefinitions;

import com.tokopedia.pageObj.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class LoginPageSteps {
    LoginPage loginPage;
    public WebDriver driver;

    public LoginPageSteps() {
        driver = Hooks.getWebdriver();
        loginPage = new LoginPage(driver);
    }

    @When("user go to login page")
    public void goToLoginPage() {
        loginPage.goLoginPage();
    }

    @And("^User login with username \"([^\"]*)\" and password \"([^\"]*)\" on login page$")
    public void inputUserName(String userName, String password) {
        loginPage.inputUsername(userName);
        loginPage.inputPassword(password);
        loginPage.clickLoginButton();
    }
}
