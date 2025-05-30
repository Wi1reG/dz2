package org.skypro.skyshop.product;

public abstract class SimpleProduct extends Product {
    private int price;

    public SimpleProduct(String name, int price) {
        super(name);
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return getName() + " (" + getPrice() + " руб.)";
    }
}
