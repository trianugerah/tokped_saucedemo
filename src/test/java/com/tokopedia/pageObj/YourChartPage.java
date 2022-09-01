package com.tokopedia.pageObj;

import com.tokopedia.data.ProductData;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YourChartPage {
    WebDriver webDriver;

    public YourChartPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(className = "title")
    private WebElement titleYourChartPage;

    @FindBy(className = "cart_quantity")
    private WebElement chartQuantity;

    @FindBy(className = "inventory_item_name")
    private WebElement productName;

    @FindBy(className = "inventory_item_price")
    private WebElement productPrice;

    @FindBy(id = "checkout")
    private WebElement checkoutBtn;

    public void verifyYourChartPage() {
        titleYourChartPage.isDisplayed();
        Assert.assertEquals("YOUR CART", titleYourChartPage.getText());
    }

    public void verifyYourProduct() {
        chartQuantity.isDisplayed();
        productName.isDisplayed();
        productPrice.isDisplayed();
        Assert.assertEquals(ProductData.getQuantityProduct(), chartQuantity.getText());
        Assert.assertEquals(ProductData.getProductTitle(), productName.getText());
        Assert.assertEquals(ProductData.getProductPrice(), productPrice.getText());
    }

    public void clickCheckoutBtn() {
        checkoutBtn.isDisplayed();
        checkoutBtn.click();
    }
}
