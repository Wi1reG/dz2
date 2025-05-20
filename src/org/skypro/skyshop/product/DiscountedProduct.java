package org.skypro.skyshop.product;

public class DiscountedProduct extends Product {
    private int basePrice;
    private int discountPercent;

    public DiscountedProduct(String name, int basePrice, int discountPercent) {
        super(name);
        this.basePrice = basePrice;
        this.discountPercent = discountPercent;
    }

    @Override
    public int getPrice() {
        return (int) (basePrice - (basePrice * discountPercent) / 100);
    }

    @Override
    public String toString() {
        return getName() + " (" + getPrice() + " руб. " + discountPercent + "% скидка)";
    }

        @Override
        public boolean isSpecial() {
            return true; // Скидка делает товар специальным
        }
    }



