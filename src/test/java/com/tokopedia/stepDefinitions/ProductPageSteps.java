package com.tokopedia.stepDefinitions;

import com.tokopedia.pageObj.ProductPage;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;

public class ProductPageSteps {
    public WebDriver driver;
    ProductPage productPage;

    public ProductPageSteps() {
        driver = Hooks.getWebdriver();
        productPage = new ProductPage(driver);
    }

    @And("User navigate to Product page")
    public void verifyProductPageDisplay() {
        productPage.validateProductPage();
    }

    @And("User click sort the product from the highest priced")
    public void sortHighestPriced() {
        productPage.clickSortButton();
        productPage.clickSortHighestPriced();
    }

    @And("User verify product display")
    public void verifyProductDisplay() {
        productPage.verifyProductDisplay();
    }

    @And("User click first product")
    public void userClickFirstProduct() {
        productPage.clickFirstProduct();
    }

}
