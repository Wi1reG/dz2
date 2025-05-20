package org.skypro.skyshop.product;

public class FixPriceProduct extends Product {
    private static final int FIXED_PRICE = 100; // Фиксированная цена

    public FixPriceProduct(String name) {
        super(name);
    }

    @Override
    public int getPrice() {
        return FIXED_PRICE;
    }

    @Override
    public String toString() {
        return getName() + " (" + getPrice() + " руб.)";
    }

    @Override
    public boolean isSpecial() {
        return true; // Фиксированная цена делает товар специальным
    }

}
