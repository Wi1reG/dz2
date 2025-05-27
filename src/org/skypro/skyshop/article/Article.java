package org.skypro.skyshop.article;

import org.skypro.skyshop.Searchable;

public class Article implements Searchable {
    private String articleTitle;
    private String articleText;

    public Article(String articleTitle, String articleText) {
        this.articleTitle = articleTitle;
        this.articleText = articleText;
    }

    public String getArticleTitle() {
        return articleTitle;
    }

    public String getArticleText() {
        return articleText;
    }

    @Override
    public String getSearchTerm() {
        return articleTitle + "\n" + articleText; // Строка из названия и текста статьи
    }

    @Override
    public String getContentType() {
        return "ARTICLE";
    }

    @Override
    public String getName() {
        return articleTitle;
    }

    @Override
    public String toString() {
        return articleTitle + "\n" + articleText;
    }
}
