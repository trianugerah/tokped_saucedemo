package com.tokopedia.pageObj;

import com.tokopedia.data.ProductData;
import com.tokopedia.stepDefinitions.Hooks;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutOverviewPage {
    WebDriver webDriver;

    public CheckoutOverviewPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(className = "title")
    private WebElement titlePage;

    @FindBy(className = "cart_quantity")
    private WebElement cartQuantity;

    @FindBy(className = "inventory_item_name")
    private WebElement productName;

    @FindBy(className = "inventory_item_price")
    private WebElement productPrice;

    @FindBy(className = "summary_subtotal_label")
    private WebElement itemTotal;

    @FindBy(className = "summary_tax_label")
    private WebElement tax;

    @FindBy(className = "summary_total_label")
    private WebElement total;

    public void verifyCheckoutOverviewPage() {
        titlePage.isDisplayed();
        Assert.assertEquals("CHECKOUT: OVERVIEW", titlePage.getText());
    }

    public void verifyProductOnCheckoutOverview() {
        cartQuantity.isDisplayed();
        productName.isDisplayed();
        productPrice.isDisplayed();
        Assert.assertEquals(ProductData.getQuantityProduct(), cartQuantity.getText());
        Assert.assertEquals(ProductData.getProductTitle(), productName.getText());
        Assert.assertEquals(ProductData.getProductPrice(), productPrice.getText());
    }

    public void verifyTotalPrice() {
        itemTotal.isDisplayed();
        tax.isDisplayed();
        total.isDisplayed();
        Hooks.takeSS("Checkout_Status");
    }
}
