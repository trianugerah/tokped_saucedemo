package com.tokopedia.stepDefinitions;

import com.tokopedia.pageObj.CheckoutOverviewPage;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;

public class CheckoutOverviewPageSteps {
    CheckoutOverviewPage checkoutOverviewPage;
    public WebDriver driver;

    public CheckoutOverviewPageSteps() {
        driver = Hooks.getWebdriver();
        checkoutOverviewPage = new CheckoutOverviewPage(driver);
    }

    @And("User navigate to checkout overview page")
    public void verifyCheckoutOverviewPage() {
        checkoutOverviewPage.verifyCheckoutOverviewPage();
    }

    @And("User verify product order status")
    public void verifyProductOrder() {
        checkoutOverviewPage.verifyProductOnCheckoutOverview();
    }

    @And("User verify total price display on checkout overview page")
    public void verifyProductPrice() {
        checkoutOverviewPage.verifyTotalPrice();
    }
}
