package org.skypro.skyshop.product;

public abstract class Product {
    private String name;

    public Product(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract int getPrice();

    public abstract String toString();

    // Новый метод для определения специального товара
    public boolean isSpecial() {
        return false; // По умолчанию все товары не специальные
    }
}
