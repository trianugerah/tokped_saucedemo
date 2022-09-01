package com.tokopedia.stepDefinitions;

import com.tokopedia.pageObj.YourChartPage;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;

public class YourChartPageSteps {
    public WebDriver driver;
    YourChartPage yourChartPage;

    public YourChartPageSteps() {
        driver = Hooks.getWebdriver();
        yourChartPage = new YourChartPage(driver);
    }

    @And("User navigate to Your Chart Page")
    public void verifyYourChartPageDisplay() {
        yourChartPage.verifyYourChartPage();
    }

    @And("user validate the product in your chart page")
    public void verifyProductYourChartPage() {
        yourChartPage.verifyYourProduct();
    }

    @And("user click checkout button in your chart page")
    public void clickCheckoutBtn() {
        yourChartPage.clickCheckoutBtn();
    }
}
