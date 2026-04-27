package za.ac.cput.adppractice2.factory;

import za.ac.cput.adppractice2.domain.Product;

public class ProductFactory {
    public static Product createProduct(String productId, String productName, double price, int stockQuantity){

        return new Product.Builder()
                .setProductId(productId)
                .setProductName(productName)
                .setPrice(price)
                .setStockQuantity(stockQuantity)
                .build();
    }
}
