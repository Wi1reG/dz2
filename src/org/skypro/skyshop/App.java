package org.skypro.skyshop;

import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.Product;

public class App {
    public static void main(String[] args) {

        ProductBasket basket = new ProductBasket();

        // Создаем несколько продуктов
        Product apple = new Product("Яблоки", 100);
        Product banana = new Product("Бананы", 150);
        Product milk = new Product("Молоко", 80);
        Product bread = new Product("Хлеб", 50);
        Product cheese = new Product("Сыр", 200);
        Product extraProduct = new Product("Дополнительные яблоки", 120);

        // 1. Добавление продукта в корзину
        System.out.println("1. Добавляем продукты в корзину:");
        basket.addProduct(apple);
        basket.addProduct(banana);
        basket.addProduct(milk);
        basket.addProduct(bread);
        basket.addProduct(cheese);

        // 2. Добавление продукта в заполненную корзину
        System.out.println("\n2. Попытка добавить продукт в заполненную корзину:");
        basket.addProduct(extraProduct);

        // 3. Печать содержимого корзины
        System.out.println("\n3. Содержимое корзины:");
        basket.printBasket();

        // 4. Получение стоимости корзины
        System.out.println("\n4. Общая стоимость корзины: " + basket.getTotalCost());

        // 5. Поиск товара, который есть в корзине
        System.out.println("\n5. Проверка наличия яблок: " + basket.containsProduct("Яблоки"));

        // 6. Поиск товара, которого нет в корзине
        System.out.println("\n6. Проверка наличия апельсинов: " + basket.containsProduct("Апельсины"));

        // 7. Очистка корзины
        System.out.println("\n7. Очищаем корзину");
        basket.clearBasket();

        // 8. Печать пустой корзины
        System.out.println("\n8. Содержимое корзины после очистки:");
        basket.printBasket();

        // 9. Получение стоимости пустой корзины
        System.out.println("\n9. Общая стоимость пустой корзины: " + basket.getTotalCost());

        // 10. Поиск товара в пустой корзине
        System.out.println("\n10. Проверка наличия яблок в пустой корзине: " + basket.containsProduct("Яблоки"));
    }
}