package com.tokopedia.pageObj;

import com.tokopedia.data.ProductData;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ProductDetailPage {
    WebDriver webDriver;

    public ProductDetailPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(css = ".inventory_details_name.large_size")
    private WebElement productTitle;

    @FindBy(className = "inventory_details_price")
    private WebElement productPrice;

    @FindBy(css = ".btn.btn_primary.btn_small.btn_inventory")
    private WebElement addToCartBtn;

    @FindBy(className = "shopping_cart_badge")
    private WebElement shoppingChartBadgeNumber;

    @FindBy(id = "shopping_cart_container")
    private WebElement shoppingChartBadge;

    public void verifyPDPDisplay() {
        productTitle.isDisplayed();
        productPrice.isDisplayed();
        verifyProductPDP();
    }

    public void verifyProductPDP() {
        Assert.assertEquals(ProductData.getProductTitle(), productTitle.getText());
        Assert.assertEquals(ProductData.getProductPrice(), productPrice.getText());
    }

    public void clickAddToCartBtn() {
        addToCartBtn.isDisplayed();
        addToCartBtn.click();
    }

    public void verifyChartAmount() {
        shoppingChartBadgeNumber.isDisplayed();
        ProductData.setQuantityProduct(shoppingChartBadgeNumber.getText());
        Assert.assertEquals("1", shoppingChartBadgeNumber.getText());
    }

    public void clickChartIcon() {
        shoppingChartBadge.isDisplayed();
        shoppingChartBadge.click();
    }

}
