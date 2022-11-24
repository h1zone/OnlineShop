package com.solutions.OnlineShop.service;

import com.solutions.OnlineShop.entity.Categories;
import java.util.List;

public interface CategoriesService {

    Categories addCategorie(int id, String name);
    void delete(int id_category);
    Categories getByName(String name);
    Categories getById(int id_category);
    Categories editCategorie(Categories bank);
    List<Categories> getAll();
}