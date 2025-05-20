package org.skypro.skyshop.basket;

import org.skypro.skyshop.product.DiscountedProduct;
import org.skypro.skyshop.product.FixPriceProduct;
import org.skypro.skyshop.product.Product;
import org.skypro.skyshop.product.SimpleProduct;

import java.util.ArrayList;
import java.util.List;

public class ProductBasket {
    private List<Product> products;

    public ProductBasket() {
        this.products = new ArrayList<>();
    }

    // Метод добавления продукта в корзину
    public void addProduct(Product product) {
        products.add(product);
    }

    // Метод получения общей стоимости корзины
    public int getTotalCost() {
        int total = 0;
        for (Product p : products) {
            total += p.getPrice();
        }
        return total;
    }

    // Новый метод для печати содержимого корзины
    public void printBasket() {
        int specialProductsCount = 0; // Счетчик специальных товаров

        System.out.println("Содержимое корзины:");
        for (Product product : products) {
            if (product instanceof SimpleProduct) {
                SimpleProduct simpleProduct = (SimpleProduct) product;
                System.out.println(simpleProduct.toString());
            } else if (product instanceof DiscountedProduct) {
                DiscountedProduct discountedProduct = (DiscountedProduct) product;
                System.out.println(discountedProduct.toString());
                specialProductsCount++;
            } else if (product instanceof FixPriceProduct) {
                FixPriceProduct fixPriceProduct = (FixPriceProduct) product;
                System.out.println(fixPriceProduct.toString());
                specialProductsCount++;
            }
        }

        System.out.println("Итого: " + getTotalCost());
        System.out.println("Специальных товаров: " + specialProductsCount);
    }

    // Метод проверки наличия продукта по имени
    public boolean containsProduct(String name) {
        for (Product p : products) {
            if (p.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    // Метод очистки корзины
    public void clearBasket() {
        products.clear();
    }
}
