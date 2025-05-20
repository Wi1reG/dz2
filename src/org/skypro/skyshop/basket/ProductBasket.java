package org.skypro.skyshop.basket;

import org.skypro.skyshop.product.Product;

public class ProductBasket {

    private Product[] products;
    private int size;

    public ProductBasket() {
        products = new Product[5];
        size = 0;
    }


    public void addProduct(Product product) {
        if (size >= products.length) {
            System.out.println("Невозможно добавить продукт");
            return;
        }
        products[size] = product;
        size++;
    }


    public int getTotalCost() {
        int total = 0;
        for (int i = 0; i < size; i++) {
            total += products[i].getPrice();
        }
        return total;
    }


    public void printBasket() {
        if (size == 0) {
            System.out.println("в корзине пусто");
            return;
        }

        for (int i = 0; i < size; i++) {
            System.out.println(products[i].getName() + ": " + products[i].getPrice());
        }
        System.out.println("Итого: " + getTotalCost());
    }


    public boolean containsProduct(String name) {
        for (int i = 0; i < size; i++) {
            if (products[i].getName().equals(name)) {
                return true;
            }
        }
        return false;
    }


    public void clearBasket() {
        for (int i = 0; i < size; i++) {
            products[i] = null;
        }
        size = 0;
    }
}