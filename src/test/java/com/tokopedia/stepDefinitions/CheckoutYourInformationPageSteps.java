package com.tokopedia.stepDefinitions;

import com.tokopedia.pageObj.CheckoutYourInformationPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class CheckoutYourInformationPageSteps {
    CheckoutYourInformationPage checkoutYourInformationPage;
    public WebDriver driver;

    public CheckoutYourInformationPageSteps() {
        driver = Hooks.getWebdriver();
        checkoutYourInformationPage = new CheckoutYourInformationPage(driver);
    }

    @And("User navigate to checkout your information page")
    public void goToCheckoutYourInformationPage() {
        checkoutYourInformationPage.verifyCheckoutYourInformationPage();
    }

    @And("^User input first name \"([^\"]*)\" and last name \"([^\"]*)\"$")
    public void inputName(String firstName, String lastName) {
        checkoutYourInformationPage.inputName(firstName, lastName);
    }

    @And("^User input postal code \"([^\"]*)\"$")
    public void inputPostalCode(String postalCode) {
        checkoutYourInformationPage.inputPostalCode(postalCode);
    }

    @And("User click continue button")
    public void clickContinueBtn() {
        checkoutYourInformationPage.clickContinueButton();
    }
}
