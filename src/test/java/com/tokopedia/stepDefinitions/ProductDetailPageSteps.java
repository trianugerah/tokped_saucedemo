package com.tokopedia.stepDefinitions;

import com.tokopedia.pageObj.ProductDetailPage;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;


public class ProductDetailPageSteps {
    public WebDriver driver;
    ProductDetailPage productDetailPage;

    public ProductDetailPageSteps() {
        driver = Hooks.getWebdriver();
        productDetailPage = new ProductDetailPage(driver);
    }

    @And("User verify the PDP display")
    public void verifyPDPDisplay() {
        productDetailPage.verifyPDPDisplay();
    }

    @And("User click add to cart button")
    public void clickAddToCartButton() {
        productDetailPage.clickAddToCartBtn();
    }

    @And("User verify the chart number added and click the chart icon")
    public void verifyChartBadgeNumber() {
        productDetailPage.verifyChartAmount();
        productDetailPage.clickChartIcon();
    }

}
