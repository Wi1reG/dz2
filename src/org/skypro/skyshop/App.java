package org.skypro.skyshop;

import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.DiscountedProduct;
import org.skypro.skyshop.product.FixPriceProduct;
import org.skypro.skyshop.product.Product;
import org.skypro.skyshop.product.SimpleProduct;

public class App {
    public static void main(String[] args) {

        ProductBasket basket = new ProductBasket();

        DiscountedProduct discountedApple = new DiscountedProduct("Яблоки", 100, 10);
        FixPriceProduct fixPriceApple = new FixPriceProduct("Фиктивные яблоки");

        DiscountedProduct discountedBanana = new DiscountedProduct("Бананы", 150, 5);
        SimpleProduct milk = new SimpleProduct("Молоко", 80);
        FixPriceProduct fixPriceBread = new FixPriceProduct("Хлеб");

        basket.addProduct(discountedApple);
        basket.addProduct(fixPriceApple);
        basket.addProduct(discountedBanana);
        basket.addProduct(milk);
        basket.addProduct(fixPriceBread);


        basket.printBasket();
    }

}