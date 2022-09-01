package com.tokopedia.pageObj;

import com.tokopedia.data.ProductData;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
    WebDriver webDriver;

    public ProductPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(className = "title")
    private WebElement productPageTitle;

    @FindBy(className = "select_container")
    private WebElement sortButton;

    @FindBy(xpath = "//*[@class='product_sort_container']/*[@value='hilo']")
    private WebElement sortHighestPrice;

    @FindBy(xpath = "//*[@class='inventory_item'][1]/descendant::*[@class='inventory_item_name']")
    private WebElement productTitle1;

    @FindBy(xpath = "//*[@class='inventory_item'][1]/descendant::*[@class='inventory_item_price']")
    private WebElement productPrice1;

    @FindBy(xpath = "//*[@class='inventory_item'][2]/descendant::*[@class='inventory_item_name']")
    private WebElement productTitle2;

    @FindBy(xpath = "//*[@class='inventory_item'][2]/descendant::*[@class='inventory_item_price']")
    private WebElement productPrice2;

    public void validateProductPage() {
        productPageTitle.isDisplayed();
    }

    public void clickSortButton() {
        sortButton.isDisplayed();
        sortButton.click();
    }

    public void clickSortHighestPriced() {
        sortHighestPrice.isDisplayed();
        sortHighestPrice.click();
    }

    public void verifyProductDisplay() {
        productTitle1.isDisplayed();
        productPrice1.isDisplayed();
        productTitle2.isDisplayed();
        productPrice2.isDisplayed();
        validateSortByHighestPrice();
    }

    public String getProductName() {
        String productTitle = productTitle1.getText().toString();
        return productTitle;
    }

    public String getProductPrice() {
        String productFirstPrice = productPrice1.getText().toString();
        return productFirstPrice;
    }

    public void validateSortByHighestPrice() {
        String subStrPrice1 = productPrice1.getText().substring(1);
        String subStrPrice2 = productPrice2.getText().substring(1);
        Float productFirstPrice = Float.parseFloat(subStrPrice1);
        Float productSecondPrice = Float.parseFloat(subStrPrice2);
        Assert.assertTrue("sorting sesuai", productFirstPrice > productSecondPrice);
    }

    public void clickFirstProduct() {
        ProductData.setProductTitle((getProductName()));
        ProductData.setProductPrice(getProductPrice());
        productTitle1.click();
    }

}
