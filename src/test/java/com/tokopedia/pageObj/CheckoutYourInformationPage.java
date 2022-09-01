package com.tokopedia.pageObj;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutYourInformationPage {
    WebDriver webDriver;

    public CheckoutYourInformationPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(id = "title")
    private WebElement titleCheckoutInformationPage;

    @FindBy(id = "first-name")
    private WebElement firstNameTextField;

    @FindBy(id = "last-name")
    private WebElement lastNameTextxField;

    @FindBy(id = "postal-code")
    private WebElement postalCodeTextxField;

    @FindBy(id = "continue")
    private WebElement continueButton;

    public void verifyCheckoutYourInformationPage() {
        titleCheckoutInformationPage.isDisplayed();
        Assert.assertEquals("CHECKOUT: YOUR INFORMATION", titleCheckoutInformationPage.getText());
    }

    public void inputName(String firstName, String lastName) {
        firstNameTextField.isDisplayed();
        lastNameTextxField.isDisplayed();
        firstNameTextField.sendKeys(firstName);
        lastNameTextxField.sendKeys(lastName);
    }

    public void inputPostalCode(String postalCode) {
        postalCodeTextxField.isDisplayed();
        postalCodeTextxField.sendKeys(postalCode);
    }

    public void clickContinueButton() {
        continueButton.isDisplayed();
        continueButton.click();
    }
}
