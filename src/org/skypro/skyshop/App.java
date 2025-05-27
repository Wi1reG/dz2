package org.skypro.skyshop;

import org.skypro.skyshop.SearchEngine;
import org.skypro.skyshop.article.Article;
import org.skypro.skyshop.product.Product;

public class App {
    public static void main(String[] args) {
        // Создание и добавление товаров
        Product apple = new Product("Apple") {
            @Override
            public String toString() {
                return "Apple, 100";
            }

            @Override
            public int getPrice() {
                return 100;
            }

            @Override
            public boolean isSpecial() {
                return false;
            }
        };

        Product banana = new Product("Banana") {
            @Override
            public String toString() {
                return "Banana, 150";
            }

            @Override
            public int getPrice() {
                return 150;
            }

            @Override
            public boolean isSpecial() {
                return false;
            }
        };

        Product milk = new Product("Milk") {
            @Override
            public String toString() {
                return "Milk, 80";
            }

            @Override
            public int getPrice() {
                return 80;
            }

            @Override
            public boolean isSpecial() {
                return false;
            }
        };

        // Создание и добавление статей
        Article article1 = new Article("Article Title 1", "Article text 1");
        Article article2 = new Article("Article Title 2", "Article text 2");

        // Создание и инициализация SearchEngine
        SearchEngine searchEngine = new SearchEngine(5);

        // Добавление товаров в SearchEngine
        searchEngine.add(apple);
        searchEngine.add(banana);
        searchEngine.add(milk)

        // Добавление статей в SearchEngine
        searchEngine.add(article1);
        searchEngine.add(article2);

        // Тестирование поиска
        searchEngine.search("ban");
        searchEngine.search("art");
        searchEngine.search("app");
    }
}
