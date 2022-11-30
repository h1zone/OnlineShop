package com.solutions.OnlineShop.service.impl;

import com.solutions.OnlineShop.entity.Category;
import com.solutions.OnlineShop.repository.CategoryRepository;
import com.solutions.OnlineShop.service.CategoryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public Category addCategory(int id, String name) {
        Category savedCategory = categoryRepository.insertCategory(id, name);
        return savedCategory;
    }

    @Override
    public void deleteCategory(int id_category) {
        categoryRepository.deleteById(id_category);
    }

    @Override
    public Category getCategoryById(int id_category) {
        return categoryRepository.selectById(id_category);
    }

    @Override
    public Category editCategory(int id_category, String name) {
        return categoryRepository.updateCategory(id_category,name);
    }

    @Override
    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }
}
