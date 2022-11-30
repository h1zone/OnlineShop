package com.solutions.OnlineShop.service;

import com.solutions.OnlineShop.entity.Category;
import java.util.List;

public interface CategoryService {
    // здесь методы надо называть высоким уровнем
    List<Category> getAllCategories();
    Category getCategoryById(int id_category);

    Category addCategory(int id, String name);
    Category editCategory(int id, String name);
    void deleteCategory(int id_category);
}