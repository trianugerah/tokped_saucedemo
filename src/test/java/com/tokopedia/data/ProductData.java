package com.tokopedia.data;

public class ProductData {

    private static String productTitle;
    private static String productPrice;
    private static String quantityProduct;

    public static String getQuantityProduct() {
        return quantityProduct;
    }

    public static void setQuantityProduct(String quantityProduct) {
        ProductData.quantityProduct = quantityProduct;
    }

    public static String getProductTitle() {
        return productTitle;
    }

    public static void setProductTitle(String productTitle) {
        ProductData.productTitle = productTitle;
    }

    public static String getProductPrice() {
        return productPrice;
    }

    public static void setProductPrice(String productPrice) {
        ProductData.productPrice = productPrice;
    }

}
