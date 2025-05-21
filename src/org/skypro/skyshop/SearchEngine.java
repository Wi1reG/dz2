package org.skypro.skyshop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SearchEngine {
    private Searchable[] searchableList;
    private List<Searchable> searchResults = new ArrayList<>();

    public SearchEngine(int size) {
        searchableList = new Searchable[size]; // Инициализация массива
    }

    public void add(Searchable searchable) {
        if (searchableList.length > 0) {
            searchableList[searchableList.length - 1] = searchable; // Добавление в конец массива
        } else {
            searchableList = Arrays.copyOf(searchableList, searchableList.length + 1); // Инициализация нового массива с добавленным элементом
            searchableList[0] = searchable;
        }
    }

    public Searchable[] search(String searchTerm) {
        searchResults.clear();
        for (Searchable item : searchableList) {
            if (item != null && item.getSearchTerm().contains(searchTerm)) {
                searchResults.add(item);
                if (searchResults.size() == 5) {
                    break;
                }
            }
        }
        return searchResults.toArray(new Searchable[5]); // Возвращаем массив из первых 5 найденных элементов
    }
}
